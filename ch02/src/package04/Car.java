package package04;

public class Car {
	String[] NameList;
	String[] ColorList;
	// �ʱ�ȭ ��� (��ü�� �����Ǳ� ����(= �޸𸮸� �����ϱ� ����) �̸� �޸𸮰� �Ҵ�ȴ�.)
	// �ʱ�ȭ����� ������ ���� �ʴ´ٴ� ���鿡�� static�� Ȯ���� ���̰� �ִ�.
	{
		NameList = new String[] { "SM3", "sM5", "SM6", "Sm7" };
	ColorList = new String[]
		{ "Black", "White", "Red", "Blue", "Gray" };
	}
	private String name;	// ���� �̸�
	private String color;	// ���� ����
	private int speed;		// �ӵ�
	private double power;	// ����
	
	public Car() {
		this.name = null;
		}
	public Car(String name) {
		this.setName(name);
		/* �����ڿ� ���� �츮�� ����� ���� �ý��ۿ���
		 * �޼ҵ带 �ڵ� ȣ���Ͽ� �����ϰ� ����� ����
		 * �ڿ��� ȣ���Ѵٰ� �ؼ� 'Callback �޼ҵ�' ��� �Ѵ�. */
		 
		/* ����ڰ� ������ �ȿ� ������ �� ���� ���� �Է��� ���
		 * ������ ���� ����ڰ� �Է���  ������ ���� ����� �� �ִ�.
		 * �̸� �����ϱ� ���� this.setName(name); �� ���� �����Ͽ�
		 * ����ڿ� ���� �Էµ� ���� ���� �˻縦 ��ģ �� �����ų �� �ֵ���
		 * �޼ҵ� �Լ� ������ ��θ� �������ش�.
		 */
	}
	public Car(String name, String color) {
		this.setName(name);
		this.setColor(color);
	}
	public Car(String name, String color, int speed) {
		this(name, color);	// �����ڵ� �� �ٸ� �����ڸ� ȣ���� �� �ִ�.
		this.setSpeed(speed);
	}
	public Car(String name, String color, int speed, double power) {
		this(name, color, speed);	// �����ڵ� �� �ٸ� �����ڸ� ȣ���� �� �ִ�.
		this.setPower(power);
	}
	public void setName(String name) {
		for(int i = 0; i < NameList.length; i++) {
			if(name.toUpperCase().equals(NameList[i].toUpperCase())) {
				this.name = name;
				System.out.println("���� �̸��� �����Ͽ����ϴ�.");
				return;
			}
		}
		System.out.println("�������� �ʴ� �̸��Դϴ�.");
	}
	public void setColor(String color) {
		for(int i = 0; i < ColorList.length; i++) {
			if(color.toUpperCase().equals(ColorList[i].toUpperCase())) {
				this.color = name;
				System.out.println("���� ������ �����Ͽ����ϴ�.");
				return;
			}
		}
		System.out.println("�������� �ʴ� ���� �Դϴ�.");
	}
	public void setSpeed(int speed) {
		if(!(speed >= 100 && speed <= 400)) {
		System.out.println("���� �ӵ��� �߸� �����Ǿ����ϴ�.");
		return;
		}
		System.out.println("���� �ӵ��� ���������� �����Ǿ����ϴ�.");
		this.speed = speed;
	}
	public void setPower(double power) {
		if(!(power >= 100 && power <= 350)) {
		System.out.println("���� ������ �߸� �����Ǿ����ϴ�.");
		return;
		}
		System.out.println("���� ������ ���������� �����Ǿ����ϴ�.");
		this.power = power;
	}
}
