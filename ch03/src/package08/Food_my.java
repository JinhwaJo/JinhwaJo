package package08;

public class Food_my {	// ����(�θ�) Ŭ����
	int price;	// ��ǰ�� ����
	
	public Food_my(int price) {
		this.price = price;
	}
	/* Eater�� ���� �����ڸ� �θ�Ŭ������ �����
	 * �Ű������� ������ �ڷ����� ������ �ߺ��� �ǹ����Ƿ�,
	 * �Ű������� �����Ͽ� �̷� ������ �ذ��ϰų�, �ٸ� Ŭ������ �������� �Ѵ�.	 */
}

class Chicken1 extends Food_my {	// ����(�ڽ�) Ŭ����1
	Chicken1() {
		super(18000);	// ġŲ�� ������ 18000��
	}

	@Override
	public String toString() {
		return "ġŲ";
	}
}

class Pizza1 extends Food_my {	// ����(�ڽ�) Ŭ����2
	Pizza1() {
		super(25000);	// ������ ������ 25000��
	}

	@Override
	public String toString() {
		return "����";
	}
}

class Burger1 extends Food_my {	// ����(�ڽ�) Ŭ����3
	Burger1() {
		super(8000);	// �ܹ����� ������ 8000��
	}

	@Override
	public String toString() {
		return "�ܹ���";
	}
}
