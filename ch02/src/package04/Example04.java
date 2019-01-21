package package04;

public class Example04 {
	public static void main(String[] args) {
		// 다음 아래 코드에 알맞게 동작하는 클래스를 설계하시오.
		Car c1 = new Car();		// 디폴트 생성자
		c1.setName("SM5");		// SM3, SM5, SM6, SM7 만 저장 가능
		c1.setColor("Black");	// 색상은 Black, White, Red, Blue, Gray만 저장 가능
		c1.setSpeed(250);		// 최대 속도는 100 ~ 400까지만 저장 가능
		c1.setPower(140.5);		// 최대 마력은 100 ~ 350까지만 저장 가능
		
		Car c2 = new Car("SM6");			// 매개 1개인 생성자
		Car c3 = new Car("SM5", "White");	// 매개 2개인 생성자
		Car c4 = new Car("SM5", "Red", 210);// 매개 3개인 생성자(210은 속도)
		Car c5 = new Car("SM5", "Blue", 230, 145.5);	// 매개 4개인 생성자
	}
}
