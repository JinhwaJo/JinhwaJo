package package10;
// 추상 클래스 : 미완성 설계도 (부모쪽에만 붙임) 프로그래밍 언어 활용 47 page 참조
public abstract class Parent {	// 부모 클래스
	Parent() {
		System.out.println("나는 생성자입니다.");
	}
	public void method1() {
		System.out.println("나는 인스턴스 메소드 입니다.");
	}
	// 미완성(추상) 메소드 : 자식 클래스에서 이 메소드를 반드시 완성해야 한다. (강제성)
	/* 아래는 틀린 형태이다. 중괄호를 가질 수 없음.
	 * public abstract void method2() {
		System.out.println("");
	} */
	// 추상 메소드는 세미콜론은 찍어서 마무리한다.
	public abstract void method2();
	
}
