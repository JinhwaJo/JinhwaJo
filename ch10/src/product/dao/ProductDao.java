package product.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import product.model.Product;
import product.util.DBResourceReturn;

public class ProductDao {
	// 싱글톤 객체
	private static ProductDao productDao = new ProductDao();
	private ProductDao() {}	// 생성자를 못 쓰게 막아놓고
	public static ProductDao getInstance() {
		return productDao;
	}
	
	// CRUD(Create, Read, Update, Delete) 메소드 작성
	// 매번 쓰는 catch문 대신, throws SQLException를 사용하여 예외가 발생 시 자신을 호출한 Service 클래스로 던짐.
	public int insert(Connection conn, Product product) throws SQLException {
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement
					("INSERT INTO PRODUCT VALUES(?, ?, ?, ?)");
			pstmt.setInt(1, product.getPno());
			pstmt.setString(2, product.getPname());
			pstmt.setLong(3, product.getPrice());
			pstmt.setInt(4, product.getPcnt());
			return pstmt.executeUpdate(); // 업데이트된 행(레코드)의 개수를 반환한다.
		} finally {
			DBResourceReturn.close(pstmt);
		}
	}
}
