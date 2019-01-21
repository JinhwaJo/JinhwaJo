package package08_while;

import java.util.Scanner;

public class Example06_ssem {
	public static void main(String[] args) {
		boolean run = true;
		int totalmoney = 0;	// 잔금
		Scanner sc = new Scanner(System.in);
		while(run) {
			System.out.println("--------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔금 | 4. 종료");
			System.out.println("--------------------------------");
			System.out.println("이용할 기능의 번호를 입력하세요.");
			int select = sc.nextInt();	// 기능 이용할 번호
			switch (select ) {
			case 1 : 	// 예금
				System.out.println("예금 기능입니다.");
				System.out.println("현재 잔고 : " + totalmoney + "원 입니다.");
				System.out.println("예금액을 입력하세요.");
				int deposit = sc.nextInt();	// 예금액 입력
				totalmoney += deposit;		// 예금액 만큼 잔액 늘어남
				System.out.println("예금 후 잔고 : " + totalmoney + "원 입니다.");
				break;
			
			case 2 : 	// 출금
				System.out.println("출금 기능입니다.");
				if (totalmoney == 0) {	// 잔액이 0일 경우 출금 불가
				System.out.println("잔액이 0 원 입니다.");
				break;
				} else {	// 아닐 경우 출금
					System.out.println("현재 출금 가능 액 : " + totalmoney + "원 입니다.");
					System.out.println("출금액을 입력하세요.");
					int withdraw = sc.nextInt();	// 출금액 입력
					if (withdraw > totalmoney) {
						System.out.println("현재 잔고보다 더 많은 액수는 출금이 불가능합니다.");
						break;
					} else {
						totalmoney -= withdraw;	// 잔액에서 출금액만큼 출금
						System.out.println("출금이 완료되었습니다.");
						System.out.println("출금 후 잔고 : " + totalmoney + "원 입니다.");
						break;
					}
				}
		
			case 3 :	// 잔금(잔액조회)
				System.out.println("잔금 조회가 가능합니다.");
				System.out.println("현재 잔고 : " + totalmoney + "원 입니다.");
				break;
				/* 	아래와 같은 방법도 있다.
				 case 3 :
					// 숫자 3자리마다 콤마 찍기
					DecimalFormat df = new DecimalFormat("#,###");
					String b = df.format(balance);	// 문자열로 입력받아서
					System.out.println("잔고 : " + b + "원");
					break;
				*/
			case 4 :	// 종료
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
					}
				}
		sc.close();
	}
}
