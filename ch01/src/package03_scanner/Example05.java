package package03_scanner;

import java.io.IOException;

public class Example05 {
	public static void main(String[] args) throws IOException {
		/* throws IOE 까지 입력하고 ctrl + space를 누르면 throws 연산자가 완성되며, 위쪽에 import가 지정된다.
		 * throws IOException은 아래 문자 1개를 입력받는 식을 사용할 수 있는 권한을 부여한다. */
		
		// 문자 1개를 입력 받아 소문자이면 대문자로 대문자이면 소문자로 변환하시오.
		System.out.print("문자 1개 입력 : ");
		char ch = (char)System.in.read();	// 문자 1개 입력(Scanner에 없음)
		
		/* 산술연산자 (+, - , *, /, %) 를 사용하면 결과 값이 int형으로 도출된다.
		 * 그래서 문자를 저장하는 char로 강제 형 변환해줘야 한다. */
		
		// ch에 입력된 문자가 대문자이면 왼쪽 아니면 오른쪽
		ch = (ch >= 'A' && ch <= 'B') ? (char)(ch + 32) : (char)(ch - 32);
		System.out.println("변환된 문자 : " + ch);
		
		/* 아래와 같이 해도 동일한 답이 나온다.
		 * ch = (ch >= 'a' && ch <= 'b') ? (char)(ch - 32) : (char)(ch + 32);
		 * System.out.println("변환된 문자 : " + ch);
		 */
		
		
	}
}
