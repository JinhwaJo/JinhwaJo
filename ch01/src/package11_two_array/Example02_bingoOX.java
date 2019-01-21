package package11_two_array;

import java.util.Arrays;
import java.util.Scanner;

public class Example02_bingoOX {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char bingo[][] = new char[3][3]; // 3 x 3
		int sw = 1;		// 1�� ����� ����, 2�� ��ǻ�� ����
		int x = -1, y = -1;
		
		while(true) {
			if(sw == 1) {	// ����ڴ� 1
				System.out.print("��) ��ǥ(x, y) �Է� : ");
				x = sc.nextInt();	// 1 ~ 3
				y = sc.nextInt();	// 1 ~ 3
			} else if(sw == 2) {	// ��ǻ�ʹ� 2
				x = (int)(Math.random() * 3) + 1;	
				y = (int)(Math.random() * 3) + 1;
			}
			
			if(x == 0 && y == 0) {
				System.out.println("�߰�����.");
				return;
			} 
			// X �� Y �� 1 ~ 3������ �ԷµǾ�� ��.
			else if((x > 0 && x < 4) && (y > 0 && y < 4)) { 
				// �������� ĭ�� ��������� 'O'�� �ֵ��� �Ѵ�.
				if(bingo[x - 1][y - 1] == '\0') {	 
					if(sw == 1) { 					// �̰Ŵ� �����
						bingo[x - 1][y - 1] = 'O';
						sw = 2;
					} else if(sw == 2) {			// �̰Ŵ� ��ǻ��	
						System.out.println("��] ��ǥ(x, y) �Է� : " + x + " " + y);
						bingo[x - 1][y - 1] = 'X';
						sw = 1;
					}
					for(int i = 0; i < bingo.length; i++) { // ������ Ȯ��
						System.out.println(Arrays.toString(bingo[i]));
					}
					System.out.println();
				}
			} else {
				if(sw == 1) {
					System.out.println("��ǥ ���� 1 ~ 3 �Դϴ�. �ٽ� �Է����ּ���.");
				}
			}
		}
		
	}
}
