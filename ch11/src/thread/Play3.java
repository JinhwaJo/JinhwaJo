package thread;
// Runnable 인터페이스를 구현하면 run 메소드를 강제 구현해야 한다.
/* class A implements Runnable {
	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println("A ");
			try {
				Thread.sleep(500);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
} */

public class Play3 {
	public static void main(String[] args) {
		// Runnable r = new A();	// 인터페이스(부모) = 구현 객체(자식)
		// 인터페이스를 생성자에 지정할 수 있음. ( = 익명구현객체를 만들 수 있다.)
		
		// 아래와 같이 하면 객체 생성 불필요.
		// Runnable 인터페이스는 주로 스레드의 익명 구현 객체를 만들 때 사용한다.
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i = 0; i < 5; i++) {
					System.out.println("A ");
					try {
						Thread.sleep(500);
					} catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			
		});
		thread1.start();
	}

}
