package package03_string;

import java.util.StringTokenizer;

public class StringExample10 {
	public static void main(String[] args) {
		String text = "홍길동/서길동/남길동";
		
		// 문자열을 분리할 때만 사용할 수 있는 문자열 API 클래스
		StringTokenizer st = new StringTokenizer(text, "/");
		int countToken = st.countTokens();
		System.out.println("분리된 토큰의 개수 : " + countToken);
		
		// iterator처럼 has 메소드와 next 메소드가 있음.
		while(st.hasMoreTokens()) {
			String str = st.nextToken();
			System.out.println(str);
		}
	}
}
