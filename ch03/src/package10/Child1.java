package package10;

public class Child1 extends Parent {
	public Child1() {
		super();
	}
	
	// 반드시 부모가 만들어 놓은 메소드를 아래와 같이 완성한다.
	@Override
	public void method2() {
		System.out.println("밥 먹고 가겠습니다.");
		
	}
}
