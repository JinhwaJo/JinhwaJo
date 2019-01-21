package package01;

public class Example01 {
	public static void main(String[] args) {
		/*
		// 객체 생성(new 연산자 사용)
		Book book1 = new Book();	// Book이라는 이름을 가진 책을 저장하는 자료형을 만들었도다.
		// book1 다음에 오는 '.'을 멤버접근 연산자라고 한다. 
		book1.name = "이것이 자바다";
		book1.author = "신용재";
		book1.rate = 4.9;
		book1.rank = 3;
		
		Book book2 = new Book();
		book2.name = "빠삐용";
		book2.author = "베르나르 베르베르";
		book2.rate = 5.0;
		book2.rank = 1; */
		// private를 붙이면 직접적인 멤버를 사용할 수 없다. (사용자로부터 접근 방지)
		
		Book book1 = new Book();
		book1.setRank(-5);
		book1.setName("this is java");
		book1.setRate(7.5);
		book1.setAuthor("신용재");
		
	}
}
