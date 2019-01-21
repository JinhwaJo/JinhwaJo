package package08_while;

import java.util.Scanner;

public class Example03 {
	public static void main(String[] args) {
		/*
		 * 숫자 맞추기 게임을 작성하시오. 1 ~ 100 사이의 값을 반복적으로 입력해서 컴퓨터가 생각한 난수(랜덤수) 를 맞추면 게임이 종료된다.
		 * 사용자가 값을 입력하면 컴퓨터가 랜덤 수와 비교해 결과를 알려주게 하여야 한다.
		 * 
		 * 사용자 : 101 OUT
		 * 
		 * 사용자 : 50 DOWN
		 * 
		 * 사용자 : 25 UP
		 * 
		 * 사용자 : 28 총 4회만에 맞췄습니다. 게임을 종료합니다.
		 */

		double ran = Math.random(); // 0 <= ~ < 1 : 난수를 형성한다.
		int rannum = (int) (ran * 100 + 1);	// int로 묶어 정수로 만들면 0 ~ 99로 범위가 설정되므로, +1을 해서 1 ~ 100의 범위를 완성할 수 있다.
		// int rannum = (int) (ran * 101) + 1;
		// int rannum = (int) (ran * 100) +1;
		Scanner sc = new Scanner(System.in);
		/* while안의 값이 참일 경우에 계속해서 검사를 하게되는 구조이므로
		 * 참, 거짓을 나타낼 수 있는 식을 사용하여 true면 계속해서 진행하고
		 * false면 나가게 하는 형태의 조건식을 만들어야 한다.
		 * 그래서 boolean 함수를 쓰거나, 아래와 같이 while 자체에 true를 넣어 식을 구성할 수 도 있다.
		 	int cnt = 1;
			while (true) {
			System.out.print("숫자를 입력하시오. : ");
			int number = sc.nextInt();
			if (rannum > number) {
				System.out.println("UP");
				cnt++;
			} else if (rannum < number) {
				System.out.println("DOWN");
				cnt++;
			} else if (rannum == number) {
				System.out.println("총 " + cnt + "번 만에 맞췄습니다. 게임을 종료합니다.");
				break; */
		
		boolean a = true;
		int cnt = 1;
		while (a) {
			System.out.print("숫자를 입력하시오. : ");
			int number = sc.nextInt();
			if (rannum > number) {
				System.out.println("UP");
				cnt++;
			} else if (rannum < number) {
				System.out.println("DOWN");
				cnt++;
			} else if (rannum == number) {
				System.out.println("총 " + cnt + "번 만에 맞췄습니다. 게임을 종료합니다.");
				a= false;
			}

		}
	}
}
