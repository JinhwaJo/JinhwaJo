package package08;

public class Eater {
	private int balance;
	private Food[] foods = new Food[10];
	private int count = 0;
	public Eater() {
		
	}
	public Eater(int balance) {
		this.balance = balance;
	}
	public void order(Food f) {
		if(this.balance < f.price ) {
			System.out.println("잔액이 부족하여 주문할 수 없습니다.");
			return;
		}
		balance -= f.price;
		foods[this.count++] = f;  
		System.out.println(f + "(을/를) 주문하였습니다.");
	}
	
	public void summary() {
		String foodList = "";
		for(int i = 0; foods[i] != null; i++) {
			foodList += foods[i] + " ";
		}
		System.out.println("[ 주문 리스트 ]");
		System.out.println(foodList);
		System.out.println("잔액 : " + balance);
	}
	
	public static void main(String[] args) {
		Eater e = new Eater(50000); // 주문자 50000원
		Chicken c = new Chicken();  // 18000원
		Pizza p = new Pizza();		// 25000원
		Burger b = new Burger();	// 8000원
		
		// 주문하기
		e.order(c);	//치킨
		e.order(p);	//피자
		e.order(b);	//햄버거
		e.summary();
	}
}
