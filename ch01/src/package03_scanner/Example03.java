package package03_scanner;

import java.util.Scanner;

public class Example03 {
	public static void main(String[] args) {
		/* ����� ��µ� �ʿ��� �ٱ��� (����) �� ���� ���ϴ� �ڵ带 �ۼ��Ͻÿ�.
		 * (�ϳ��� �ٱ��Ͽ� ���� �� �ִ� ��� ���� 10��)
		 * 
		 * ����� ���� �Է� �ް�, ����� ���� 123�� �̸�
		 * �� ���� �ٱ��ϰ� �ʿ��� �� ����Ѵ�.
		 * 
		 * ���� >
		 * ����� �� �Է� : 130
		 * �ʿ��� �ٱ��� �� : 13��
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("����� �� �Է� : ");
		int apple = sc.nextInt();	// ����� ���� �Է� �޴´�.
		int bucket = apple / 10;	// �ٱ��� ���� �����Ѵ�.
		
		// ����� ���� 10���� ������ �� �������� 0�̸� ���� �ƴϸ� ������ �� �� �����Ѵ�.
		bucket = (apple % 10) == 0 ? bucket : bucket + 1;
		System.out.println("�ʿ��� �ٱ��� �� : " + bucket + "��");
		
		sc.close();
		
		
		
		
		
	}
}
