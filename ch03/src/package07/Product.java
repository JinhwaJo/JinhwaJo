package package07;
// Ŭ���� �տ� public�� �ϳ��� ���̸�, �̴� �θ� Ŭ������ ���Ѵ�.
// public�� ������ ���� class�� ������ �����Ͽ� ����(�ڽ�) Ŭ������ �� �� �ִ�.
public class Product {	// ����(�θ�) Ŭ����
	int price;		// ��ǰ�� ����
	int bonusPoint;	// ��ǰ ���� �� ���ʽ� ����
	
	public Product(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);		// ���ʽ� ������ ��ǰ ������ 10%
	}

}
//�θ� Ŭ������ �ʵ带 ���� �ڽ�Ŭ������ �������� �Ӽ��� �� �� �ִ�.
class Computer extends Product {		// ����(�ڽ�) Ŭ����
	Computer() {
		super(200);		// ��ǻ���� ������ 200����
		// super�� �θ� ������ ȣ�� ��ɾ�
	}

	@Override
	public String toString() {	// toString�� ���ڿ��� ��ȯ�ϴ� �޼ҵ�
		return "��ǻ��";
		// ������ �ڽ��� ��ǻ�͸� ����� �� ������, �������̵��� �ڽ��� ���� ����� �� �ְ� �ȴ�.
	}
	
}

class Tv extends Product {				// ����(�ڽ�) Ŭ����
	Tv() {
		super(300);		// TV�� ������ 300����
	}
	
	@Override
	public String toString() {
		return "TV";
	}
		
}
