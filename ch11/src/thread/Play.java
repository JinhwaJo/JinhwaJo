package thread;

import java.awt.Toolkit;
// ��Ƽ�����尡 �������� ���� ���(����(�̱�)�����常 ���)
public class Play {
	public static void main(String[] args) {
		// �Ҹ�  0.5�ʰ� �� ���� ������ �Ҹ���  ���� ����
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i < 5; i++) {
			toolkit.beep(); // ������ ���
			try {
				Thread.sleep(500); // 0.5�ʰ� ���
			} catch (Exception e) {}
		}
		
		// ��� 0.5�ʰ� �� ���� ������ ���ڸ� ��� ����.
		for(int i = 0; i < 5; i++) {
			System.out.println("��");
			try {
				Thread.sleep(500); // 0.5�ʰ� ���
			} catch(Exception e) {}
		}
	}
}
