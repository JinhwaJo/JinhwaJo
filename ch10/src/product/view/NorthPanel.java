package product.view;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import product.model.Product;
import product.service.SaveService;
// 부분 화면이므로 JPanel을 상속받는다.
// Panel의 기본 특성은 Frame과 동일하다고 생각하면 됨.
public class NorthPanel extends JPanel {
	/* Component에 Event가 존재하면 버튼 같은 내부 구성은
	 * 안에 생성하는 것이 아니라 바깥에 만드는 게 공식이다.
	 * 바깥에 만들어놔야 공유해서 다른 클래스에서 받아쓸 수 있지 않겠니.		 */
	JButton regButton = null;
	
	NorthPanel() {
		// 레이아웃은 젤 위쪽에 나두는 것이 정석인듯!
		setLayout(new GridBagLayout());			// 레이아웃
		
		JLabel noLabel = new JLabel("상품 코드");
		JLabel nameLabel = new JLabel("상품명");
		JLabel priceLabel = new JLabel("가격");
		JLabel cntLabel = new JLabel("수량");
		
		JTextField noTextField = new JTextField();
		JTextField nameTextField = new JTextField();
		JTextField priceTextField = new JTextField();
		JTextField cntTextField = new JTextField();

		// 그리드 제약 조건 (크기, 위치 등등)
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.HORIZONTAL; // 수평 방향
		
		gbc.weightx = 0.1;	// x축 비율
		gbc.gridx = 0;
		gbc.gridy = 0;
		add(noLabel, gbc); // 0,0좌표에 추가가 되라!
		
		gbc.weightx = 0.4;	// x축 비율
		gbc.gridx = 1;
		gbc.gridy = 0;
		add(noTextField, gbc); // 1,0좌표에 추가가 되라!
		
		gbc.weightx = 0.1;	// x축 비율
		gbc.gridx = 0;
		gbc.gridy = 1;
		add(nameLabel, gbc); // 0,1 좌표
		
		gbc.weightx = 0.4;	// x축 비율
		gbc.gridx = 1;
		gbc.gridy = 1;
		add(nameTextField, gbc); // 1,1 좌표
		
		gbc.weightx = 0.1;
		gbc.gridx = 0;
		gbc.gridy = 2;
		add(priceLabel, gbc);
		
		gbc.weightx = 0.4;
		gbc.gridx = 1;
		gbc.gridy = 2;
		add(priceTextField, gbc);
		
		gbc.weightx = 0.1;
		gbc.gridx = 0;
		gbc.gridy = 3;
		add(cntLabel, gbc);
		
		gbc.weightx = 0.4;
		gbc.gridx = 1;
		gbc.gridy = 3;
		add(cntTextField, gbc);
				
		regButton = new JButton("등록");
		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.gridwidth = 2;	// 가로 병합
		add(regButton, gbc);		
		regButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 상품 객체를 생성
				Product product = new Product();
				// 입력한 상품 번호를 상품 객체에 저장
				product.setPno(Integer.parseInt(noTextField.getText()));
				// 입력한 상품명을 상품 객체에 저장
				product.setPname(nameTextField.getText());
				// 입력한 가격을 상품 객체에 저장
				product.setPrice(Integer.parseInt(priceTextField.getText()));
				// 입력한 수량을 상품 객체에 저장
				product.setPcnt(Integer.parseInt(cntTextField.getText()));
				// view에서 service로 전달할 때는 view에서 service.메소드명(model이 매개변수)의 형태로 간다.
				SaveService saveService = SaveService.getInstance();
				saveService.save(product);
				
				// 상품 등록 후 입력한 값을 공백으로 만들어 재 입력하기 용이하게 하는 코드
				noTextField.setText("");
				nameTextField.setText("");
				priceTextField.setText("");
				cntTextField.setText("");
				
			}
		});
		
		setBounds(10, 10, 460, 120);
		setBackground(Color.GRAY);	// 부분화면(Panel)의 배경색 변경
		setVisible(true);			// 부분 화면을 보여줌
	}

}
