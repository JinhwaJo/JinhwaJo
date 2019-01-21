package package05_sw;

import java.util.Scanner;

public class Example05_My {
	public static void main(String[] args) {
		/* 직급별 월급을 출력하시오.
		 * (월급은 기본급 + (기본급 X 보너스))
		 * [ 보너스 ]
		 * 부장 : 50%
		 * 과장 : 30%
		 * 대리 : 20%
		 * 사원 : 10%
		 * 
		 * 예시 >
		 * 직급 입력 : 대리
		 * 기본급 입력(만원 단위) : 1000
		 * 
		 * 당신의 월급은 1200만원 입니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("직급 입력 : ");
		String position = sc.next();
		System.out.print("기본급 입력(만원 단위) : ");
		int sal = sc.nextInt();

		
		switch(position) {
		case "부장" : 
			System.out.println("당신의 월급은 " + (int)(sal + (sal * 0.5)) + "만원 입니다."); break;
		case "과장" : 
			System.out.println("당신의 월급은 " + (int)(sal + (sal * 0.3)) + "만원 입니다."); break;
		case "대리" :
			System.out.println("당신의 월급은 " + (int)(sal + (sal * 0.2)) + "만원 입니다."); break;
		case "사원" : 
			System.out.println("당신의 월급은 " + (int)(sal + (sal * 0.1)) + "만원 입니다."); break;
		}
	}
}
