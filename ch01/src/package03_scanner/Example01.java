package package03_scanner;

import java.util.Scanner;
// Ctrl + Shift + O : ���丶��¡(��Ű�� �̸��� ������ �� �ִ�.)
//������ java.util.Scanner sc = new java.util.Scanner(System.in);

public class Example01 {
	public static void main(String[] args) {
		//��ĳ��(�Է�) ��ü ����
		Scanner sc = new Scanner(System.in);
		// new�� ���� ���� '���𰡸� �����ϰ� �ִ�' '��ü'�̴�.
		// sc��  ��ü �̸��̹Ƿ� �ƹ��ų� �����ص� �ȴ�.
		
		int a = sc.nextInt();			// ����(����) �Է�
		
		String b = sc.next();			// ���ڿ�1 �Է�
		
		sc.nextLine();
		/* nextLine�� ��� ���鹮�ڳ� Enter Ű�� �Է¹��� �� �ִµ� �װ͵� 32�� ���� ���� ���ڷ� �νĵȴ�.
		 * �� ��� ���� ��ü�̸�.nextLine();�� �Է������ �װ��� �� ���� ��ɾ� ��� EnterŰ�� �ް� (�޴� ���� �����Ƿ� �ް� ��������.)
		 * �� ���� ��ɾ�� ���������� ����� ���� �ִ�.
		 */
		String c = sc.nextLine();		// ���ڿ�2 �Է� - ���鹮�� ���
		
		double d = sc.nextDouble();		// ����(�Ǽ�)
		// ���� ���� ������ ������ ��ü ������ ���� ����� �Ѵ�.
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		
		sc.close();
		// ��ü ���� ������ ��ɾ�
		
	}
}
