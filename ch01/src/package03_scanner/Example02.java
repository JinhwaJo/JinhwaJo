package package03_scanner;

import java.util.Scanner;

public class Example02 {
	public static void main(String[] args) {
		/* ������� �̸��� ��, ��, �� ������ �Է� �ް�, �հ�� ����� ����Ͻÿ�.
		 * 
		 * ����� �̸� �Է� : �ڼ���
		 * ���� ���� �Է� : 66
		 * ���� ���� �Է� : 55
		 * ���� ���� �Է� : 33
		 * 
		 * ���) 
		 * �ڼ��� ���� ������
		 * �հ� : 154��
		 * ��� : 51.333333333333��
		 * �Դϴ�.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("����� �̸� �Է� : ");
		String name = sc.next();
		System.out.print("���� ���� �Է� : ");
		int kor = sc.nextInt();
		System.out.print("���� ���� �Է� : ");
		int eng = sc.nextInt();
		System.out.print("���� ���� �Է� : ");
		int math = sc.nextInt();
		sc.nextLine();
		String a = sc.nextLine();
		
		System.out.println(name + " ���� ������");
		System.out.println("�հ� : " + (kor + eng + math) + "��");
		System.out.println("��� : " + (double)((kor + eng + math) / 3));
		System.out.println("�Դϴ�.");
		
		sc.close();
		
		
		
	}
}
