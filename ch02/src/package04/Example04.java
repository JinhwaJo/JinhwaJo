package package04;

public class Example04 {
	public static void main(String[] args) {
		// ���� �Ʒ� �ڵ忡 �˸°� �����ϴ� Ŭ������ �����Ͻÿ�.
		Car c1 = new Car();		// ����Ʈ ������
		c1.setName("SM5");		// SM3, SM5, SM6, SM7 �� ���� ����
		c1.setColor("Black");	// ������ Black, White, Red, Blue, Gray�� ���� ����
		c1.setSpeed(250);		// �ִ� �ӵ��� 100 ~ 400������ ���� ����
		c1.setPower(140.5);		// �ִ� ������ 100 ~ 350������ ���� ����
		
		Car c2 = new Car("SM6");			// �Ű� 1���� ������
		Car c3 = new Car("SM5", "White");	// �Ű� 2���� ������
		Car c4 = new Car("SM5", "Red", 210);// �Ű� 3���� ������(210�� �ӵ�)
		Car c5 = new Car("SM5", "Blue", 230, 145.5);	// �Ű� 4���� ������
	}
}
