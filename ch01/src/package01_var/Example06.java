package package01_var;

public class Example06 {
	public static void main(String[] args) {
		/* ����, a �� b ��  '�λ�', c �� '����' �� �ּҸ� �����ϰ� �ִٰ� �ϸ�
		 * a == c�� false�� ������� ���´�. 
		 */
		String a = "abc";
		String b = "abc";
		String c = new String("abc");
		
		System.out.println(a == b);
		System.out.println(a == c);
		/* ������, �Ʒ��� ���� c(����)�� a�� �����ϰ� �Ǹ�,
		 * a �� c �� �����ϰ� ������ �����ϰ� �Ǹ鼭
		 * a == c�� true�� �ȴ�.
		 */
		a = c;
		System.out.println(a == c);
		
		
		
		
	}
}
