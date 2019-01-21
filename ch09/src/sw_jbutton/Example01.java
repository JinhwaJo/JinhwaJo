package sw_jbutton;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Example01 {
	Example01(){
		JFrame f = new JFrame("버튼 예제");
		/* 파일의 경로는 전체 경로가 아닌 내 위치에서 봤을 때인 상대 경로로 작성한다.
		 * 작성 후 Java Project 하위에 images 폴더를 만든다.
		 * 경로에 사용된 이름으로 이미지 파일을 하나 생성하여 images 폴더에 넣는다. 	*/
		
		/* Windows에서 정보를 얻을 때는 Toolkit을 쓴다.
		 * 아래 두 줄은 다른 컴퓨터에 옮길 경우 주소가 달라 image 파일이 깨지거나
		 * 오류가 발생할 수 있는 점을 감안하여 작성한 부분이다.		 */
		Image image = Toolkit.getDefaultToolkit().createImage("images\\icon.png");
		JButton b = new JButton(new ImageIcon(image));
		b.setBounds(130, 100, 70, 70);
		// 아래와 같이 설정하고 Alt + 1을 하면 클릭 버튼이 실행된다.
		b.setMnemonic(KeyEvent.VK_1);
		
		f.add(b);
		f.setSize(400, 500);
		f.setLayout(null); // Layout이 null이란 말은 직접 좌표(x,y)를 지정해줘야 함을 의미
		f.setVisible(true);
		/* Jbutton과 달리 button에서는 닫기 버튼을 눌러도 창이 종료되지 않는 경우가 있다.
		 * 그럴떄 아래의 코드를 사용하자.
		 *  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	 */

	}
	
	public static void main(String[] args) {
		new Example01();
	}
}
