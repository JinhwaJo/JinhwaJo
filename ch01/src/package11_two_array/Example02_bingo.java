package package11_two_array;

import java.util.Arrays;
import java.util.Scanner;

public class Example02_bingo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	// ���ڿ��� �Է¹޴� �� System.in.read();
		char bingo[][] = new char[3][3]; // 3 X 3
		
		while(true) {
		System.out.print("��ǥ(x, y) �Է� : ");
		int x = sc.nextInt();	// 1 ~ 3
		int y = sc.nextInt();	// 1 ~ 3
		if(x == 0 && y == 0) {
			System.out.println("�߰�����.");
			return;
		} else if((x > 0 && x < 4) && (y > 0 && y < 4)) {	// X �� Y �� 1 ~ 3������ �ԷµǾ�� ��.
			// �������� ĭ�� ��������� 'O'�� �ֵ��� �Ѵ�.
			if(bingo[x - 1][y - 1] != '\0' ) {	// char������ \0�� null�� ���Ѵ�.
			bingo[x - 1][y - 1] = 'O';	// ���� ��ǥ�� 0 ~ 2�ϱ� -1�� �������.
			
			for(int i = 0; i < bingo.length; i++) {	// ������ Ȯ��
				System.out.println(Arrays.toString(bingo[i]));
			}
			}
		} else {
			System.out.println("��ǥ ���� 1 ~ 3 �Դϴ�. �ٽ� �Է����ּ���.");
		}
		
	}
}
	}

