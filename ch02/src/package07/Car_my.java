package package07;

public class Car_my {
	
	private String carName;
	private int carYear;
	private int carPrice;
	private int carCapa;
	private static double carTax;
	private int carStock;
	
	Car_my() { }	// 디폴트 생성자
	Car_my(String carName, int carYear,
			int carPrice, int carCapa, int carStock) {
		this.carName = carName;
		this.carYear = carYear;
		this.carPrice = carPrice;
		this.carCapa = carCapa;
		this.carStock = carStock;		
	}
	
	public void setCarName(String carName) {	// 자동차 이름 저장 메소드
		this.carName = carName;
	}
	public void setCarYear(int carYear) {		// 자동차 년식 저장 메소드
		this.carYear = carYear;
	}
	public void setCarPrice(int carPrice) {		// 자동차 가격 저장 메소드
		this.carPrice = carPrice;
	}	
	public void setCarCapa(int carCapa) {		// 자동차 배기량 저장 메소드
		this.carCapa = carCapa;
	}
	public static void setCarTax(double carTax) {
		Car_my.carTax = carTax;
	}
	public void setCarStock(int carStock) {		// 자동차 재고량
		this.carStock = carStock;
	}
	public String getCarName() {	// 자동차 이름 반환 메소드
		return this.carName;
	}
	public int getCarYear() {		// 자동차 년식 반환 메소드
		return this.carYear;
	}
	public int getCarPrice() {		// 자동차 가격 반환 메소드
		return this.carPrice;
	}
	public int getCarCapa() {		// 자동차 배기량 반환 메소드
		return this.carCapa;
	}
	public int getCarStock() {		// 자동차 재고량 반환 메소드
		return this.carStock;
		
	}
	}
	
