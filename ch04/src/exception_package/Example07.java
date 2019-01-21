package exception_package;

public class Example07 {
	private static int[] scores = new int[2];
	
	public static void main(String[] args) {
		try {
			method1();
			method2();
		} catch(IndexOutOfBoundsException e) {
			System.out.println("�ε����� �ʰ��Ͽ����ϴ�.");
			// e�� ���� throw new NumberFormatException(); �� �޴´�.
		} catch(NumberFormatException e) {	
			System.out.println("���ڷ� ��ȯ�� �� �����ϴ�.");
		}
	}
	
	// ���� ���ѱ��(throws��) : �޼ҵ忡�� �ٸ� �޼ҵ�� Ư�� ���ܸ� ���� �� ����Ѵ�.
	private static void method1() throws NumberFormatException {
		// ���� ��ü ����(���� ���� �߻���Ű��) : throw�ڿ� s�� �ٰ� �� �ٰ� ���̴�.
		throw new NumberFormatException(); // �̿� ���� ���� Ŭ������ �����Ǿ� �����Ǿ� �ִ�.
		/* scores[0] = Integer.parseInt("1");
		scores[1] = Integer.parseInt("a"); */
	}
	
	private static void method2() throws IndexOutOfBoundsException {
		scores[2] = 2;
	}
}
