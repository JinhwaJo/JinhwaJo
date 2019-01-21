package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Insertion {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Scanner sc = new Scanner(System.in);
		try {
			conn = DBConnection.getConn();
			System.out.println("[ �л� ������ �Է��ϼ���. ]");
			
			System.out.print("�̸� : ");
			String iname = sc.next().trim();
			
			int[] iscores = new int[3];
			System.out.print("��, ��, �� ���� : ");
			for(int i = 0; i < iscores.length; i++) {
				iscores[i] = sc.nextInt();
			}
			
			System.out.print("��ȭ��ȣ : ");
			String itel = sc.next().trim();
			
			System.out.print("�ֹι�ȣ : ");
			String iiden = sc.next().trim();
			
			conn.setAutoCommit(false); 	// Ŀ���� ����. �ϳ��� �������� �����ϸ� �ڵ����� commit�Ǵ� ���� ����.
			// ���ڵ��� ������ ã�� �� �ִ� ��ɾ ����.
			String query = "SELECT STDNO FROM STUDENT";
			/* ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE�� �־�� first�� last�� �� �� �ִ�.
			 * �Ժη� ������ �ٲ�� �׷��� �ȵǹǷ�, ������ first�� last�� �� �� ������ �����ִ�.	 */
			pstmt = conn.prepareStatement(query, ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_UPDATABLE);	
			// executeQuery(); �� ����� ��ü�̸�, SELECT(��ȸ)�� �� �ַ� ���
			rs = pstmt.executeQuery();
			// �л� ��ȣ ��ȯ
			// �� �� ���ڵ��� ��ȣ�� ���ؼ�(rs.getInt�� ����) +1�� ���ְ�, ���ڵ尡 �ƹ��͵� ���� ��� 1�� ��ȯ�Ѵ�. 
			// int istdno = rs.last() ? rs.getInt(1) + 1 : 1;
			
			rs.close(); // �ڿ��� �� �� ���� �� �ٽ� ������ �� �ݳ��� ����� �Ѵ�.
			pstmt.close();
			/* CREATE SEQUENCE STD_ID
				INCREMENT BY 1 START WITH 1000;
				-- 1�� ������, 1000�� ���� ��ȣ
				INSERT INTO STUDENT VALUES
				(STD_ID.NEXTVAL, '��浿', 10, 10, 10, 010-1111-1111, 111111-1111111);
				-- NEXTVAL�� ���� ��ȣ�� �̵��ϴ� ����
				-- 1000���� �����, ����� �ٽ� �����ϸ� 1001������ ���� �ִ�.�ѹ� �� ��ȣ�� ��� ����.		 */
			
			// �л� ����(�߰�) ������
			query = "INSERT INTO STUDENT VALUES(STD_ID.NEXTVAL, ?, ?, ?, ?, ?, ?)";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, iname);		// �̸�
			pstmt.setInt(2, iscores[0]);	// ���� ����
			pstmt.setInt(3, iscores[1]);	// ���� ����
			pstmt.setInt(4, iscores[2]);	// ���� ����
			pstmt.setString(5, itel);		// ��ȭ��ȣ
			pstmt.setString(6, iiden);		// �ֹι�ȣ
			// executeUpdate(); ��  �߰�, ����, ���� �ÿ� ���
			pstmt.executeUpdate();		// ���� ����
			
			conn.commit(); 	// Ʈ������ �Ϸ�(Ŀ���� �����ұ� ������ �� ��ɾ ����� �Ѵ�.)
		} catch(SQLException e) {
			try {
				// ĳġ������ ������ �ٽ� �÷��ش�.
				// (�ϳ��� ������ ����ǰ� �ٸ� ������ ������ ���� ������ �ȵǴ� ���� �����ϱ� ����)
				conn.rollback();	
				SequenceIncrement.idMinus(conn);
			} catch (SQLException e1) {
				System.out.println(e1.getMessage());
			}
			System.out.println(e.getMessage());
		}
	}
}
