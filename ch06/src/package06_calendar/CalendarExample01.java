package package06_calendar;

import java.util.Calendar;

public class CalendarExample01 {
	public static void main(String[] args) {
		/* Date Ŭ������ ��¥�� �ð��� �ٷ�� API Ŭ������ JDK 1.0�� �����Ͽ�, ����� �ſ� ����.
		 * �̸� �����ϱ� ���� Calendar Ŭ������ JDK 1.1 ���� �����Ѵ�.		 */
		// Ķ���� ��ü ����
		Calendar today = Calendar.getInstance();	// new Calendar(); ��� ����
		
		System.out.println("���� ���� �⵵ : " + today.get(Calendar.YEAR));
		// �迭�� �����Ͽ� �� ���� ����Ѵٵ��� �ϴ� ��쿡, �迭�� ù ������ 0�̹Ƿ�, Calendar Ŭ������ MONTH �޼ҵ��� ù ������ 0�� �ƴұ�...
		// 0 ~ 11 (1������ �ҷ��� �Ʒ�ó�� + 1�� �ٿ��ش�.)
		System.out.println("���� ���� ��(��)(1) : " + today.get(Calendar.MONTH));
		// 1 ~ 12 (���ڿ��� ���Ͽ� ���ڿ� ���� "01"�� �����Ƿ�, ��ȣó�� �ؼ� ���ڷ� �ν��ϵ��� ���ش�.)
		System.out.println("���� ���� ��(��)(2) : " + (today.get(Calendar.MONTH) + 1)); 
		System.out.println("���� ���� ��(��) : " + today.get(Calendar.DAY_OF_MONTH));
		System.out.println("���� ���� �� ��° �� : " + today.get(Calendar.WEEK_OF_YEAR));	// 52�ֱ���
		System.out.println("���� ���� �� ��° �� : " + today.get(Calendar.WEEK_OF_MONTH));	// 4 ~ 5�ֱ���
	}
}
