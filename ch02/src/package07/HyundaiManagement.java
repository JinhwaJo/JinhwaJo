package package07;
import java.util.Scanner;
public class HyundaiManagement {
	/* �����ڵ��� ��� ���α׷��� �ۼ��Ͻÿ�.
	 * �ڵ��� �̸�, ���, ����, 
	 * ��ⷮ, ���� �� ����(7.5%), ���
	 * 1. �ڵ��� ���
	 * 2. ��� �߰� : �ڵ��� �̸��� �Է� �ް� ��� �߰�(���� �ִ� ��� + �Էµ� ���)
	 * 3. �ڵ��� ���� : �ڵ��� �̸��� �Է� �ް� ���� Ȯ��
	 *    (��, ���� �� ������ ������ ���ݸ� ����Ѵ�.)
	 * 4. ���� ����    : �ڵ��� ������ �����Ѵ�.
	 * 6. ���α׷� ����   								 */
	private static Car[] cars = new Car[50];
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Car.setTax(7.5);
		int select = 0;
		while(true) {
			menu();
			select = sc.nextInt();
			switch(select) {
			case 1:
				registration(); break;
			case 2:
				changeCount(); break;
			case 3:
				information(); break;
			case 4:
				changePrice();break;
			case 5:
				System.out.println("�����ڵ��� ���α׷� ����");
				System.exit(1);
			}
		}
	}

	private static void menu() {			// �޴�
		System.out.println("-----------�����ڵ���------------");
		System.out.println("1. �ڵ��� ���");
		System.out.println("2. ��� ����");
		System.out.println("3. �ڵ��� ����");
		System.out.println("4. ���� ����");
		System.out.println("5. ����");
		System.out.print(">> ");
	}
	
	private static void registration() {	// ���
		System.out.println("[ �ڵ��� ��� ]");
		for(int i = 0; i < cars.length; i++) {
			if(cars[i] == null) {
				System.out.print("�̸� : ");
				String number = sc.next();
				System.out.print("��� : ");
				int year = sc.nextInt();
				System.out.print("���� : ");
				int price = sc.nextInt();
				System.out.print("��ⷮ : ");
				int cc = sc.nextInt();
				System.out.print("��� : ");
				int count = sc.nextInt();
				cars[i] = new Car(number, year, price, cc, count);
				System.out.println("������ ��ϵǾ����ϴ�.");
				return;
			}
		}
		System.out.println("�� �̻� ����� �� �����ϴ�.");
	}

	private static Car search() {			// �˻�
		System.out.print("�ڵ��� �̸� �Է� : ");
		String name = sc.next();
		for(int i = 0; cars[i] != null; i++) {
			if(cars[i].getName().equals(name)) {
				return cars[i];
			}
		}
		return null;
	}
	
	
	private static void changeCount() {	// ��� ����
		Car car = search();
		if(car == null) {
			System.out.println("��ϵ� ������ �����ϴ�.");
			return;
		}
		System.out.print("�߰��� ��� �Է��ϼ��� : ");
		int count = sc.nextInt();
		car.setCount(car.getCount() + count);
		System.out.println(car.getName() + " ������ ��� : " + car.getCount());
	}
	
	private static void changePrice() {	// ���� ����
		Car car = search();
		if(car == null) {
			System.out.println("��ϵ� ������ �����ϴ�.");
			return;
		}
		System.out.print("����� ������ �Է��ϼ��� : ");
		int price = sc.nextInt();
		car.setPrice(price);
		System.out.println(car.getName() + " ������ ���� : " + car.getPrice());
	}
	
	private static void information() {	// �ڵ��� ���
		Car car = search();
		if(car == null) {
			System.out.println("��ϵ� ������ �����ϴ�.");
			return;
		}
		car.confirm();
	}
}
