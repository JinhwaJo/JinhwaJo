package package07_for;

public class Example03 {
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {				// if���� �����ϸ�
				System.out.print(i + " ");	// ��� ��
				sum += i;					// sum ������ i�� ���� ������.
			}
		}
		
		System.out.println("\n�ݺ��� ���� ��");
		System.out.println("1 ~ 10 ������ ¦�� �հ� : " + sum);
	}
}