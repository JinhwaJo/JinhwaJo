package db;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class SequenceIncrement {
	private static Statement stmt = null;
	public static void idMinus(Connection conn) throws SQLException{
		stmt = conn.createStatement();
		stmt.execute("alter sequence STD_ID increment by -1");
		stmt.close();
		
		stmt = conn.createStatement();
		stmt.execute("SELECT STD_ID.NEXTVAL FROM DUAL");
		stmt.close();
		
		stmt = conn.createStatement();
		stmt.execute("alter sequence STD_ID increment by 1");
		stmt.close();
	}
}
