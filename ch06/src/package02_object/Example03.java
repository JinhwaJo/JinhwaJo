package package02_object;

class Member3 {
	String id;
	String pw;
	int age;
	
	public Member3(String id, String pw, int age) {
		super();
		this.id = id;
		this.pw = pw;
		this.age = age;
	}

	@Override
	public String toString() {
		return id + "���� ���̴�" + age + "�� �Դϴ�.";
	}

	
}

public class Example03 {
	public static void main(String[] args) {
		Member3 m1 = new Member3("itbank1", "1111", 20);
		Member3 m2 = new Member3("itbank2", "2222", 30);
		/* Object Ŭ������ toString �޼ҵ� : ��ü�� ������ ǥ���� �� ���
		 * �������ϱ� ������
		 * return getClass().getName() + '@' + integer.toHexString(hashCode());
		 * �� ��ȯ�ȴ�.		 */
		System.out.println(m1);
		System.out.println(m2.toString());
		
	}
}
