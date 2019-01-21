package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Deletion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = DBConnection.getConn();	// 연결 객체 생성
			
			System.out.println("[ 학생 정보 삭제 ]");
			System.out.print("주민등록번호 입력 : ");
			String input_iden = sc.next().trim();
			
			String query = "DELETE FROM STUDENT WHERE ID = ?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, input_iden); // 첫 번째 ? 에다가 입력한 주민번호를 저장
			
			// 삭제 쿼리를 실행하고, CRUD된 레코드의 개수를 반환한다.
			int cnt = pstmt.executeUpdate(); // 반환형이 int이며, 업데이트한 행의 갯수를 반환한다. (반환형을 안적어줘도 된다)
			
			if(cnt == 0) {
				System.out.println("주민등록번호를 찾을 수 없습니다.");
			} else {
				System.out.println("총" + cnt + "명의 학생 정보가 삭제되었습니다.");
			}
		} catch(SQLException e) {
			// 자원 해제
			DBResourceReturn.resultSetReturn(rs);
			DBResourceReturn.preparedStatementReturn(pstmt);
			DBResourceReturn.connectionReturn(conn);
			System.out.println(e.getMessage());
		}
	}
}
