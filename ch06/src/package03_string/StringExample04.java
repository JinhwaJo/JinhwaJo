package package03_string;

public class StringExample04 {
	public static void main(String[] args) {
		String ssn = "900903-2101111";
		int length = ssn.length();	// ������ ������ ��ȯ�Ѵ�.
		
		if(length == 14) {
			System.out.println("�ֹι�ȣ �ڸ����� ��ġ�մϴ�.");
		} else {
			System.out.println("�ֹι�ȣ�� �߸��Ǿ����ϴ�.");
		}
	}
}
