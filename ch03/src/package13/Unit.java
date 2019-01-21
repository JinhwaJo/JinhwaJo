package package13;

public abstract class Unit {
	// �������̽������� �� �� ���� �ʵ�(��� ����) ����
	int x;			// x ��ǥ(��ġ)
	int y;			// y ��ǥ(��ġ)
	int currentHP;	// HP(ü��)
	
	Unit(int currentHP) {	// ������
		this.currentHP = currentHP;
	}
}

interface Attackable {
	public void attack();	// ����
	
}

interface Movable {
	public void move(int x , int y);		// �̵�
}

// �������̽� ������ ���߻���� �����ϴ�. (Ŭ���� ������ ���� ����� �Ұ��� : �޼ҵ��� ��ȣ��)
interface Fighter extends Attackable, Movable {	// ���ݰ� �̵�
	
}
// ����(������ �ڽ� Ŭ�����̸鼭 �����͸� �����Ѵ�.)
class Marine extends Unit implements Fighter {
	Marine() {
		super(80);	// ������ HP
	}
	
	@Override
	public void attack() {	// Attackable �������̽��� attack �޼ҵ�
		super.currentHP -= 10;
		System.out.println("������(����)�� ����մϴ�.");
		
	}
	
	@Override
	public void move(int x , int y) {	// Movable �������̽��� move �޼ҵ�
		super.x = x;
		super.y = y;
		System.out.println(x + ", " + y + ") ��ġ�� �̵�");
	}
}
// �����(���ۼ�)�� �����̹Ƿ� ������ ����ϰ�, �̵��ϴ� ������ �ϹǷ� �̵� �������̽��� �����Ѵ�.
class Dropship extends Unit implements Movable {
	Dropship(int currentHP) {
		super(150);	// ������� HP(ü��)
	}

	@Override
	public void move(int x, int y) {
		super.x = x;
		super.y = y;
		System.out.println(x + ", " + y + ") ��ġ�� �̵�");
		
	}
	
}