package product.view;

import javax.swing.JFrame;
// ��ü ȭ���̴ϱ� JFrame�� ��ӹ޴´�.
public class ProductMainView extends JFrame {

	ProductMainView() {
		// �κ� ȭ��1(����)
		NorthPanel northpanel = new NorthPanel();
		add(northpanel);
		
		// �κ� ȭ��2(����)
		SouthPanel southpanel = new SouthPanel();
		add(southpanel);
		
		// Frame, Panel �� ȭ�鿡 �ʿ��� �Ʒ� 3���� �޼ҵ带 �������.
		setSize(500, 600);
		setLayout(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ProductMainView();
	}
	
}
