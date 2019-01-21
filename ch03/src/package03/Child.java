package package03;

public class Child extends Parent {
	public void method3() {
		System.out.println("Child method3() 호출됨.");
	}
	// 부모 클래스의 메소드를 재정의(Overriding(오버라이딩))한다.(기능을 바꿈)
	@Override // annotation을 붙이면 아래와 같이 잘못된 것에 대한 경고메시지를 준다.
	// public void method2(int a) {
	public void method2() {
		System.out.println("Hello, world.");
	}
	// Cf. 오버로딩은 똑같은 메소드인데 매개변수를 달리하여 입력 값을 다르게 가져갈 수 있는 것.
	public static void main(String[] args) {
		Child child = new Child();	// 자식 객체 생성
		child.method1();	// 부모의 메소드1
		child.method2();	// 부모의 메소드2
		child.method3();	// 자식의 메소드3
		
	}
}
