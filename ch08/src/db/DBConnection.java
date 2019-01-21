package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// DB ���� ��ü�� ��ȯ�ϴ� Ŭ����
public class DBConnection {
	private static Connection conn = null;	// ���� ��ü�� �ϳ��� ������ �Ǵ� ������ �� �ֵ��� static���� ������ش�.

	public static Connection getConn() {
		// DB�� ������� ���� ��� ���� ó��
		try {
			// 1. JDBC ����̹�(������� �����ϴ� ģ��) ���� �ε�(�޸𸮿� ����)
			// oracle.jdbc.driver.(��Ű�� �̸�)OracleDriver(Ŭ�����̸�)
			// DB ���� �ÿ��� new�� �ƴ� Class.forName�� ����ϴµ� �� ���� ������ try... catch...�� �� �ʿ��ϴ�.
			Class.forName("oracle.jdbc.driver.OracleDriver");
			try {
				String userId = "SCHOOL";	// ���� ����(Id)
				String userPw = "kg";	// ���� ����(Pw)
				String url = "jdbc:oracle:thin:@localhost:1521:orcl";	// localhost�� �ڵ����� �ڱ� �ڽ��� IP�ּҰ� ��
				conn = DriverManager.getConnection(url, userId, userPw);
			} catch (SQLException e) {
				System.out.println("���� �� ��й�ȣ �Ǵ� URL�� Ʋ�Ƚ��ϴ�.");
			}
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC ����̹��� �ε��� �� �����ϴ�.");
		}
		
		return conn;	// null �Ǵ� ���� ��ü�� ��ȯ�Ѵ�.
	}
}
