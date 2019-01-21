package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBResourceReturn {

	public static void resultSetReturn(ResultSet rs) {
		if(rs != null) {
			try { rs.close(); } catch(SQLException e) { }
		}
		
	}

	public static void preparedStatementReturn(PreparedStatement pstmt) {
		if(pstmt != null) {
			try { pstmt.close(); } catch(SQLException e) { }
		}
		
	}

	public static void connectionReturn(Connection conn) {
		if(conn != null) {
			try { conn.close(); } catch(SQLException e) { }
		}
		
	}
	
}
