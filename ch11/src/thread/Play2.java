package thread;

import java.awt.Toolkit;
// ��Ƽ�����尡 �������� ���� ���(����(�̱�)�����常 ���)
class Sound extends Thread {		// �Ҹ� ������
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i < 5; i++) {
			toolkit.beep(); // ������ ���
			try {
				Thread.sleep(500);	// 0.5�ʰ� ���
				System.out.println("�Ͽ�");
			} catch(Exception e) {}
		}
	}
}

class Print extends Thread {			// ��� ������
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i < 5; i++) {
			System.out.println("��");
			try {
				Thread.sleep(500);	// 0.5�ʰ� ���
			} catch(Exception e) {}
		}
	}			
}

public class Play2 {
	public static void main(String[] args) {
		Sound sound = new Sound(); // �۾� ������1
		Print print = new Print(); // �۾� ������2
		
		sound.start();
		print.start();
	}
}
