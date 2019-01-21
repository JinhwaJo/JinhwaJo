package package03_string;

public class StringExample04 {
	public static void main(String[] args) {
		String ssn = "900903-2101111";
		int length = ssn.length();	// 문자의 개수를 반환한다.
		
		if(length == 14) {
			System.out.println("주민번호 자릿수가 일치합니다.");
		} else {
			System.out.println("주민번호가 잘못되었습니다.");
		}
	}
}
