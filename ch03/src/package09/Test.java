package package09;

import java.util.Calendar;

public class Test {
	public static void main(String[] args) {
		/* 객체를 생성하는 2가지 방법 : 
		 * 1. new 연산자를 사용 - 프로그램을 실행할 때마다 연결 객체를 생성하겠다아
		 * 					- 메모리 부담이 크다
		 * 2. getInstance(); 사용 - 달력을 만들어 공유하겠다아
		 * 						- 공유해서 쓰므로 메모리는 하나만 저장되어 효율적이다. */
		
		/* Caldenar cal = new Calender(); 와 같이 new 연산자를 사용할 수 없도록 해야한다.
		 * 이를 위해서 클래스를 새로 생성하여 new 뒤에 오는 생성자를 공유하지 못하도록 접근 제한자를 사용한다.	 */
		// Singleton 객체(싱글톤) : 메모리에 유일한 객체
		Calendar cal = Calendar.getInstance();
		/* int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.println(hour + " : " + minute + " : " + second); */
		
		// Connection 이름으로 getInstance를 호출할 수 있어야한다.
		Connection conn1 = Connection.getInstance();
		Connection conn2 = Connection.getInstance();
		if(conn1 == conn2) {
			System.out.println("참조하는 메모리가 같습니다.");
		} else {
			System.out.println("참조하는 메모리가 다릅니다.");
		}
	}
}
