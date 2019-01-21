package package08;

public class Food_my {	// 상위(부모) 클래스
	int price;	// 제품의 가격
	
	public Food_my(int price) {
		this.price = price;
	}
	/* Eater에 대한 생성자를 부모클래스에 만들면
	 * 매개변수의 갯수와 자료형이 같아져 중복이 되버리므로,
	 * 매개변수를 수정하여 이런 문제를 해결하거나, 다른 클래스에 만들어줘야 한다.	 */
}

class Chicken1 extends Food_my {	// 하위(자식) 클래스1
	Chicken1() {
		super(18000);	// 치킨의 가격은 18000원
	}

	@Override
	public String toString() {
		return "치킨";
	}
}

class Pizza1 extends Food_my {	// 하위(자식) 클래스2
	Pizza1() {
		super(25000);	// 피자의 가격은 25000원
	}

	@Override
	public String toString() {
		return "피자";
	}
}

class Burger1 extends Food_my {	// 하위(자식) 클래스3
	Burger1() {
		super(8000);	// 햄버거의 가격은 8000원
	}

	@Override
	public String toString() {
		return "햄버거";
	}
}
