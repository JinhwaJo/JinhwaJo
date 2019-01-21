package package08;

public class Eater {
	private int balance;
	private Food[] foods = new Food[10];
	private int count = 0;
	public Eater() {
		
	}
	public Eater(int balance) {
		this.balance = balance;
	}
	public void order(Food f) {
		if(this.balance < f.price ) {
			System.out.println("�ܾ��� �����Ͽ� �ֹ��� �� �����ϴ�.");
			return;
		}
		balance -= f.price;
		foods[this.count++] = f;  
		System.out.println(f + "(��/��) �ֹ��Ͽ����ϴ�.");
	}
	
	public void summary() {
		String foodList = "";
		for(int i = 0; foods[i] != null; i++) {
			foodList += foods[i] + " ";
		}
		System.out.println("[ �ֹ� ����Ʈ ]");
		System.out.println(foodList);
		System.out.println("�ܾ� : " + balance);
	}
	
	public static void main(String[] args) {
		Eater e = new Eater(50000); // �ֹ��� 50000��
		Chicken c = new Chicken();  // 18000��
		Pizza p = new Pizza();		// 25000��
		Burger b = new Burger();	// 8000��
		
		// �ֹ��ϱ�
		e.order(c);	//ġŲ
		e.order(p);	//����
		e.order(b);	//�ܹ���
		e.summary();
	}
}
