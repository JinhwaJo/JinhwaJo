package package04_if;

import java.io.IOException;

public class Example02 {
	public static void main(String[] args) throws IOException {
		System.out.print("���� 1�� �Է� : ");
		char ch = (char)System.in.read();
		
		if(ch >= 'A' & ch <= 'Z') {		// �Է��� ���ڰ� �빮���̸�
			System.out.println("�빮���Դϴ�.");
		}
		/* else if ���� ����� ���, ���� if ���� ����Ǹ� , �ش� else if ���� ���ǽ��� ������� �ʴ´�.  
		 * �ݸ鿡, if ���� ����� ���, ���� ���� ����Ǹ� �Ʒ��� ���� �������� �ʴ��� ����� �����Ѵ�. (������)
		 */
		else if(ch >= 'a' && ch <= 'z') {	// �Է��� ���ڰ� �ҹ����̸�
			System.out.println("�ҹ����Դϴ�.");
		}
		/* �Ʒ� ���� ����ȭ�Ͽ� else�� ����� ���� �ۼ� ����
		 * if(!(ch >= 'A' && ch <= 'Z') && !(ch >= 'a' && ch <= 'z'))
		 */
		// else �ڿ� if�� ������ ���ǽ��� �Է��� ���� ����.
		else {	// �Է��� ���ڰ� �빮�ڰ� �ƴϸ鼭 �ҹ��ڰ� �ƴϸ� (!)
			System.out.println("���ĺ��� �Է��ϼ���.");
		}
}
}