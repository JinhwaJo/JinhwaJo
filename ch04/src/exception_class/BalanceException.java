package exception_class;

// 3-2. 예외 클래스 작성(최상위 부모인 Exception 또는 RuntimeException을 상속한다.)
public class BalanceException extends RuntimeException {
	
	BalanceException(){}
	BalanceException(String msg){
		// 부모 생성자 호출(메시지 전달)
		super(msg);
	}

}
