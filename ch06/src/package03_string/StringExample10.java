package package03_string;

import java.util.StringTokenizer;

public class StringExample10 {
	public static void main(String[] args) {
		String text = "ȫ�浿/���浿/���浿";
		
		// ���ڿ��� �и��� ���� ����� �� �ִ� ���ڿ� API Ŭ����
		StringTokenizer st = new StringTokenizer(text, "/");
		int countToken = st.countTokens();
		System.out.println("�и��� ��ū�� ���� : " + countToken);
		
		// iteratoró�� has �޼ҵ�� next �޼ҵ尡 ����.
		while(st.hasMoreTokens()) {
			String str = st.nextToken();
			System.out.println(str);
		}
	}
}
