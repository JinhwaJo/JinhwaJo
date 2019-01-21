package package08;

public class Food {
	int price;
	
	public Food(int price) {
		this.price = price;
	}
}

class Chicken extends Food {
	public Chicken() {
		super(18000);
	}
	@Override
	public String toString() {
		return "치킨";
	}
}

class Pizza extends Food {
	public Pizza() {
		super(25000);
	}
	@Override
	public String toString() {
		return "피자";
	}
}

class Burger extends Food {
	public Burger() {
		super(8000);
	}
	@Override
	public String toString() {
		return "버거";
	}
}
