package package14;

public class RepairableTest {

}

interface Repairable { }	// 수리하는 인터페이스

class Unit{		// 유닛 클래스(최상위 부모)
	int currentHP;
	// final을 붙여 최대체력이 변하지 않도록 상수로 만든다.
	/* static을 붙이지 않는 이유 : 부모가 자식 객체의 체력(속성 값)을 알 수 없기 때문 (150, 125, 100, 80 각각 다름)
	 * 부모 클래스가 처음부터 값을 부여할 수 없음.
	 * (static final은 프로그램 실행 직전에 메모리가 생성되므로,
	 *  초기화를 프로그램 실행 직전에 해야한다.) */
	final int MAXHP;
	Unit(int hp) {		 
		MAXHP = hp;		// 유닛의 최대 체력
		currentHP = hp;	// 유닛의 현재 체력
	
	}
}

class GroundUnit extends Unit {		// 지상 (걸어다니는) 유닛 클래스
	GroundUnit(int hp) {
		super(hp);
	}
}

class AirUnit extends Unit {	// 공중(날아다니는) 유닛 클래스
	AirUnit(int hp) {
		super(hp);
	}
}
// 탱크(유닛)은 지상(걸어다니는) 유닛이며 수리가 가능하다.
class Tank extends GroundUnit implements Repairable {
	// 지상 유닛 클래스를 상속받고, implements (구현 명령어)를 통해 Repairable 인터페이스를 받았다.
	Tank(int hp) {
		super(150);	// super가 붙었으므로 150을 부모에게 전달
	}
	@Override
	public String toString() {	// 변수의 이름만으로 출력하기 위해 toString 사용
		return "탱크";
	}
}
// 수송선(드랍쉽 유닛)은 공중(날아다니는) 유닛이며 수리가 가능하다.
class Dropship extends AirUnit implements Repairable {
	Dropship(int hp) {
		super(125);
	}
	@Override
	public String toString() {	// 변수의 이름만으로 출력하기 위해 toString 사용
		return "드랍쉽";
	}
}
// 마린(보병 유닛)은 지상 (걸어다니는) 유닛이며 수리가 불가능하다.(repairable 할 수 없음)
class Marine extends GroundUnit {
	Marine(int hp) {
		super(100);
	}
	@Override
	public String toString() {
		return "마린";
	}
}
//SCV(일꾼 유닛)은 지상(걸어다니는) 유닛이며 수리가 가능하고,
class SCV extends GroundUnit implements Repairable {
	SCV(int hp){
		super(80);
		}
	@Override
	public String toString() {
		return "SCV";
		}
	// 매개 변수 : 인터페이스 타입의 변수(부모)는 인터페이스를 구현한 객체(자식)를 저장할 수 있다.
	/* 여기서 Repairable은 인터페이스이며, Tank랑 Dropship은 implement Repairable을 받았으니까
	 * Repairable의 자식이라 여겨짐. 그러니 Repairable이 부모라 자식을 저장할 수 있다는 개념.	 */
	void repair(Repairable r) {	// 수리를 할 수 있다.	
		/* 인터페이스 타입의 변수는 껍데기일 뿐이므로 클래스 타입으로 강제 타입 변환하여야 한다.
		 * 클래스 타입으로 강제 타입 변환된 변수는 객체가 되므로 객체를 이용해
		 * 객체의 기능(필드, 메소드)를 사용할 수 있게 된다.	 */
		if(r instanceof Unit) {	
			Unit u = (Unit)r;	// 인터페이스를 클래스로 강제 타입 변환하여야 한다.
			while(u.currentHP != MAXHP) {
				u.currentHP++;
				}
			System.out.println(u.toString() + "의 수리가 완료되었습니다.");
		}
	}
}