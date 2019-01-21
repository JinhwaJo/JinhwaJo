package package03_string;

public class StringExample06 {
	public static void main(String[] args) {
		String ssn = "900903-2101111";
		
		// 문자열을 부분적으로 추출할 때 (인덱스는 첫번째가 0번째 자리가 되고, endIndex -1 처리된다.)
		// 쌤은 그냥 "여섯자를 뽑겠다." 라고 생각하면 헷갈리지 않는다고 하신다.
		String frontNum = ssn.substring(0, 6);	// 0 ~ 5(6자)
		// 뒤에 endIndex가 설정되어 있지 않으면 해당 인덱스부터 끝까지 뽑는다.
		String endNum = ssn.substring(7);		// 7 ~ 끝
		
		System.out.println("앞 자리 : " + frontNum);
		System.out.println("뒷 자리 : " + endNum);
		System.out.println("뒷 자리 : " + endNum.substring(0, 2) + "*****");	// 0 ~ 1(2자)
		System.out.println("뒷 자리 : " + ssn.substring(7).substring(0, 2) + "*****");	// 0 ~ 1(2자) 추출 나머지는 *으로 끝까지 채움
	}
}
