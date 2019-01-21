package package06;

public class NongHyup {
	private static Account[] accounts = new Account[3];
	/* ���¸� 3�� ������ �� �ִ� Account �迭�� ����
	 * ���� �ȿ� ���°� 3�� ��� �ְ�, �װ��� ������ ���̹Ƿ� static�� Ư¡�� ���Ѵ�.
	 * ������ �� ������ ���°� 3�� �����ǰ�, ��� ������� �����ϰ� �ȴ�.
	 */
	public static void main(String[] args) {
		Account.setRate(3.3); 	// ��� ����(��ü)�� ������ 3.3%�� �ȴ�.
		accounts[0] = new Account();	// new�� ����Ͽ� ���ο� ���¸� ����
		
		// ���¸� �迭�� ����(����)�� ������ ������ �����ڰ� ȣ��Ǿ�� �Ѵ�.
		accounts[0].setAccNumber("111-111");
		accounts[0].setAccOwner("ȫ�浿");
		accounts[0].setBalance(10000);
		// accounts[0].setRate(3.3);	// 3.3% (X)
		// ���� ���� Account Ŭ������ ���� �� �ѹ��� �����ش�.
		
		accounts[1] = new Account();
		accounts[1].setAccNumber("222-222");
		accounts[1].setAccNumber("���浿");
		accounts[1].setBalance(5000);
		// accounts[1].setRate(3.3); 	// 3.3% (X)
		
	}
}
