package package07_for;

public class Example02 {
	public static void main(String[] args) {
		int sum = 0;
		
		// 1 ~ 10���� �� 10�� �ݺ��Ѵ�.
		for(int i = 1; i <= 10; i++) {
			System.out.println("i = " + i + ", sum = " + sum);
			sum += i;	// 1 ~10������ ���� sum ������ �����Ѵ�.
		}
		
		System.out.println("1 ~ 10 ������ �� : " + sum);
		System.out.println("�ݺ��� ����");
	}
}
