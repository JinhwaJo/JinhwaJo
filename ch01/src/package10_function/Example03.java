package package10_function;

import java.util.Scanner;

public class Example03 {
	// main �Լ������� ����, registration �Լ������� ���� ���� ���� ���� �տ� static�� �ٿ� �ش�.
	static Scanner sc = new Scanner(System.in);	
	static String [] acc_number = new String[10];	// ���¹�ȣ�� ������ �迭
	
	public static void main(String[] args) {
		while(true) {
		System.out.println("-----------------");
		System.out.println("1. ���¹�ȣ ���");
		System.out.println("2. ���¹�ȣ Ȯ��");
		System.out.println("3. ������");
		System.out.println(">> ");
		int choice = sc.nextInt();
		System.out.println("-----------------");
		switch(choice) {
		case 1:	// ���¹�ȣ ����ϱ�
			registration(); break;
		case 2: // ���¹�ȣ ��� �����ֱ�
			information(); break;
		case 3:
			System.exit(1);	// �ý��� ����
		}
	}
	}
	private static void information() {		// ���¸�� Ȯ��
		for(int i = 0; acc_number[i] != null; i++) {
			System.out.println(acc_number[i]);
		}
		System.out.println("��� ���¸� ����Ͽ����ϴ�.");
		
	}

	private static void registration() {
		// 1. ���¹�ȣ �Է�
		System.out.print("���¹�ȣ �Է� : ");
		String account = sc.next();
		// 2. ���¹�ȣ �迭�� ����
		// int�� �迭�� �ƹ��͵� ������ 0�� ��� �ְ�, String�� �迭�� �ƹ��͵� ������ null�� ����ִ�.
		for(int i = 0; i < acc_number.length; i++) {
			if(acc_number[i] == null) {
				acc_number[i] = account;
				System.out.println("���¹�ȣ�� ����Ͽ����ϴ�.");
				// 3. ������
				return;
			}
		}
		
		System.out.println("���¹�ȣ�� ����� �� �����ϴ�.");
		
	}
}
