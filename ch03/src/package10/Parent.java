package package10;
// �߻� Ŭ���� : �̿ϼ� ���赵 (�θ��ʿ��� ����) ���α׷��� ��� Ȱ�� 47 page ����
public abstract class Parent {	// �θ� Ŭ����
	Parent() {
		System.out.println("���� �������Դϴ�.");
	}
	public void method1() {
		System.out.println("���� �ν��Ͻ� �޼ҵ� �Դϴ�.");
	}
	// �̿ϼ�(�߻�) �޼ҵ� : �ڽ� Ŭ�������� �� �޼ҵ带 �ݵ�� �ϼ��ؾ� �Ѵ�. (������)
	/* �Ʒ��� Ʋ�� �����̴�. �߰�ȣ�� ���� �� ����.
	 * public abstract void method2() {
		System.out.println("");
	} */
	// �߻� �޼ҵ�� �����ݷ��� �� �������Ѵ�.
	public abstract void method2();
	
}
