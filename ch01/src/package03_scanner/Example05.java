package package03_scanner;

import java.io.IOException;

public class Example05 {
	public static void main(String[] args) throws IOException {
		/* throws IOE ���� �Է��ϰ� ctrl + space�� ������ throws �����ڰ� �ϼ��Ǹ�, ���ʿ� import�� �����ȴ�.
		 * throws IOException�� �Ʒ� ���� 1���� �Է¹޴� ���� ����� �� �ִ� ������ �ο��Ѵ�. */
		
		// ���� 1���� �Է� �޾� �ҹ����̸� �빮�ڷ� �빮���̸� �ҹ��ڷ� ��ȯ�Ͻÿ�.
		System.out.print("���� 1�� �Է� : ");
		char ch = (char)System.in.read();	// ���� 1�� �Է�(Scanner�� ����)
		
		/* ��������� (+, - , *, /, %) �� ����ϸ� ��� ���� int������ ����ȴ�.
		 * �׷��� ���ڸ� �����ϴ� char�� ���� �� ��ȯ����� �Ѵ�. */
		
		// ch�� �Էµ� ���ڰ� �빮���̸� ���� �ƴϸ� ������
		ch = (ch >= 'A' && ch <= 'B') ? (char)(ch + 32) : (char)(ch - 32);
		System.out.println("��ȯ�� ���� : " + ch);
		
		/* �Ʒ��� ���� �ص� ������ ���� ���´�.
		 * ch = (ch >= 'a' && ch <= 'b') ? (char)(ch - 32) : (char)(ch + 32);
		 * System.out.println("��ȯ�� ���� : " + ch);
		 */
		
		
	}
}
