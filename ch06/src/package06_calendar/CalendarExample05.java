package package06_calendar;

import java.util.Calendar;

public class CalendarExample05 {
	public static void main(String[] args) {
		final int[] TIME_UNIT = {60*60, 60, 1};	// 시,분,초를 초로 환산
		final String[] TIME_UNIT_NAME = {"시간", "분", "초"};
		
		Calendar time1 = Calendar.getInstance();
		Calendar time2 = Calendar.getInstance();
		
		// time1은 10시 20분 30초
		time1.set(Calendar.HOUR_OF_DAY, 10);
		time1.set(Calendar.MINUTE, 20);
		time1.set(Calendar.SECOND, 30);
		
		// time2는 20시 30분 10초
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
		System.out.println("두 시간의 차이는" + tmp + "입니다.");
	}
}
