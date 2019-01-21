package sw_jbutton;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class BurgerKing {
	BurgerKing(){
		JFrame f = new JFrame("★BURGER KING★");
		Image image = Toolkit.getDefaultToolkit().createImage("images\\icon.png");
		Image image1 = Toolkit.getDefaultToolkit().createImage("images\\Lunch Menu.png");
		Image image2 = Toolkit.getDefaultToolkit().createImage("images\\Truffle Mushroom Whopper.png");
		Image image3 = Toolkit.getDefaultToolkit().createImage("images\\Prawn Whopper.png");
		Image image4 = Toolkit.getDefaultToolkit().createImage("images\\Grilled Beef Whopper.png");
		Image image5 = Toolkit.getDefaultToolkit().createImage("images\\Monster Whopper.png");
				
		final JTextField tf = new JTextField();
		tf.setBounds(90, 10, 270, 30);
		final JTextField tf1 = new JTextField();
		tf1.setBounds(10, 145, 450, 30);
		final JTextField tf2 = new JTextField();
		tf2.setBounds(100, 220, 250, 30);
		final JTextField tf3 = new JTextField();
		tf3.setBounds(100, 340, 250, 30);
		final JTextField tf4 = new JTextField();
		tf4.setBounds(100, 455, 250, 30);
		final JTextField tf5 = new JTextField();
		tf5.setBounds(100, 575, 250, 30);
		
		JButton a = new JButton(new ImageIcon(image));
		a.setBounds(10, 10, 70, 70);
		a.setMnemonic(KeyEvent.VK_1);
		// ActionListener는 해당 버튼을 클릭하면 설정된 문구를 출력해주는 메소드
		a.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			tf.setText(" WELCOME TO BURGER KING!! BAAAAMMM!!!!!");
			}
		});
		JButton b = new JButton(new ImageIcon(image1));
		b.setBounds(10, 90, 260, 50);
		b.setMnemonic(KeyEvent.VK_2);
		b.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			tf1.setText(" Click the image of burgers you want and you can see the detailed information. ");
			}
		});
		JButton c = new JButton(new ImageIcon(image2));
		c.setBounds(10, 180, 80, 100);
		c.setMnemonic(KeyEvent.VK_3);
		c.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			tf2.setText(" 1. Truffle Mushroom Whopper : 6,000 won");
			}
		});
		JButton d = new JButton(new ImageIcon(image3));
		d.setBounds(10, 300, 80, 100);
		d.setMnemonic(KeyEvent.VK_4);
		d.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			tf3.setText(" 2. Prawn Whopper : 6,600 won");
			}
		});
		JButton e = new JButton(new ImageIcon(image4));
		e.setBounds(10, 420, 80, 100);
		e.setMnemonic(KeyEvent.VK_5);
		e.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			tf4.setText(" 3. Grilled Beef Whopper : 5,700 won");
			}
		});
		JButton g = new JButton(new ImageIcon(image5));
		g.setBounds(10, 540, 80, 100);
		g.setMnemonic(KeyEvent.VK_6);
		g.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			tf5.setText(" 4. Monster Whopper : 7,900 won");
			}
		});
		
		JCheckBox checkBox1 = new JCheckBox("Truffle Mushroom");
		checkBox1.setBounds(360, 210, 150, 50);
		JCheckBox checkBox2 = new JCheckBox("Prawn");
		checkBox2.setBounds(360, 330, 150, 50);
		JCheckBox checkBox3 = new JCheckBox("Grilled Beef");
		checkBox3.setBounds(360, 445, 150, 50);
		JCheckBox checkBox4 = new JCheckBox("Monster");
		checkBox4.setBounds(360, 565, 150, 50);
		
		f.add(a);f.add(tf);
		f.add(b);f.add(tf1);
		f.add(c);f.add(tf2);
		f.add(d);f.add(tf3);
		f.add(e);f.add(tf4);
		f.add(g);f.add(tf5);
		f.add(checkBox1);
		f.add(checkBox2);
		f.add(checkBox3);
		f.add(checkBox4);
		f.setSize(550, 1000);
		f.setLayout(null);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		new BurgerKing();
	}
}
