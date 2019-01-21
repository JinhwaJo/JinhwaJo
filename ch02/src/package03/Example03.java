package package03;

public class Example03 {
	public static void main(String[] args) {
		Movie m1 = new Movie("마약왕");
		// mi1 객체를 생성하면 자동으로 class에 Movie 메소드를 생성해준다.
		// 매개변수는 자동으로 생성이 안됨.
		Movie m2 = new Movie();
		// 생성자를 직접 만들어주면 class에서의 자동 메소드 생성을 안하게된다.
		Movie m3 = new Movie("아쿠아맨", "피카츄");
		Movie m4 = new Movie(3);
		
}
}
