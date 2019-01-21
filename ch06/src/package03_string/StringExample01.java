package package03_string;

public class StringExample01 {
	public static void main(String[] args) {
		/* String 클래스 : 문자열을 다룰 때 사용되는 API 클래스
		 * String 클래스의 메소드는 대부분 새로운 객체를 생성하여,
		 * 문자열을 객체에 저장하게 된다.	 */
		String s1 = new String("Hello");	// 문자열 객체 생성
		System.out.println("s1 = " + s1);
		
		char[] chArray = {'H', 'e', 'l', 'l', 'o'};
		String s2 = new String(chArray);	// char 배열을 문자열 객체로 생성
		System.out.println("s2 = " + s2);
		
		StringBuffer sb = new StringBuffer("Hello");
		String s3 = new String(sb);			// StringBuffer 객체를 String 객체로 생성
		System.out.println("s3 = " + s3);
	}
}
