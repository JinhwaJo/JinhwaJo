package package06_calendar;

import java.util.Calendar;

public class CalendarExample02 {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		
		// 1(일) ~ 7(토)
		System.out.println("요일 : " + today.get(Calendar.DAY_OF_WEEK));
		System.out.println("현재 달의 오늘(?요일)은 몇 번째 주 : "
		+ today.get(Calendar.DAY_OF_WEEK_IN_MONTH));	// 요일을 기준으로 주를 계산하는 구조
		
		// 0은 오전, 1은 오후를 의미
		System.out.println("오전 오후(0 또는 1) : " + today.get(Calendar.AM_PM));
		
		System.out.println("시 : " + today.get(Calendar.HOUR));			// 12시간제
		System.out.println("시 : " + today.get(Calendar.HOUR_OF_DAY));	// 24시간제
		System.out.println("분 : " + today.get(Calendar.MINUTE));
		System.out.println("초 : " + today.get(Calendar.SECOND));
		
		System.out.println("1000분의 1초로(0 ~ 999) : "
		+ today.get(Calendar.MILLISECOND));	// 현재 시간에서 초를 밀리초로 변환하여 출력 (잘 안쓴다.)
	}
}
