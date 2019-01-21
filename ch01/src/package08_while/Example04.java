package package08_while;

import java.util.Scanner;

public class Example04 {
	public static void main(String[] args) {
		/* 정수를 입력 받아 다음 아래와 같은 결과를 출력하시오.
		 * 
		 * 예시 1>
		 * 입력 : 12345
		 * 결과 : 15
		 * 
		 * 예시 2>
		 * 입력 : 333
		 * 결과 : 9
		 * (나눗셈 연산자 : / , % 또는 charAt(인덱스번호) 활용)
		 */
		
		/* 또다른 답
	    Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");	// 12345
		int sum = 0;
		String number = sc.next();
		for(int i = 0; i < number.length(); i++) {
		sum += number.charAt(i) - 48;	// 48은 아스키코드 0
		}
		System.out.println("결과 : " + sum); */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");	// 12345
		int num = sc.nextInt(), sum = 0;
		while(num > 0) {
			sum += num % 10;	// 5+4+3+2+1 (나머지)
			num /= 10;			// 1234 -> 123 -> 12 -> 1 ->0(몫)
		}
		System.out.println("결과 : " + sum);
		
		}
	}

