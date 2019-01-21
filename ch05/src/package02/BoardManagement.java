package package02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardManagement {
	private static Scanner sc = new Scanner(System.in);
	private static List<Board> boards = new ArrayList<Board>();
	
	public static void main(String[] args) {
		/* [ 게시판 관리 프로그램을 작성하시오. ]
		 * (게시판 : 제목, 내용, 글쓴이, 암호)
		 * 1. 게시판 등록 : 제목, 내용, 글쓴이, 암호를 입력 받고 등록한다.
		 * 2. 게시판 검색 : 제목으로 게시판을 찾고 글쓴이와 내용을 확인한다.
		 * 3. 게시판 삭제 : 제목, 글쓴이, 암호를 입력 받아 해당 게시판을 삭제한다.
		 * 4. 게시판 목록 : 게시판 제목을 나열한다.
		 * 5. 종료 : 프로그램을 종료한다.							 */
		while(true) {
			System.out.println("--------[ 게시판 관리 메뉴 ]--------");
			System.out.println("1. 등록");
			System.out.println("2. 검색");
			System.out.println("3. 삭제");
			System.out.println("4. 목록");
			System.out.println("5. 종료");
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

	private static void list() {		// 게시글 목록
		if(boards.isEmpty()) {
			System.out.println("게시글이 없습니다.");
			return;
		}
		for(int i = 0; i < boards.size(); i++) {
			System.out.println(boards.get(i).getTitle());
		}
	}

	private static void delete() {		// 게시판 삭제
		if(boards.isEmpty()) {
			System.out.println("게시글이 없습니다.");
			return;
		}
		sc.nextLine();
		System.out.print("제목 : ");
		String title = sc.nextLine();
		for(int i = 0; i < boards.size(); i++) {
			// 삭제할 게시판 제목과 리스트에 저장된 게시판의 제목이 같으면
			if(title.equals(boards.get(i).getTitle())) {
				// 게시판을 반환하고,
				Board board = boards.get(i);
				// 글쓴이와 암호를 입력 받은 후 
				System.out.print("글쓴이 : ");
				String writer = sc.next();
				System.out.print("암호 : ");
				String password = sc.next();
				
				// 게시판의 글쓴이와 암호가 일치하면
				if(writer.equals(board.getWriter()) && password.equals(board.getPassword())) {
					boards.remove(i); // 해당 게시판을 삭제하고,
					System.out.println("게시글이 삭제되었습니다.");
					return;	// 메소드를 종료한다.
				}
				System.out.println("글쓴이와 암호가 다릅니다.");
				return;
			}
		}
		System.out.println("등록된 게시글이 없습니다.");
	}

	private static void search() {			// 게시판 검색
		if(boards.isEmpty()) {
			System.out.println("게시글이 없습니다.");
			return;
		}
		sc.nextLine();
		System.out.print("제목 : ");
		String title = sc.nextLine();
		for(int i = 0; i < boards.size(); i++) {
			// 찾을 게시판 제목과 리스트에 저장된 게시판의 제목이 같으면
			if(title.equals(boards.get(i).getTitle())) {
				// 해당 게시판을 반환하고,
				Board board = boards.get(i);
				// 글쓴이와 내용을 확인한다.
				System.out.println("글쓴이 : " + board.getWriter());
				System.out.println("내용 : ");
				System.out.println(board.getContent());
				return;
			}
		}
		System.out.println("등록된 게시글이 없습니다.");
	}

	private static void registration() {		// 등록
		sc.nextLine();
		System.out.print("제목 : ");
		String title = sc.nextLine();
		System.out.print("글쓴이 : ");
		String writer = sc.next();
		System.out.print("암호 : ");
		String password = sc.next();
		System.out.println("내용 : ");
		sc.nextLine();
		String content = sc.nextLine();
		Board board = new Board(title, content, writer, password);
		boards.add(board);
		System.out.println("게시판이 등록되었습니다.");
	}
}







