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
			System.out.println("[ 학생 정보를 입력하세요. ]");
			
			System.out.print("이름 : ");
			String iname = sc.next().trim();
			
			int[] iscores = new int[3];
			System.out.print("국, 영, 수 점수 : ");
			for(int i = 0; i < iscores.length; i++) {
				iscores[i] = sc.nextInt();
			}
			
			System.out.print("전화번호 : ");
			String itel = sc.next().trim();
			
			System.out.print("주민번호 : ");
			String iiden = sc.next().trim();
			
			conn.setAutoCommit(false); 	// 커밋을 끈다. 하나의 쿼리문을 실행하면 자동으로 commit되는 것을 방지.
			// 레코드의 갯수를 찾을 수 있는 명령어를 넣자.
			String query = "SELECT STDNO FROM STUDENT";
			/* ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE를 넣어야 first와 last를 쓸 수 있다.
			 * 함부로 순서가 바뀌고 그러면 안되므로, 원래는 first와 last를 쓸 수 없도록 막혀있다.	 */
			pstmt = conn.prepareStatement(query, ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_UPDATABLE);	
			// executeQuery(); 는 결과를 객체이며, SELECT(조회)할 때 주로 사용
			rs = pstmt.executeQuery();
			// 학생 번호 반환
			// 맨 끝 레코드의 번호를 구해서(rs.getInt의 역할) +1을 해주고, 레코드가 아무것도 없을 경우 1을 반환한다. 
			// int istdno = rs.last() ? rs.getInt(1) + 1 : 1;
			
			rs.close(); // 자원은 한 번 쓰고난 후 다시 쓰려면 꼭 반납을 해줘야 한다.
			pstmt.close();
			/* CREATE SEQUENCE STD_ID
				INCREMENT BY 1 START WITH 1000;
				-- 1은 증가폭, 1000은 시작 번호
				INSERT INTO STUDENT VALUES
				(STD_ID.NEXTVAL, '장길동', 10, 10, 10, 010-1111-1111, 111111-1111111);
				-- NEXTVAL은 다음 번호로 이동하는 역할
				-- 1000번을 만들고, 지우고 다시 생성하면 1001번부터 쓸수 있다.한번 쓴 번호는 사용 못함.		 */
			
			// 학생 삽입(추가) 쿼리문
			query = "INSERT INTO STUDENT VALUES(STD_ID.NEXTVAL, ?, ?, ?, ?, ?, ?)";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, iname);		// 이름
			pstmt.setInt(2, iscores[0]);	// 국어 점수
			pstmt.setInt(3, iscores[1]);	// 영어 점수
			pstmt.setInt(4, iscores[2]);	// 수학 점수
			pstmt.setString(5, itel);		// 전화번호
			pstmt.setString(6, iiden);		// 주민번호
			// executeUpdate(); 는  추가, 수정, 삭제 시에 사용
			pstmt.executeUpdate();		// 쿼리 실행
			
			conn.commit(); 	// 트랜젝션 완료(커밋을 꺼놓았기 때문에 이 명령어를 써줘야 한다.)
		} catch(SQLException e) {
			try {
				// 캐치문으로 왔을때 다시 올려준다.
				// (하나의 쿼리가 실행되고 다른 쿼리가 오류가 나서 실행이 안되는 것을 방지하기 위해)
				conn.rollback();	
				SequenceIncrement.idMinus(conn);
			} catch (SQLException e1) {
				System.out.println(e1.getMessage());
			}
			System.out.println(e.getMessage());
		}
	}
}
