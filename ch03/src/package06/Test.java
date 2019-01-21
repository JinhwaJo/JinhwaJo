package package06;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

// Ȯ���ϰ��� �ϴ� ���뿡 �ش��ϴ� Ŭ������ Ŀ���� �ø��� Shift + F2�� ������ ���� Ȯ���� �����ϴ�.

// 0. ������(ȭ��)�� ��ӹ޴´�.
public class Test extends JFrame {
	// 7-1. ȭ�� ���θ� ������ ��ư�� ������.
	JButton button = new JButton("Ŭ��");
	// 8-1. �ؽ�Ʈ ����
	JTextField text = new JTextField();
	// 1. ȭ���� �����ϱ� ���� �켱 �����ڸ� �����.
	static int sw = 1; //7-4. if���� ���� ���� ���� ����
	
	public Test() {
		/* 2. ������ �� �Ŀ��� ����Ϳ� ��µ��� ������ ����ڴ� �� �� ����.
		 * �׷��� �Ʒ��� ���� ����Ϳ� ȭ���� ����ϱ� ���� ��ɾ �ʿ��ϴ�.	*/
		setVisible(true);	// ȭ�� ����� ���� ���� �Ǿ�� �ϹǷ� setVisible(); ��ɾ�� �� ���ʿ� ��ġ�ؾ��Ѵ�.
		// 7-2. ������� ��ư�� �߰��ϰ� ��ư�� ����� �������ش�.
		button.setBounds(10, 30, 100, 30);
		/* �׼��� �͸� ���� ��ü(ActionListener)
		 * �׼��� �͸� ���� ��ü���� Anonymous ���� Inner�� �ǹ� : 
		 * ��ø Ŭ������ �Ͽ�, Ŭ�����ȿ� �������̽��� �����Ͽ� �� Ŭ���� �ȿ����� �� �� �ֵ��� ��.
		 * UI�ʿ����� �ַ� ����ϸ�, �׿� ���߿����� ��ø Ŭ������ ���� ������� �����Ƿ� ���� �� ��.	 */
		button.addActionListener(new ActionListener() {	// 7-3. ��ư�� Ŭ���ϴ� ����� �߰����ش�.			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(sw == 1) {	// 7-4. if - else if���� �Ἥ Ŭ�� Ƚ���� ���� ��ȭ�� �� �� �ִ�.  
					text.setText("Hello, world.");
					sw = 2;
				} else if(sw == 2) {
					text.setText("");
					sw = 1;
				}
				
			}
		}); 	
		add(button);
		// 8-2. ������� �ؽ�Ʈ�� �߰��ϰ� �ؽ�Ʈ ����� �������ش�.
		text.setBounds(120, 30, 130, 30);
		add(text);
		

		// �ΰ����� ���� �κ��� �Ʒ��� �̷��� �������ָ� ����.
		// 4. ȭ���� ũ�⸦ �����Ѵ�.
		setSize(300, 700); // ����, ����
		// 5-1. ������� �ص�, ���ο� ��ü�� �������� �ʾƼ� ������ �ȵȴ�. �Ʒ��� ��ü�� ����������.
		// 6. ȭ�� ���� ������ �ְ� �; �Ʒ��� ���� �����غ���.
		setTitle("����");
		// 3. Layout(��ư, �� ������ ����) ���� ����.
		setLayout(null);

	}
	
	public static void main(String[] args) {
		new Test();	// 5-2. ��ü�� �����Ѵ�.
	}
}
