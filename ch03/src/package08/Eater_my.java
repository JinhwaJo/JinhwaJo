package package08;

public class Eater_my {	// �Թ淯 Ŭ����
	private int money;
	/* ���� �ֹ����� �ݾ��� �Է¹޴� ������ �������� ����
	 * int money = 50000; �� ���� ������ ���� ���� �Է����� �ʵ��� �Ѵ�.  */
	
	public Eater_my(int money) {
		this.money = money;
	}
	// ������ ��ǰ�� �����ϱ� ���� �迭
	Food_my food[] = new Food_my[10];
	int i = 0;	// ��ǰ ������ ���� ����
	

	
	void order(Food_my f) {	// �ֹ�
		if(money < f.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �ֹ��� �� �����ϴ�.");
			return;
		}
		money -= f.price;	// ���� ������ ������ ��ǰ ������ �A��.
		food[i++] = f;		// �ֹ��� ��ǰ�� �迭�� �����Ѵ�.
		System.out.println(f + "��/�� �ֹ��Ͽ����ϴ�.");
	}
	void summary() {
		int sum = 0;	// �ֹ��� ��ǰ�� �հ�
		String foodList = "";	// �ֹ��� ��ǰ�� ����� ����
		for(int i = 0; i < food.length; i++) {
			if(food[i] == null) {
				break;
			}
			sum += food[i].price;
			foodList += food[i] + ", ";
		}
		System.out.println("�ֹ��Ͻ� ��ǰ�� �� �ݾ���" + sum + "�� �Դϴ�.");
		System.out.println("�ֹ��Ͻ� ��ǰ�� " + foodList + " �Դϴ�.");
	}
	
	public static void main(String[] args) {
		/* (�����м�)
		 * ���ʿ� int money = 50000; ó�� ������ �ع����� �����ڰ� �ʿ������
		 * �Ʒ��� ���� Eater�� ���� ���� �Է¹ޱ� ���ؼ� �����ڸ� �������ϰ�
		 * Chicken, Pizza, Burger�� ���� Class�� �ʿ��ϰ�
		 * �ֹ�(order)�� ���� �޼ҵ尡 �ʿ��ϰ�
		 * �ֹ� ���(Summary)�� �����ֱ� ���� �޼ҵ尡 �ʿ��ϴ�. */
		Eater_my e = new Eater_my(50000);		// �ֹ��� 50000��
		Chicken1 c = new Chicken1();		// 18000��
		Pizza1 p = new Pizza1();			// 25000��
		Burger1 b = new Burger1();		// 8000��
		
		// �ֹ��ϱ�
		e.order(c);	// ġŲ
		e.order(p);	// ����
		e.order(b);	// �ܹ���
		e.summary();
	}
}
