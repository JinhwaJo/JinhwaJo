package db;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/* DB 연동의 3가지 요소는 연결(Connection), 상태(Statement), 결과(ResultSet)
 * 결과는 상황에 따라 필요하지 않을 수 있다.
 * 예시1 - 아이디 비번을 입력하고 실행할 때는 결과가 필요함.
 * 예시2 - DB안에서 단순히 아이디의 변경만 이루어질 경우, JAVA에서 별다른 코딩변경이나 조작이 필요치 않음 - 결과가 불필요함. */
public class Selection {
	public static void main(String[] args) {
		// try와 finally 모두 쓸 수 있도록 바깥에다가 선언.
		Connection conn = null;
		PreparedStatement pstate = null;
		ResultSet rs = null;
		// JDBC 드라이버 동적 로딩을 할 수 없을 경우 예외 처리
		try {
			// 2. 연결 객체 생성
			// 위에서 JDBC 드라이버 동적 로딩이 되고나면 DriverManager를 사용할 수 있게 된다.
			conn = DBConnection.getConn();	// 연결 객체를 반환 받아서 conn에게 저장하기
			// 3. 쿼리를 저장하고 실행할 상태 객체 생성
			String query = "SELECT * FROM EMP";
			/* Statement는 작은 따옴표를 사용해줘야 하고, 이것이 자바에서 문자열을 나타내는 큰 따옴표와 같이 쓰여
			 * 코드의 내용이 길어지면 코딩에 혼란을 야기할 수 있다.
			 * 반면에, PreparedStatement를 사용하면 작은 따옴표를 사용하지 않아도 된다.	 */
			pstate = conn.prepareStatement(query);
			// 4. 쿼리를 실행하고, 결과 객체를 생성 
			rs = pstate.executeQuery();
				
			System.out.println("EMPNO | ENAME | JOB | MGR | HIREDATE | SAL | COMM | DEPTNO");
			// hasNext가 없고, next만 사용 가능하다.
			while(rs.next()) {	// 결과가 있으면 true 없으면 false
				// rs.next()가 레코드의 개수만큼 반복(EMP table이 15개 정도 레코드가 있었지 아마?)
				int empno = rs.getInt(1);
				String ename = rs.getString(2);
				String job = rs.getString(3);
				int mgr = rs.getInt(4);
				Date date = rs.getDate(5);
				int sal = rs.getInt(6);
				int comm = rs.getInt(7);
				int deptno = rs.getInt(8);
				String result = empno + " | " + ename + " | " + job + " | "
						 + mgr + " | " + date + " | " + sal + " | "
						 + comm + " | " + deptno;
				System.out.println(result);
			}
		} catch (SQLException e) {
			System.out.println("오라클 데이터베이스에 접속(연결)할 수 없습니다.");
		} catch (Exception e) {
			System.out.println("알 수 없는 오류가 발생하였습니다.");
		} finally {
			/* 자원 반납(메모리 해제) : 예외가 발생할 경우 통로 생성에 사용된 자원을 반납할 수 있도록 finally문을 작성
			 * 동적 로딩은 로딩되면 메모리에 남아 있지 않고 넘어가므로 따로 해제할 필요가 없고,
			 * 실행 후 해제해줘야할 중요한 3가지는 연결, 쿼리, 결과!!!	 */
			try {
				// 내부에 null이 있으면 반납할 필요가 없으므로 아래와 같이 if문 작성
				if(rs != null) rs.close();
				if(pstate != null) pstate.close();
				if(conn != null) conn.close();
			} catch (SQLException e) { }
		}
	}
}
