package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Selection1 {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// 우리에게 필요한 3가지를 적어보자.
		Connection conn = null;			// 1. 연결
		PreparedStatement pstmt = null;	// 2. 상태
		ResultSet rs = null;			// 3. 결과
		try {
			// 1. 연결 객체를 반환 받아서 conn에게 저장하기
			conn = DBConnection.getConn();
			// 2. 쿼리 작성하기 (첫번째 ?는 1번)
			String query = "SELECT ENAME, JOB, DEPTNO FROM EMP"
					+ " WHERE DEPTNO = ? OR JOB = ?";	// 쿼리 안에는 세미콜론을 쓰지 않는다.
			System.out.print("직책 입력 : ");
			String inputJob = sc.next().trim();
			System.out.print("부서번호 입력 : ");
			int inputDeptno = sc.nextInt();
			// 3. 쿼리를 상태 객체에 저장하고, 연결 객체로부터 상태 객체 반환하기
			// 위에서 알 수 있듯이, 연결객체를 받은 건 conn이다.
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, inputDeptno);	// 첫 번째 ? 에는 입력한 부서 번호를
			pstmt.setString(2, inputJob);	// 두 번째 ? 에는 입력한 직책을 쿼리에 등록
			// 4. pstmt(상태 변수)에 query 저장 및 결과 객체 반환
			// 3번이 끝나면 상태객체에 query가 저장되어 있다.
			rs = pstmt.executeQuery();
			// 5. 결과 객체 사용하기
			while(rs.next()) {	// 다음 레코드 인덱스로 이동하면서 true 또는 false 반환
				// 결과 값을 도출하기 위해 get 메소드를 사용한다.
				// 테이블의 각 컬럼에는 번호가 매겨져 있다. 도출하고자 하는 컬럼의 자료형과 번호에 유의하여 사용한다.
				String ename = rs.getString(1);	// ENAME 컬럼의 값
				String job = rs.getString(2);	// JOB 컬럼의 값
				int deptno = rs.getInt(3);		// DEPTNO 컬럼의 값을 추출
				// 결과를 콘솔창에 출력
				System.out.println(ename + " | " + job + " | " + deptno);
			}
		} catch (SQLException e) {
			System.out.println("SQL문을 실행할 수 없습니다.");
		} finally {
			// 6. try 또는 catch 실행 여부에 관계 없이 자원 반납하기 (순서를 거꾸로 한다)
			DBResourceReturn.resultSetReturn(rs);
			DBResourceReturn.preparedStatementReturn(pstmt);
			DBResourceReturn.connectionReturn(conn);
		}
		
	}	
}
