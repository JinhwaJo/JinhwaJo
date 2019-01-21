package package06;

public class Account {
	private String accNumber;	// ���¹�ȣ
	private String accOwner;	// ������
	private int balance;		// �ܾ�
	private static double rate;
	// ����(�ݸ�%)(���� �ݸ��� ����ǹǷ� ������ Ư���� �������� staticȭ ��Ų��.)
	/* rate�� ���¸� ����(�����ڸ� ���) �ϱ����� ����������
	 * �Ʒ� rate���� �Լ��� ���� ���� �Ŀ� �۵��ϹǷ� It doesn't make sense.
	 * �׷��� �Ʒ��� ���� �Լ��κ��� �������ְ�, �����ڿ����� �������ش�.
	 * (�����ڿ� static ��� ������ �������� ������ �ʴ´�.)
	 */
	
	// ������
	Account() { }	// ����Ʈ ������
	Account(String accNumber, String accOwner, int balance){
		this.accNumber = accNumber;
		this.accOwner = accOwner;
		this.balance = balance;
	}
	
	public void setAccNumber(String accNumber) {	// ���¹�ȣ ���� �޼ҵ�
		this.accNumber = accNumber;
	}
	
	public void setAccOwner(String accOwner) {		// ������ ���� �޼ҵ�
		this.accOwner = accOwner;
	}
	
	public void setBalance(int money) {				// �ܾ� ���� �޼ҵ�
		balance = money;
	}
	
	public static void setRate(double rate) {				// ���� ���� �޼ҵ�
		/* static �޼ҵ忡��
		 * this ��ɾ�� ��ü�� �ǹ��ϹǷ�,
		 * ��ü�� �����ϱ� ���� ����� �� �ִ� static ��� ������ �����Ϸ���
		 * �Ʒ��� ���� Ŭ���� �̸����� �����Ͽ��� �Ѵ�.
		 */
		// this.rate = rate; (X)
		Account.rate = rate;
	}
	/* getter �޼ҵ�� �ٸ� Ŭ�������� ���� Ŭ������ ��ü ������ ����� �� Ȱ��ȴ�.
	 * : ��ȯ���� �ְ�, �޼ҵ� �̸� �տ� get�� ������, �Ű� ������ ����.
	 * : �޼ҵ� �������� �׻� return ���� �ۼ��ȴ�.
	 * (��ü ���� ������ �� ����ϴ� setter �޼ҵ�� �ݴ�Ǵ� �����̴�.)
	 */
	public String getAccNumber() {	// ���¹�ȣ ��ȯ(������) �޼ҵ�
		return this.accNumber;
	}
	
	public String getAccOwner() { 	// ������ ��ȯ(������) �޼ҵ�
		return this.accOwner;
	}
	
	public int getBalance() {		// �ܾ��� ��ȯ(������) �޼ҵ�
		return this.balance;
	}
	
	
	
	
	
	
}
