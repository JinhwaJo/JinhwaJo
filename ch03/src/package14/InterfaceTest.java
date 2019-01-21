package package14;

interface I {
	public abstract void play();
}

class A {
	void autoPlay(I i) {
		i.play();
	}
}

class B implements I {	// implements�� �ٿ��� �� ������ ����� ������ ���� �ʴ´�.
	@Override
	public void play() {
		System.out.println("B Class�� �����մϴ�.");
		
	}
	
}

class C implements I {
	@Override
	public void play() {
		System.out.println("C Class�� �����մϴ�.");
	}
}
	
public class InterfaceTest {
	public static void main(String[] args) {
		A a = new A();	// autoPlay ����� �����Ѵ�.
		// �ڽ� �ʿ��� ������ �޼ҵ�� �������̽��� ������ �� �ִ�.
		a.autoPlay(new B() {
			/* �͸� ���� ��ü : �̸� �����Ǿ� �ִ� �ڵ带 ���Ӱ� �����ϱ� ���� ���ȴ�.
			 * ���� autoPlayó�� ������ ���� �����Ǵ°� �ƴ϶�
			 * ���� ���� ����ڰ� �����Ͽ� ����ϴ� ���� �����ϴ�.
			 * { }(�߰�ȣ)�� ���� ���������� �������� �� �ֵ��� Override ���ְ�
			 * ���� ������ �ۼ��ϸ� �ȴ�. (�θ� Ŭ������ �߻�Ŭ�������� ����) */
			@Override
			public void play() {
				System.out.println("���� ���� ����� �����մϴ�.");
			}
		});	
		a.autoPlay(new C());
		
	}
}
