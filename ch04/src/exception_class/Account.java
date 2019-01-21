package exception_class;

public class Account {
	private String number;	// 계좌번호 필드
	private int balance;	// 잔액 필드
	
	public Account() {}
	//2. 예외 던지기
	// 3-1. 노란줄이 뜨는 예외 클래스에 커서를 올려 예외 클래스 작성을 선택한다.
	public Account(String number, int balance) throws BalanceException {
		this.number = number;
		if(balance < 0) {
			// 1. 예외 발생
			throw new BalanceException("잔액이 잘못되었습니다.");
		}
		this.balance = balance;
	}
	// 잔액 변경
	public void setBalance(int balance) throws BalanceException {
		if(balance < 0) {
			throw new BalanceException("0보다 작습니다.");
		}
		this.balance = balance;
	}
	// 출금
	public void withdraw(int money) throws BalanceException {
		if(balance < money) {	// 출금 금액보다 잔액이 작으면
			throw new BalanceException("잔액을 초과하였습니다.");
		}
		this.balance -= balance;
	}
}

