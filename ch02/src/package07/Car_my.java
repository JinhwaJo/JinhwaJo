package package07;

public class Car_my {
	
	private String carName;
	private int carYear;
	private int carPrice;
	private int carCapa;
	private static double carTax;
	private int carStock;
	
	Car_my() { }	// ����Ʈ ������
	Car_my(String carName, int carYear,
			int carPrice, int carCapa, int carStock) {
		this.carName = carName;
		this.carYear = carYear;
		this.carPrice = carPrice;
		this.carCapa = carCapa;
		this.carStock = carStock;		
	}
	
	public void setCarName(String carName) {	// �ڵ��� �̸� ���� �޼ҵ�
		this.carName = carName;
	}
	public void setCarYear(int carYear) {		// �ڵ��� ��� ���� �޼ҵ�
		this.carYear = carYear;
	}
	public void setCarPrice(int carPrice) {		// �ڵ��� ���� ���� �޼ҵ�
		this.carPrice = carPrice;
	}	
	public void setCarCapa(int carCapa) {		// �ڵ��� ��ⷮ ���� �޼ҵ�
		this.carCapa = carCapa;
	}
	public static void setCarTax(double carTax) {
		Car_my.carTax = carTax;
	}
	public void setCarStock(int carStock) {		// �ڵ��� ���
		this.carStock = carStock;
	}
	public String getCarName() {	// �ڵ��� �̸� ��ȯ �޼ҵ�
		return this.carName;
	}
	public int getCarYear() {		// �ڵ��� ��� ��ȯ �޼ҵ�
		return this.carYear;
	}
	public int getCarPrice() {		// �ڵ��� ���� ��ȯ �޼ҵ�
		return this.carPrice;
	}
	public int getCarCapa() {		// �ڵ��� ��ⷮ ��ȯ �޼ҵ�
		return this.carCapa;
	}
	public int getCarStock() {		// �ڵ��� ��� ��ȯ �޼ҵ�
		return this.carStock;
		
	}
	}
	
