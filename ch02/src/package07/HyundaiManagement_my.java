package package07;

import java.util.Scanner;

public class HyundaiManagement_my {
	/* 현대자동차 등록 프로그램을 작성하시오.
	 * 자동차 이름, 년식, 가격, 배기량, 구입 시 세금(7.5%), 재고량
	 * 1. 자동차 등록
	 * 2. 재고 추가 : 자동차 이름을 입력 받고 재고 추가(원래 있던 재고량 + 입력된 재고량)
	 * 3. 자동차 정보 : 자동차 이름을 입력 받고 정보 확인
	 *    (단, 구입 시 세금을 제외한 가격만 출력한다.)
	 * 4. 가격 변경 : 자동차 가격을 변경한다.
	 * 5. 프로그램 종료	 	*/
	private static Car[] hyundai = new Car[6];
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Car.setCarTax(7.5); 	// 모든 자동차의 자동차세는 7.5%가 된다.
		
		while (true) {
			menu();
			int select = sc.nextInt();
			switch(select) {
			case 1:
				registration();	// 자동차 등록 메소드
				break;
			case 2:
				stockadd();		// 자동차 재고 확인 메소드
			case 3:
				list();			// 자동차 정보 확인 메소드
			case 4:
				pricechange();	// 자동차 가격 변경 메소드
			case 5:
				System.out.println("프로그램 종료");
				System.exit(1);
			}
		}

	}
	
	private static void stockadd() {
		System.out.println("[ 자동차 재고 추가 ]");
		System.out.print("자동차 이름 : ");
		String
		
		
	}

	private static Car search(String name) {	// 자동차 찾기 메소드
		for (int i = 0; hyundai[i] != null; i++) {
			if(hyundai[i].getCarName().equals(name)) {
				return hyundai[i];
			}
		}
		System.out.println("자동차가 없습니다.");
		return null;
	}
	
	private static void list() {
		System.out.println("[ 자동차 정보 보기 ]");
		for(int i = 0; hyundai[i] != null; i++) {
			System.out.println((i + 1) + "번 자동차의 정보는 ↓");
			System.out.println("자동차 이름 : " + hyundai[i].getCarName());
			System.out.println("자동차 년식 : " + hyundai[i].getCarYear());
			System.out.println("자동차 배기량 : " + hyundai[i].getCarCapa() + "CC");
		}
		System.out.println("정보를 모두 출력하였습니다.");
		
	}

	private static void registration() {	// 자동차 등록 메소드
		System.out.println("[ 자동차 등록 정보를 입력하세요. ]");
		for (int i = 0; i < hyundai.length - 1; i++) {
			if(hyundai[i] == null) {
				System.out.print("자동차 이름 : ");
				String name = sc.next();	// 자동차 이름을 입력한다.
				System.out.print("자동차 년식 : ");
				int year = sc.nextInt();	// 자동차 년식을 입력한다.
				System.out.print("자동차 배기량 : ");
				int capa = sc.nextInt();	// 자동차 배기량을 입력한다.
				hyundai[i] = new Car(name, year, capa);
				// 입력 받은 값을 토대로 자동차정보 생성
				System.out.println("자동차 정도가 등록되었습니다.");
				return;
				
			}
		}
		System.out.println("자동차를 등록할 수 없습니다.");
		
	}
	
	private static void menu() {
		System.out.println("-------------- Hyundai NO.1 Dealer------------");
		System.out.println("1. 자동차 등록");
		System.out.println("2. 재고 변경");
		System.out.println("3. 자동차 정보");
		System.out.println("4. 가격 변경");
		System.out.println("5. 종료");
		System.out.println(">> ");
		
	}
}
