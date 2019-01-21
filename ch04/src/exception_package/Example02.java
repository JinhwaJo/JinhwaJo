package exception_package;

import java.util.Arrays;

public class Example02 {
	public static void main(String[] args) {
		String[] name = new String[2];
		// try문 안에 선언된 변수는 그 안에서만 사용할 수 있다.
		// finally는 (try 문 안의 생성된 객체와 연관된) 자원을 반납하는 구문을 catch문 여부와 상관없이 무조건 실행된다.
		try {
			name[0] = "박";
			name[1] = "성";
			name[2] = "정";
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 번호를 초과하였습니다.");
		} finally {	
			System.out.println(Arrays.toString(name));
		}
		
	}
}
