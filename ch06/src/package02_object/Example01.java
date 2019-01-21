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
			// 아이디와 비밀번호가 같으면 true
			return id.equals(param.id) && pw.equals(param.pw);
		}
		return false;	// 아니면 false
	}
}

public class Example01 {
	public static void main(String[] args) {
		Member1 m1 = new Member1("itbank", "1111", 20);
		Member1 m2 = new Member1("itbank", "1111", 25);
		
		// Object API 클래스의 equals 메소드 : 자신 객체와 상대방 객체가 같은지 다른지 확인할 때
		if(m1.equals(m2)) {
			System.out.println("같은 회원");
		} else {
			System.out.println("다른 회원");
		}
		
	}
}
