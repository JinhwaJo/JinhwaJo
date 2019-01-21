package package07;

import java.text.DecimalFormat;

public class Car {
	private String name; // 이름
	private int year;	 // 년식
	private int price;	 // 가격
	private int cc;	     // 배기량
	private static double tax;  // 세금
	private int count;	 // 재고량
	
	// 생성자
	public Car() {
		
	}
	public Car(String name, int year, int price, int cc, int count) {
		this.name = name;
		this.year = year;
		this.setPrice(price);
		this.cc = cc;
		this.count = count;
	}
	
	// setter & getter 메소드
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		// 가격은 7.5%를 제외한 가격으로 저장
		this.price = (int)(price * ((100 - Car.tax) / 100));
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	public static double getTax() {
		return tax;
	}
	public static void setTax(double tax) {
		Car.tax = tax;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	public void confirm() {
		System.out.println("자동차명 : " + name);
		System.out.println("년식 : " + year + " 년");
		DecimalFormat df = new DecimalFormat("#,###");
		String p = df.format(price);
		System.out.println("가격 : " + p + " 만 원");
		System.out.println("배기량 : " + cc + " cc");
		System.out.println("재고량 : " + count + " 대");
	}
}
