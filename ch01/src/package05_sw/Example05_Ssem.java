package package05_sw;

import java.util.Scanner;

public class Example05_Ssem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		String pos = sc.next();
		System.out.print("�⺻�� �Է�(���� ����) : ");
		long money = sc.nextLong();

		// n += 3; �� �ǹ̴� n = n + 3; �̴�.
		// *=, +=, -= ó�� ���յ� �����ڸ� ����Ͽ� ����� ���� �� ��ȯ�� �� �ʿ䰡 ����.
		switch(pos) {	// ���� ã��
		case "����" : 
			// money = (long)(money * 1.5)
			money *= 1.5; break;
		case "����" : 
			// money = (long)(money * 1.3)
			money *= 1.3; break;
		case "�븮" :
			// money = (long)(money * 1.2)
			money *= 1.2; break;
		case "���" : 
			// money = (long)(money * 1.1)
			money *= 1.1; break;
		}
		System.out.println("����� ������ " + money + "�� �� �Դϴ�.");

	}
}
