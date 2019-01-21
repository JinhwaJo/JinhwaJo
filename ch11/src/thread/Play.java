package thread;

import java.awt.Toolkit;
// 멀티스레드가 구현되지 않은 경우(메인(싱글)스레드만 사용)
public class Play {
	public static void main(String[] args) {
		// 소리  0.5초간 한 번씩 띵띵띵띵띵 소리를  실행 해줌
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i < 5; i++) {
			toolkit.beep(); // 비프음 듣기
			try {
				Thread.sleep(500); // 0.5초간 대기
			} catch (Exception e) {}
		}
		
		// 출력 0.5초간 한 번씩 띵띵띵띵띵 글자를 출력 해줌.
		for(int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500); // 0.5초간 대기
			} catch(Exception e) {}
		}
	}
}
