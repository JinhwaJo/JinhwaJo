package package05_sw;

import java.util.Scanner;

public class Example05_My {
	public static void main(String[] args) {
		/* ���޺� ������ ����Ͻÿ�.
		 * (������ �⺻�� + (�⺻�� X ���ʽ�))
		 * [ ���ʽ� ]
		 * ���� : 50%
		 * ���� : 30%
		 * �븮 : 20%
		 * ��� : 10%
		 * 
		 * ���� >
		 * ���� �Է� : �븮
		 * �⺻�� �Է�(���� ����) : 1000
		 * 
		 * ����� ������ 1200���� �Դϴ�.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		String position = sc.next();
		System.out.print("�⺻�� �Է�(���� ����) : ");
		int sal = sc.nextInt();

		
		switch(position) {
		case "����" : 
			System.out.println("����� ������ " + (int)(sal + (sal * 0.5)) + "���� �Դϴ�."); break;
		case "����" : 
			System.out.println("����� ������ " + (int)(sal + (sal * 0.3)) + "���� �Դϴ�."); break;
		case "�븮" :
			System.out.println("����� ������ " + (int)(sal + (sal * 0.2)) + "���� �Դϴ�."); break;
		case "���" : 
			System.out.println("����� ������ " + (int)(sal + (sal * 0.1)) + "���� �Դϴ�."); break;
		}
	}
}
