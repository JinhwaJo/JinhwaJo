package package05;

public class Example05 {
	public static void main(String[] args) {
		// 위는 인스턴스 메소드 사용법(객체를 생성하고, 객체의 이름으로 사용)
		// 1. 객체를 생성한다.
		String s = new String("문자열");
		// 2. 객체의 기능을 사용한다.
		System.out.println(s.length() + "개");
		// length가 인스턴스 메소드이며, s가 객체의 이름
		
		// 아래는 스테틱 메소드 사용법(클래스 이름으로 사용(객체가 필요없음))
		int number = 123;
		// 1. 객체 없이 기능을 사용한다.
		String a = String.valueOf(number);
		// valueOf가 스테틱 메소드이며, String이 클래스 이름
		System.out.println(a + 1);
		
		/********************************************/
		
		Test.static_method(); 	// 클래스 명.메소드 명() (static)
		
		Test t = new Test();	// 객체 생성 후
		t.static_method();		// 객체 명.메소드 명() (instance)
		/* 객체의 이름으로 static 메소드를 사용하려고 만들어진게 아니므로
		실행이 되더라도 bad code 경고가 뜬다. */
	}
}
