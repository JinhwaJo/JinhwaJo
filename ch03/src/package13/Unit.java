package package13;

public abstract class Unit {
	// 인터페이스에서는 할 수 없는 필드(멤버 변수) 선언
	int x;			// x 좌표(위치)
	int y;			// y 좌표(위치)
	int currentHP;	// HP(체력)
	
	Unit(int currentHP) {	// 생성자
		this.currentHP = currentHP;
	}
}

interface Attackable {
	public void attack();	// 공격
	
}

interface Movable {
	public void move(int x , int y);		// 이동
}

// 인터페이스 간에는 다중상속이 가능하다. (클래스 간에는 다중 상속이 불가능 : 메소드의 모호성)
interface Fighter extends Attackable, Movable {	// 공격과 이동
	
}
// 마린(유닛의 자식 클래스이면서 파이터를 구현한다.)
class Marine extends Unit implements Fighter {
	Marine() {
		super(80);	// 마린의 HP
	}
	
	@Override
	public void attack() {	// Attackable 인터페이스의 attack 메소드
		super.currentHP -= 10;
		System.out.println("스팀팩(마약)을 사용합니다.");
		
	}
	
	@Override
	public void move(int x , int y) {	// Movable 인터페이스의 move 메소드
		super.x = x;
		super.y = y;
		System.out.println(x + ", " + y + ") 위치로 이동");
	}
}
// 드랍쉽(수송선)은 유닛이므로 유닛을 상속하고, 이동하는 행위만 하므로 이동 인터페이스를 구현한다.
class Dropship extends Unit implements Movable {
	Dropship(int currentHP) {
		super(150);	// 드랍쉽의 HP(체력)
	}

	@Override
	public void move(int x, int y) {
		super.x = x;
		super.y = y;
		System.out.println(x + ", " + y + ") 위치로 이동");
		
	}
	
}