package package02_object;

class Member2 {
	String id;
	String pw;
	int age;
	
	public Member2(String id, String pw, int age) {
		super();
		this.id = id;
		this.pw = pw;
		this.age = age;
	}

	@Override
	public int hashCode() {
		int sum = 0;
		for(int i = 0; i < id.length(); i++) {
			char ch = id.charAt(i);
			sum += (int)ch;
		}
		for(int i = 0; i < pw.length(); i++) {
			char ch = pw.charAt(i);
			sum += (int)ch;
		}
		return sum; // ���̵�� ��й�ȣ�� �ƽ�Ű �ڵ� ���� ��� ���� �� ��ȯ
	}
}

public class Example02 {
	public static void main(String[] args) {
		Member2 m1 = new Member2("itbank", "1111", 20);
		Member2 m2 = new Member2("itbank", "1111", 30);
		
		/* Object Ŭ������ hashCode �޼ҵ带 ���� ����
		 * Member Ŭ������ ��ü�� �ּҰ��� �̿��� �ؽ� ���� ��ȯ�Ѵ�.
		 * �ؽ� ����� ����ϴ� HashMap�̳� HashSet�� ���� Ŭ������ ����� ��ü��
		 * �ݵ�� �ؽ��ڵ尡 �����ؾ� ������ ��ü�� �Ǵ��Ѵ�.		 */
		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
		
	}
}
