package package04;

public class Car {
	String[] NameList;
	String[] ColorList;
	// 초기화 블록 (객체가 생성되기 전에(= 메모리를 실행하기 전에) 미리 메모리가 할당된다.)
	// 초기화블록은 공유를 하지 않는다는 측면에서 static과 확연한 차이가 있다.
	{
		NameList = new String[] { "SM3", "sM5", "SM6", "Sm7" };
	ColorList = new String[]
		{ "Black", "White", "Red", "Blue", "Gray" };
	}
	private String name;	// 차량 이름
	private String color;	// 차량 색상
	private int speed;		// 속도
	private double power;	// 마력
	
	public Car() {
		this.name = null;
		}
	public Car(String name) {
		this.setName(name);
		/* 생성자와 같이 우리가 만들어 놓은 시스템에서
		 * 메소드를 자동 호출하여 재사용하게 만드는 것을
		 * 뒤에서 호출한다고 해서 'Callback 메소드' 라고 한다. */
		 
		/* 사용자가 생성자 안에 설정된 값 외의 값을 입력할 경우
		 * 설정된 값이 사용자가 입력한  값으로 임의 변경될 수 있다.
		 * 이를 방지하기 위해 this.setName(name); 와 같이 설정하여
		 * 사용자에 의해 입력된 값에 대한 검사를 거친 후 통과시킬 수 있도록
		 * 메소드 함수 쪽으로 경로를 설정해준다.
		 */
	}
	public Car(String name, String color) {
		this.setName(name);
		this.setColor(color);
	}
	public Car(String name, String color, int speed) {
		this(name, color);	// 생성자도 또 다른 생성자를 호출할 수 있다.
		this.setSpeed(speed);
	}
	public Car(String name, String color, int speed, double power) {
		this(name, color, speed);	// 생성자도 또 다른 생성자를 호출할 수 있다.
		this.setPower(power);
	}
	public void setName(String name) {
		for(int i = 0; i < NameList.length; i++) {
			if(name.toUpperCase().equals(NameList[i].toUpperCase())) {
				this.name = name;
				System.out.println("차량 이름을 저장하였습니다.");
				return;
			}
		}
		System.out.println("존재하지 않는 이름입니다.");
	}
	public void setColor(String color) {
		for(int i = 0; i < ColorList.length; i++) {
			if(color.toUpperCase().equals(ColorList[i].toUpperCase())) {
				this.color = name;
				System.out.println("차량 색상을 저장하였습니다.");
				return;
			}
		}
		System.out.println("존재하지 않는 색상 입니다.");
	}
	public void setSpeed(int speed) {
		if(!(speed >= 100 && speed <= 400)) {
		System.out.println("차량 속도가 잘못 설정되었습니다.");
		return;
		}
		System.out.println("차량 속도가 정상적으로 설정되었습니다.");
		this.speed = speed;
	}
	public void setPower(double power) {
		if(!(power >= 100 && power <= 350)) {
		System.out.println("차량 마력이 잘못 설정되었습니다.");
		return;
		}
		System.out.println("차량 마력이 정상적으로 설정되었습니다.");
		this.power = power;
	}
}
