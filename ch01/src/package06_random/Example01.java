package package06_random;

public class Example01 {
	public static void main(String[] args) {
		// 0.0 <= Math.random() < 1.0
		double ran = Math.random();
		System.out.println("���� �� : " + ran);
		System.out.println("���� �� : " + (int)(ran * 5));		// (0 ~ 4) ���� ���� 5�� �Ѿ�� ����.
		System.out.println("���� �� : " + (int)(ran * 10));		// (0 ~ 9) ���� ���� 10�� �Ѿ�� ����.
		System.out.println("���� �� : " + (int)(ran * 100));	// (0 ~ 99) ���� ���� 100�� �Ѿ�� ����.
		System.out.println("���� �� : " + (int)(ran * 20));		// (0 ~ 19) ���� ���� 20�� �Ѿ�� ����.
	}
}
