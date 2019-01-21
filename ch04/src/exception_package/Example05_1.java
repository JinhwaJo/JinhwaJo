package exception_package;

public class Example05_1 {
	public static void main(String[] args) {
		int[] data = new int[2];
		
		/* ���ܰ� 2�� �̻� �߻��� �� ���� catch���� ����Ѵ�.
		 * ��, ������ catch���� ����Ǹ� ������ catch���� ������� �ʴ´�. */
		try {
			data[0] = Integer.parseInt("1");
			data[1] = Integer.parseInt("a");	// �� �ٿ� ������ �߻��ϸ� �ٷ� ĳġ������ �Ѿ�� 
			data[2] = 2;						// �� ���� �������� �ʴ´�.
			System.out.println(data[0]);
			System.out.println(data[1]);
			System.out.println(data[2]);
		// } catch (Exception e) {	�θ� catch���� ���� ������ ��͸� �����ϰ� �ǹǷ� �Ʒ��ʿ� �־��Ѵ�.
			
		} catch (NumberFormatException e) {
			System.out.println("���ڷ� ��ȯ�� �� �����ϴ�.");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("�ε����� �ʰ��Ͽ����ϴ�.");
		} catch (Exception e) {
			System.out.println("�� ���� ������ �߻��Ͽ����ϴ�.");
		}
	}
}

