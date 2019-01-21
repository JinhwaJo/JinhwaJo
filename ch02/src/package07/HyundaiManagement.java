package package07;
import java.util.Scanner;
public class HyundaiManagement {
	/* 현대자동차 등록 프로그램을 작성하시오.
	 * 자동차 이름, 년식, 가격, 
	 * 배기량, 구입 시 세금(7.5%), 재고량
	 * 1. 자동차 등록
	 * 2. 재고 추가 : 자동차 이름을 입력 받고 재고 추가(원래 있던 재고량 + 입력된 재고량)
	 * 3. 자동차 정보 : 자동차 이름을 입력 받고 정보 확인
	 *    (단, 구입 시 세금을 제외한 가격만 출력한다.)
	 * 4. 가격 변경    : 자동차 가격을 변경한다.
	 * 6. 프로그램 종료   								 */
	private static Car[] cars = new Car[50];
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Car.setTax(7.5);
		int select = 0;
		while(true) {
			menu();
			select = sc.nextInt();
			switch(select) {
			case 1:
				registration(); break;
			case 2:
				changeCount(); break;
			case 3:
				information(); break;
			case 4:
				changePrice();break;
			case 5:
				System.out.println("현대자동차 프로그램 종료");
				System.exit(1);
			}
		}
	}

	private static void menu() {			// 메뉴
		System.out.println("-----------현대자동차------------");
		System.out.println("1. 자동차 등록");
		System.out.println("2. 재고량 변경");
		System.out.println("3. 자동차 정보");
		System.out.println("4. 가격 변경");
		System.out.println("5. 종료");
		System.out.print(">> ");
	}
	
	private static void registration() {	// 등록
		System.out.println("[ 자동차 등록 ]");
		for(int i = 0; i < cars.length; i++) {
			if(cars[i] == null) {
				System.out.print("이름 : ");
				String number = sc.next();
				System.out.print("년식 : ");
				int year = sc.nextInt();
				System.out.print("가격 : ");
				int price = sc.nextInt();
				System.out.print("배기량 : ");
				int cc = sc.nextInt();
				System.out.print("재고량 : ");
				int count = sc.nextInt();
				cars[i] = new Car(number, year, price, cc, count);
				System.out.println("신차가 등록되었습니다.");
				return;
			}
		}
		System.out.println("더 이상 등록할 수 없습니다.");
	}

	private static Car search() {			// 검색
		System.out.print("자동차 이름 입력 : ");
		String name = sc.next();
		for(int i = 0; cars[i] != null; i++) {
			if(cars[i].getName().equals(name)) {
				return cars[i];
			}
		}
		return null;
	}
	
	
	private static void changeCount() {	// 재고량 변경
		Car car = search();
		if(car == null) {
			System.out.println("등록된 차량이 없습니다.");
			return;
		}
		System.out.print("추가된 재고를 입력하세요 : ");
		int count = sc.nextInt();
		car.setCount(car.getCount() + count);
		System.out.println(car.getName() + " 차량의 재고 : " + car.getCount());
	}
	
	private static void changePrice() {	// 가격 변경
		Car car = search();
		if(car == null) {
			System.out.println("등록된 차량이 없습니다.");
			return;
		}
		System.out.print("변경된 가격을 입력하세요 : ");
		int price = sc.nextInt();
		car.setPrice(price);
		System.out.println(car.getName() + " 차량의 가격 : " + car.getPrice());
	}
	
	private static void information() {	// 자동차 목록
		Car car = search();
		if(car == null) {
			System.out.println("등록된 차량이 없습니다.");
			return;
		}
		car.confirm();
	}
}
