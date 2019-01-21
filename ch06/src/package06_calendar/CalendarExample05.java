package package06_calendar;

import java.util.Calendar;

public class CalendarExample05 {
	public static void main(String[] args) {
		final int[] TIME_UNIT = {60*60, 60, 1};	// ��,��,�ʸ� �ʷ� ȯ��
		final String[] TIME_UNIT_NAME = {"�ð�", "��", "��"};
		
		Calendar time1 = Calendar.getInstance();
		Calendar time2 = Calendar.getInstance();
		
		// time1�� 10�� 20�� 30��
		time1.set(Calendar.HOUR_OF_DAY, 10);
		time1.set(Calendar.MINUTE, 20);
		time1.set(Calendar.SECOND, 30);
		
		// time2�� 20�� 30�� 10��
		time2.set(Calendar.HOUR_OF_DAY, 20);
		time2.set(Calendar.MINUTE, 30);
		time2.set(Calendar.SECOND, 10);
		
		long diff
		= Math.abs((time1.getTimeInMillis() - time2.getTimeInMillis())) / 1000;
		
		String tmp = "";
		for(int i = 0; i < TIME_UNIT.length; i++) {
			tmp += diff / TIME_UNIT[i] + TIME_UNIT_NAME[i] + " ";
			diff %= TIME_UNIT[i];
		}
		System.out.println("�� �ð��� ���̴�" + tmp + "�Դϴ�.");
	}
}
