package exception_package;
// 프로그래밍 언어 활용 책 56 page 참조
/* - 정의
 * 프로그램 진행중 발생되는 에러를 통해 오작동 혹은 비정상적 종료를 막고
 * 예외 처리를 통해 정상적인 상태로 수습토록 유도
 * 
 * try{ } 구간이 있으면 반드시
 * 에러를 처리할 예외처리 : catch(예외클래스 인수) {} 구간이 필요
 * 
 * try ~ catch() 는 짝으로 이루어져야 한다.
 * 중간에 try가 더 삽입 되어서는 안 된다.
 * catch()는 예외 처리 클래스에 따라 오버로딩, 오버라이딩으로 여러 개를
 * 둘 수 있다.
 * 
 * finally { } (생략 가능)
 * 반드시 맨 마지막에 작성
 * 
 * 1. 에러 발생 예상 -> try { 에러를 발생시키는 코드 작성 }
 * 2. 예외 처리 -> catch(예외인수 e) { }
 * 3. 마지막 -> finally { 자원 해제 구문 작성, 예외처리가 되더라도 무조건 실행되어야만 하는 구문 작성 }
 * finally문은 catch문에 return이 있다해도 우선해서 실행되고 나가게 된다. */
public class Example01 {
	public static void main(String[] args) {
		// 값을 사용할 수 없는 null이 저장되어 있으므로, NullPointerException 발생
		String str = null;
		
		try {
			System.out.println(str.toString());
			/* catch 문 안에 오류가 발생한 클래스 이름과 변수 이름을 입력해준다.
			 * NullPointerException 같은 클래스 이름이나
			 * 부모 이름인 RuntimeException을 넣어도 된다.(대신 구체적인 내용을 알 수가 없음) */
		} catch(NullPointerException e) {	
			System.out.println("값을 입력 받지 못하였습니다.");
		}
	}
}
