package package02_object;

/* clone �޼ҵ带 �������� Ŭ������ �ݵ�� Cloneable �������̽��� �����ؾ� �Ѵ�.
 * �������� ����� ���� �������� �Ѽ��� ������ �� �����Ƿ�, �ڹٿ��� ������� �ʴ´�.
 * �׷��� �����ڰ� �ʿ��ϴٸ� ���縦 ����� �� �ֵ��� Cloneable �������̽��� �����Ѵ�. */
class Member4 implements Cloneable {
	String id;
	String pw;
	int age;
	
	public Member4(String id, String pw, int age) {
		super();
		this.id = id;
		this.pw = pw;
		this.age = age;
	}
	
	@Override
	/* �������̵��� �޼ҵ��� ��ȯ���� ������ �� �ִµ�,
	 * �θ� Ŭ������ �ڽ� Ŭ���� Ÿ�����θ� ������ �����ϴ�.(JDK 1.5 ���� ����)
	 * �Ʒ��� ���� Overriding �ȿ� �ѹ��� Ÿ�Ժ�ȯ �س����� �ȴ�.	 */
	protected Member4 clone() {
		Object obj = null;
		try {
			/* clone�� �����ϸ� obj�� �˾Ƽ� clone �޼ҵ带 ���� �����ϰ�, ���� �ּҸ� �״�� �޴´�.
			 * �׷��� ���� ��ü�� �����ϹǷ�, ��ü ������ �����ϸ� clone�� ���� ���� ������ �Ǿ������.(������)
			 * �� �������� ���� ������ ���� Example05���� Ȯ���غ���.	*/
			obj = super.clone();	// Object�� ���� clone �޼ҵ带 ȣ���ϸ� ��.
		} catch(CloneNotSupportedException e) {
			System.out.println("Cloneable�� �������� �ʾҽ��ϴ�.");
		}
		return (Member4)obj;
	}
}

public class Example04 {
	public static void main(String[] args) {
		Member4 m1 = new Member4("itbank1", "1111", 20);
		Member4 m2;
		// �θ� ������(obj)�� ��ȯ�ϰ� �ֱ� ������, ��ü�� m2�� �ٷ� ������ �� ����. �׷��� ���� Ÿ�Ժ�ȯ�� �ʿ��ϴ�.
		m2 = m1.clone();	// ��ü ����

		m1.id = "it";
		System.out.println(m1.id);
		System.out.println(m2.id);		
	}
}
