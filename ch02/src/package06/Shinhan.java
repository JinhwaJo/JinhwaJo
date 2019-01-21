package package06;

import java.util.Scanner;

public class Shinhan {
	private static Account[] accounts = new Account[4];
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Account.setRate(4.3); // ��� ����(��ü)�� ������ 4.3%�� �ȴ�.

		while (true) {
			menu();
			int select = sc.nextInt();
			switch (select) {
			case 1:
				registration(); // ���� ��� �޼ҵ�
				break;
			case 2:
				list(); // ���� ��� �޼ҵ�
				break;
			case 3:
				deposit(); // �Ա� �޼ҵ�
				break;
			case 4:
				withdraw(); // ��� �޼ҵ�
				break;
			case 5:
				System.out.println("���α׷� ����");
				System.exit(1);
			}
		}
	}

	private static void withdraw() {	// ��� �޼ҵ�
		System.out.println("[ ��� ]");
		System.out.print("���¹�ȣ : ");
		String number = sc.next();
		Account account = search(number);
		if (account != null) {	// ���°� �迭�� ������
			System.out.print("��ݾ� : ");
			int money = sc.nextInt();
			// ��ݾ��� ���� ��ü�� �ܾ׿� �����Ѵ�.
			account.setBalance(account.getBalance() - money);
			System.out.println("��ݵǾ����ϴ�.");
			return;
		}
		System.out.println("�ٽ� �õ��ϼ���.");

	}

	/*
	 * ���(�߸��� ��������� �Է��ϸ� ����� ��ȯ�ϱ� ���� ���� ������ ã��), �Ա�, ��� ��� �۾� ���� �� �Է¹��� ���� ������ ã�´ٴ�
	 * �������� �ִ�. ����, �Ʒ� search �޼ҵ带 ���� �ʿ伺�� �����.
	 */
	private static void deposit() { // �Ա� �޼ҵ�
		System.out.println("[ �Ա� ]");
		System.out.print("���¹�ȣ : ");
		String number = sc.next();
		Account account = search(number);
		/*
		 * ���⼭ account�� ���� ��ȣ��, ������ �� �ƴ� ���� ��ü�� ������. ��, 100����, 200����, 300������ �ִ� ������ ����
		 * �޴°� �ƴ϶� �� ������ �ּҸ� �޴´�.
		 */
		if (account != null) {
			System.out.print("�Աݾ� : ");
			int money = sc.nextInt();
			// �Աݾ��� ���� ��ü�� �ܾ׿� �����Ѵ�.
			account.setBalance(account.getBalance() + money);
			System.out.println("�ԱݵǾ����ϴ�.");
			return;
		}
		System.out.println("�ٽ� �õ��ϼ���.");

	}

	private static Account search(String number) { // ���� ã�� �޼ҵ�
		for (int i = 0; accounts[i] != null; i++) {
			// �迭�� ����Ǿ� �ִ� ���¹�ȣ(a[i].getAccNumber())�� ���� �Է��� ���¹�ȣ(number)�� ��ġ�ϸ� if�� ����
			if (accounts[i].getAccNumber().equals(number)) {
				return accounts[i];
				/*
				 * search�� ���� ���¸� return�� ��ȯ�ϵ��� �����Ѵ�. return�� ���� ��� ��ȯ���� ����������Ѵ�. ���� ����ִ�(void)
				 * ��ȯ���� Account�� �����Ѵ�.
				 */
			}
		}
		System.out.println("���°� �����ϴ�.");
		return null; // ��ü���� ���� ���� ��� null�� ����ȴ�.
	}

	private static void list() {
		System.out.println("[ ���� ��� ���� ]");
		for(int i = 0; accounts[i] != null; i++) {
			System.out.println((i + 1) + "�� ������ ������ ��");
			System.out.println("���¹�ȣ : " + accounts[i].getAccNumber());
			System.out.println("������ : " + accounts[i].getAccOwner());
			System.out.println("�ܾ� : " + accounts[i].getBalance());
		}
		System.out.println("����� ��� ����Ͽ����ϴ�.");

	}

	private static void registration() { // ���� ��� �޼ҵ�
		System.out.println("[ ���� ��� ������ �Է��ϼ���. ]");
		for (int i = 0; i < accounts.length - 1; i++) {
			// ȿ������ ���� �迭�� ������ ���� null�� �Ǿ��ϹǷ� -1�� ���ش�. ���!! 
			if (accounts[i] == null) {
				System.out.print("���¹�ȣ : ");
				String number = sc.next(); // ���¹�ȣ�� �Է��Ѵ�.
				System.out.print("������ : ");
				String owner = sc.next(); // �����ָ� �Է��Ѵ�.
				System.out.print("�Աݾ� : ");
				int money = sc.nextInt(); // �Աݾ��� �Է��Ѵ�.
				accounts[i] = new Account(number, owner, money);
				// �Է� ���� ���� ���� ���������� ����
				System.out.println("���°� ��ϵǾ����ϴ�.");
				return;
			}

		}
		System.out.println("���¸� ����� �� �����ϴ�.");

	}

	private static void menu() {
		System.out.println("----------��������-----------");
		System.out.println("1. ���� ���");
		System.out.println("2. ���� ���");
		System.out.println("3. �Ա�");
		System.out.println("4. ���");
		System.out.println("5. ����");
		System.out.print(">> ");
	}
}
