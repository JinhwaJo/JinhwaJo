package exception_package;

public class Example06 {
	public static void main(String[] args) {
		int[] data = new int[2];
		
		// ���ܰ� 2�� �̻� �߻��� �� ��Ƽ catch���� ����Ѵ�.
		 try {
			data[0] = Integer.parseInt("1");
			data[1] = Integer.parseInt("a");
			System.out.println(data[0]);
			System.out.println(data[1]);
			data[2] = 2;
			// �� �� �� �ϳ��� ���ܰ� �߻��Ͽ��� �� (�� ���� ��� �ش��ϴ� ���� ����.)
		} catch (NumberFormatException | IndexOutOfBoundsException e) {
			e.printStackTrace(); // �� ���� ���ܰ� ���� Ŭ������ Ȯ���� �� �ְ� ����
			System.out.println("�ε����� �ʰ��Ͽ��ų� ���ڷ� ��ȯ�� �� �����ϴ�.");
		} catch (Exception e) {
			System.out.println("�� ���� ������ �߻��Ͽ����ϴ�.");
		}
	}
}


