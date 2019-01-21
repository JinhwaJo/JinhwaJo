package package01_generics;

class Box1 {	// 제네릭을 적용하지 않은 클래스
	private Object item;	// 제네릭이 없다면? Object 클래스의 다형성 활용(Object는 모든 클래스의 조상이므로)
	
	public void setItem(Object item) {
		this.item = item;
	}
	
	public Object getItem() {
		return this.item;
	}
}

class Box2<T> {	// 제네릭이 있는 클래스 생성
	private T item;
	// public static T[] itemArray; 제한1) static 멤버에는 파라미터 타입을 사용할 수 없다.
	
	public void setItem(T item) {
		this.item = item;
	}
	
	public T getItem() {
		return this.item;
	}
	
	// T[] toArray() {
		// 제한2) T[] tmpArr = new T[itemArray.length]; 배열을 생성할 때도 사용할 수 없다.
	// }
}

class Japanese {
	
}

public class Example01 {
	public static void main(String[] args) {
		/* 제네릭은 다양한 타입의 객체들을 처리하는 메소드나 컬렉션 클래스들의
		 * 컴파일 시 타입을 체크하는 기능을 말한다.
		 * 프로그램 실행 전에 타입을 정해놓기 떄문에 객체 형식의 안정성과 형 변환의
		 * 번거로움을 줄일 수 있다.		 */
	Box1 box1 = new Box1();
	box1.setItem(new Japanese());	// 일본 객체를 박스에 저장한다.
	// Object를 제네릭으로 쓰면 문법 상 get 메소드를 쓸때마다 강제 타입 변환을 해줘야한다.
	// 강제 타입 변환이 필요한 이유 : 타입이 정해져 있지 않기 때문.( = 어떤 타입을 저장할 지 모름)
	Japanese j = (Japanese)box1.getItem();	// 일본 객체를 반환한다.
	
	Box2<Japanese> box2 = new Box2<Japanese>();
	box2.setItem(new Japanese());
	Japanese j2 = box2.getItem();	// 강제 타입 변환할 필요가 없음.
			
	}
}
