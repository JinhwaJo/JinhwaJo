package package09;

public class Connection {
	private static Connection connection = new Connection();
	
	private Connection() {
		// public�� ���� ������ ������ �����ϹǷ�, ���� ������ private�� ���ش�.
		// �ܺο��� ��ü�� ���� �� �������� ���ϰ� �ϱ� ���� private�� ���ش�.
		
	}
	public static Connection getInstance() {
		return connection;
		/* �ܺο��� ��ü�� ����ϰ� �ϱ� ���� public�� ���ְ�
		 * ����������ϹǷ� static�� �ٿ��ش�.
		 * Instance�� ��ü�� ���� ���̴�.
		 */
		
	}
}
