package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Selection1 {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// �츮���� �ʿ��� 3������ �����.
		Connection conn = null;			// 1. ����
		PreparedStatement pstmt = null;	// 2. ����
		ResultSet rs = null;			// 3. ���
		try {
			// 1. ���� ��ü�� ��ȯ �޾Ƽ� conn���� �����ϱ�
			conn = DBConnection.getConn();
			// 2. ���� �ۼ��ϱ� (ù��° ?�� 1��)
			String query = "SELECT ENAME, JOB, DEPTNO FROM EMP"
					+ " WHERE DEPTNO = ? OR JOB = ?";	// ���� �ȿ��� �����ݷ��� ���� �ʴ´�.
			System.out.print("��å �Է� : ");
			String inputJob = sc.next().trim();
			System.out.print("�μ���ȣ �Է� : ");
			int inputDeptno = sc.nextInt();
			// 3. ������ ���� ��ü�� �����ϰ�, ���� ��ü�κ��� ���� ��ü ��ȯ�ϱ�
			// ������ �� �� �ֵ���, ���ᰴü�� ���� �� conn�̴�.
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, inputDeptno);	// ù ��° ? ���� �Է��� �μ� ��ȣ��
			pstmt.setString(2, inputJob);	// �� ��° ? ���� �Է��� ��å�� ������ ���
			// 4. pstmt(���� ����)�� query ���� �� ��� ��ü ��ȯ
			// 3���� ������ ���°�ü�� query�� ����Ǿ� �ִ�.
			rs = pstmt.executeQuery();
			// 5. ��� ��ü ����ϱ�
			while(rs.next()) {	// ���� ���ڵ� �ε����� �̵��ϸ鼭 true �Ǵ� false ��ȯ
				// ��� ���� �����ϱ� ���� get �޼ҵ带 ����Ѵ�.
				// ���̺��� �� �÷����� ��ȣ�� �Ű��� �ִ�. �����ϰ��� �ϴ� �÷��� �ڷ����� ��ȣ�� �����Ͽ� ����Ѵ�.
				String ename = rs.getString(1);	// ENAME �÷��� ��
				String job = rs.getString(2);	// JOB �÷��� ��
				int deptno = rs.getInt(3);		// DEPTNO �÷��� ���� ����
				// ����� �ܼ�â�� ���
				System.out.println(ename + " | " + job + " | " + deptno);
			}
		} catch (SQLException e) {
			System.out.println("SQL���� ������ �� �����ϴ�.");
		} finally {
			// 6. try �Ǵ� catch ���� ���ο� ���� ���� �ڿ� �ݳ��ϱ� (������ �Ųٷ� �Ѵ�)
			DBResourceReturn.resultSetReturn(rs);
			DBResourceReturn.preparedStatementReturn(pstmt);
			DBResourceReturn.connectionReturn(conn);
		}
		
	}	
}
