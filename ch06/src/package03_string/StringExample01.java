package package03_string;

public class StringExample01 {
	public static void main(String[] args) {
		/* String Ŭ���� : ���ڿ��� �ٷ� �� ���Ǵ� API Ŭ����
		 * String Ŭ������ �޼ҵ�� ��κ� ���ο� ��ü�� �����Ͽ�,
		 * ���ڿ��� ��ü�� �����ϰ� �ȴ�.	 */
		String s1 = new String("Hello");	// ���ڿ� ��ü ����
		System.out.println("s1 = " + s1);
		
		char[] chArray = {'H', 'e', 'l', 'l', 'o'};
		String s2 = new String(chArray);	// char �迭�� ���ڿ� ��ü�� ����
		System.out.println("s2 = " + s2);
		
		StringBuffer sb = new StringBuffer("Hello");
		String s3 = new String(sb);			// StringBuffer ��ü�� String ��ü�� ����
		System.out.println("s3 = " + s3);
	}
}
