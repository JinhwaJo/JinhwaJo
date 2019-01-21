package package06;

import java.util.Scanner;

public class Shinhan {
	private static Account[] accounts = new Account[4];
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Account.setRate(4.3); // 모든 계좌(객체)의 이율은 4.3%가 된다.

		while (true) {
			menu();
			int select = sc.nextInt();
			switch (select) {
			case 1:
				registration(); // 계좌 등록 메소드
				break;
			case 2:
				list(); // 계좌 목록 메소드
				break;
			case 3:
				deposit(); // 입금 메소드
				break;
			case 4:
				withdraw(); // 출금 메소드
				break;
			case 5:
				System.out.println("프로그램 종료");
				System.exit(1);
			}
		}
	}

	private static void withdraw() {	// 출금 메소드
		System.out.println("[ 출금 ]");
		System.out.print("계좌번호 : ");
		String number = sc.next();
		Account account = search(number);
		if (account != null) {	// 계좌가 배열에 있으면
			System.out.print("출금액 : ");
			int money = sc.nextInt();
			// 출금액을 게좌 객체의 잔액에 저장한다.
			account.setBalance(account.getBalance() - money);
			System.out.println("출금되었습니다.");
			return;
		}
		System.out.println("다시 시도하세요.");

	}

	/*
	 * 등록(잘못된 등록정보를 입력하면 경고문을 반환하기 위해 계좌 내용을 찾음), 입금, 출금 모두 작업 실행 전 입력받은 계좌 내용을 찾는다는
	 * 공통점이 있다. 따라서, 아래 search 메소드를 만들 필요성이 생긴다.
	 */
	private static void deposit() { // 입금 메소드
		System.out.println("[ 입금 ]");
		System.out.print("계좌번호 : ");
		String number = sc.next();
		Account account = search(number);
		/*
		 * 여기서 account는 계좌 번호나, 계좌주 가 아닌 계좌 자체를 가진다. 즉, 100번지, 200번지, 300번지에 있는 계좌의 값을
		 * 받는게 아니라 그 계좌의 주소를 받는다.
		 */
		if (account != null) {
			System.out.print("입금액 : ");
			int money = sc.nextInt();
			// 입금액을 계좌 객체의 잔액에 저장한다.
			account.setBalance(account.getBalance() + money);
			System.out.println("입금되었습니다.");
			return;
		}
		System.out.println("다시 시도하세요.");

	}

	private static Account search(String number) { // 계좌 찾기 메소드
		for (int i = 0; accounts[i] != null; i++) {
			// 배열에 저장되어 있는 계좌번호(a[i].getAccNumber())와 내가 입력한 계좌번호(number)가 일치하면 if문 실행
			if (accounts[i].getAccNumber().equals(number)) {
				return accounts[i];
				/*
				 * search에 받은 계좌를 return에 반환하도록 지정한다. return이 있을 경우 반환형을 지정해줘야한다. 위에 비어있던(void)
				 * 반환형에 Account를 지정한다.
				 */
			}
		}
		System.out.println("계좌가 없습니다.");
		return null; // 객체형은 값이 없을 경우 null이 저장된다.
	}

	private static void list() {
		System.out.println("[ 계좌 목록 보기 ]");
		for(int i = 0; accounts[i] != null; i++) {
			System.out.println((i + 1) + "번 계좌의 정보는 ↓");
			System.out.println("계좌번호 : " + accounts[i].getAccNumber());
			System.out.println("계좌주 : " + accounts[i].getAccOwner());
			System.out.println("잔액 : " + accounts[i].getBalance());
		}
		System.out.println("목록을 모두 출력하였습니다.");

	}

	private static void registration() { // 계좌 등록 메소드
		System.out.println("[ 계좌 등록 정보를 입력하세요. ]");
		for (int i = 0; i < accounts.length - 1; i++) {
			// 효율성을 위해 배열의 마지막 값은 null이 되야하므로 -1을 해준다. 기억!! 
			if (accounts[i] == null) {
				System.out.print("계좌번호 : ");
				String number = sc.next(); // 계좌번호를 입력한다.
				System.out.print("계좌주 : ");
				String owner = sc.next(); // 계좌주를 입력한다.
				System.out.print("입금액 : ");
				int money = sc.nextInt(); // 입금액을 입력한다.
				accounts[i] = new Account(number, owner, money);
				// 입력 받은 값을 토대로 계좌정보를 생성
				System.out.println("계좌가 등록되었습니다.");
				return;
			}

		}
		System.out.println("계좌를 등록할 수 없습니다.");

	}

	private static void menu() {
		System.out.println("----------신한은행-----------");
		System.out.println("1. 계좌 등록");
		System.out.println("2. 계좌 목록");
		System.out.println("3. 입금");
		System.out.println("4. 출금");
		System.out.println("5. 종료");
		System.out.print(">> ");
	}
}
