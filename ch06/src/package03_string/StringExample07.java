package package03_string;

public class StringExample07 {
	public static void main(String[] args) {
		String str1 = "java programming";
		String str2 = "JAVA programming";
		
		System.out.println(str1.toUpperCase());	// 대문자
		System.out.println(str2.toLowerCase());	// 소문자
		
		// 대소문자까지 구분하여 비교
		System.out.println(str1.equals(str2));
		// 대소문자와 관계없이 비교
		System.out.println(str1.equalsIgnoreCase(str2));
		
		System.out.println(str1.substring(0, 1).toUpperCase()
				+ str1.substring(1).toLowerCase());	// substring을 활용하여 맨 앞의 문자만 대문자로 출력
	}
}
