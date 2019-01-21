package product.service;

import java.sql.Connection;
import java.sql.SQLException;

import product.dao.ProductDao;
import product.model.Product;
import product.util.DBConnection;
import product.util.DBResourceReturn;

public class SaveService {
	private static SaveService saveService = new SaveService();
	private SaveService() {}
	public static SaveService getInstance() {
		return saveService;
	}
	
	public void save(Product product) {
		Connection conn = null;
		try {
			conn = DBConnection.getConn(); // 연결 객체 생성
			// 데이터베이스 접근 객체 생성
			ProductDao productDao = ProductDao.getInstance();
			// 연결 객체와 입력된 값이 저장된 상품 객체를 Dao를 이용해 DB에 삽입(저장)
			productDao.insert(conn, product);
		} catch(SQLException e) {
			System.out.println("저장 실패");
		} finally {
			DBResourceReturn.close(conn);
		}
	}
}
