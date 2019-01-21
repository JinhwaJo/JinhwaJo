package thread;
// Runnable �������̽��� �����ϸ� run �޼ҵ带 ���� �����ؾ� �Ѵ�.
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
		// Runnable r = new A();	// �������̽�(�θ�) = ���� ��ü(�ڽ�)
		// �������̽��� �����ڿ� ������ �� ����. ( = �͸�����ü�� ���� �� �ִ�.)
		
		// �Ʒ��� ���� �ϸ� ��ü ���� ���ʿ�.
		// Runnable �������̽��� �ַ� �������� �͸� ���� ��ü�� ���� �� ����Ѵ�.
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
