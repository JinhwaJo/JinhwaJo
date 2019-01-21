package package06_calendar;

import java.util.Calendar;

public class CalendarExample04 {
	public static void main(String[] args) {
		// ���� ���
		final String[] DAY_OF_THE_WEEK =
			{"", "��", "��", "ȭ", "��", "��", "��", "��"};	// ��¥�� 0���� �����ϴ� ù��° ĭ�� ����д�.
		
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
		date1.set(1988, 11, 20); // ��¥ ��ü�� ��, ��, ���� �����Ѵ�.	
		System.out.println("date1�� " + toString(date1)
		+ DAY_OF_THE_WEEK[date1.get(Calendar.DAY_OF_WEEK)] + "���� �Դϴ�.");
		System.out.println("date2�� " + toString(date2)
		+ DAY_OF_THE_WEEK[date2.get(Calendar.DAY_OF_WEEK)] + "���� �Դϴ�.");
		
		// �� �ð��� ���̸� ���� ��(�и���(1/1000��)�� ȯ��Ǳ� ������ 1000���� �������ش�.
		long diff = Math.abs((date1.getTimeInMillis() - date2.getTimeInMillis())) / 1000;	// ���� ����
		//long diff = (date2.getTimeInMillis() - date1.getTimeInMillis()) / 1000;
		System.out.println("�� ������ ���ݱ��� " + diff + "�ʰ� �������ϴ�.");
		long diffDay = diff / (24 * 60 * 60);	// �Ϸ�(24�ð�X60��X60��)�� �ʷ� ȯ���ϰ� �����ش�.
		System.out.println("�� ������ ���ݱ��� " + diffDay + "���� �������ϴ�.");
	}
	
	// ��¥ ��ü�� ����� ��, ��, �� ���� �̿��� ���ڿ��� ��ȯ�ϴ� �޼ҵ�
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR) + "�� " + (date.get(Calendar.MONTH) + 1)
		+ "�� " + date.get(Calendar.DAY_OF_MONTH) + "�� ";
	}
}
