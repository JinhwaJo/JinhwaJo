package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Updation {
	public static void main(String[] args) {
		// �ֹε�Ϲ�ȣ�� �Է¹޾� �̸��� ����(����)�Ͽ� �����Ͻÿ�.
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Scanner sc = new Scanner(System.in);
		try {
			conn = DBConnection.getConn();	// ���� ��ü ����
			
			System.out.println("[ �л� ���� ���� ]");
			System.out.print("�ֹε�Ϲ�ȣ �Է� : ");
			String input_iden = sc.next().trim();
			System.out.print("�̸� �Է� : ");
			String input_iname = sc.next().trim();
			
			String query = "UPDATE STUDENT SET SNAME = ? WHERE ID = ?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, input_iname);
			pstmt.setString(2, input_iden);
			int cnt = pstmt.executeUpdate();
			
			if(cnt == 0) {
				System.out.println("�ֹε�Ϲ�ȣ�� ã�� �� �����ϴ�.");
			} else {
				System.out.println("��" + cnt + "���� ������ �����Ǿ����ϴ�.");
			}
			
			
		} catch(SQLException e) {
			DBResourceReturn.resultSetReturn(rs);
			DBResourceReturn.preparedStatementReturn(pstmt);
			DBResourceReturn.connectionReturn(conn);
			System.out.println(e.getMessage());
		}
	}
	
}
