package package05_sw;

import java.util.Scanner;

public class Example05_Ssem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("직급 입력 : ");
		String pos = sc.next();
		System.out.print("기본급 입력(만원 단위) : ");
		long money = sc.nextLong();

		// n += 3; 의 의미는 n = n + 3; 이다.
		// *=, +=, -= 처럼 복합된 연산자를 사용하여 계산할 때는 형 변환을 할 필요가 없다.
		switch(pos) {	// 직급 찾기
		case "부장" : 
			// money = (long)(money * 1.5)
			money *= 1.5; break;
		case "과장" : 
			// money = (long)(money * 1.3)
			money *= 1.3; break;
		case "대리" :
			// money = (long)(money * 1.2)
			money *= 1.2; break;
		case "사원" : 
			// money = (long)(money * 1.1)
			money *= 1.1; break;
		}
		System.out.println("당신의 월급은 " + money + "만 원 입니다.");

	}
}
