package package11_two_array;

import java.util.Arrays;
import java.util.Scanner;

public class Example02_bingoOX {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char bingo[][] = new char[3][3]; // 3 x 3
		int sw = 1;		// 1은 사용자 차례, 2는 컴퓨터 차례
		int x = -1, y = -1;
		
		while(true) {
			if(sw == 1) {	// 사용자는 1
				System.out.print("나) 좌표(x, y) 입력 : ");
				x = sc.nextInt();	// 1 ~ 3
				y = sc.nextInt();	// 1 ~ 3
			} else if(sw == 2) {	// 컴퓨터는 2
				x = (int)(Math.random() * 3) + 1;	
				y = (int)(Math.random() * 3) + 1;
			}
			
			if(x == 0 && y == 0) {
				System.out.println("잘가세요.");
				return;
			} 
			// X 와 Y 가 1 ~ 3까지만 입력되어야 함.
			else if((x > 0 && x < 4) && (y > 0 && y < 4)) { 
				// 빙고판의 칸이 비어있으면 'O'를 넣도록 한다.
				if(bingo[x - 1][y - 1] == '\0') {	 
					if(sw == 1) { 					// 이거는 사용자
						bingo[x - 1][y - 1] = 'O';
						sw = 2;
					} else if(sw == 2) {			// 이거는 컴퓨터	
						System.out.println("컴] 좌표(x, y) 입력 : " + x + " " + y);
						bingo[x - 1][y - 1] = 'X';
						sw = 1;
					}
					for(int i = 0; i < bingo.length; i++) { // 빙고판 확인
						System.out.println(Arrays.toString(bingo[i]));
					}
					System.out.println();
				}
			} else {
				if(sw == 1) {
					System.out.println("좌표 값은 1 ~ 3 입니다. 다시 입력해주세요.");
				}
			}
		}
		
	}
}
