package package01;

// 자식 클래스 : 이미 만들어진 클래스의 기능을 그대로 물려 받는 클래스
public class Child extends Parent {
	// extends는 Parent 기능을 물려 받겠다는 명령어
	int x;	// 필드는 파란색
	/* parent 클래스를 상속받았기 때문에 x라는 변수를 따로 생성하지 않아도 된다.
	 * 똑같은 x변수를 생성하면 자기 것이 우선순위가 높다.	 */
	
	/* this는 부모의 변수가 될 수도 있다.
	 * 위의 int x는 자식의 것임에도 삭제했을 때 밑에 this로 출력한 x 변수가 오류가 나지 않는다.
	 * 이는, 자식의 변수가 사라져도 this를 부모의 변수로 받았기 때문이다. 	*/
	public void method() {
		int x = 10;	// 지역변수는 갈색		
		// 클래스에 생성하면 필드가 되지만, 메소드 안에서는 지역변수가 된다.
		super.x = 7;	// 부모(super)의 x 변수
		this.x = 5;			// 자식()의 x 변수
		System.out.println(super.x);	// 부모의 필드
		System.out.println(this.x);		// 자식의 필드
		System.out.println(x);			// 지역 변수
	}
	
	public static void main(String[] args) {
		Child child = new Child();
		child.method();
	}
}
