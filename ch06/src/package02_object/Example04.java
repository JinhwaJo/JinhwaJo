package package02_object;

/* clone 메소드를 재정의한 클래스는 반드시 Cloneable 인터페이스를 구현해야 한다.
 * 데이터의 복사는 기존 데이터의 훼손을 가져올 수 있으므로, 자바에서 허락하지 않는다.
 * 그러나 개발자가 필요하다면 복사를 허용할 수 있도록 Cloneable 인터페이스를 제공한다. */
class Member4 implements Cloneable {
	String id;
	String pw;
	int age;
	
	public Member4(String id, String pw, int age) {
		super();
		this.id = id;
		this.pw = pw;
		this.age = age;
	}
	
	@Override
	/* 오버라이딩된 메소드의 반환형을 변경할 수 있는데,
	 * 부모 클래스의 자식 클래스 타입으로만 변경이 가능하다.(JDK 1.5 버전 이후)
	 * 아래와 같이 Overriding 안에 한번만 타입변환 해놓으면 된다.	 */
	protected Member4 clone() {
		Object obj = null;
		try {
			/* clone을 생성하면 obj가 알아서 clone 메소드를 만들어서 대입하고, 기존 주소를 그대로 받는다.
			 * 그래서 같은 객체를 참조하므로, 객체 정보를 변경하면 clone에 까지 변경 적용이 되어버린다.(문제점)
			 * 이 문제점에 대한 예제를 다음 Example05에서 확인해보자.	*/
			obj = super.clone();	// Object가 만든 clone 메소드를 호출하면 됨.
		} catch(CloneNotSupportedException e) {
			System.out.println("Cloneable을 구현하지 않았습니다.");
		}
		return (Member4)obj;
	}
}

public class Example04 {
	public static void main(String[] args) {
		Member4 m1 = new Member4("itbank1", "1111", 20);
		Member4 m2;
		// 부모 껍데기(obj)로 반환하고 있기 때문에, 객체인 m2에 바로 대입할 수 없다. 그래서 강제 타입변환이 필요하다.
		m2 = m1.clone();	// 객체 복사

		m1.id = "it";
		System.out.println(m1.id);
		System.out.println(m2.id);		
	}
}
