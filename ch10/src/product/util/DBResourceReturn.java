package product.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBResourceReturn {
// 메소드 이름을 간단하게 close로 모두 변경
	public static void close(ResultSet rs) {
		if(rs != null) {
			try { rs.close(); } catch(SQLException e) { }
		}
		
	}

	public static void close(PreparedStatement pstmt) {
		if(pstmt != null) {
			try { pstmt.close(); } catch(SQLException e) { }
		}
		
	}

	public static void close(Connection conn) {
		if(conn != null) {
			try { conn.close(); } catch(SQLException e) { }
		}
		
	}
	
}
