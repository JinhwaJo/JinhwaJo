package package03_scanner;

import java.util.Scanner;
// Ctrl + Shift + O : 오토마이징(패키지 이름을 생략할 수 있다.)
//원문은 java.util.Scanner sc = new java.util.Scanner(System.in);

public class Example01 {
	public static void main(String[] args) {
		//스캐너(입력) 객체 생성
		Scanner sc = new Scanner(System.in);
		// new가 붙은 것은 '무언가를 참조하고 있는' '객체'이다.
		// sc는  객체 이름이므로 아무거나 설정해도 된다.
		
		int a = sc.nextInt();			// 숫자(정수) 입력
		
		String b = sc.next();			// 문자열1 입력
		
		sc.nextLine();
		/* nextLine의 경우 공백문자나 Enter 키를 입력받을 수 있는데 그것도 32의 값을 가진 문자로 인식된다.
		 * 이 경우 위의 객체이름.nextLine();을 입력해줘야 그것이 그 다음 명령어 대신 Enter키를 받고 (받는 값이 없으므로 받고 버려진다.)
		 * 그 다음 명령어는 정상적으로 실행될 수가 있다.
		 */
		String c = sc.nextLine();		// 문자열2 입력 - 공백문자 허용
		
		double d = sc.nextDouble();		// 숫자(실수)
		// 위와 같은 수식을 쓰려면 객체 생성을 먼저 해줘야 한다.
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		
		sc.close();
		// 객체 수식 마무리 명령어
		
	}
}
