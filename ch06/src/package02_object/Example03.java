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
		return id + "님의 나이는" + age + "세 입니다.";
	}

	
}

public class Example03 {
	public static void main(String[] args) {
		Member3 m1 = new Member3("itbank1", "1111", 20);
		Member3 m2 = new Member3("itbank2", "2222", 30);
		/* Object 클래스의 toString 메소드 : 객체의 정보를 표현할 때 사용
		 * 재정의하기 전에는
		 * return getClass().getName() + '@' + integer.toHexString(hashCode());
		 * 가 변환된다.		 */
		System.out.println(m1);
		System.out.println(m2.toString());
		
	}
}
