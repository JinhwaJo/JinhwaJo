package package02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardManagement_my {
	private static List<Board_my> boards = new ArrayList<Board_my>();
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		/* [ 게시판 관리 프로그램을 작성하시오. ]
		 * (게시판 : 제목, 내용, 글쓴이, 암호)
		 * 1. 게시판 등록 : 제목, 내용, 글쓴이, 암호를 입력 받고 등록한다.
		 * 2. 게시판 검색 : 제목으로 게시판을 찾고 글쓴이와 내용을 확인한다.
		 * 3. 게시판 삭제 : 제목, 글쓴이, 암호,를 입력 받아 해당 게시판을 삭제한다.
		 * 4. 게시판 목록 : 게시판 제목을 나열한다.
		 * 5. 종료 : 프로그램을 종료한다. */
		
		int select;
		while(true) {
			System.out.println("-------------------");
			System.out.println("[ 게시판 관리 프로그램 ]");
			System.out.println("1. 게시판 등록");
			System.out.println("2. 게시판 검색");
			System.out.println("3. 게시판 삭제");
			System.out.println("4. 게시판 목록");
			System.out.println("5. 종료");
			System.out.print(">> ");
			select = sc.nextInt();
			switch(select) {
			case 1:
				write(); break;			// 게시판 등록 메소드
			case 2:
				search(); break;		// 게시판 검색 메소드
			case 3:
				delete(); break;		// 게시판 삭제 메소드
			case 4:
				list(); break;			// 게시판 목록 메소드
			case 5:
				System.exit(1);			// 종료
			}
			
		}
			
	}

	private static void list() {	// 게시판 목록 메소드
		/* 내가 작성한 답
		 * for(int i = 0; i < boards.size(); i++) {
		 * String str = list.get(i);
		 * System.out.println("[" + (i + 1) + "]" + str); */
		System.out.println("[ 게시판 목록 ]");	// 내가 틀린부분
		if(boards.isEmpty()) {
			System.out.println("게시글이 없습니다.");
			return;
		}
		for(int i = 0; i < boards.size(); i++) {
			System.out.println(boards.get(i).getTitle());
		}
	}

	private static void delete() {	// 게시판 삭제 메소드
		if(boards.isEmpty()) {	// 내가 안넣은 부분
			System.out.println("게시글이 없습니다.");
			return;
		}
		sc.nextLine();	// 내가 안넣은 부분
		System.out.print("게시판 제목 : ");
		/* 내가 작성한 답
		 * String title = sc.next();
		 * 아래 nextLine대신 next를 사용했음. */
		String title = sc.nextLine();	// 내가 틀린 부분
		System.out.print("글쓴이 : ");
		String writer = sc.next();
		System.out.println("- 게시판을 삭제 하시려면 암호를 입력하십시오. -");
		System.out.print("암호 : ");
		int password = sc.nextInt();
		for(int i = 0; i < boards.size(); i++) {
			Board_my writing = boards.get(i);
			if(writing.getTitle().equals(title)) {
				boards.remove(i);
				System.out.println(title + " 게시판이 삭제되었습니다.");
				return;
			}
		}
		System.out.println("존재하지 않는 게시판 입니다.");
	}

	private static void search() {	// 게시판 검색 메소드
		System.out.print("게시판 제목 : ");
		String title = sc.next();
		for(int i = 0; i < boards.size(); i++) {
			Board_my writing = boards.get(i);
			if(writing.getTitle().equals(title)) {
				System.out.println("[ " + writing.getTitle() + "게시판의 내용 ]");
				System.out.println("내용 : " + writing.getContent());
				System.out.println("글쓴이 : " + writing.getWriter() + "님");
				return;
			}
		}
		System.out.println("존재하지 않는 게시판 입니다.");
		
	}

	private static void write() {	// 게시판 등록 메소드
		System.out.print("게시판 제목 : ");
		String title = sc.next();
		System.out.print("내용 : ");
		String content = sc.next();
		System.out.print("글쓴이 : ");
		String writer = sc.next();
		System.out.print("암호 : ");
		int password = sc.nextInt();
		Board_my newBoard = new Board_my(title, content, writer, password);
		boards.add(newBoard);
		System.out.println("게시판이 등록되었습니다.");
		
	}
}
