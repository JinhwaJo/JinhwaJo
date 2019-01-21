package package11_two_array;

import java.util.Arrays;
import java.util.Scanner;

public class Example02_bingo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	// 문자열을 입력받는 건 System.in.read();
		char bingo[][] = new char[3][3]; // 3 X 3
		
		while(true) {
		System.out.print("좌표(x, y) 입력 : ");
		int x = sc.nextInt();	// 1 ~ 3
		int y = sc.nextInt();	// 1 ~ 3
		if(x == 0 && y == 0) {
			System.out.println("잘가세요.");
			return;
		} else if((x > 0 && x < 4) && (y > 0 && y < 4)) {	// X 와 Y 가 1 ~ 3까지만 입력되어야 함.
			// 빙고판의 칸이 비어있으면 'O'를 넣도록 한다.
			if(bingo[x - 1][y - 1] != '\0' ) {	// char에서는 \0가 null을 뜻한다.
			bingo[x - 1][y - 1] = 'O';	// 실제 좌표는 0 ~ 2니깐 -1을 해줘야해.
			
			for(int i = 0; i < bingo.length; i++) {	// 빙고판 확인
				System.out.println(Arrays.toString(bingo[i]));
			}
			}
		} else {
			System.out.println("좌표 값은 1 ~ 3 입니다. 다시 입력해주세요.");
		}
		
	}
}
	}

