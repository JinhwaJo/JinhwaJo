package exception_package;

public class Example04 {
	public static void main(String[] args) {
		int num = 100;
		int result = 0;
		
		// �Ʒ� ���ܸ� ó���Ͻÿ�.
		
			for(int i = 0; i < 5; i++) {
				try {
				result = num / (int)(Math.random() * 5);
				System.out.println(result);
			} catch (ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�.");
			}
				
		}
		
	}
}

