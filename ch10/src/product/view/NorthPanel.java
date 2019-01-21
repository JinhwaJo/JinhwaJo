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
// �κ� ȭ���̹Ƿ� JPanel�� ��ӹ޴´�.
// Panel�� �⺻ Ư���� Frame�� �����ϴٰ� �����ϸ� ��.
public class NorthPanel extends JPanel {
	/* Component�� Event�� �����ϸ� ��ư ���� ���� ������
	 * �ȿ� �����ϴ� ���� �ƴ϶� �ٱ��� ����� �� �����̴�.
	 * �ٱ��� �������� �����ؼ� �ٸ� Ŭ�������� �޾ƾ� �� ���� �ʰڴ�.		 */
	JButton regButton = null;
	
	NorthPanel() {
		// ���̾ƿ��� �� ���ʿ� ���δ� ���� �����ε�!
		setLayout(new GridBagLayout());			// ���̾ƿ�
		
		JLabel noLabel = new JLabel("��ǰ �ڵ�");
		JLabel nameLabel = new JLabel("��ǰ��");
		JLabel priceLabel = new JLabel("����");
		JLabel cntLabel = new JLabel("����");
		
		JTextField noTextField = new JTextField();
		JTextField nameTextField = new JTextField();
		JTextField priceTextField = new JTextField();
		JTextField cntTextField = new JTextField();

		// �׸��� ���� ���� (ũ��, ��ġ ���)
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.HORIZONTAL; // ���� ����
		
		gbc.weightx = 0.1;	// x�� ����
		gbc.gridx = 0;
		gbc.gridy = 0;
		add(noLabel, gbc); // 0,0��ǥ�� �߰��� �Ƕ�!
		
		gbc.weightx = 0.4;	// x�� ����
		gbc.gridx = 1;
		gbc.gridy = 0;
		add(noTextField, gbc); // 1,0��ǥ�� �߰��� �Ƕ�!
		
		gbc.weightx = 0.1;	// x�� ����
		gbc.gridx = 0;
		gbc.gridy = 1;
		add(nameLabel, gbc); // 0,1 ��ǥ
		
		gbc.weightx = 0.4;	// x�� ����
		gbc.gridx = 1;
		gbc.gridy = 1;
		add(nameTextField, gbc); // 1,1 ��ǥ
		
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
				
		regButton = new JButton("���");
		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.gridwidth = 2;	// ���� ����
		add(regButton, gbc);		
		regButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// ��ǰ ��ü�� ����
				Product product = new Product();
				// �Է��� ��ǰ ��ȣ�� ��ǰ ��ü�� ����
				product.setPno(Integer.parseInt(noTextField.getText()));
				// �Է��� ��ǰ���� ��ǰ ��ü�� ����
				product.setPname(nameTextField.getText());
				// �Է��� ������ ��ǰ ��ü�� ����
				product.setPrice(Integer.parseInt(priceTextField.getText()));
				// �Է��� ������ ��ǰ ��ü�� ����
				product.setPcnt(Integer.parseInt(cntTextField.getText()));
				// view���� service�� ������ ���� view���� service.�޼ҵ��(model�� �Ű�����)�� ���·� ����.
				SaveService saveService = SaveService.getInstance();
				saveService.save(product);
				
				// ��ǰ ��� �� �Է��� ���� �������� ����� �� �Է��ϱ� �����ϰ� �ϴ� �ڵ�
				noTextField.setText("");
				nameTextField.setText("");
				priceTextField.setText("");
				cntTextField.setText("");
				
			}
		});
		
		setBounds(10, 10, 460, 120);
		setBackground(Color.GRAY);	// �κ�ȭ��(Panel)�� ���� ����
		setVisible(true);			// �κ� ȭ���� ������
	}

}
