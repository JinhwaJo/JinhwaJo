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
			conn = DBConnection.getConn(); // ���� ��ü ����
			// �����ͺ��̽� ���� ��ü ����
			ProductDao productDao = ProductDao.getInstance();
			// ���� ��ü�� �Էµ� ���� ����� ��ǰ ��ü�� Dao�� �̿��� DB�� ����(����)
			productDao.insert(conn, product);
		} catch(SQLException e) {
			System.out.println("���� ����");
		} finally {
			DBResourceReturn.close(conn);
		}
	}
}
