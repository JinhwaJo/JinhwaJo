package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Selection2_my {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
		conn = DBConnection.getConn();
		String query = "SELECT ENAME, SAL, NVL(COMM, 0) AS COMM,"
				+ "SAL*12+NVL(COMM,0) AS ANNSAL(WITH COMM) FROM EMP";
		
			pstmt = conn.prepareStatement(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
