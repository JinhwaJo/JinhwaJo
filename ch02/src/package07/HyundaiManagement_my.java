package package07;

import java.util.Scanner;

public class HyundaiManagement_my {
	/* �����ڵ��� ��� ���α׷��� �ۼ��Ͻÿ�.
	 * �ڵ��� �̸�, ���, ����, ��ⷮ, ���� �� ����(7.5%), ���
	 * 1. �ڵ��� ���
	 * 2. ��� �߰� : �ڵ��� �̸��� �Է� �ް� ��� �߰�(���� �ִ� ��� + �Էµ� ���)
	 * 3. �ڵ��� ���� : �ڵ��� �̸��� �Է� �ް� ���� Ȯ��
	 *    (��, ���� �� ������ ������ ���ݸ� ����Ѵ�.)
	 * 4. ���� ���� : �ڵ��� ������ �����Ѵ�.
	 * 5. ���α׷� ����	 	*/
	private static Car[] hyundai = new Car[6];
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Car.setCarTax(7.5); 	// ��� �ڵ����� �ڵ������� 7.5%�� �ȴ�.
		
		while (true) {
			menu();
			int select = sc.nextInt();
			switch(select) {
			case 1:
				registration();	// �ڵ��� ��� �޼ҵ�
				break;
			case 2:
				stockadd();		// �ڵ��� ��� Ȯ�� �޼ҵ�
			case 3:
				list();			// �ڵ��� ���� Ȯ�� �޼ҵ�
			case 4:
				pricechange();	// �ڵ��� ���� ���� �޼ҵ�
			case 5:
				System.out.println("���α׷� ����");
				System.exit(1);
			}
		}

	}
	
	private static void stockadd() {
		System.out.println("[ �ڵ��� ��� �߰� ]");
		System.out.print("�ڵ��� �̸� : ");
		String
		
		
	}

	private static Car search(String name) {	// �ڵ��� ã�� �޼ҵ�
		for (int i = 0; hyundai[i] != null; i++) {
			if(hyundai[i].getCarName().equals(name)) {
				return hyundai[i];
			}
		}
		System.out.println("�ڵ����� �����ϴ�.");
		return null;
	}
	
	private static void list() {
		System.out.println("[ �ڵ��� ���� ���� ]");
		for(int i = 0; hyundai[i] != null; i++) {
			System.out.println((i + 1) + "�� �ڵ����� ������ ��");
			System.out.println("�ڵ��� �̸� : " + hyundai[i].getCarName());
			System.out.println("�ڵ��� ��� : " + hyundai[i].getCarYear());
			System.out.println("�ڵ��� ��ⷮ : " + hyundai[i].getCarCapa() + "CC");
		}
		System.out.println("������ ��� ����Ͽ����ϴ�.");
		
	}

	private static void registration() {	// �ڵ��� ��� �޼ҵ�
		System.out.println("[ �ڵ��� ��� ������ �Է��ϼ���. ]");
		for (int i = 0; i < hyundai.length - 1; i++) {
			if(hyundai[i] == null) {
				System.out.print("�ڵ��� �̸� : ");
				String name = sc.next();	// �ڵ��� �̸��� �Է��Ѵ�.
				System.out.print("�ڵ��� ��� : ");
				int year = sc.nextInt();	// �ڵ��� ����� �Է��Ѵ�.
				System.out.print("�ڵ��� ��ⷮ : ");
				int capa = sc.nextInt();	// �ڵ��� ��ⷮ�� �Է��Ѵ�.
				hyundai[i] = new Car(name, year, capa);
				// �Է� ���� ���� ���� �ڵ������� ����
				System.out.println("�ڵ��� ������ ��ϵǾ����ϴ�.");
				return;
				
			}
		}
		System.out.println("�ڵ����� ����� �� �����ϴ�.");
		
	}
	
	private static void menu() {
		System.out.println("-------------- Hyundai NO.1 Dealer------------");
		System.out.println("1. �ڵ��� ���");
		System.out.println("2. ��� ����");
		System.out.println("3. �ڵ��� ����");
		System.out.println("4. ���� ����");
		System.out.println("5. ����");
		System.out.println(">> ");
		
	}
}
