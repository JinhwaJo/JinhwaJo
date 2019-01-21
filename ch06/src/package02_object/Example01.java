package package02_object;

class Member1 {
	String id;
	String pw;
	int age;
	
	public Member1(String id, String pw, int age) {
		super();
		this.id = id;
		this.pw = pw;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Member1) {
			Member1 param = (Member1)obj;
			// ���̵�� ��й�ȣ�� ������ true
			return id.equals(param.id) && pw.equals(param.pw);
		}
		return false;	// �ƴϸ� false
	}
}

public class Example01 {
	public static void main(String[] args) {
		Member1 m1 = new Member1("itbank", "1111", 20);
		Member1 m2 = new Member1("itbank", "1111", 25);
		
		// Object API Ŭ������ equals �޼ҵ� : �ڽ� ��ü�� ���� ��ü�� ������ �ٸ��� Ȯ���� ��
		if(m1.equals(m2)) {
			System.out.println("���� ȸ��");
		} else {
			System.out.println("�ٸ� ȸ��");
		}
		
	}
}
