package package02_object;

class Identifier {
	String id;
	String pw;
	public Identifier(String id, String pw) {
		this.id = id;
		this.pw = pw;
		
	}
}

class Member5 implements Cloneable {
	
	Identifier identifier; // �ٸ� ��ü�� �����ϰ� �ִ� ���(��ü�� �ּ� ����)
	int age;
	public Member5(Identifier identifier, int age) {
		this.identifier = identifier;
		this.age = age;
	}
	public Member5(Member5 m) {
		this.identifier = m.identifier;
		this.age = m.age;
	}
	@Override
	public Member5 clone() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch(CloneNotSupportedException e) {
			System.out.println("Cloneable�� �������� �ʾҽ��ϴ�.");
		}
		// �ڹ��� ���� 460 page�� ��������.
		/* �ڽ� ��ü m1�� clone�� ȣ���ϹǷ�, m1�� ������ �����Ͽ� m2�� ��������� �Ѵ�.
		 * �̶�, ��� ��ü�� �θ�� Object��� �� ���ø���.
		 * �θ� �ڽ� ��ü�� �����ϹǷ�, �ڽ� ��ü�� m1�� ������ ���ؼ� �θ� �����ؼ� �ٽ� ��������Ѵٴ� �� �� �� �ִ�.
		 * �θ�� �ڽ��� ��ü�� ����� �� �����Ƿ�, Object�� �ڽ��� ��ü�� �� �� �ֵ��� �ڽ����� Ÿ�Ժ�ȯ ���ְ�	 */
		Member5 m = (Member5)obj;
		// ���ο� ��ü�� ����� �������ش���, id�� pw�� �������ش�.
		m.identifier = new Identifier(this.identifier.id, this.identifier.pw);
		return m;
	}
}

public class Example05 {
	public static void main(String[] args) {
		Member5 m1 = new Member5(new Identifier("itbank", "1111"), 20);
		Member5 m2 = m1.clone();
		
		m1.identifier.id = "it";	// ������ ���̵� �������� ��
		System.out.println(m1.identifier.id);	// ����
		System.out.println(m2.identifier.id);	// �纻���� ��� �����.(������)
		
	}
}
