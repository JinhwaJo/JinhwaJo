package package07;
// 클래스 앞에 public은 하나만 붙이며, 이는 부모 클래스를 뜻한다.
// public을 붙이지 않은 class를 여러개 형성하여 하위(자식) 클래스로 둘 수 있다.
public class Product {	// 상위(부모) 클래스
	int price;		// 제품의 가격
	int bonusPoint;	// 제품 구매 시 보너스 점수
	
	public Product(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);		// 보너스 점수는 제품 가격의 10%
	}

}
//부모 클래스의 필드를 보면 자식클래스의 공통적인 속성을 알 수 있다.
class Computer extends Product {		// 하위(자식) 클래스
	Computer() {
		super(200);		// 컴퓨터의 가격은 200만원
		// super는 부모 생성자 호출 명령어
	}

	@Override
	public String toString() {	// toString은 문자열을 반환하는 메소드
		return "컴퓨터";
		// 원래는 자식인 컴퓨터를 사용할 수 없지만, 오버라이딩된 자식의 것은 사용할 수 있게 된다.
	}
	
}

class Tv extends Product {				// 하위(자식) 클래스
	Tv() {
		super(300);		// TV의 가격은 300만원
	}
	
	@Override
	public String toString() {
		return "TV";
	}
		
}
