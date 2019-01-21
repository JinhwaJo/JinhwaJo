package package07_simpledateformat;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SimpleDateFormatExample03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/* DateFormat �޼ҵ�� SimpleDateFormat Ŭ������ ��������
		 * parse �޼ҵ带 ����ϸ�,
		 * ���ڿ��� ��¥(Date) ��ü�� �ڵ����� ��ȯ���ֱ� ������ ���ϰ� ����� �� �ִ�.
		 * (String�� substring �޼ҵ带 ����� �ʿ䰡 ���� �ȴ�.)		 */
		String pattern = "yyyy/MM/dd";
		DateFormat df = new SimpleDateFormat(pattern); // ���� = �ڼ�
		System.out.println("��¥��" + pattern + "���·� �Է�(���� : 1988/7/27)");
		System.out.print("��¥ �Է� : ");
		Date date = null;
		while(true) {
			try {
				// parse�޼ҵ�� DateFormat �޼ҵ忡���� ���� �ְ�, SimpleDateFormat �޼ҵ忡���� �� �� ����.
				date = df.parse(sc.nextLine()); // �Է��� ���ڿ�(String)�� ��¥(Date) ��ü�� ��ȯ
				break;
			} catch(Exception e) {
				System.out.println("��¥��" + pattern + "���·� �Է��ؾ� �մϴ�.");
			}
		}
		System.out.println(df.format(date));
	}
}
