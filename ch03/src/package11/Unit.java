package package11;

abstract public class Unit {
	// 모든 유닛의 공통적인 속성과 행위
	int x, y; // 좌표
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println(x + ", " + y + "로 이동합니다.");
	}
	
	// 모든 유닛의 다른점
	abstract public void attack();
	
	public static void main(String[] args) {
		Unit u = new Marine();
		u.move(5, 10);	// 마린이 이동한다.
		u.attack();		// 마린이 공격한다.
		u = new Tank();
		u.move(50, 100);// 탱크가 이동한다.
		u.attack();		// 탱크가 공격한다.
		
		// 부대 지정
		Unit[] group = new Unit[2];
		group[0] = new Marine();
		group[1] = new Tank();
		for(int i = 0; i < group.length; i++) {
			group[i].move(100, 200);
			group[i].attack();
		}
		
	}
}

class Marine extends Unit {	// 보병
	@Override
	public void attack() {
		System.out.println("스팀팩(마약)을 사용합니다.");
	}
}
class Tank extends Unit{	// 탱크
	@Override
	public void attack() {
		System.out.println("자리를 잡고 원거리 공격(시즈모드)을 지원합니다.");
	}
}


