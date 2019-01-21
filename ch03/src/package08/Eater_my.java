package package08;

public class Eater_my {	// 먹방러 클래스
	private int money;
	/* 밑의 주문자의 금액을 입력받는 값으로 가져가기 위해
	 * int money = 50000; 와 같은 별도의 변수 값을 입력하지 않도록 한다.  */
	
	public Eater_my(int money) {
		this.money = money;
	}
	// 구입한 제품을 저장하기 위한 배열
	Food_my food[] = new Food_my[10];
	int i = 0;	// 제품 개수를 세는 변수
	

	
	void order(Food_my f) {	// 주문
		if(money < f.price) {
			System.out.println("잔액이 부족하여 음식을 주문할 수 없습니다.");
			return;
		}
		money -= f.price;	// 가진 돈에서 구입한 제품 가격을 뺸다.
		food[i++] = f;		// 주문한 제품을 배열에 저장한다.
		System.out.println(f + "을/를 주문하였습니다.");
	}
	void summary() {
		int sum = 0;	// 주문한 제품의 합계
		String foodList = "";	// 주문한 제품의 목록을 저장
		for(int i = 0; i < food.length; i++) {
			if(food[i] == null) {
				break;
			}
			sum += food[i].price;
			foodList += food[i] + ", ";
		}
		System.out.println("주문하신 제품의 총 금액은" + sum + "원 입니다.");
		System.out.println("주문하신 제품은 " + foodList + " 입니다.");
	}
	
	public static void main(String[] args) {
		/* (문제분석)
		 * 위쪽에 int money = 50000; 처럼 선언을 해버리면 생성자가 필요없지만
		 * 아래와 같이 Eater가 가진 돈을 입력받기 위해선 생성자를 만들어야하고
		 * Chicken, Pizza, Burger에 대한 Class가 필요하고
		 * 주문(order)을 위한 메소드가 필요하고
		 * 주문 목록(Summary)을 보여주기 위한 메소드가 필요하다. */
		Eater_my e = new Eater_my(50000);		// 주문자 50000원
		Chicken1 c = new Chicken1();		// 18000원
		Pizza1 p = new Pizza1();			// 25000원
		Burger1 b = new Burger1();		// 8000원
		
		// 주문하기
		e.order(c);	// 치킨
		e.order(p);	// 피자
		e.order(b);	// 햄버거
		e.summary();
	}
}
