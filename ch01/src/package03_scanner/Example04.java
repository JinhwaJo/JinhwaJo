package package03_scanner;

import java.util.Scanner;

public class Example04 {
	public static void main(String[] args) {
		/* 입력한 값이 음수일 경우에는 양수로 변환하여 출력하시오.
		 * 
		 * 예시1 >
		 * 입력 : -5
		 * 절댓값 : 5
		 * 
		 * 예시2 >
		 * 입력 : 5
		 * 절댓값 : 5
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int num = sc.nextInt();		// 정수를 입력 받고
		
		// 입력 값은 값이 0 보다 작으면 왼쪽 아니면 오른쪽
		num = (num < 0) ? -num : num;
		System.out.println("절댓값 : " + num);
		/* 아래와 같이 출력 문구 자체에 조건식을 걸어도 된다.
		System.out.println("절댓값 : " + (num < 0 ? -num : num)); */
		
	}
}
