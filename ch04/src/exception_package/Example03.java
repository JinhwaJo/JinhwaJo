package exception_package;

import java.util.Arrays;

public class Example03 {
	public static void main(String[] args) {
		String data1 = "1";
		String data2 = "a";
		
		// 아래 예외를 예외 처리하시오.
		int num1 = Integer.parseInt(data1);
		System.out.println(num1);
		try {
			
			int num2 = Integer.parseInt(data2);
		} catch (NumberFormatException e) {
			System.out.println("숫자 형식이 잘못되었습니다.");

		} 
		
		
	}
}
