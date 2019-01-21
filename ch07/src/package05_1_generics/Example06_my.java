package package05_1_generics;

import java.util.ArrayList;

class Hyundai {	// 1-1. Hyundai 클래스 생성
	}

class Factory { // 4. Factory 클래스 생성
	/* 4. 저장될 내용을 받을 carList 필드 생성
	 * 어떠한 파라미터 타입이 올 지 예측할 수 없기 때문에 제네릭 안에 와일드카드(?)를 쓴다.
	 * <? extends Hyundai> 는 Hyundai와 Hyundai의 자손 클래스만 제네릭에 들어올 수 있게 설정하는 것이다.
	 * "CarList<? extends Hyundai>" 전체를 carList 필드를 꾸며주는 자료형이라 생각하자.	 */
	private CarList<? extends Hyundai> carList;	
	
	// 5. set 메소드 생성
	public void setCarList(CarList<? extends Hyundai> carList) {
		this.carList = carList;
	}
	// 저장 기능만 필요하므로 get 메소드는 굳이 생성할 필요 없으나, Set-Get 짝을 맞추도록 해보자. 
	public CarList<? extends Hyundai> getCarList() {
		return this.carList;
	}
	/* 6. info 메소드 생성
	 * 저장된 데이터를 뽑아내거나 하는 것이 아닌 출력기능만 필요하므로 별도의 반환형 없이 void를 써준다.
	 * CarList 클래스 내에 생성된 컬렉션 List의 기능이지만, 내용이 저장하는 객체가 carList이므로 
	 * 최종적으로 carList에서 toString 메소드를 사용하여 출력문을 완성한다.	 */
	public void info() {
		System.out.println(carList.toString() + " 가 공장에 있습니다.");
	}
}
//2-1. Sonata, Cona, Sm5 클래스 생성하고, Hyundai로 제네릭을 제한 지정할 클래스만 상속 설정
class Sonata extends Hyundai {	
	public String toString() {
		return "쏘나타";
	}
}
class Cona extends Hyundai {
	public String toString() {
		return "코나";
	}
}
class Sm5 {
	public String toString() {
		return "SM5";
	}
}

class CarList<T> {	// 1-2. 제네릭을 가진 CarList 클래스를 생성하고, (뭐가 들어올 지 모르므로) T로 제네릭안의 클래스를 받을 수 있도록 지정해준다. 
	ArrayList<T> list = new ArrayList<T>();
	// 2-2. add 메소드를 생성해준다.
	void add(T item) {
		list.add(item); // 아이템(데이터) 추가
	}
	// 3. 컬렉션 중 list에 자체 내장 되어 있는 toString 메소드에 따라, [A, B]의 형태로 출력된다.
	public String toString() {
		return list.toString();	// 리스트에 아이템(데이터)들을 문자열로 반환
	}
}
public class Example06_my {
	public static void main(String[] args) {
		// 1. 제네릭을 가진 CarList라는 클래스와 그 제네릭 안에 들어갈 Hyundai 클래스 생성되어야 함.
		CarList<Hyundai> carlist = new CarList<Hyundai>();
		// 2. Sonata, Cona, Sm5 클래스가 생성되어야하고, add 메소드의 사용이 가능해야 한다. 
		carlist.add(new Sonata());	// 리스트 추가 가능
		carlist.add(new Cona());	// 리스트 추가 가능
		// carlist.add(new Sm5());		// 리스트 추가 불가능
		// 3. 문제에서 요구한 "[쏘나타, 코나]" 형태로 출력될 수 있도록 CarList 클래스에서 조건 설정이 필요함.
		System.out.println(carlist.toString()); // "[쏘나타, 코나]"가 출력되어야 함.
		// 4. Factory 클래스 생성 요망.
		Factory factory = new Factory();
		// 5. Factory 클래스 내에 Set 메소드 생성 요망.
		factory.setCarList(carlist);
		// 6. 출력 기능을 위해 Factory 클래스 내에 info 메소드 설정
		factory.info(); // "[쏘나타, 코나]" 가 공장에 있습니다."가 출력되어야 함.
	}
}
