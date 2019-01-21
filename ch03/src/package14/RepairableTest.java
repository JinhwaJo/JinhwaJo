package package14;

public class RepairableTest {

}

interface Repairable { }	// �����ϴ� �������̽�

class Unit{		// ���� Ŭ����(�ֻ��� �θ�)
	int currentHP;
	// final�� �ٿ� �ִ�ü���� ������ �ʵ��� ����� �����.
	/* static�� ������ �ʴ� ���� : �θ� �ڽ� ��ü�� ü��(�Ӽ� ��)�� �� �� ���� ���� (150, 125, 100, 80 ���� �ٸ�)
	 * �θ� Ŭ������ ó������ ���� �ο��� �� ����.
	 * (static final�� ���α׷� ���� ������ �޸𸮰� �����ǹǷ�,
	 *  �ʱ�ȭ�� ���α׷� ���� ������ �ؾ��Ѵ�.) */
	final int MAXHP;
	Unit(int hp) {		 
		MAXHP = hp;		// ������ �ִ� ü��
		currentHP = hp;	// ������ ���� ü��
	
	}
}

class GroundUnit extends Unit {		// ���� (�ɾ�ٴϴ�) ���� Ŭ����
	GroundUnit(int hp) {
		super(hp);
	}
}

class AirUnit extends Unit {	// ����(���ƴٴϴ�) ���� Ŭ����
	AirUnit(int hp) {
		super(hp);
	}
}
// ��ũ(����)�� ����(�ɾ�ٴϴ�) �����̸� ������ �����ϴ�.
class Tank extends GroundUnit implements Repairable {
	// ���� ���� Ŭ������ ��ӹް�, implements (���� ��ɾ�)�� ���� Repairable �������̽��� �޾Ҵ�.
	Tank(int hp) {
		super(150);	// super�� �پ����Ƿ� 150�� �θ𿡰� ����
	}
	@Override
	public String toString() {	// ������ �̸������� ����ϱ� ���� toString ���
		return "��ũ";
	}
}
// ���ۼ�(����� ����)�� ����(���ƴٴϴ�) �����̸� ������ �����ϴ�.
class Dropship extends AirUnit implements Repairable {
	Dropship(int hp) {
		super(125);
	}
	@Override
	public String toString() {	// ������ �̸������� ����ϱ� ���� toString ���
		return "�����";
	}
}
// ����(���� ����)�� ���� (�ɾ�ٴϴ�) �����̸� ������ �Ұ����ϴ�.(repairable �� �� ����)
class Marine extends GroundUnit {
	Marine(int hp) {
		super(100);
	}
	@Override
	public String toString() {
		return "����";
	}
}
//SCV(�ϲ� ����)�� ����(�ɾ�ٴϴ�) �����̸� ������ �����ϰ�,
class SCV extends GroundUnit implements Repairable {
	SCV(int hp){
		super(80);
		}
	@Override
	public String toString() {
		return "SCV";
		}
	// �Ű� ���� : �������̽� Ÿ���� ����(�θ�)�� �������̽��� ������ ��ü(�ڽ�)�� ������ �� �ִ�.
	/* ���⼭ Repairable�� �������̽��̸�, Tank�� Dropship�� implement Repairable�� �޾����ϱ�
	 * Repairable�� �ڽ��̶� ������. �׷��� Repairable�� �θ�� �ڽ��� ������ �� �ִٴ� ����.	 */
	void repair(Repairable r) {	// ������ �� �� �ִ�.	
		/* �������̽� Ÿ���� ������ �������� ���̹Ƿ� Ŭ���� Ÿ������ ���� Ÿ�� ��ȯ�Ͽ��� �Ѵ�.
		 * Ŭ���� Ÿ������ ���� Ÿ�� ��ȯ�� ������ ��ü�� �ǹǷ� ��ü�� �̿���
		 * ��ü�� ���(�ʵ�, �޼ҵ�)�� ����� �� �ְ� �ȴ�.	 */
		if(r instanceof Unit) {	
			Unit u = (Unit)r;	// �������̽��� Ŭ������ ���� Ÿ�� ��ȯ�Ͽ��� �Ѵ�.
			while(u.currentHP != MAXHP) {
				u.currentHP++;
				}
			System.out.println(u.toString() + "�� ������ �Ϸ�Ǿ����ϴ�.");
		}
	}
}