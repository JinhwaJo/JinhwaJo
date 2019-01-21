package package10;

public class Child2 extends Parent {
	// 반드시 부모가 만들어 놓은 메소드를 아래와 같이 완성한다.
	@Override
	public void method2() {
		System.out.println("씻고 가겠습니다.");
	}
	
	public static void main(String[] args) {
		//Parent p = new Parent();	- 추상 클래스에서는 새로운 객체를 생성할 수 없다.
		Parent p = new Child1();
		p.method1();	// 공통된 기능 호출
		p.method2();	// 자식마다 다른 기능 호출
		
		p = new Child2();
		p.method1(); // 공통된 기능 호출
		p.method2(); // 자식마다 다른 기능 호출
	}

}
