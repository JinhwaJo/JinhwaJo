package package15;
/* ���� �����
 * �׼��� �͸� ���� ��ü���� Anonymous ���� Inner�� �ǹ� : 
 * ��ø Ŭ������ �Ͽ�, Ŭ�����ȿ� �������̽��� �����Ͽ� �� Ŭ���� �ȿ����� �� �� �ֵ��� ��.
 * GUI�ʿ����� �ַ� ����ϸ�, �׿� ���߿����� ��ø Ŭ������ ���� ������� �����Ƿ� ���� �� ��.	 */

// 1-3. �Ʒ��� onClickListener�� �����ϱ� ���� �Ʒ� �� ���� Ŭ������ ����
class CheckListener implements Button.OnClickListener {

	@Override
	public void onClick() {
		System.out.println("üũ�� �մϴ�.");
		
	}
	
}
class MessageListener implements Button.OnClickListener {

	@Override
	public void onClick() {
		System.out.println("�޽����� �����ݴϴ�.");
		
	}
	
}

public class Button {	// �ٱ� Ŭ����
	OnClickListener listener;
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {	// 1-1. touch(Ŭ��)�ϸ� onClickListener�� �����ϰ� �����س�������.
		listener.onClick();
	}
	
	// ��ø(����) �������̽�
	interface OnClickListener {	// 1-2. OnClickListenr �ȿ� ���������� ����. �׷���
		void onClick();
	}
	
	public static void main(String[] args) {	// ���� �ȿ� ���� ������ �Է����ش�.
		Button button = new Button();
		button.setOnClickListener(new CheckListener());
		button.touch();	// ���콺 Ŭ���� ����
		button.setOnClickListener(new MessageListener());
		button.touch();	// ���콺 Ŭ���� ����
		button.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("�׸��� �����ش�.");
				
			}
		});
		button.touch();	// ���콺 Ŭ���� ����
	}
}
