package package12;

// ���α׷��� ��� Ȱ�� 47 page ����

public interface Runnable {
	// �������̽������� �߻� �޼ҵ常 ����� �ִ�.
	/* �������̽����� �ʵ��� ������ �����ϳ� ����� ��� ������ �ݵ�� ���� �ʱ�ȭ�Ǿ� �־�� �Ѵ�.
	 * final static �� �ڵ����� ������ �ؼ��Ǿ�����.	(final static�� �ٿ��� �����ص� �������.) */
	boolean START = false;
	/* �������̽��� ����� ��� �Լ�(�޼ҵ�)�� ������ �� ����.
	 * abstract�� �ڵ����� ������ �ؼ��ȴ�. (abstract�� �ٿ��� �����ص� �������.) */
	public void run();
	// �������� abstract�� ���� �� �־�����, �Ʒ��� ���� �ڹ�8 ���� �߰��� ����� �ִ�.
	default public void stop() {	// default �޼ҵ� : ������ ����������.
		System.out.println("������ ����ϴ�.");
		}
	static public void message() {	// static �޼ҵ� : ��ü ���� ȣ�� ������ �޼ҵ�
		System.out.println("�˸�â");
	}
}

// ������ ����ϴ� ��ɾ� implements Runnable
class A implements Runnable {

	@Override
	public void run() {
		System.out.println("A ��ü�� ����˴ϴ�.");
		
	}
	
}

class B implements Runnable {

	@Override
	public void run() {
		System.out.println("B ��ü�� ����˴ϴ�.");
		
	}
	
}

class Test {
	public static void main(String[] args) {
		Runnable r = new A();
		r.run();	// A ���α׷� ����
		
		r = new B();
		r.run();	// B ���α׷� ����
		
		r.stop();
	}
}