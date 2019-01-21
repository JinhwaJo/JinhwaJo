package package12;

// 프로그래밍 언어 활용 47 page 참조

public interface Runnable {
	// 인터페이스에서는 추상 메소드만 만들수 있다.
	/* 인터페이스에서 필드의 생성은 가능하나 선언된 멤버 변수는 반드시 값이 초기화되어 있어야 한다.
	 * final static 이 자동으로 컴파일 해석되어진다.	(final static을 붙여도 생략해도 상관없다.) */
	boolean START = false;
	/* 인터페이스에 선언된 멤버 함수(메소드)는 구현할 수 없다.
	 * abstract가 자동으로 컴파일 해석된다. (abstract를 붙여도 생략해도 상관없다.) */
	public void run();
	// 기존에는 abstract는 만들 수 있었으나, 아래와 같이 자바8 이후 추가된 기능이 있다.
	default public void stop() {	// default 메소드 : 구현이 가능해진다.
		System.out.println("실행을 멈춥니다.");
		}
	static public void message() {	// static 메소드 : 객체 없이 호출 가능한 메소드
		System.out.println("알림창");
	}
}

// 구현시 사용하는 명령어 implements Runnable
class A implements Runnable {

	@Override
	public void run() {
		System.out.println("A 객체가 실행됩니다.");
		
	}
	
}

class B implements Runnable {

	@Override
	public void run() {
		System.out.println("B 객체가 실행됩니다.");
		
	}
	
}

class Test {
	public static void main(String[] args) {
		Runnable r = new A();
		r.run();	// A 프로그램 실행
		
		r = new B();
		r.run();	// B 프로그램 실행
		
		r.stop();
	}
}