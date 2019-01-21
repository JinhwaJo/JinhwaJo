package sw_jbutton;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Example01 {
	Example01(){
		JFrame f = new JFrame("��ư ����");
		/* ������ ��δ� ��ü ��ΰ� �ƴ� �� ��ġ���� ���� ���� ��� ��η� �ۼ��Ѵ�.
		 * �ۼ� �� Java Project ������ images ������ �����.
		 * ��ο� ���� �̸����� �̹��� ������ �ϳ� �����Ͽ� images ������ �ִ´�. 	*/
		
		/* Windows���� ������ ���� ���� Toolkit�� ����.
		 * �Ʒ� �� ���� �ٸ� ��ǻ�Ϳ� �ű� ��� �ּҰ� �޶� image ������ �����ų�
		 * ������ �߻��� �� �ִ� ���� �����Ͽ� �ۼ��� �κ��̴�.		 */
		Image image = Toolkit.getDefaultToolkit().createImage("images\\icon.png");
		JButton b = new JButton(new ImageIcon(image));
		b.setBounds(130, 100, 70, 70);
		// �Ʒ��� ���� �����ϰ� Alt + 1�� �ϸ� Ŭ�� ��ư�� ����ȴ�.
		b.setMnemonic(KeyEvent.VK_1);
		
		f.add(b);
		f.setSize(400, 500);
		f.setLayout(null); // Layout�� null�̶� ���� ���� ��ǥ(x,y)�� ��������� ���� �ǹ�
		f.setVisible(true);
		/* Jbutton�� �޸� button������ �ݱ� ��ư�� ������ â�� ������� �ʴ� ��찡 �ִ�.
		 * �׷��� �Ʒ��� �ڵ带 �������.
		 *  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	 */

	}
	
	public static void main(String[] args) {
		new Example01();
	}
}
