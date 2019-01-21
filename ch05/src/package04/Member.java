package package04;

public class Member {
	private String id;
	private String pw;
	private int age;
	
	public Member() {}
	public Member(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	// 1. equals �޼ҵ带 �ۼ��Ͽ� ��ü ���� ���� ���ϵ��� �ؾ��Ѵ�.
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member target = (Member)obj;
			// id�� id�� ����, pw�� pw�� ������ true�� ��ȯ�϶�
			if(this.id.equals(target.id) &&  this.pw.equals(target.pw)) {
				return true;
			}
		}
		return false;
	}
	// 2. �ؽ� ���� ������ ������ ��ȯ�ϵ��� �ؾ� �Ѵ�.
	/* �Ϲ������� �ؽ��ڵ�� �ּ� ���� ���� �ƴ� �ּ� ��ü�� ���� �ؽ��ڵ带 ��������,
	 * ���ڿ��� �ؽ��ڵ� �޼ҵ�� �ּҰ� �ƴ϶� ���� ���� �ؽ��ڵ带 ���Ѵ�.
	 * �ؽ��ڵ��� ��ȯ���� int�̱� ������ return Id + Pw�� �ϸ�,
	 * Id�� Pw�� ��ȯ���� ��� String�̱� ������ �ؽ��ڵ� �޼ҵ� �ȿ� ��ȯ�� �� ����.
	 * �׷���, id�� Pw�� �ؽ��ڵ�(16������ �̷���� �ؽ��ڵ�� int���̹Ƿ�)�� �̿��� ��ȯ  */
	@Override
	public int hashCode() {
		// age�� ���� int���̹Ƿ� ������ ��ȯ ���� �����ָ� �ȴ�.
		return id.hashCode() + pw.hashCode() + age;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
}
