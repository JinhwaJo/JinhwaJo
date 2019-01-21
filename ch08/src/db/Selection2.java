package db;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Selection2 {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBConnection.getConn();
			String query = "SELECT ENAME,SAL,COMM,SAL*12+COMM AS TOTSAL FROM EMP";
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				String ename = space(rs.getString(1));
				String sal = space(rs.getInt(2));
				String comm = space(rs.getInt(3));
				String total = space(rs.getInt(4));
				System.out.println(ename + " | " + sal + " | " 
				+ comm + " | " + total);
			}
			
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			DBResourceReturn.resultSetReturn(rs);
			DBResourceReturn.preparedStatementReturn(pstmt);
			DBResourceReturn.connectionReturn(conn);
		}
	}
	
	private static String space(String str) {
		int len = 10 - str.length(); 
		while((len--) > 0) {
			str = " " + str;
		}
		return str;
	}
	private static String space(int n) {
		String str = String.valueOf(n);
		str = space(str);
		return str;
	}
}
