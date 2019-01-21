package product.view;

import javax.swing.JFrame;
// 전체 화면이니까 JFrame을 상속받는다.
public class ProductMainView extends JFrame {

	ProductMainView() {
		// 부분 화면1(북쪽)
		NorthPanel northpanel = new NorthPanel();
		add(northpanel);
		
		// 부분 화면2(남쪽)
		SouthPanel southpanel = new SouthPanel();
		add(southpanel);
		
		// Frame, Panel 등 화면에 필요한 아래 3가지 메소드를 기억하자.
		setSize(500, 600);
		setLayout(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ProductMainView();
	}
	
}
