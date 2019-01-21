package package04_if;

import java.io.IOException;

public class Example02 {
	public static void main(String[] args) throws IOException {
		System.out.print("문자 1개 입력 : ");
		char ch = (char)System.in.read();
		
		if(ch >= 'A' & ch <= 'Z') {		// 입력한 문자가 대문자이면
			System.out.println("대문자입니다.");
		}
		/* else if 절을 사용할 경우, 위의 if 절이 실행되면 , 해당 else if 절의 조건식은 계산하지 않는다.  
		 * 반면에, if 절만 사용할 경우, 위의 식이 실행되면 아래의 식을 실행하진 않더라도 계산은 수행한다. (차이점)
		 */
		else if(ch >= 'a' && ch <= 'z') {	// 입력한 문자가 소문자이면
			System.out.println("소문자입니다.");
		}
		/* 아래 절을 간소화하여 else를 사용한 절로 작성 가능
		 * if(!(ch >= 'A' && ch <= 'Z') && !(ch >= 'a' && ch <= 'z'))
		 */
		// else 뒤에 if가 없으면 조건식을 입력할 수가 없다.
		else {	// 입력한 문자가 대문자가 아니면서 소문자가 아니면 (!)
			System.out.println("알파벳만 입력하세요.");
		}
}
}