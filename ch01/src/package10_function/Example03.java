package package10_function;

import java.util.Scanner;

public class Example03 {
	// main 함수에서도 쓰고, registration 함수에서도 쓰기 위해 위로 뺴고 앞에 static을 붙여 준다.
	static Scanner sc = new Scanner(System.in);	
	static String [] acc_number = new String[10];	// 계좌번호를 저장할 배열
	
	public static void main(String[] args) {
		while(true) {
		System.out.println("-----------------");
		System.out.println("1. 계좌번호 등록");
		System.out.println("2. 계좌번호 확인");
		System.out.println("3. 나가기");
		System.out.println(">> ");
		int choice = sc.nextInt();
		System.out.println("-----------------");
		switch(choice) {
		case 1:	// 계좌번호 등록하기
			registration(); break;
		case 2: // 계좌번호 목록 보여주기
			information(); break;
		case 3:
			System.exit(1);	// 시스템 종료
		}
	}
	}
	private static void information() {		// 계좌목록 확인
		for(int i = 0; acc_number[i] != null; i++) {
			System.out.println(acc_number[i]);
		}
		System.out.println("모든 계좌를 출력하였습니다.");
		
	}

	private static void registration() {
		// 1. 계좌번호 입력
		System.out.print("계좌번호 입력 : ");
		String account = sc.next();
		// 2. 계좌번호 배열에 저장
		// int형 배열은 아무것도 없으면 0이 들어 있고, String형 배열은 아무것도 없으면 null이 들어있다.
		for(int i = 0; i < acc_number.length; i++) {
			if(acc_number[i] == null) {
				acc_number[i] = account;
				System.out.println("계좌번호를 등록하였습니다.");
				// 3. 나가기
				return;
			}
		}
		
		System.out.println("계좌번호를 등록할 수 없습니다.");
		
	}
}
