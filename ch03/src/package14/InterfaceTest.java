package package14;

interface I {
	public abstract void play();
}

class A {
	void autoPlay(I i) {
		i.play();
	}
}

class B implements I {	// implements를 붙였을 때 구현을 해줘야 오류가 뜨지 않는다.
	@Override
	public void play() {
		System.out.println("B Class를 실행합니다.");
		
	}
	
}

class C implements I {
	@Override
	public void play() {
		System.out.println("C Class를 실행합니다.");
	}
}
	
public class InterfaceTest {
	public static void main(String[] args) {
		A a = new A();	// autoPlay 기능을 구현한다.
		// 자식 쪽에서 구현한 메소드는 인터페이스가 실행할 수 있다.
		a.autoPlay(new B() {
			/* 익명 구현 객체 : 미리 구현되어 있는 코드를 새롭게 구현하기 위해 사용된다.
			 * 위의 autoPlay처럼 고정된 값이 구현되는게 아니라
			 * 구현 값을 사용자가 수정하여 사용하는 것이 가능하다.
			 * { }(중괄호)를 열어 구현내용을 재정의할 수 있도록 Override 해주고
			 * 구현 내용을 작성하면 된다. (부모 클래스나 추상클래스에도 가능) */
			@Override
			public void play() {
				System.out.println("내가 만든 기능을 실행합니다.");
			}
		});	
		a.autoPlay(new C());
		
	}
}
