package package04;

public class Nike {
	private int number;
	private String name;
	private long price;
	public Nike() {}
	public Nike(int number) {
		this.number = number;
	}
	
	public Nike(int number, String name) {
		super();
		this.number = number;
		this.name = name;
	}
	
	public Nike(int number, String name, long price) {
		this(number, name);
		this.price = price;
	}
	
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
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
		if(obj instanceof Nike) {
			Nike target = (Nike)obj;
			if(this.number == target.number) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return this.number;
	}
}



