package exception_class;

public class Bank {
	public static void main(String[] args) {
		// 4. 던져진 예외 객체를 해당 catch문에서 처리한다.
		try {
			Account acc1 = new Account("111-111", 100);
			acc1.setBalance(300);
			acc1.withdraw(1000);
		} catch(BalanceException e) {
			System.out.println(e.getMessage());
		}
	}
}
