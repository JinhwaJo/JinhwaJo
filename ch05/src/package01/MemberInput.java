package package01;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MemberInput {
	// 회원 정보를 저장하는 컬렉션
	private static List<Member> members = new LinkedList<Member>();
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int select;
		while(true) {
			System.out.println("-----------------");
			System.out.println("0.종료");
			System.out.println("1. 회원 가입");
			System.out.println("2. 회원 정보");
			System.out.println("3. 회원 삭제");	// 아이디를 이용해서 회원 삭제
			System.out.print(">> ");
			select = sc.nextInt();
			switch(select) {
			case 0: 
				System.exit(1);	// 종료
			case 1:
				membership();	// 회원가입 메소드
				break;
			case 2:
				search();		// 회원 찾기 메소드
				break;
			case 3:
				delete();		// 회원 삭제 메소드
				break;
			}
		}
	}
private static void delete() {	// 회원 삭제 메소드
		System.out.print("아이디 : ");
		String id = sc.next();
		for(int i = 0; i < members.size(); i++) {
			Member member = members.get(i);
			if(member.getId().equals(id)) {
				members.remove(i);
				System.out.println(id + " 회원님의 정보가 삭제되었습니다.");
				System.out.println("그 동안 이용해주셔서 감사합니다.");
				return;
				
			}
		}
		System.out.println("가입되지 않은 회원 입니다.");
	}
	
	private static void search() {	// 회원 찾기 메소드
		System.out.print("아이디 : ");
		String id = sc.next();
		for(int i = 0; i < members.size(); i++) {
			Member member = members.get(i);
			if(member.getId().equals(id)) {
				System.out.println("[ " + member.getId() + "회원님의 정보 ]");
				System.out.println("이름 : " + member.getName());
				System.out.println("나이 : " + member.getAge() + "세");
				return;
			}
		}
		System.out.println("가입되지 않은 회원 입니다.");
	}

	private static void membership() {	// 회원가입 메소드
		System.out.print("아이디 : ");
		String id = sc.next();
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		Member newMember = new Member(id, name, age);
		members.add(newMember);
		System.out.println("회원가입 되었습니다. 환영합니다.");
	}
}
