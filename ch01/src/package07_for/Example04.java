package package07_for;

public class Example04 {
	public static void main(String[] args) {
		/* 1 ~ 100������ ���� �� 3�� ����� ������ ����Ͻÿ�.
		 * �� : 1683
		 */
		
		int sum = 0;
		
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0) {
				System.out.print(i + " ");
				sum += i;
			}
		}
		System.out.println("\n�ݺ��� ���� ��");
		System.out.println("1 ~ 100 ������ 3�� ����� ���� : " + sum);
	}
}
