package package02_op;

public class Example01 {
	public static void main(String[] args) {
		int n = -5; //n = -5
		int c;
		c = -n; //c = -(-5)
		System.out.println(n);
		System.out.println(c);
		n = -n;
		System.out.println(n);
		
		boolean is = true;
		is = !is;
		System.out.println(is); // is�� !is�� ���������Ƿ� false
		System.out.println(!is); // ���� ���� �ٽ� ���� ��Ű�Ƿ� true�� �ȴ�.

		int a = 5;
		a++; // ++�� 1 ����, --�� 1 ���� (2 �� �����ǰų� �׷��� ����.)
		System.out.println(a++); // ���� �ڿ� ++�� ���������� �Ǽ� ���� ���ο� �����ǰ� ��� ������� �ʴ´�. �׷��� ��� 6�̴�.
		System.out.println(a);
		System.out.println(++a); // ++�� ���� �տ� ���� ���������� ��� ����ȴ�. �׷��� 8�̴�.
		System.out.println(a);
		int b = (a--);			// �������Ҷ� a�� ������ 8�̸� �� ���� b�� ����ȴ�. ���� �ٿ��� a�� 7�� �ȴ�. 
		System.out.println(a);	// 7
		System.out.println(b);	// 8
		
		a = 5;
		b = 2;
		a = (a++) - (--b);
		/* ���������� �ǹǷ� a�� ������ 5�̹Ƿ�, 5-1 = 4�� �ǰ�, ���������Ǽ� �Ʒ� ��� ���� 5�� �� �� ������
		 * a�� ������ �ϸ� ���������� ������� �ʴ´�.
		 * ���������� ���������� ��� �� ���� �ش� ���� �״�� �����ϸ� ������� �ʴ´�. (++ ���� = �� �켱�Ѵ�.) 	*/
		System.out.println(a);
		
	}
}
