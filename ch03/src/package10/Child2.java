package package10;

public class Child2 extends Parent {
	// �ݵ�� �θ� ����� ���� �޼ҵ带 �Ʒ��� ���� �ϼ��Ѵ�.
	@Override
	public void method2() {
		System.out.println("�İ� ���ڽ��ϴ�.");
	}
	
	public static void main(String[] args) {
		//Parent p = new Parent();	- �߻� Ŭ���������� ���ο� ��ü�� ������ �� ����.
		Parent p = new Child1();
		p.method1();	// ����� ��� ȣ��
		p.method2();	// �ڽĸ��� �ٸ� ��� ȣ��
		
		p = new Child2();
		p.method1(); // ����� ��� ȣ��
		p.method2(); // �ڽĸ��� �ٸ� ��� ȣ��
	}

}
