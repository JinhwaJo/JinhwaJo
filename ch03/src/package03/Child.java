package package03;

public class Child extends Parent {
	public void method3() {
		System.out.println("Child method3() ȣ���.");
	}
	// �θ� Ŭ������ �޼ҵ带 ������(Overriding(�������̵�))�Ѵ�.(����� �ٲ�)
	@Override // annotation�� ���̸� �Ʒ��� ���� �߸��� �Ϳ� ���� ���޽����� �ش�.
	// public void method2(int a) {
	public void method2() {
		System.out.println("Hello, world.");
	}
	// Cf. �����ε��� �Ȱ��� �޼ҵ��ε� �Ű������� �޸��Ͽ� �Է� ���� �ٸ��� ������ �� �ִ� ��.
	public static void main(String[] args) {
		Child child = new Child();	// �ڽ� ��ü ����
		child.method1();	// �θ��� �޼ҵ�1
		child.method2();	// �θ��� �޼ҵ�2
		child.method3();	// �ڽ��� �޼ҵ�3
		
	}
}
