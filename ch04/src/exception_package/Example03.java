package exception_package;

import java.util.Arrays;

public class Example03 {
	public static void main(String[] args) {
		String data1 = "1";
		String data2 = "a";
		
		// �Ʒ� ���ܸ� ���� ó���Ͻÿ�.
		int num1 = Integer.parseInt(data1);
		System.out.println(num1);
		try {
			
			int num2 = Integer.parseInt(data2);
		} catch (NumberFormatException e) {
			System.out.println("���� ������ �߸��Ǿ����ϴ�.");

		} 
		
		
	}
}
