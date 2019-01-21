package package02;

public class Point3D extends Point {	// 자식 클래스(3차원 좌표)
	int z;
	
	public Point3D() {
		super();	// 자식의 디폴트 생성자는 부몬의 디폴트 생성자를 호출한다.
		this.z = 5;
		/* 부모 클래스를 상속받아 자식 클래스가 일을 하도록 하는 구조이므로
		 * x, y가 우선하고, 그다음 z가 따라오게 된다.
		 * 그래서 this.z = 5; 와 super();를 순서 바꿔 작성하면 오류가 난다.	 */
	}
	
	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = 5;
	}
	
	public void method() {
		/* 같은 패키지 내의 자식 클래스는 super 명령어(protected)와
		 * 객체 생성 후 멤버 접근 연산자로의 멤버에 접근이 가능(default)하다.	 */
		super.x = 10;	// protected
		super.y = 15;	// protected
		Point point = new Point();
		point.x = 10;	// default
		point.y = 15;	// default
		 
	}
	
	public static void main(String[] args) {
		Point3D point3D1 = new Point3D(1, 2, 3);
		Point3D point3D2 = new Point3D();
		
	}

}
