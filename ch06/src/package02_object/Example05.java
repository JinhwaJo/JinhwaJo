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
	
	Identifier identifier; // 다른 객체를 포함하고 있는 경우(객체의 주소 저장)
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
			System.out.println("Cloneable을 구현하지 않았습니다.");
		}
		// 자바의 정석 460 page를 참조하자.
		/* 자식 객체 m1이 clone을 호출하므로, m1의 내용을 수정하여 m2에 대입해줘야 한다.
		 * 이때, 모든 객체의 부모는 Object라는 걸 떠올리자.
		 * 부모가 자식 객체를 저장하므로, 자식 객체인 m1의 수정을 위해선 부모가 수정해서 다시 물려줘야한다는 걸 알 수 있다.
		 * 부모는 자식의 객체를 사용할 수 없으므로, Object가 자식의 객체를 쓸 수 있도록 자식으로 타입변환 해주고	 */
		Member5 m = (Member5)obj;
		// 새로운 객체를 만들어 대입해준다음, id와 pw를 복사해준다.
		m.identifier = new Identifier(this.identifier.id, this.identifier.pw);
		return m;
	}
}

public class Example05 {
	public static void main(String[] args) {
		Member5 m1 = new Member5(new Identifier("itbank", "1111"), 20);
		Member5 m2 = m1.clone();
		
		m1.identifier.id = "it";	// 원본의 아이디를 변경했을 때
		System.out.println(m1.identifier.id);	// 원본
		System.out.println(m2.identifier.id);	// 사본까지 모두 변경됨.(문제점)
		
	}
}
