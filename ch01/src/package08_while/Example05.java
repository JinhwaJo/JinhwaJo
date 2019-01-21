package package08_while;

import java.util.Scanner;

public class Example05 {
	public static void main(String[] args) {
		/* while문과 Math.random() 메소드를 이용해 두 개의 주사위를
		 * 던졌을 때 나오는 눈을 출력한다.
		 * (단, 눈의 합이 5가 아니면 주사위를 계속 던져야 하고,
		 *     눈의 합이 5이면 반복문을 나가야 한다.)
		 *     
		 * 결과 )
		 * ( 1, 1 )
		 * ( 6, 6 )
		 * ( 2, 3 )
		 * 
		 * 랜덤 주사위를 모두 던졌습니다.
		 * 총 3회 만에 눈의 합이 5가 되었습니다.
		 */
		
		/* Scanner sc = new Scanner(System.in);
		double ran = Math.random();
		int rannum = (int)(ran * 6) + 1;
		while(true) {
			System.out.print("주사위 값을 입력하시오. : ");
		int num = sc.nextInt();
		sum = 0;
		if(rannum ) */
		
		int cnt = 0;
		while(true) {
			++cnt;
			int dice1 = (int)(Math.random() * 6) + 1;
			int dice2 = (int)(Math.random() * 6) + 1;
			System.out.println("( " + dice1 + ", " + dice2 + " )");
			if(dice1 + dice2 == 5) {
				break;
			}
		}
		System.out.println("총" + cnt + "회 만에 눈의 합이 5가 되었습니다.");
	}
}
