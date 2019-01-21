package package04;

public class Nike_my {
	private int number;
	private String name;
	private int price;
	public Nike_my() {}
	public Nike_my(int number) {
		this.number = number;
	}
	public Nike_my(int number, String name) {
		super();	// 내가 안넣은 코드
		this.number = number;
		this.name = name;
	}
	public Nike_my(int number, String name, int price) {
		this(number, name);
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Nike_my) {
			Nike_my target = (Nike_my)obj;
			/* 내답
			 * if(this.number == number && this.name.equals(target.name)) { */
			if(this.number == target.number) {	
				return true;
			}
		}
		return false;
	}
	@Override
	public int hashCode() {
		// return number; - 내답
		return this.number;
	}
}
