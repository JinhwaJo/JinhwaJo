package package01_var;

public class Example03 {
	public static void main(String[] args) {
		/* 123.456�� ����̸�  double�� ũ���� �����Ͷ� float�� ������ �� �����Ƿ�,
		�ڿ� F�� �ٿ� float���� �������ش�.
		*/
		float a = 123.456F; // float a = (float) 123.456�� ���� ���� ����ȯ ���ִ� ����̴�.
		double b = 123.456;
		
		a = 0.123456789123456789F;
		b = 0.123456789123456789;
		System.out.println(a); // 7�ڸ� : float�� ǥ���� �� �ִ� �ڸ������� ��µȴ�.
		System.out.println(b); // 15�ڸ� : double�� ǥ���� �� �ִ� �ڸ������� ��µȴ�.
		// �ڹٴ� ��� ������Ʈ�Ǹ� ���� �ҿ����ϱ� ������, ��µǴ� �ڸ��� �ణ�� ���̴� �߻��� �� �ִ�. 
		
		//e���� ����(e���� ���ڰ� ����̸� �ڷ� 0�� �ٿ��ְ�, �����̸� ������ �Ҽ����� �ش��ϴ� ����ŭ �̵��ϸ� �ȴ�.)
		a = 1e3F;
		b = 1e3;
		System.out.println(a);
		System.out.println(b);
	}
}
