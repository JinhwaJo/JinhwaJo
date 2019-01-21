package package06_calendar;

import java.util.Calendar;

public class CalendarExample03 {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		
		// 최대
		System.out.println("현재 달의 마지막 날 : "
				+ today.getActualMaximum(Calendar.DAY_OF_MONTH));
		// 최소
		System.out.println("현재 달의 첫 날 : "
				+ today.getActualMinimum(Calendar.DAY_OF_MONTH));
		
		System.out.println("현재 달의 마지막 주 : "
				+ today.getActualMaximum(Calendar.WEEK_OF_MONTH));
		/* Calendar 클래스 자체에 버그가 제법 존재한다고 한다.
		 * 하여, 아래 출력식은 버그로 인해 결과 값이 비정상적으로 도출된다.
		 * System.out.println("현재 달의 첫 주 : "
				+ today.getActualMinimum(Calendar.WEEK_OF_MONTH));
		 * 대신 아래의 식을 사용하자. */
		System.out.println("현재 달의 첫 주(1) : "
				+ today.getMinimalDaysInFirstWeek());
		System.out.println("현재 달의 첫 주(2) : "
				+ today.getFirstDayOfWeek());
	}
}
