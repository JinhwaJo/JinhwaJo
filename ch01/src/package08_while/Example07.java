package package08_while;

import java.text.DecimalFormat;

public class Example07 {
	public static void main(String[] args) {
		double n = 1.123456;
		/* 소수점 넷째자리까지만 저장된다.
		 * #을 추가하거나 삭제하여 소수점 자리를 조정할 수 있다.
		 */
		// 1. 숫자의 형식을 정한다.(법을 정한다.)
		DecimalFormat df = new DecimalFormat("#.####");
		// 2. 바뀐 숫자의 형태를 문자열로 변환해야 한다.
		String a = df.format(n);
		// 3. 바꾼 숫자의 형태는 문자열 객체에 저장되어 있다.
		System.out.println(a);
	}
}
