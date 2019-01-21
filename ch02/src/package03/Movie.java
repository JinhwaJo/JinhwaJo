package package03;

public class Movie {
	String name;		// 영화 이름
	String director;	// 영화 감독
	int rank;			// 영화 순위
	// 생성자(Constructor) : 객체를 생성하고 초기화하는 메소드
	// 생성자의 이름은 클래스의 이름과 같다.
	/* 메소드의 이름이 같을 때 매개 변수의 이름을 다르게 설정하는 것을 overloading이라 한다.
	 * 생성자 오버로딩(Overloading)
	 * : 메소드 이름이 같고, 매개 변수의 자료형 또는 개수가 '다르면'
	 *   메소드를 허용하는 것 (반환형과는 관계 없다.) */
	public Movie() {	// 매개 변수가 없으면 디폴트 생성자
		this.name = "미지정";
	}
	public Movie(String name) {	// 매개 변수가 1개인 생성자
		this.name = name;
	}
	public Movie(int rank) { 	// 매개 변수가 1개인 생성자
		this.rank = rank;
	}
	/* (허용 안됨)
	 	public Movie(String director) {
		this.director = director;
		} */
	
	// 매개 변수가 2개인 생성자 (허용됨)
	public Movie(String name, String director) {
		this.name = name;
		this.director = director;
	}
}
