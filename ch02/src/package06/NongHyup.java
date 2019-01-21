package package06;

public class NongHyup {
	private static Account[] accounts = new Account[3];
	/* 계좌를 3개 저장할 수 있는 Account 배열을 생성
	 * 은행 안에 계좌가 3개 들어 있고, 그것은 유일한 것이므로 static의 특징을 지닌다.
	 * 은행을 갈 떄마다 계좌가 3개 생성되고, 모든 사람들이 공유하게 된다.
	 */
	public static void main(String[] args) {
		Account.setRate(3.3); 	// 모든 계좌(객체)의 이율은 3.3%가 된다.
		accounts[0] = new Account();	// new를 사용하여 새로운 계좌를 생성
		
		// 계좌를 배열에 저장(생성)할 때마다 각각의 생성자가 호출되어야 한다.
		accounts[0].setAccNumber("111-111");
		accounts[0].setAccOwner("홍길동");
		accounts[0].setBalance(10000);
		// accounts[0].setRate(3.3);	// 3.3% (X)
		// 위와 같이 Account 클래스를 수정 후 한번에 적어준다.
		
		accounts[1] = new Account();
		accounts[1].setAccNumber("222-222");
		accounts[1].setAccNumber("남길동");
		accounts[1].setBalance(5000);
		// accounts[1].setRate(3.3); 	// 3.3% (X)
		
	}
}
