package product.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import product.model.Product;
import product.util.DBResourceReturn;

public class ProductDao {
	// �̱��� ��ü
	private static ProductDao productDao = new ProductDao();
	private ProductDao() {}	// �����ڸ� �� ���� ���Ƴ���
	public static ProductDao getInstance() {
		return productDao;
	}
	
	// CRUD(Create, Read, Update, Delete) �޼ҵ� �ۼ�
	// �Ź� ���� catch�� ���, throws SQLException�� ����Ͽ� ���ܰ� �߻� �� �ڽ��� ȣ���� Service Ŭ������ ����.
	public int insert(Connection conn, Product product) throws SQLException {
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement
					("INSERT INTO PRODUCT VALUES(?, ?, ?, ?)");
			pstmt.setInt(1, product.getPno());
			pstmt.setString(2, product.getPname());
			pstmt.setLong(3, product.getPrice());
			pstmt.setInt(4, product.getPcnt());
			return pstmt.executeUpdate(); // ������Ʈ�� ��(���ڵ�)�� ������ ��ȯ�Ѵ�.
		} finally {
			DBResourceReturn.close(pstmt);
		}
	}
}
