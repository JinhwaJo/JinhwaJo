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
	// 1. equals 메소드를 작성하여 객체 내의 값을 비교하도록 해야한다.
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member target = (Member)obj;
			// id랑 id랑 같고, pw랑 pw가 같으면 true를 반환하라
			if(this.id.equals(target.id) &&  this.pw.equals(target.pw)) {
				return true;
			}
		}
		return false;
	}
	// 2. 해시 값을 동일한 값으로 반환하도록 해야 한다.
	/* 일반적으로 해시코드는 주소 안의 값이 아닌 주소 자체를 보고 해시코드를 구하지만,
	 * 문자열의 해시코드 메소드는 주소가 아니라 값을 보고 해시코드를 구한다.
	 * 해시코드의 반환형이 int이기 때문에 return Id + Pw를 하면,
	 * Id와 Pw의 반환형이 모두 String이기 때문에 해시코드 메소드 안에 반환할 수 없다.
	 * 그래서, id와 Pw의 해시코드(16진수로 이루어진 해시코드는 int형이므로)를 이용해 반환  */
	@Override
	public int hashCode() {
		// age는 본래 int형이므로 별도로 변환 없이 적어주면 된다.
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
