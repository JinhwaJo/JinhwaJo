package package03_string;

public class StringExample02 {
	public static void main(String[] args) {
		String s4 = "9000430-1000001";
		// char���� �ϰ���° �ε����� ���� '1'�� ����ǰ�
		char ch = s4.charAt(7);	// �ε����� 7�� ��ġ�� ���� ���ڷ� ��ȯ�Ѵ�.
		// �ƽ�Ű �ڵ忡 ���� ���� '1'�� 49�̹Ƿ�, 49 - 48 = ���� 1�� �ȴ�.
		int n = ch - 48;
		// ��ó�� �ƽ�Ű �ڵ带 Ȱ������ �ʰ�, if���� n�� ���� '1'�� �־��൵ �ȴ�.
		if(n == 1 || n == 3) {
			System.out.println("����");
		} else if(n == 2 || n == 4) {
			System.out.println("����");
		}
	}
}
