package package07_for;

public class Example10 {
	public static void main(String[] args) {
		/* �� ���� �ֻ����� ������ �� ���� ���� 6�� �Ǵ� ��� ����� ����
		 * ����Ͻÿ�. (��ø for��)
		 * 
		 * ���)
		 * 1 + 5 = 6
		 * 2 + 4 = 6
		 * 3 + 3 = 6
		 * 4 + 2 = 6
		 * 5 + 1 = 6
		 */
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				if(6 == i + j) {
					System.out.println(i + " + " + j + " = " + (i + j));
				}
			}
		}
	}
}
