package package15;
/* 참고만 혀라아
 * 액션의 익명 구현 객체에서 Anonymous 뒤의 Inner의 의미 : 
 * 중첩 클래스라 하여, 클래스안에 인터페이스를 선언하여 그 클래스 안에서만 쓸 수 있도록 함.
 * GUI쪽에서만 주로 사용하며, 그외 개발에서는 중첩 클래스를 거의 사용하지 않으므로 참고만 할 것.	 */

// 1-3. 아래의 onClickListener를 구현하기 위해 아래 두 가지 클래스를 생성
class CheckListener implements Button.OnClickListener {

	@Override
	public void onClick() {
		System.out.println("체크를 합니다.");
		
	}
	
}
class MessageListener implements Button.OnClickListener {

	@Override
	public void onClick() {
		System.out.println("메시지를 보여줍니다.");
		
	}
	
}

public class Button {	// 바깥 클래스
	OnClickListener listener;
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {	// 1-1. touch(클릭)하면 onClickListener를 실행하게 설정해놓았지만.
		listener.onClick();
	}
	
	// 중첩(내부) 인터페이스
	interface OnClickListener {	// 1-2. OnClickListenr 안에 구현내용이 없음. 그래서
		void onClick();
	}
	
	public static void main(String[] args) {	// 메인 안에 실행 내용을 입력해준다.
		Button button = new Button();
		button.setOnClickListener(new CheckListener());
		button.touch();	// 마우스 클릭의 개념
		button.setOnClickListener(new MessageListener());
		button.touch();	// 마우스 클릭의 개념
		button.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("그림을 보여준다.");
				
			}
		});
		button.touch();	// 마우스 클릭의 개념
	}
}
