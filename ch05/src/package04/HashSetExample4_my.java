package package04;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class HashSetExample4_my {
	/* HashSet �� �̿��� ����Ű ��ǰ ���α׷��� �ۼ��Ͻÿ�.
	 * (�߰�, ���� �� �޼ҵ�� ��� ����Ʈ�� ������� �����ϴ�.)
	 * 
	 * ����Ű �Ź� : ��ǰ��ȣ, ��ǰ��, ����
	 * [ ����Ű ���� ]
	 * 1. �Ż� ��� ( ��ǰ��ȣ, ��ǰ��, ���� �̸� �� ��(Set) ��ü�� ���� )
	 * 2. ��ǰ ���� ( remove �޼ҵ� ���(��ǰ ��ȣ�� ����) )
	 * 3. ��ǰ ��� ( ��ϵ� ��ǰ��ȣ�� ��ǰ��, ������ ��� ��µǾ�� �Ѵ�. )
	 * 4. ��ǰ ã�� ( ��ǰ���� �Է��ϸ� ��ǰ ��ȣ�� ������ ��µǾ�� �Ѵ�. )
	 * 5. ����	 */
	private static HashSet<Nike_my> shoes = new HashSet<Nike_my>();
	private static Scanner sc = new Scanner(System.in);
	/* HashSet�� �ε����� ��� ������ �����͸� �迭ó�� �ϳ��� ������ ���ϹǷ�,
	 * �ε����� ������ ���ִ� Iterator�� �ʿ��ѵ� (�� ���� �� �־���� ��.)
	 * Iterator�� �ݺ����� i�� �������� ������� �ʰ�,
	 * while���� ����Ͽ� hasNext�� next�� ���� �����͸� ���Ѵ�.	 */
	public static void main(String[] args) {
		while(true) {
			System.out.println("[ ����Ű ���� ]");
			System.out.println("1. �Ż� ���");
			System.out.println("2. ��ǰ ����");
			System.out.println("3. ��ǰ ���");
			System.out.println("4. ��ǰ ã��");
			System.out.println("5. ����");
			System.out.print(">> ");
			int select = sc.nextInt();
			switch(select) {
			case 1:
				registration(); break;
			case 2:
				delete(); break;
			case 3:
				list(); break;
			case 4:
				search(); break;
			case 5:
				System.exit(1);
			}
		}
	}
	private static void search() {
		if(shoes.isEmpty()) {
			System.out.println("��ϵ� ��ǰ�� �����ϴ�.");
			return;
		}
		System.out.println("[ ��ǰ ã�� ]");
		System.out.print("��ǰ�� : ");
		String name = sc.next();
		Iterator<Nike_my> iter = shoes.iterator();
		while(iter.hasNext()) {
			Nike_my searchtool = iter.next();
			if(name.equals(searchtool.getName())) {
				System.out.println("��ǰ ��ȣ : " + searchtool.getNumber());
				System.out.println("���� : " + searchtool.getPrice());
				return;
			}
		}
		
	}
	private static void list() {
		if(shoes.isEmpty()) {
			System.out.println("��ϵ� ��ǰ�� �����ϴ�.");
			return;
		}
		System.out.println("[ ��ǰ ��� ]");
		Iterator<Nike_my> iter = shoes.iterator();
		while(iter.hasNext()) {
			Nike_my itemlist = iter.next();
			System.out.println("��ǰ ��ȣ : " + itemlist.getNumber());
			System.out.println("��ǰ �� : " + itemlist.getName());
			System.out.println("���� : " + itemlist.getPrice());
		}
	}
	private static void delete() {
		if(shoes.isEmpty()) {
			System.out.println("��ϵ� ��ǰ�� �����ϴ�.");
			return;
		}
		System.out.println("[ ��ǰ ���� ]");
		System.out.print("��ǰ ��ȣ : ");
		int number = sc.nextInt();
		// hasNext�� �޸� �ȿ� ����(�Ż� ����� ��)�� ������ ã�� ����
		Iterator<Nike_my> iter = shoes.iterator();
		while(iter.hasNext()) {	
			// next�� ã�� ���� ���� ���� eraser�̶� ������ �������ִ� ����
			Nike_my eraser = iter.next(); 
			// eraser������ ������ �ο��� Nike_my�� Ŭ�����̹Ƿ� get �޼ҵ带 ����� �� �ִ�.
			if(number == eraser.getNumber()) {
				/* hasNext�� ã��, next�� eraser�� �����س�������
				 * eraser�� ���� = �Է� ���� ��ǰ�� ���� */
				shoes.remove(eraser);
				System.out.println("��ǰ�� �����Ǿ����ϴ�.");
				return;
			}
		}
		System.out.println("ã���ô� ��ǰ�� �������� �ʽ��ϴ�.");
	}
	private static void registration() {	// �Ż� ��� �޼ҵ�
		System.out.println("[ �Ż� ��� ]");
		System.out.print("��ǰ ��ȣ : ");
		int number = sc.nextInt();
		System.out.print("��ǰ�� : ");
		String name = sc.next();
		System.out.print("���� : ");
		int price = sc.nextInt();
		Nike_my Set = new Nike_my (number, name, price);
		// �̹� ��ϵ� ��ǰ�� ���� ��ǰ��ȣ�� �� �Է½� ��� ������ �ߵ��� ��.
		if(shoes.contains(new Nike_my(number))) {
			System.out.println("�ش� ��ǰ�� �̹� ��ϵǾ� �ֽ��ϴ�.");
			return;
		}
		shoes.add(Set);
		System.out.println("�Ż� ����� �Ϸ�Ǿ����ϴ�.");
		
	}
}
