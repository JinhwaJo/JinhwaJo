package exception_package;

import java.util.Arrays;

public class Example02 {
	public static void main(String[] args) {
		String[] name = new String[2];
		// try�� �ȿ� ����� ������ �� �ȿ����� ����� �� �ִ�.
		// finally�� (try �� ���� ������ ��ü�� ������) �ڿ��� �ݳ��ϴ� ������ catch�� ���ο� ������� ������ ����ȴ�.
		try {
			name[0] = "��";
			name[1] = "��";
			name[2] = "��";
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�ε��� ��ȣ�� �ʰ��Ͽ����ϴ�.");
		} finally {	
			System.out.println(Arrays.toString(name));
		}
		
	}
}
