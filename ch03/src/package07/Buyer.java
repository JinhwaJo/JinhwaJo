package package07;

public class Buyer {	// ������ Ŭ����
	int money = 1000;	// ���� �ݾ�
	int bonusPoint = 0;	// ���ʽ� ����
	// ������ ��ǰ�� �����ϱ� ���� �迭
	Product products[] = new Product[10];
	int i = 0;	// ��ǰ ������ ���� ����
	// �θ� p�� ��ǻ�͸� �����ϰ� �ִ�.
	void buy(Product p) {	// ��� ����
		if(money < p.price) {	// ���� ���� ��ǰ�� ���ݺ��� ������
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
			return;
		}
		money -= p.price;	// ���� ������ ������ ��ǰ ������ �A��.
		bonusPoint += p.bonusPoint;	// ��ǰ�� ���ʽ� ������ �߰��Ѵ�.
		products[i++] = p;		// ������ ��ǰ�� �迭�� �����Ѵ�.
		// p.name, p.get ������ ������� �ʰ�, Ŭ������ �̸� ��ü�� ����ϰ� �ʹٸ�?
		System.out.println(p + "��/�� �����Ͽ����ϴ�.");	// p�� ��ǻ���� �޸� �ּҸ� ������ �ִ�.
		}
	void summary() {
		int sum = 0;		// ������ ��ǰ�� �հ�
		String proList = "";	// ������ ��ǰ�� ����� ����
		for(int i = 0; i < products.length; i++) {
			if(products[i] == null) {
				break;
			}
			sum += products[i].price;
			proList += products[i] + ", ";
		}
		System.out.println("�����Ͻ� ��ǰ�� �� �ݾ���" + sum + "�� �� �Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ��" + proList + " �Դϴ�.");
	}

	public static void main(String[] args) {
		Buyer buyer = new Buyer();	// 1000������ ���� ȣ���� ����!
		buyer.buy(new Computer());	// ��ǻ�͸� ���.
		buyer.buy(new Tv());		// TV�� ���.
		buyer.summary();
	
		/* System.out.println(new Computer().toString());
		 * System.out.println(new Computer());
		 * �ֻ��� Ŭ������ Object�� toString ����� ž��Ǿ� �־�
		 * new Computer�� ����ϸ� �ڵ����� toString �޼ҵ带 ȣ��,
		 * toString�� ������ �ʾƵ� �޼ҵ带 �����س����� ���ϴ´�� ��°���
		 * ��, ���� �� ���� ������ ����� ������.
		 * �� �⺻�Ŀ� �츮�� ��ǻ��, TV�� ����ϵ��� �������س������Ƿ� �ش� �̸��� ��µȴ�.
		 * ������ �ڽ��� ��ǻ�͸� ����� �� ������, �������̵��� �ڽ��� ���� ����� �� �ְ� �ȴ�.*/
	}
}
