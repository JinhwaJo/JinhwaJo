package package06;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

// 확인하고자 하는 내용에 해당하는 클래스에 커서를 올리고 Shift + F2를 누르면 정보 확인이 가능하다.

// 0. 프레임(화면)을 상속받는다.
public class Test extends JFrame {
	// 7-1. 화면 내부를 구성할 버튼을 만들어보자.
	JButton button = new JButton("클릭");
	// 8-1. 텍스트 설정
	JTextField text = new JTextField();
	// 1. 화면을 생성하기 위해 우선 생성자를 만든다.
	static int sw = 1; //7-4. if문을 쓰기 위한 변수 생성
	
	public Test() {
		/* 2. 생성이 된 후에도 모니터에 출력되지 않으면 사용자는 알 수 없다.
		 * 그래서 아래와 같이 모니터에 화면을 출력하기 위한 명령어가 필요하다.	*/
		setVisible(true);	// 화면 출력이 제일 먼저 되어야 하므로 setVisible(); 명령어는 젤 위쪽에 위치해야한다.
		// 7-2. 만들어진 버튼을 추가하고 버튼의 사이즈를 설정해준다.
		button.setBounds(10, 30, 100, 30);
		/* 액션의 익명 구현 객체(ActionListener)
		 * 액션의 익명 구현 객체에서 Anonymous 뒤의 Inner의 의미 : 
		 * 중첩 클래스라 하여, 클래스안에 인터페이스를 선언하여 그 클래스 안에서만 쓸 수 있도록 함.
		 * UI쪽에서만 주로 사용하며, 그외 개발에서는 중첩 클래스를 거의 사용하지 않으므로 참고만 할 것.	 */
		button.addActionListener(new ActionListener() {	// 7-3. 버튼을 클릭하는 기능을 추가해준다.			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(sw == 1) {	// 7-4. if - else if문을 써서 클릭 횟수에 따른 변화를 줄 수 있다.  
					text.setText("Hello, world.");
					sw = 2;
				} else if(sw == 2) {
					text.setText("");
					sw = 1;
				}
				
			}
		}); 	
		add(button);
		// 8-2. 만들어진 텍스트를 추가하고 텍스트 사이즈를 설정해준다.
		text.setBounds(120, 30, 130, 30);
		add(text);
		

		// 부가적인 설정 부분은 아래에 이렇게 정리해주면 좋다.
		// 4. 화면의 크기를 설정한다.
		setSize(300, 700); // 가로, 세로
		// 5-1. 여기까지 해도, 메인에 객체를 실행하지 않아서 실행이 안된다. 아래에 객체를 생성해주자.
		// 6. 화면 옆에 제목을 넣고 싶어서 아래와 같이 설정해본다.
		setTitle("계산기");
		// 3. Layout(버튼, 라벨 등으로 구성) 없이 간다.
		setLayout(null);

	}
	
	public static void main(String[] args) {
		new Test();	// 5-2. 객체를 생성한다.
	}
}
