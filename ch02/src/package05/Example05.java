package package05;

public class Example05 {
	public static void main(String[] args) {
		// ���� �ν��Ͻ� �޼ҵ� ����(��ü�� �����ϰ�, ��ü�� �̸����� ���)
		// 1. ��ü�� �����Ѵ�.
		String s = new String("���ڿ�");
		// 2. ��ü�� ����� ����Ѵ�.
		System.out.println(s.length() + "��");
		// length�� �ν��Ͻ� �޼ҵ��̸�, s�� ��ü�� �̸�
		
		// �Ʒ��� ����ƽ �޼ҵ� ����(Ŭ���� �̸����� ���(��ü�� �ʿ����))
		int number = 123;
		// 1. ��ü ���� ����� ����Ѵ�.
		String a = String.valueOf(number);
		// valueOf�� ����ƽ �޼ҵ��̸�, String�� Ŭ���� �̸�
		System.out.println(a + 1);
		
		/********************************************/
		
		Test.static_method(); 	// Ŭ���� ��.�޼ҵ� ��() (static)
		
		Test t = new Test();	// ��ü ���� ��
		t.static_method();		// ��ü ��.�޼ҵ� ��() (instance)
		/* ��ü�� �̸����� static �޼ҵ带 ����Ϸ��� ��������� �ƴϹǷ�
		������ �Ǵ��� bad code ��� ���. */
	}
}
