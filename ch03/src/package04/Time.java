package package04;

// final 클래스 : 상속할 수 없는 클래스가 된다. (부모가 될 수 없음)
// public final class Time {
	public class Time extends Object {
		// 아무것도 없으면 자동으로 object 클래스를 자동 상속하고 있음이 생략되어 있다.
		// Object는 모든 객체의 최상위에 있다.
		
		/* 매개값으로 어떤 자식 객체가 제공되느냐에 따라 메소드의 실행 결과는 다양해질 수 있다.
		 * 이에따라, 부모가 다양하게 많은 자식들을 저장할 수 있는 것을 "매개변수의 다형성" 이라고 한다.
		 * 입력 받는 값이 어떠한 것이 들어올 지 알수가 없는 상황이므로
		 * 모든 범위를 설정하려면 무수한 코드 입력을 요하게 된다.
		 * 이런 코드의 과다를 방지하기 위해 필요한 것이 "매개변수의 다형성" 이다.	 */
	private int hour;
	private int minute;
	private int second;
	/* final 필드 : 처음 저장된 값(초기화)은 변경될 수 없다. (상수)
	 * Static 필드 : 공유 기능 추가
	 * 변수화되어 중간 변경이 가능한 멤버를 final을 붙여 변경불가로 고정시킨다.
	 * 상수 선언 시 보통 대문자로 입력
	 * 또한, 상수화시키면 보통 공유해서 쓰므로 static을 같이 붙여준다.	*/
	private static final int MAX_HOUR = 23;
	private static final int MIN_HOUR = 0;
	
	public Time() {	}	// 디폴트 생성자
	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	//final 메소드 : 상속한 클래스가 재정의(부모의 해당 기능 변경 X) 할 수 없다.
	// public final void info() {
	public void info() {
		System.out.println(this.hour + " : " + this.minute + " : " + this.second);
	}
	
	@Override
	public boolean equals(Object obj) {
		// obj 가 저장하고 있는 객체가 Time 객체이면 true 아니면 false
		if(obj instanceof Time) {	// 왼쪽엔 부모 껍데기, 오른쪽엔 자식 클래스
			// 컴퓨터는 Time이 American time인지 어떤건지 모르니 강제 타입 변환이 필요.
			Time target = (Time)obj;	// 다시 자식 인스턴스로 만들어주고,
			// 시와 분을 비교해 일치하면 true를 반환하고,
			if(this.hour == target.hour && this.minute == target.minute) {
				return true;
				// 여기서 this.hour == target.hour는 t1.hour = t2.hour와 같다.
			}
			
		}
		// 일치하지 않으면 false를 반환한다.
					return false;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		if(hour > Time.MAX_HOUR || hour < Time.MIN_HOUR) {
			System.out.println("시간이 잘못되었습니다.");
			return;
		}
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}

	public static void main(String[] args) {
		Time t1 = new Time(10, 59, 10);
		Time t2 = new Time(10, 59, 10);
		Time t3 = new Time (9, 10, 50);
		
		if(t1.equals(t2)) {
			System.out.println("알람 울림.");
		} else {
			System.out.println("알람 안 울림.");
		}
	}
}
