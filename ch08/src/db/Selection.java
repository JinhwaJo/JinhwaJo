package db;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/* DB ������ 3���� ��Ҵ� ����(Connection), ����(Statement), ���(ResultSet)
 * ����� ��Ȳ�� ���� �ʿ����� ���� �� �ִ�.
 * ����1 - ���̵� ����� �Է��ϰ� ������ ���� ����� �ʿ���.
 * ����2 - DB�ȿ��� �ܼ��� ���̵��� ���游 �̷���� ���, JAVA���� ���ٸ� �ڵ������̳� ������ �ʿ�ġ ���� - ����� ���ʿ���. */
public class Selection {
	public static void main(String[] args) {
		// try�� finally ��� �� �� �ֵ��� �ٱ����ٰ� ����.
		Connection conn = null;
		PreparedStatement pstate = null;
		ResultSet rs = null;
		// JDBC ����̹� ���� �ε��� �� �� ���� ��� ���� ó��
		try {
			// 2. ���� ��ü ����
			// ������ JDBC ����̹� ���� �ε��� �ǰ��� DriverManager�� ����� �� �ְ� �ȴ�.
			conn = DBConnection.getConn();	// ���� ��ü�� ��ȯ �޾Ƽ� conn���� �����ϱ�
			// 3. ������ �����ϰ� ������ ���� ��ü ����
			String query = "SELECT * FROM EMP";
			/* Statement�� ���� ����ǥ�� �������� �ϰ�, �̰��� �ڹٿ��� ���ڿ��� ��Ÿ���� ū ����ǥ�� ���� ����
			 * �ڵ��� ������ ������� �ڵ��� ȥ���� �߱��� �� �ִ�.
			 * �ݸ鿡, PreparedStatement�� ����ϸ� ���� ����ǥ�� ������� �ʾƵ� �ȴ�.	 */
			pstate = conn.prepareStatement(query);
			// 4. ������ �����ϰ�, ��� ��ü�� ���� 
			rs = pstate.executeQuery();
				
			System.out.println("EMPNO | ENAME | JOB | MGR | HIREDATE | SAL | COMM | DEPTNO");
			// hasNext�� ����, next�� ��� �����ϴ�.
			while(rs.next()) {	// ����� ������ true ������ false
				// rs.next()�� ���ڵ��� ������ŭ �ݺ�(EMP table�� 15�� ���� ���ڵ尡 �־��� �Ƹ�?)
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
			System.out.println("����Ŭ �����ͺ��̽��� ����(����)�� �� �����ϴ�.");
		} catch (Exception e) {
			System.out.println("�� �� ���� ������ �߻��Ͽ����ϴ�.");
		} finally {
			/* �ڿ� �ݳ�(�޸� ����) : ���ܰ� �߻��� ��� ��� ������ ���� �ڿ��� �ݳ��� �� �ֵ��� finally���� �ۼ�
			 * ���� �ε��� �ε��Ǹ� �޸𸮿� ���� ���� �ʰ� �Ѿ�Ƿ� ���� ������ �ʿ䰡 ����,
			 * ���� �� ����������� �߿��� 3������ ����, ����, ���!!!	 */
			try {
				// ���ο� null�� ������ �ݳ��� �ʿ䰡 �����Ƿ� �Ʒ��� ���� if�� �ۼ�
				if(rs != null) rs.close();
				if(pstate != null) pstate.close();
				if(conn != null) conn.close();
			} catch (SQLException e) { }
		}
	}
}
