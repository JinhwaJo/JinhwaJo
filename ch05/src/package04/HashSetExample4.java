package package04;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
public class HashSetExample4 {
	/* HashSet �� �̿��� ����Ű ��ǰ ���α׷��� �ۼ��Ͻÿ�.
	 * (�߰�, ���� �� �޼ҵ�� ��� ����Ʈ�� ��� ����� �����ϴ�.)
	 * 
	 * ����Ű �Ź� : ��ǰ��ȣ, ��ǰ��, ����
	 * [ ����Ű ���� ]
	 * 1. �Ż� ��� ( ��ǰ��ȣ, ��ǰ��, ���� �̸� �� ��(Set) ��ü�� ���� )
	 * 2. ��ǰ ���� ( remove �޼ҵ� ���(��ǰ ��ȣ�� ���� ) )
	 * 3. ��ǰ ��� ( ��ϵ� ��ǰ��ȣ�� ��ǰ��, ������ ��� ��µǾ�� �Ѵ�. )
	 * 4. ��ǰ ã�� ( ��ǰ���� �Է��ϸ� ��ǰ ��ȣ�� ������ ��µǾ�� �Ѵ�. )
	 * 5. ����													 */
	private static Scanner sc = new Scanner(System.in);
	private static HashSet<Nike> goods = new HashSet<Nike>();
	private static int n = 0;
	
	public static void main(String[] args) {
		while(true) {
			System.out.println("-----[ ����Ű �Ź� ]-----");
			System.out.println("1.�Ż� ���");
			System.out.println("2.��ǰ ����");
			System.out.println("3.��ǰ ���");
			System.out.println("4.��ǰ ã��");
			System.out.println("5.����");
			System.out.print(">> ");
			int select = sc.nextInt();
			switch(select) {
			case 1:
				registration();
				break;
			case 2:
				delete();
				break;
			case 3:
				list();
				break;
			case 4:
				search();
				break;
			case 5:
				System.exit(1);
			}
		}
	}

	private static void search() {
		sc.nextLine();
		System.out.print("�˻��� ��ǰ�� : ");
		String name = sc.nextLine();
		Iterator<Nike> i = goods.iterator();
		while(i.hasNext()) {
			Nike nike = i.next();
			if(nike.getName().equals(name)) {
				System.out.println("��ǰ ��ȣ : " + nike.getNumber());
				System.out.println("���� : " + nike.getPrice());
				return;
			}
		}
		System.out.println("��ȸ�� ��ǰ�� �����ϴ�.");
	}

	private static void list() {
		Iterator<Nike> i = goods.iterator();
		while(i.hasNext()) {
			Nike nike = i.next();
			System.out.println("��ǰ ��ȣ : " + nike.getNumber());
			System.out.println("��ǰ�� : " + nike.getName());
			System.out.println("���� : " + nike.getPrice());
		}
		System.out.println("��ϵ� ��ǰ�� ��� ��ȸ�Ͽ����ϴ�.");
	}

	private static void registration() {
		System.out.print("��ǰ��ȣ : ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("��ǰ�� : ");
		String name = sc.nextLine();
		System.out.print("���� : ");
		long price = sc.nextLong();
		goods.add(new Nike(number, name, price));
	}
	
	private static void delete() {
		System.out.print("������ ��ǰ�� ��ȣ : ");
		int number = sc.nextInt();
		// ��(Set)�� ��ǰ ��ȣ�� ������
		if(goods.contains(new Nike(number))) {
			// ��ǰ ��ȣ�� �̿��� ��ǰ�� �����Ѵ�.
			goods.remove(new Nike(number));
			System.out.println("��ǰ�� �����Ͽ����ϴ�.");
			return;
		}
		System.out.println("��ǰ�� ��ϵǾ� ���� �ʽ��ϴ�.");
	}
}






