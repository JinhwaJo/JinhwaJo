package package01;

import java.util.regex.Pattern;

// ���赵(Ŭ����)
public class Book {	// å
	// : �������� ���Ἲ(�ŷڵ��� ���̱� ����)�� ���� ��������, ĸ��ȭ�� �Ѵ�.
	// �Ӽ�(�ʵ� : ��� ����)
	/* �ʵ� �ȿ� private : �������� ���Ἲ(�ŷڵ��� ���̱� ����)
	 * 				  : ���� ����(Information Hiding)
	 * private �� ���� ����� �ܺ�(Ŭ����)���� �ڽ��� �ʵ带
	 * ���� ������ �� ����.	 */
	private String name;	// �̸�
	private String author;	// ����
	private double rate;	// ���
	private int rank;		// ����
	private static String p;	// ����(��� ��ü�� �����ϴ� �ʵ�)
	/* �޼ҵ庰�� pattern�� �����ϸ� ���������� ������ �ȴ�.
	 * ���, �ʵ忡 �����Ͽ� ������Ű��, �������ϸ� ������ �� �ִ�.
	 * static�� ������ "����"�� �ǹ��̴�.*/
	
	// ����(�޼ҵ� : ��� �Լ�)
	/* �ʵ�� �޼ҵ带 Ŭ���� �ȿ� ���� ���¸� ĸ��ȭ(Encapsulation)
	 * ��� ���Ѵ�.
	 */
	public void setRank(int r) {
		if(r < 0) {
			System.out.println("������ �߸��Ǿ����ϴ�.");
			return;
		}
		rank = r;
		/* ����ڰ� �ܺο��� �Է��� �����ʹ� r�� ����ǰ� rank�� �� �ʵ��̹Ƿ�,
		 * �� ������ ���еǾ� �������� ���Ἲ�� �����Ѵ�. */
	}

	public void setName(String nm) {
		/* ^�� ���ڿ��� ������ �ǹ�, a-z(�ҹ��ڸ�), A-Z(�빮�ڸ�) ���,
		 * *�� �������� ������ �Է� �������� �ǹ�(������ �ϳ��� �� �� ����),
		 * $�� ���ڿ��� ��  */
		p = "^[a-zA-Z\\s]*$";
		// �����ڰ� �ƴϸ� if�� ����
		if(!Pattern.matches(p,nm)) {	// Pattern�� ���丶��¡ ����� ��.
			System.out.println("å �̸��� �߸��Ǿ����ϴ�.");
			return;
		}
		name = nm;
		
	}
	/* Alt + s - generate getters and setters �ǿ��� 
	 * ���ϴ� �͸� �����Ͽ� �Լ� �������� */
	public void setAuthor(String author) {
		// ������(����) �� �ѱ�(����x)�� ���� ����
		p = "^[��-�R]*$";
		if(!Pattern.matches(p, author)) {
			System.out.println("���� ������ �߸��Ǿ����ϴ�.");
			return;
		}
		this.author = author;	// this�� �ٿ��� �ʵ�� �Ű������� ����
	}

	public void setRate(double rate) {
		// 1.0 ~ 5.0������ ���� ����
		if(!(rate >= 1.0 && rate <= 5.0)) {
			System.out.println("������ �߸� �Է��Ͽ����ϴ�.");
			return;
		}
		this.rate = rate;
	}


}
