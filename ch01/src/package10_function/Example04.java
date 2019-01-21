package package10_function;

import java.util.Scanner;

/* 0. å �̸��� 50������ ������ �� �ִ� �迭�� �����Ѵ�.
 * 1. 1�� �Է��ϸ� ���� �̸��� �迭�� ����Ѵ�. (���� ���)
 * 2. 2�� �Է��ϸ� ���� ����� ����Ѵ�. (���� ��� Ȯ��)
 * 3. 3�� �Է��ϸ� �������� �Է¹ް� ������ �ִ��� Ȯ���Ѵ�. (���� ã��)
 * 4. 4�� �Է��ϸ� ���α׷��� �����Ѵ�.
 */

public class Example04 {
	static Scanner sc = new Scanner(System.in);
	static String [] books = new String[50];	// å �̸� �迭 ����
	
	public static void main(String[] args) {
		/* ���α׷� ���� �� �����Ǵ� ���� main �Լ� �ϳ� ���̴�.
		 * ���� Search �Լ��� �ش� �Լ� ���뿡 �ִ� ���� �������� ��� ���� main �Լ��� ȣ���ϴ� ���̴�.
		 * �� ���, input ������ main �Լ� ���� ��ġ�ϰų�, Search �Լ��� ���ǽ� ���� ��ġ�Ͽ��� �Ѵ�.
		 * (Class �Լ��� �־������, ȣ���� �� ���� ����.)
		 */
		while(true) {
			System.out.println("--------------------");
			System.out.println("1. ���� ���");
			System.out.println("2. ���� ��� Ȯ��");
			System.out.println("3. ���� ã��");
			System.out.println("4. ���α׷��� �����մϴ�.");
			System.out.println("--------------------");
			System.out.print(">> ");
			int number = sc.nextInt();
			
		switch(number) {
		case 1 :	// 1. ���� ���
			registration(); break;
		case 2 : 	// 2. ���� ��� Ȯ��
			list(); break;
		case 3 : 	// 3. ���� ã��
			search(); break;
		case 4 : 	// 4. ������
			System.out.println("���α׷� ����");
			System.exit(1);		// ���� �Լ�(�޼ҵ�)
					
					}
		}
	}

	private static void search() {	// �˻� �Լ�(�޼ҵ�)
		// ���� ã��
		System.out.println("[ ���� �˻� ]");
		System.out.print("���� �̸� : ");
		String input = sc.next();
		for(int i = 0; books[i] != null; i++) {	
			if(input.equals(books[i])) {
		// �˻��ϰ��� �ϴ� ������ �̸���, ��Ͽ� �ִ� ���� �̸��� ���Ҷ� => ������ �ƴ� ���� ���Ѵ� => == �� �ƴ� equals (���ڿ� ����) �� ����.
				System.out.println("������ ��ϵǾ� �ֽ��ϴ�.");
				return;
				
			}
		}
		System.out.println("��ϵ��� ���� �����Դϴ�.");
	}

	private static void list() {	// ��� �Լ� (�޼ҵ�)
		// ���� ��� Ȯ��
		int cnt = 0;
		System.out.println("[ ���� ��� ] ");
		for(int i = 0; books[i] != null; i++) {
			System.out.println(books[i]);
			cnt++;
		}
		System.out.println("ȸ�� ���� ���� ����Դϴ�. : �� " + cnt + "��" );
		
	}

	private static void registration() {
		// ���� �̸� �Է��Ͽ� �迭�� ���
		System.out.println("[ ���� ��� ] ");
		for(int i = 0; i < books.length-1; i++) {
			/* String �迭���� books.length-1 ��� �������ָ� ������ ���� null�� ������ �� �ִ�.
			 * ���� ���� ���� ���� �ʰ�, books.length��� �ϸ�
			 * ���� ���, �迭�� ���̰� 100�ε� 2���� ���� ����ִٸ�, �������� �迭�� ������ �ݺ����� �����ϴ� ���� �ؾ��Ѵ�.
			 * �׷��� �������� ���� ������ �����Ͽ� ������ϸ� �߱��ϴ� ���� ������ �� �ִ�. */
			if(books[i] == null) {
				System.out.print("���� �̸� �Է� : ");
				books[i] = sc.next();
				System.out.println("���� �̸��� ����Ͽ����ϴ�.");
				// 4. ������
				return;
			}
				
		}
			System.out.println("���� �̸��� ����� �� �����ϴ�.");
	
		
	}
}
