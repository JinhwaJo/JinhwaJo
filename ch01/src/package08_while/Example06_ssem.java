package package08_while;

import java.util.Scanner;

public class Example06_ssem {
	public static void main(String[] args) {
		boolean run = true;
		int totalmoney = 0;	// �ܱ�
		Scanner sc = new Scanner(System.in);
		while(run) {
			System.out.println("--------------------------------");
			System.out.println("1. ���� | 2. ��� | 3. �ܱ� | 4. ����");
			System.out.println("--------------------------------");
			System.out.println("�̿��� ����� ��ȣ�� �Է��ϼ���.");
			int select = sc.nextInt();	// ��� �̿��� ��ȣ
			switch (select ) {
			case 1 : 	// ����
				System.out.println("���� ����Դϴ�.");
				System.out.println("���� �ܰ� : " + totalmoney + "�� �Դϴ�.");
				System.out.println("���ݾ��� �Է��ϼ���.");
				int deposit = sc.nextInt();	// ���ݾ� �Է�
				totalmoney += deposit;		// ���ݾ� ��ŭ �ܾ� �þ
				System.out.println("���� �� �ܰ� : " + totalmoney + "�� �Դϴ�.");
				break;
			
			case 2 : 	// ���
				System.out.println("��� ����Դϴ�.");
				if (totalmoney == 0) {	// �ܾ��� 0�� ��� ��� �Ұ�
				System.out.println("�ܾ��� 0 �� �Դϴ�.");
				break;
				} else {	// �ƴ� ��� ���
					System.out.println("���� ��� ���� �� : " + totalmoney + "�� �Դϴ�.");
					System.out.println("��ݾ��� �Է��ϼ���.");
					int withdraw = sc.nextInt();	// ��ݾ� �Է�
					if (withdraw > totalmoney) {
						System.out.println("���� �ܰ��� �� ���� �׼��� ����� �Ұ����մϴ�.");
						break;
					} else {
						totalmoney -= withdraw;	// �ܾ׿��� ��ݾ׸�ŭ ���
						System.out.println("����� �Ϸ�Ǿ����ϴ�.");
						System.out.println("��� �� �ܰ� : " + totalmoney + "�� �Դϴ�.");
						break;
					}
				}
		
			case 3 :	// �ܱ�(�ܾ���ȸ)
				System.out.println("�ܱ� ��ȸ�� �����մϴ�.");
				System.out.println("���� �ܰ� : " + totalmoney + "�� �Դϴ�.");
				break;
				/* 	�Ʒ��� ���� ����� �ִ�.
				 case 3 :
					// ���� 3�ڸ����� �޸� ���
					DecimalFormat df = new DecimalFormat("#,###");
					String b = df.format(balance);	// ���ڿ��� �Է¹޾Ƽ�
					System.out.println("�ܰ� : " + b + "��");
					break;
				*/
			case 4 :	// ����
				System.out.println("���α׷��� �����մϴ�.");
				run = false;
				break;
					}
				}
		sc.close();
	}
}
