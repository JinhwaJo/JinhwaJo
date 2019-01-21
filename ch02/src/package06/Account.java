package package06;

public class Account {
	private String accNumber;	// 계좌번호
	private String accOwner;	// 계좌주
	private int balance;		// 잔액
	private static double rate;
	// 이율(금리%)(동일 금리가 적용되므로 공유의 특성을 가지도록 static화 시킨다.)
	/* rate는 계좌를 생성(생성자를 사용) 하기전에 지정되지만
	 * 아래 rate관련 함수는 계좌 생성 후에 작동하므로 It doesn't make sense.
	 * 그래서 아래와 같이 함수부분을 수정해주고, 생성자에서도 삭제해준다.
	 * (생성자와 static 멤버 변수는 연관성을 가지지 않는다.)
	 */
	
	// 생성자
	Account() { }	// 디폴트 생성자
	Account(String accNumber, String accOwner, int balance){
		this.accNumber = accNumber;
		this.accOwner = accOwner;
		this.balance = balance;
	}
	
	public void setAccNumber(String accNumber) {	// 계좌번호 저장 메소드
		this.accNumber = accNumber;
	}
	
	public void setAccOwner(String accOwner) {		// 계좌주 저장 메소드
		this.accOwner = accOwner;
	}
	
	public void setBalance(int money) {				// 잔액 저장 메소드
		balance = money;
	}
	
	public static void setRate(double rate) {				// 이율 저장 메소드
		/* static 메소드에서
		 * this 명령어는 객체를 의미하므로,
		 * 객체를 생성하기 전에 사용할 수 있는 static 멤버 변수에 접근하려면
		 * 아래와 같이 클래스 이름으로 접근하여야 한다.
		 */
		// this.rate = rate; (X)
		Account.rate = rate;
	}
	/* getter 메소드는 다른 클래스에서 현재 클래스의 객체 값들을 사용할 때 활용된다.
	 * : 반환형이 있고, 메소드 이름 앞에 get이 붙으며, 매개 변수가 없다.
	 * : 메소드 구현에는 항상 return 문이 작성된다.
	 * (객체 값을 저장할 때 사용하는 setter 메소드와 반대되는 개념이다.)
	 */
	public String getAccNumber() {	// 계좌번호 반환(꺼내는) 메소드
		return this.accNumber;
	}
	
	public String getAccOwner() { 	// 계좌주 반환(꺼내는) 메소드
		return this.accOwner;
	}
	
	public int getBalance() {		// 잔액을 반환(꺼내는) 메소드
		return this.balance;
	}
	
	
	
	
	
	
}
