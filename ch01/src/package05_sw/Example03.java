package package05_sw;

import java.util.Scanner;

public class Example03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("��(��) �Է� : ");
		int month = sc.nextInt();
		switch(month) {
		case 1: case 2: case 3: case 12:
			System.out.println("�ܿ�"); break;
		case 4: case 5: case 6:
			System.out.println("��"); break;
		case 7: case 8: case 9:
			System.out.println("����"); break;
		case 10: case 11:
			System.out.println("����"); break;
		default:
			System.out.println("1 ~ 12������ �Է��ϼ���.");
		}
	}
}
