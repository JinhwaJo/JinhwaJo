package package03_string;

public class StringExample07 {
	public static void main(String[] args) {
		String str1 = "java programming";
		String str2 = "JAVA programming";
		
		System.out.println(str1.toUpperCase());	// �빮��
		System.out.println(str2.toLowerCase());	// �ҹ���
		
		// ��ҹ��ڱ��� �����Ͽ� ��
		System.out.println(str1.equals(str2));
		// ��ҹ��ڿ� ������� ��
		System.out.println(str1.equalsIgnoreCase(str2));
		
		System.out.println(str1.substring(0, 1).toUpperCase()
				+ str1.substring(1).toLowerCase());	// substring�� Ȱ���Ͽ� �� ���� ���ڸ� �빮�ڷ� ���
	}
}
