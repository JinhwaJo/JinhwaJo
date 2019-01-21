package package03_scanner;

import java.util.Scanner;

public class Example03 {
	public static void main(String[] args) {
		/* 사과를 담는데 필요한 바구니 (버켓) 의 수를 구하는 코드를 작성하시오.
		 * (하나의 바구니에 담을 수 있는 사과 수는 10개)
		 * 
		 * 사과의 수를 입력 받고, 사과의 수가 123개 이면
		 * 몇 개의 바구니가 필요한 지 출력한다.
		 * 
		 * 예시 >
		 * 사과의 수 입력 : 130
		 * 필요한 바구니 수 : 13개
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("사과의 수 입력 : ");
		int apple = sc.nextInt();	// 사과의 수를 입력 받는다.
		int bucket = apple / 10;	// 바구니 수를 저장한다.
		
		// 사과의 수를 10개로 나눴을 때 나머지가 0이면 왼쪽 아니면 오른쪽 항 을 실행한다.
		bucket = (apple % 10) == 0 ? bucket : bucket + 1;
		System.out.println("필요한 바구니 수 : " + bucket + "개");
		
		sc.close();
		
		
		
		
		
	}
}
