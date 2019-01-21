package package11;

abstract public class Unit {
	// ��� ������ �������� �Ӽ��� ����
	int x, y; // ��ǥ
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println(x + ", " + y + "�� �̵��մϴ�.");
	}
	
	// ��� ������ �ٸ���
	abstract public void attack();
	
	public static void main(String[] args) {
		Unit u = new Marine();
		u.move(5, 10);	// ������ �̵��Ѵ�.
		u.attack();		// ������ �����Ѵ�.
		u = new Tank();
		u.move(50, 100);// ��ũ�� �̵��Ѵ�.
		u.attack();		// ��ũ�� �����Ѵ�.
		
		// �δ� ����
		Unit[] group = new Unit[2];
		group[0] = new Marine();
		group[1] = new Tank();
		for(int i = 0; i < group.length; i++) {
			group[i].move(100, 200);
			group[i].attack();
		}
		
	}
}

class Marine extends Unit {	// ����
	@Override
	public void attack() {
		System.out.println("������(����)�� ����մϴ�.");
	}
}
class Tank extends Unit{	// ��ũ
	@Override
	public void attack() {
		System.out.println("�ڸ��� ��� ���Ÿ� ����(������)�� �����մϴ�.");
	}
}


