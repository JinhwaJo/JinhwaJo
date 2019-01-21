package package05_sw;

import java.io.IOException;

public class Example04 {
	public static void main(String[] args) throws IOException {
		/* 입력한 값이
		 * 'a' 또는 'A' 이면 "Apple"
		 * 'b' 또는 'B' 이면 "Baby"
		 * 'c' 또는 'C' 이면 "Cycle"
		 * 나머지 알파벳은 "없는 단어입니다."를 출력하시오.
		 */
		
		System.out.print("알파벳 입력 : ");
		char alphabet = (char)System.in.read();
		
		switch(alphabet) {
		case 'a': case 'A':
			System.out.println("Apple"); break;
		case 'b': case 'B':
			System.out.println("Baby"); break;
		case 'c': case 'C':
			System.out.println("Cycle"); break;
		default:
			System.out.println("없는 단어입니다.");
		}
	}
}
