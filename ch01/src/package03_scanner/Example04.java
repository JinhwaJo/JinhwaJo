package package03_scanner;

import java.util.Scanner;

public class Example04 {
	public static void main(String[] args) {
		/* �Է��� ���� ������ ��쿡�� ����� ��ȯ�Ͽ� ����Ͻÿ�.
		 * 
		 * ����1 >
		 * �Է� : -5
		 * ���� : 5
		 * 
		 * ����2 >
		 * �Է� : 5
		 * ���� : 5
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է� : ");
		int num = sc.nextInt();		// ������ �Է� �ް�
		
		// �Է� ���� ���� 0 ���� ������ ���� �ƴϸ� ������
		num = (num < 0) ? -num : num;
		System.out.println("���� : " + num);
		/* �Ʒ��� ���� ��� ���� ��ü�� ���ǽ��� �ɾ �ȴ�.
		System.out.println("���� : " + (num < 0 ? -num : num)); */
		
	}
}
