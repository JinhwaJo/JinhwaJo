package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// DB 연결 객체를 반환하는 클래스
public class DBConnection {
	private static Connection conn = null;	// 연결 객체는 하나만 있으면 되니 공유할 수 있도록 static으로 만들어준다.

	public static Connection getConn() {
		// DB에 연결되지 않을 경우 예외 처리
		try {
			// 1. JDBC 드라이버(연결통로 공사하는 친구) 동적 로딩(메모리에 적재)
			// oracle.jdbc.driver.(패키지 이름)OracleDriver(클래스이름)
			// DB 연동 시에는 new가 아닌 Class.forName를 사용하는데 이 것을 쓰려면 try... catch...가 꼭 필요하다.
			Class.forName("oracle.jdbc.driver.OracleDriver");
			try {
				String userId = "SCHOOL";	// 계정 정보(Id)
				String userPw = "kg";	// 계정 정보(Pw)
				String url = "jdbc:oracle:thin:@localhost:1521:orcl";	// localhost에 자동으로 자기 자신의 IP주소가 들어감
				conn = DriverManager.getConnection(url, userId, userPw);
			} catch (SQLException e) {
				System.out.println("계정 및 비밀번호 또는 URL이 틀렸습니다.");
			}
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버를 로딩할 수 없습니다.");
		}
		
		return conn;	// null 또는 연결 객체를 반환한다.
	}
}
