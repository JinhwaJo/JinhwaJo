package package07;

import java.text.DecimalFormat;

public class Car {
	private String name; // �̸�
	private int year;	 // ���
	private int price;	 // ����
	private int cc;	     // ��ⷮ
	private static double tax;  // ����
	private int count;	 // ���
	
	// ������
	public Car() {
		
	}
	public Car(String name, int year, int price, int cc, int count) {
		this.name = name;
		this.year = year;
		this.setPrice(price);
		this.cc = cc;
		this.count = count;
	}
	
	// setter & getter �޼ҵ�
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
		// ������ 7.5%�� ������ �������� ����
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
		System.out.println("�ڵ����� : " + name);
		System.out.println("��� : " + year + " ��");
		DecimalFormat df = new DecimalFormat("#,###");
		String p = df.format(price);
		System.out.println("���� : " + p + " �� ��");
		System.out.println("��ⷮ : " + cc + " cc");
		System.out.println("��� : " + count + " ��");
	}
}
