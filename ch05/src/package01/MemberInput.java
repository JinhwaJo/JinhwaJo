package package01;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MemberInput {
	// ȸ�� ������ �����ϴ� �÷���
	private static List<Member> members = new LinkedList<Member>();
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int select;
		while(true) {
			System.out.println("-----------------");
			System.out.println("0.����");
			System.out.println("1. ȸ�� ����");
			System.out.println("2. ȸ�� ����");
			System.out.println("3. ȸ�� ����");	// ���̵� �̿��ؼ� ȸ�� ����
			System.out.print(">> ");
			select = sc.nextInt();
			switch(select) {
			case 0: 
				System.exit(1);	// ����
			case 1:
				membership();	// ȸ������ �޼ҵ�
				break;
			case 2:
				search();		// ȸ�� ã�� �޼ҵ�
				break;
			case 3:
				delete();		// ȸ�� ���� �޼ҵ�
				break;
			}
		}
	}
private static void delete() {	// ȸ�� ���� �޼ҵ�
		System.out.print("���̵� : ");
		String id = sc.next();
		for(int i = 0; i < members.size(); i++) {
			Member member = members.get(i);
			if(member.getId().equals(id)) {
				members.remove(i);
				System.out.println(id + " ȸ������ ������ �����Ǿ����ϴ�.");
				System.out.println("�� ���� �̿����ּż� �����մϴ�.");
				return;
				
			}
		}
		System.out.println("���Ե��� ���� ȸ�� �Դϴ�.");
	}
	
	private static void search() {	// ȸ�� ã�� �޼ҵ�
		System.out.print("���̵� : ");
		String id = sc.next();
		for(int i = 0; i < members.size(); i++) {
			Member member = members.get(i);
			if(member.getId().equals(id)) {
				System.out.println("[ " + member.getId() + "ȸ������ ���� ]");
				System.out.println("�̸� : " + member.getName());
				System.out.println("���� : " + member.getAge() + "��");
				return;
			}
		}
		System.out.println("���Ե��� ���� ȸ�� �Դϴ�.");
	}

	private static void membership() {	// ȸ������ �޼ҵ�
		System.out.print("���̵� : ");
		String id = sc.next();
		System.out.print("�̸� : ");
		String name = sc.next();
		System.out.print("���� : ");
		int age = sc.nextInt();
		Member newMember = new Member(id, name, age);
		members.add(newMember);
		System.out.println("ȸ������ �Ǿ����ϴ�. ȯ���մϴ�.");
	}
}
