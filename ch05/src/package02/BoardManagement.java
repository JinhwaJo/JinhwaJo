package package02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardManagement {
	private static Scanner sc = new Scanner(System.in);
	private static List<Board> boards = new ArrayList<Board>();
	
	public static void main(String[] args) {
		/* [ �Խ��� ���� ���α׷��� �ۼ��Ͻÿ�. ]
		 * (�Խ��� : ����, ����, �۾���, ��ȣ)
		 * 1. �Խ��� ��� : ����, ����, �۾���, ��ȣ�� �Է� �ް� ����Ѵ�.
		 * 2. �Խ��� �˻� : �������� �Խ����� ã�� �۾��̿� ������ Ȯ���Ѵ�.
		 * 3. �Խ��� ���� : ����, �۾���, ��ȣ�� �Է� �޾� �ش� �Խ����� �����Ѵ�.
		 * 4. �Խ��� ��� : �Խ��� ������ �����Ѵ�.
		 * 5. ���� : ���α׷��� �����Ѵ�.							 */
		while(true) {
			System.out.println("--------[ �Խ��� ���� �޴� ]--------");
			System.out.println("1. ���");
			System.out.println("2. �˻�");
			System.out.println("3. ����");
			System.out.println("4. ���");
			System.out.println("5. ����");
			System.out.print(">> ");
			int select = sc.nextInt();
			switch(select) {
			case 1:
				registration(); break;
			case 2:
				search(); break;
			case 3:
				delete(); break;
			case 4:
				list(); break;
			case 5:
				System.exit(1);
			}
		}
	}

	private static void list() {		// �Խñ� ���
		if(boards.isEmpty()) {
			System.out.println("�Խñ��� �����ϴ�.");
			return;
		}
		for(int i = 0; i < boards.size(); i++) {
			System.out.println(boards.get(i).getTitle());
		}
	}

	private static void delete() {		// �Խ��� ����
		if(boards.isEmpty()) {
			System.out.println("�Խñ��� �����ϴ�.");
			return;
		}
		sc.nextLine();
		System.out.print("���� : ");
		String title = sc.nextLine();
		for(int i = 0; i < boards.size(); i++) {
			// ������ �Խ��� ����� ����Ʈ�� ����� �Խ����� ������ ������
			if(title.equals(boards.get(i).getTitle())) {
				// �Խ����� ��ȯ�ϰ�,
				Board board = boards.get(i);
				// �۾��̿� ��ȣ�� �Է� ���� �� 
				System.out.print("�۾��� : ");
				String writer = sc.next();
				System.out.print("��ȣ : ");
				String password = sc.next();
				
				// �Խ����� �۾��̿� ��ȣ�� ��ġ�ϸ�
				if(writer.equals(board.getWriter()) && password.equals(board.getPassword())) {
					boards.remove(i); // �ش� �Խ����� �����ϰ�,
					System.out.println("�Խñ��� �����Ǿ����ϴ�.");
					return;	// �޼ҵ带 �����Ѵ�.
				}
				System.out.println("�۾��̿� ��ȣ�� �ٸ��ϴ�.");
				return;
			}
		}
		System.out.println("��ϵ� �Խñ��� �����ϴ�.");
	}

	private static void search() {			// �Խ��� �˻�
		if(boards.isEmpty()) {
			System.out.println("�Խñ��� �����ϴ�.");
			return;
		}
		sc.nextLine();
		System.out.print("���� : ");
		String title = sc.nextLine();
		for(int i = 0; i < boards.size(); i++) {
			// ã�� �Խ��� ����� ����Ʈ�� ����� �Խ����� ������ ������
			if(title.equals(boards.get(i).getTitle())) {
				// �ش� �Խ����� ��ȯ�ϰ�,
				Board board = boards.get(i);
				// �۾��̿� ������ Ȯ���Ѵ�.
				System.out.println("�۾��� : " + board.getWriter());
				System.out.println("���� : ");
				System.out.println(board.getContent());
				return;
			}
		}
		System.out.println("��ϵ� �Խñ��� �����ϴ�.");
	}

	private static void registration() {		// ���
		sc.nextLine();
		System.out.print("���� : ");
		String title = sc.nextLine();
		System.out.print("�۾��� : ");
		String writer = sc.next();
		System.out.print("��ȣ : ");
		String password = sc.next();
		System.out.println("���� : ");
		sc.nextLine();
		String content = sc.nextLine();
		Board board = new Board(title, content, writer, password);
		boards.add(board);
		System.out.println("�Խ����� ��ϵǾ����ϴ�.");
	}
}







