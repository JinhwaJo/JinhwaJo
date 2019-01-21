package package03_string;

public class StringExample02 {
	public static void main(String[] args) {
		String s4 = "9000430-1000001";
		// char에는 일곱번째 인덱스인 문자 '1'이 저장되고
		char ch = s4.charAt(7);	// 인덱스가 7인 위치의 값을 문자로 변환한다.
		// 아스키 코드에 따라 문자 '1'은 49이므로, 49 - 48 = 숫자 1이 된다.
		int n = ch - 48;
		// 위처럼 아스키 코드를 활용하지 않고, if문의 n에 문자 '1'을 넣어줘도 된다.
		if(n == 1 || n == 3) {
			System.out.println("남자");
		} else if(n == 2 || n == 4) {
			System.out.println("여자");
		}
	}
}
