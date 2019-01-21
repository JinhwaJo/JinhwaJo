package package02;
/* 접근제한자(클래스 : 2개)
 * public : 모든 클래스에서 사용이 가능한 클래스
 * default : 해당 클래스와 같은 패키지에서만 사용이 가능한 클래스
 * 클래스와는 달리, 필드, 생성자, 메소드에서는 모든 접근 제한자가 사용가능	 */
public class Point {	// 부모 클래스(2차원 좌표)
	/* 접근 제한자의 종류 : public, private, default, protected 
	 * public은 공중 화장실처럼 모든 클래스(모든 사용자)에서 자유롭게 접근 가능한 멤버(다른 프로젝트 간에는 사용 불가)
	 * private은 하드나 RAM처럼 해당 클래스(컴퓨터)에서만 사용 가능한 멤버
	 * default는 같은 패키지(방) 내의 클래스들만 공유 가능한 멤버
	 * protected는 해당 클래스와 같은, 다른 패키지 내의 자식 클래스들만 공유 가능한 멤버(부모 자식 관계)
	 */
	protected int x;	// public 접근 제한자
	int y;			// 디폴트 접근 제한자
	/* 부모클래스에 디폴트 생성자가 없으면 자식 클래스에 문제가 발생하므로
	 * 항상 기본으로 만들어놓도록 하자.	 */
	public Point( ) {
		
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
