package thread;

import java.awt.Toolkit;
// 멀티스레드가 구현되지 않은 경우(메인(싱글)스레드만 사용)
class Sound extends Thread {		// 소리 스레드
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i < 5; i++) {
			toolkit.beep(); // 비프음 듣기
			try {
				Thread.sleep(500);	// 0.5초간 대기
				System.out.println("하오");
			} catch(Exception e) {}
		}
	}
}

class Print extends Thread {			// 출력 스레드
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);	// 0.5초간 대기
			} catch(Exception e) {}
		}
	}			
}

public class Play2 {
	public static void main(String[] args) {
		Sound sound = new Sound(); // 작업 스레드1
		Print print = new Print(); // 작업 스레드2
		
		sound.start();
		print.start();
	}
}
