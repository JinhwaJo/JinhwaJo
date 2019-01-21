package package10_function;

import java.util.Scanner;

/* 0. 책 이름을 50개까지 저장할 수 있는 배열을 생성한다.
 * 1. 1을 입력하면 도서 이름을 배열에 등록한다. (도서 등록)
 * 2. 2를 입력하면 도서 목록을 출력한다. (도서 목록 확인)
 * 3. 3을 입력하면 도서명을 입력받고 도서가 있는지 확인한다. (도서 찾기)
 * 4. 4를 입력하면 프로그램을 종료한다.
 */

public class Example04 {
	static Scanner sc = new Scanner(System.in);
	static String [] books = new String[50];	// 책 이름 배열 생성
	
	public static void main(String[] args) {
		/* 프로그램 실행 시 구동되는 것은 main 함수 하나 뿐이다.
		 * 가령 Search 함수는 해당 함수 내용에 있는 식을 조건으로 결과 값을 main 함수로 호출하는 것이다.
		 * 이 경우, input 변수는 main 함수 내에 위치하거나, Search 함수의 조건식 내에 위치하여야 한다.
		 * (Class 함수에 넣어버리면, 호출을 할 수가 없다.)
		 */
		while(true) {
			System.out.println("--------------------");
			System.out.println("1. 도서 등록");
			System.out.println("2. 도서 목록 확인");
			System.out.println("3. 도서 찾기");
			System.out.println("4. 프로그램을 종료합니다.");
			System.out.println("--------------------");
			System.out.print(">> ");
			int number = sc.nextInt();
			
		switch(number) {
		case 1 :	// 1. 도서 등록
			registration(); break;
		case 2 : 	// 2. 도서 목록 확인
			list(); break;
		case 3 : 	// 3. 도서 찾기
			search(); break;
		case 4 : 	// 4. 나가기
			System.out.println("프로그램 종료");
			System.exit(1);		// 종료 함수(메소드)
					
					}
		}
	}

	private static void search() {	// 검색 함수(메소드)
		// 도서 찾기
		System.out.println("[ 도서 검색 ]");
		System.out.print("도서 이름 : ");
		String input = sc.next();
		for(int i = 0; books[i] != null; i++) {	
			if(input.equals(books[i])) {
		// 검색하고자 하는 도서의 이름과, 목록에 있는 도서 이름을 비교할때 => 변수가 아닌 값을 비교한다 => == 가 아닌 equals (문자열 전용) 를 쓴다.
				System.out.println("도서가 등록되어 있습니다.");
				return;
				
			}
		}
		System.out.println("등록되지 않은 도서입니다.");
	}

	private static void list() {	// 목록 함수 (메소드)
		// 도서 목록 확인
		int cnt = 0;
		System.out.println("[ 도서 목록 ] ");
		for(int i = 0; books[i] != null; i++) {
			System.out.println(books[i]);
			cnt++;
		}
		System.out.println("회원 님의 도서 목록입니다. : 총 " + cnt + "권" );
		
	}

	private static void registration() {
		// 도서 이름 입력하여 배열에 등록
		System.out.println("[ 도서 등록 ] ");
		for(int i = 0; i < books.length-1; i++) {
			/* String 배열에서 books.length-1 라고 설정해주면 마지막 값을 null로 설정할 수 있다.
			 * 만약 위와 같이 하지 않고, books.length라고 하면
			 * 예를 들어, 배열의 길이가 100인데 2개의 값만 들어있다면, 쓸데없이 배열의 끝까지 반복문을 실행하는 수고를 해야한다.
			 * 그래서 쓸데없이 많이 돌리게 설정하여 기능저하를 야기하는 것을 방지할 수 있다. */
			if(books[i] == null) {
				System.out.print("도서 이름 입력 : ");
				books[i] = sc.next();
				System.out.println("도서 이름을 등록하였습니다.");
				// 4. 나가기
				return;
			}
				
		}
			System.out.println("도서 이름을 등록할 수 없습니다.");
	
		
	}
}
