package exception_package;

public class Example05_2 {
	public static void main(String[] args) {
		int[] data = new int[2];
		
		/* ���ܰ� 2�� �̻� �߻��� �� ���� catch���� ����Ѵ�.
		 * ��, ������ catch���� ����Ǹ� ������ catch���� ������� �ʴ´�. */
		try {
			data[0] = Integer.parseInt("1");
			data[1] = Integer.parseInt("a");	
			System.out.println(data[0]);
			System.out.println(data[1]);
			System.out.println(data[2]);
		// catch�� �ȿ� try���� �־ ����ó�� ����� �ΰ� �̻����� ����� �� �ִ�.
		} catch (NumberFormatException ex) {
			try {
				data[2] = 2;
			} catch (IndexOutOfBoundsException e) {
				System.out.println("�ε����� �ʰ��Ͽ����ϴ�.");
			}
			System.out.println("���ڷ� ��ȯ�� �� �����ϴ�.");
		} catch (Exception e) {
			System.out.println("�� ���� ������ �߻��Ͽ����ϴ�.");
		}
	}
}


