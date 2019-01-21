package package07;

public class Buyer {	// 구매자 클래스
	int money = 1000;	// 보유 금액
	int bonusPoint = 0;	// 보너스 점수
	// 구입한 제품을 저장하기 위한 배열
	Product products[] = new Product[10];
	int i = 0;	// 제품 개수를 세는 변수
	// 부모 p는 컴퓨터를 저장하고 있다.
	void buy(Product p) {	// 사는 행위
		if(money < p.price) {	// 가진 돈이 제품의 가격보다 적으면
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		money -= p.price;	// 가진 돈에서 구입한 제품 가격을 뺸다.
		bonusPoint += p.bonusPoint;	// 제품의 보너스 점수를 추가한다.
		products[i++] = p;		// 구입한 제품을 배열에 저장한다.
		// p.name, p.get 등으로 출력하지 않고, 클래스의 이름 자체로 출력하고 싶다면?
		System.out.println(p + "을/를 구입하였습니다.");	// p는 컴퓨터의 메모리 주소를 가지고 있다.
		}
	void summary() {
		int sum = 0;		// 구입한 제품의 합계
		String proList = "";	// 구입한 제품의 목록을 저장
		for(int i = 0; i < products.length; i++) {
			if(products[i] == null) {
				break;
			}
			sum += products[i].price;
			proList += products[i] + ", ";
		}
		System.out.println("구입하신 물품의 총 금액은" + sum + "만 원 입니다.");
		System.out.println("구입하신 제품은" + proList + " 입니다.");
	}

	public static void main(String[] args) {
		Buyer buyer = new Buyer();	// 1000만원을 가진 호갱님 등장!
		buyer.buy(new Computer());	// 컴퓨터를 산다.
		buyer.buy(new Tv());		// TV를 산다.
		buyer.summary();
	
		/* System.out.println(new Computer().toString());
		 * System.out.println(new Computer());
		 * 최상위 클래스인 Object에 toString 기능이 탑재되어 있어
		 * new Computer를 출력하면 자동으로 toString 메소드를 호출,
		 * toString을 붙이지 않아도 메소드를 정의해놓으면 원하는대로 출력가능
		 * 즉, 위의 두 식이 동일한 기능을 가진다.
		 * 이 기본식에 우리가 컴퓨터, TV를 출력하도록 재정의해놓았으므로 해당 이름이 출력된다.
		 * 원래는 자식인 컴퓨터를 사용할 수 없지만, 오버라이딩된 자식의 것은 사용할 수 있게 된다.*/
	}
}
