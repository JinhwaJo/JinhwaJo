package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Updation {
	public static void main(String[] args) {
		// 주민등록번호를 입력받아 이름을 수정(변경)하여 저장하시오.
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Scanner sc = new Scanner(System.in);
		try {
			conn = DBConnection.getConn();	// 연결 객체 생성
			
			System.out.println("[ 학생 정보 수정 ]");
			System.out.print("주민등록번호 입력 : ");
			String input_iden = sc.next().trim();
			System.out.print("이름 입력 : ");
			String input_iname = sc.next().trim();
			
			String query = "UPDATE STUDENT SET SNAME = ? WHERE ID = ?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, input_iname);
			pstmt.setString(2, input_iden);
			int cnt = pstmt.executeUpdate();
			
			if(cnt == 0) {
				System.out.println("주민등록번호를 찾을 수 없습니다.");
			} else {
				System.out.println("총" + cnt + "명의 정보가 수정되었습니다.");
			}
			
			
		} catch(SQLException e) {
			DBResourceReturn.resultSetReturn(rs);
			DBResourceReturn.preparedStatementReturn(pstmt);
			DBResourceReturn.connectionReturn(conn);
			System.out.println(e.getMessage());
		}
	}
	
}
