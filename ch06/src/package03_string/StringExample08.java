package package03_string;

public class StringExample08 {
	public static void main(String[] args) {
		String fileName = "itbank.txt";
		
		// "txt" 가 fileName 문자열의 맨 끝에 있으면 true 없으면 false
		if(fileName.endsWith("txt")) {
			System.out.println("텍스트 문서입니다.");
		} else if(fileName.endsWith("hwp")) {
			System.out.println("아래 한글 문서입니다.");
		} else {
			System.out.println("이 외의 문서입니다.");
		}
	}
}
