package package06_calendar;

import java.util.Calendar;

public class CalendarExample02 {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		
		// 1(��) ~ 7(��)
		System.out.println("���� : " + today.get(Calendar.DAY_OF_WEEK));
		System.out.println("���� ���� ����(?����)�� �� ��° �� : "
		+ today.get(Calendar.DAY_OF_WEEK_IN_MONTH));	// ������ �������� �ָ� ����ϴ� ����
		
		// 0�� ����, 1�� ���ĸ� �ǹ�
		System.out.println("���� ����(0 �Ǵ� 1) : " + today.get(Calendar.AM_PM));
		
		System.out.println("�� : " + today.get(Calendar.HOUR));			// 12�ð���
		System.out.println("�� : " + today.get(Calendar.HOUR_OF_DAY));	// 24�ð���
		System.out.println("�� : " + today.get(Calendar.MINUTE));
		System.out.println("�� : " + today.get(Calendar.SECOND));
		
		System.out.println("1000���� 1�ʷ�(0 ~ 999) : "
		+ today.get(Calendar.MILLISECOND));	// ���� �ð����� �ʸ� �и��ʷ� ��ȯ�Ͽ� ��� (�� �Ⱦ���.)
	}
}
