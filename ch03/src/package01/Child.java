package package01;

// �ڽ� Ŭ���� : �̹� ������� Ŭ������ ����� �״�� ���� �޴� Ŭ����
public class Child extends Parent {
	// extends�� Parent ����� ���� �ްڴٴ� ��ɾ�
	int x;	// �ʵ�� �Ķ���
	/* parent Ŭ������ ��ӹ޾ұ� ������ x��� ������ ���� �������� �ʾƵ� �ȴ�.
	 * �Ȱ��� x������ �����ϸ� �ڱ� ���� �켱������ ����.	 */
	
	/* this�� �θ��� ������ �� ���� �ִ�.
	 * ���� int x�� �ڽ��� ���ӿ��� �������� �� �ؿ� this�� ����� x ������ ������ ���� �ʴ´�.
	 * �̴�, �ڽ��� ������ ������� this�� �θ��� ������ �޾ұ� �����̴�. 	*/
	public void method() {
		int x = 10;	// ���������� ����		
		// Ŭ������ �����ϸ� �ʵ尡 ������, �޼ҵ� �ȿ����� ���������� �ȴ�.
		super.x = 7;	// �θ�(super)�� x ����
		this.x = 5;			// �ڽ�()�� x ����
		System.out.println(super.x);	// �θ��� �ʵ�
		System.out.println(this.x);		// �ڽ��� �ʵ�
		System.out.println(x);			// ���� ����
	}
	
	public static void main(String[] args) {
		Child child = new Child();
		child.method();
	}
}
