package package05;

public class Test {
	// 인스턴스(일반) 메소드
	public void instance_method() {
		System.out.println("나는 객체를 생성해 객체로 사용할 수 있음.");
		}
	//스테틱(정적) 메소드
	public static void static_method() {
		System.out.println("나는 클래스 이름으로 사용할 수 있음.");
		
		/* 나와 남을 비교할 때는 객체가 필요하므로 인스턴스 메소드를 사용
		 * 나 혼자 비교할 때는 객체가 필요없으므로 스테틱 메소드 사용
		 * 인스턴스 메소드와 스테틱 메소드를 사용해야하는 상황을 구별할 줄 알아야 한다. */
	}
}
