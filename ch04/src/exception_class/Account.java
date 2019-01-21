package exception_class;

public class Account {
	private String number;	// ���¹�ȣ �ʵ�
	private int balance;	// �ܾ� �ʵ�
	
	public Account() {}
	//2. ���� ������
	// 3-1. ������� �ߴ� ���� Ŭ������ Ŀ���� �÷� ���� Ŭ���� �ۼ��� �����Ѵ�.
	public Account(String number, int balance) throws BalanceException {
		this.number = number;
		if(balance < 0) {
			// 1. ���� �߻�
			throw new BalanceException("�ܾ��� �߸��Ǿ����ϴ�.");
		}
		this.balance = balance;
	}
	// �ܾ� ����
	public void setBalance(int balance) throws BalanceException {
		if(balance < 0) {
			throw new BalanceException("0���� �۽��ϴ�.");
		}
		this.balance = balance;
	}
	// ���
	public void withdraw(int money) throws BalanceException {
		if(balance < money) {	// ��� �ݾ׺��� �ܾ��� ������
			throw new BalanceException("�ܾ��� �ʰ��Ͽ����ϴ�.");
		}
		this.balance -= balance;
	}
}

