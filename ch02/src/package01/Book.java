package package01;

import java.util.regex.Pattern;

// 설계도(클래스)
public class Book {	// 책
	// : 데이터의 무결성(신뢰도를 높이기 위해)을 위해 정보은닉, 캡슐화를 한다.
	// 속성(필드 : 멤버 변수)
	/* 필드 안에 private : 데이터의 무결성(신뢰도를 높이기 위해)
	 * 				  : 정보 은닉(Information Hiding)
	 * private 이 붙은 멤버는 외부(클래스)에서 자신의 필드를
	 * 직접 접근할 수 없다.	 */
	private String name;	// 이름
	private String author;	// 저자
	private double rate;	// 평균
	private int rank;		// 순위
	private static String p;	// 패턴(모든 객체가 공유하는 필드)
	/* 메소드별로 pattern을 생성하면 성능저하의 원인이 된다.
	 * 대신, 필드에 형성하여 공유시키면, 성능저하를 방지할 수 있다.
	 * static이 붙으면 "공유"의 의미이다.*/
	
	// 행위(메소드 : 멤버 함수)
	/* 필드와 메소드를 클래스 안에 넣은 상태를 캡슐화(Encapsulation)
	 * 라고 말한다.
	 */
	public void setRank(int r) {
		if(r < 0) {
			System.out.println("순위가 잘못되었습니다.");
			return;
		}
		rank = r;
		/* 사용자가 외부에서 입력한 데이터는 r에 저장되고 rank는 내 필드이므로,
		 * 두 가지가 구분되어 데이터의 무결성을 유지한다. */
	}

	public void setName(String nm) {
		/* ^는 문자열의 시작을 의미, a-z(소문자만), A-Z(대문자만) 허용,
		 * *는 앞패턴을 여러개 입력 가능함을 의미(없으면 하나만 쓸 수 있음),
		 * $는 문자열의 끝  */
		p = "^[a-zA-Z\\s]*$";
		// 영문자가 아니면 if문 실행
		if(!Pattern.matches(p,nm)) {	// Pattern을 오토마이징 해줘야 함.
			System.out.println("책 이름이 잘못되었습니다.");
			return;
		}
		name = nm;
		
	}
	/* Alt + s - generate getters and setters 탭에서 
	 * 원하는 것만 선택하여 함수 생성가능 */
	public void setAuthor(String author) {
		// 지은이(저자) 는 한글(공백x)만 저장 가능
		p = "^[가-힣]*$";
		if(!Pattern.matches(p, author)) {
			System.out.println("저자 형식이 잘못되었습니다.");
			return;
		}
		this.author = author;	// this를 붙여서 필드와 매개변수를 구분
	}

	public void setRate(double rate) {
		// 1.0 ~ 5.0까지만 저장 가능
		if(!(rate >= 1.0 && rate <= 5.0)) {
			System.out.println("평점을 잘못 입력하였습니다.");
			return;
		}
		this.rate = rate;
	}


}
