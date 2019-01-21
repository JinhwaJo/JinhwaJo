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
			conn = DBConnection.getConn();	// ���� ��ü ����
			
			System.out.println("[ �л� ���� ���� ]");
			System.out.print("�ֹε�Ϲ�ȣ �Է� : ");
			String input_iden = sc.next().trim();
			
			String query = "DELETE FROM STUDENT WHERE ID = ?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, input_iden); // ù ��° ? ���ٰ� �Է��� �ֹι�ȣ�� ����
			
			// ���� ������ �����ϰ�, CRUD�� ���ڵ��� ������ ��ȯ�Ѵ�.
			int cnt = pstmt.executeUpdate(); // ��ȯ���� int�̸�, ������Ʈ�� ���� ������ ��ȯ�Ѵ�. (��ȯ���� �������൵ �ȴ�)
			
			if(cnt == 0) {
				System.out.println("�ֹε�Ϲ�ȣ�� ã�� �� �����ϴ�.");
			} else {
				System.out.println("��" + cnt + "���� �л� ������ �����Ǿ����ϴ�.");
			}
		} catch(SQLException e) {
			// �ڿ� ����
			DBResourceReturn.resultSetReturn(rs);
			DBResourceReturn.preparedStatementReturn(pstmt);
			DBResourceReturn.connectionReturn(conn);
			System.out.println(e.getMessage());
		}
	}
}
