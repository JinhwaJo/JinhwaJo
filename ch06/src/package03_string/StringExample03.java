package package03_string;

public class StringExample03 {
	public static void main(String[] args) {
		String address = "�λ�� ������ ����1�� XX����Ʈ";
		
		// address�� �����ϴ� ���ڿ����� "������"�� '��' ��ġ(�ε���)�� ��ȯ�Ѵ�.
		int location = address.indexOf("������");	// ��ȯ �� 4
		System.out.println(location);
		
		// address�� �����ϴ� ���ڿ��� "�λ�"�� ������ -1�� ��ȯ�Ѵ�. (������ -1�� ��ȯ�Ѵٴ� ������ ���� ����Ѵ�.)
		// if(address.indexOf("�λ�") >= 0) �� ������ �ǹ̸� ������.
		if(address.indexOf("�λ�") != -1) {
			System.out.println("�λ걤���ÿ� �����ϰ� �ֽ��ϴ�.");
		} else {
			System.out.println("�λ걤���ÿ� �������� �ʽ��ϴ�.");
		}
	}
}
