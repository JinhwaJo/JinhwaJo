package package06_calendar;

import java.util.Calendar;

public class CalendarExample03 {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		
		// �ִ�
		System.out.println("���� ���� ������ �� : "
				+ today.getActualMaximum(Calendar.DAY_OF_MONTH));
		// �ּ�
		System.out.println("���� ���� ù �� : "
				+ today.getActualMinimum(Calendar.DAY_OF_MONTH));
		
		System.out.println("���� ���� ������ �� : "
				+ today.getActualMaximum(Calendar.WEEK_OF_MONTH));
		/* Calendar Ŭ���� ��ü�� ���װ� ���� �����Ѵٰ� �Ѵ�.
		 * �Ͽ�, �Ʒ� ��½��� ���׷� ���� ��� ���� ������������ ����ȴ�.
		 * System.out.println("���� ���� ù �� : "
				+ today.getActualMinimum(Calendar.WEEK_OF_MONTH));
		 * ��� �Ʒ��� ���� �������. */
		System.out.println("���� ���� ù ��(1) : "
				+ today.getMinimalDaysInFirstWeek());
		System.out.println("���� ���� ù ��(2) : "
				+ today.getFirstDayOfWeek());
	}
}
