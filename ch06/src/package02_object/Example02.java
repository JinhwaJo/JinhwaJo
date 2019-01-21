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
		return sum; // 아이디와 비밀번호의 아스키 코드 값을 모두 더한 후 반환
	}
}

public class Example02 {
	public static void main(String[] args) {
		Member2 m1 = new Member2("itbank", "1111", 20);
		Member2 m2 = new Member2("itbank", "1111", 30);
		
		/* Object 클래스의 hashCode 메소드를 물려 받은
		 * Member 클래스는 객체의 주소값을 이용한 해시 값을 반환한다.
		 * 해싱 기법을 사용하는 HashMap이나 HashSet과 같은 클래스에 저장될 객체는
		 * 반드시 해시코드가 동일해야 동일한 객체로 판단한다.		 */
		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
		
	}
}
