package package05_sw;

import java.io.IOException;

public class Example04 {
	public static void main(String[] args) throws IOException {
		/* �Է��� ����
		 * 'a' �Ǵ� 'A' �̸� "Apple"
		 * 'b' �Ǵ� 'B' �̸� "Baby"
		 * 'c' �Ǵ� 'C' �̸� "Cycle"
		 * ������ ���ĺ��� "���� �ܾ��Դϴ�."�� ����Ͻÿ�.
		 */
		
		System.out.print("���ĺ� �Է� : ");
		char alphabet = (char)System.in.read();
		
		switch(alphabet) {
		case 'a': case 'A':
			System.out.println("Apple"); break;
		case 'b': case 'B':
			System.out.println("Baby"); break;
		case 'c': case 'C':
			System.out.println("Cycle"); break;
		default:
			System.out.println("���� �ܾ��Դϴ�.");
		}
	}
}
