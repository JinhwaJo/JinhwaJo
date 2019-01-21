package package02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardManagement_my {
	private static List<Board_my> boards = new ArrayList<Board_my>();
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		/* [ �Խ��� ���� ���α׷��� �ۼ��Ͻÿ�. ]
		 * (�Խ��� : ����, ����, �۾���, ��ȣ)
		 * 1. �Խ��� ��� : ����, ����, �۾���, ��ȣ�� �Է� �ް� ����Ѵ�.
		 * 2. �Խ��� �˻� : �������� �Խ����� ã�� �۾��̿� ������ Ȯ���Ѵ�.
		 * 3. �Խ��� ���� : ����, �۾���, ��ȣ,�� �Է� �޾� �ش� �Խ����� �����Ѵ�.
		 * 4. �Խ��� ��� : �Խ��� ������ �����Ѵ�.
		 * 5. ���� : ���α׷��� �����Ѵ�. */
		
		int select;
		while(true) {
			System.out.println("-------------------");
			System.out.println("[ �Խ��� ���� ���α׷� ]");
			System.out.println("1. �Խ��� ���");
			System.out.println("2. �Խ��� �˻�");
			System.out.println("3. �Խ��� ����");
			System.out.println("4. �Խ��� ���");
			System.out.println("5. ����");
			System.out.print(">> ");
			select = sc.nextInt();
			switch(select) {
			case 1:
				write(); break;			// �Խ��� ��� �޼ҵ�
			case 2:
				search(); break;		// �Խ��� �˻� �޼ҵ�
			case 3:
				delete(); break;		// �Խ��� ���� �޼ҵ�
			case 4:
				list(); break;			// �Խ��� ��� �޼ҵ�
			case 5:
				System.exit(1);			// ����
			}
			
		}
			
	}

	private static void list() {	// �Խ��� ��� �޼ҵ�
		/* ���� �ۼ��� ��
		 * for(int i = 0; i < boards.size(); i++) {
		 * String str = list.get(i);
		 * System.out.println("[" + (i + 1) + "]" + str); */
		System.out.println("[ �Խ��� ��� ]");	// ���� Ʋ���κ�
		if(boards.isEmpty()) {
			System.out.println("�Խñ��� �����ϴ�.");
			return;
		}
		for(int i = 0; i < boards.size(); i++) {
			System.out.println(boards.get(i).getTitle());
		}
	}

	private static void delete() {	// �Խ��� ���� �޼ҵ�
		if(boards.isEmpty()) {	// ���� �ȳ��� �κ�
			System.out.println("�Խñ��� �����ϴ�.");
			return;
		}
		sc.nextLine();	// ���� �ȳ��� �κ�
		System.out.print("�Խ��� ���� : ");
		/* ���� �ۼ��� ��
		 * String title = sc.next();
		 * �Ʒ� nextLine��� next�� �������. */
		String title = sc.nextLine();	// ���� Ʋ�� �κ�
		System.out.print("�۾��� : ");
		String writer = sc.next();
		System.out.println("- �Խ����� ���� �Ͻ÷��� ��ȣ�� �Է��Ͻʽÿ�. -");
		System.out.print("��ȣ : ");
		int password = sc.nextInt();
		for(int i = 0; i < boards.size(); i++) {
			Board_my writing = boards.get(i);
			if(writing.getTitle().equals(title)) {
				boards.remove(i);
				System.out.println(title + " �Խ����� �����Ǿ����ϴ�.");
				return;
			}
		}
		System.out.println("�������� �ʴ� �Խ��� �Դϴ�.");
	}

	private static void search() {	// �Խ��� �˻� �޼ҵ�
		System.out.print("�Խ��� ���� : ");
		String title = sc.next();
		for(int i = 0; i < boards.size(); i++) {
			Board_my writing = boards.get(i);
			if(writing.getTitle().equals(title)) {
				System.out.println("[ " + writing.getTitle() + "�Խ����� ���� ]");
				System.out.println("���� : " + writing.getContent());
				System.out.println("�۾��� : " + writing.getWriter() + "��");
				return;
			}
		}
		System.out.println("�������� �ʴ� �Խ��� �Դϴ�.");
		
	}

	private static void write() {	// �Խ��� ��� �޼ҵ�
		System.out.print("�Խ��� ���� : ");
		String title = sc.next();
		System.out.print("���� : ");
		String content = sc.next();
		System.out.print("�۾��� : ");
		String writer = sc.next();
		System.out.print("��ȣ : ");
		int password = sc.nextInt();
		Board_my newBoard = new Board_my(title, content, writer, password);
		boards.add(newBoard);
		System.out.println("�Խ����� ��ϵǾ����ϴ�.");
		
	}
}
