package package09;

public class Connection {
	private static Connection connection = new Connection();
	
	private Connection() {
		// public일 때는 누구나 접근이 가능하므로, 접근 제한자 private를 써준다.
		// 외부에서 객체를 여러 개 생성하지 못하게 하기 위해 private를 써준다.
		
	}
	public static Connection getInstance() {
		return connection;
		/* 외부에서 객체를 사용하게 하기 위해 public를 써주고
		 * 공유해줘야하므로 static을 붙여준다.
		 * Instance와 객체는 같은 말이다.
		 */
		
	}
}
