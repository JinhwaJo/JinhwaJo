package exception_package;

public class Example07 {
	private static int[] scores = new int[2];
	
	public static void main(String[] args) {
		try {
			method1();
			method2();
		} catch(IndexOutOfBoundsException e) {
			System.out.println("인덱스를 초과하였습니다.");
			// e가 밑의 throw new NumberFormatException(); 를 받는다.
		} catch(NumberFormatException e) {	
			System.out.println("숫자로 변환할 수 없습니다.");
		}
	}
	
	// 예외 떠넘기기(throws절) : 메소드에서 다른 메소드로 특정 예외를 더질 때 사용한다.
	private static void method1() throws NumberFormatException {
		// 예외 객체 생성(예외 강제 발생시키기) : throw뒤에 s가 붙고 안 붙고 차이다.
		throw new NumberFormatException(); // 이와 같은 예외 클래스가 생성되어 생략되어 있다.
		/* scores[0] = Integer.parseInt("1");
		scores[1] = Integer.parseInt("a"); */
	}
	
	private static void method2() throws IndexOutOfBoundsException {
		scores[2] = 2;
	}
}
