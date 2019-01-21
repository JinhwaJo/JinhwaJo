package package06_calendar;

import java.util.Calendar;

public class CalendarExample08_my {
	public static void main(String[] args) {
		int year = 2019;
		int month = 1;
		
		// 시작날 달력
		Calendar startDay = Calendar.getInstance();
		startDay.set(year, month -1, 1); // 2019년 1월 1일부터
		
		// 마지막날 달력
		Calendar endDay = Calendar.getInstance();
		endDay.set(year, month -1, 1);
		endDay.add(Calendar.DAY_OF_MONTH, -1); // 2월에서 -1을 하니 1월 31일이 된다.
		
		// 전월 일자 구하기
		Calendar lastMonthDay = Calendar.getInstance();
		lastMonthDay.set(year, month -1, 1);
		lastMonthDay.roll(Calendar.DAY_OF_MONTH, -2);
		
		// 내월 일자 구하기
		Calendar nextMonthDay = Calendar.getInstance();
		nextMonthDay.set(year, month -1, 31);
		nextMonthDay.roll(Calendar.DAY_OF_MONTH, 2);
		
		int start = startDay.get(Calendar.DAY_OF_WEEK);	// 1월의 시작 요일 구하기
		int last = startDay.getActualMaximum(Calendar.DAY_OF_MONTH); // 1월의 마지막 날 구하기

		System.out.println("     " + year + "년 " + month + "월 달력");
		System.out.println("  (전월, 내월 일자 반영)");
		System.out.println(" SU MO TU WE TH FR SA");
		for(int i = 1; i < start; i++) {
			System.out.print(toString(lastMonthDay)); // 공백 3개
		}
		for(int i = 1; i <= endDay.get(Calendar.DAY_OF_MONTH); i++) {
			if(i < 10) {
				System.out.print("  " + i);	// 1자리 숫자이면 공백 2개
			} else {
				System.out.print(" " + i);	// 2자리 숫자이면 공백 1개
			}
			if(start++ % 7 == 0) {			// 7의 배수이면 다음 줄로 이동
				System.out.println();			
			}
		}
	}
	public static String toString(Calendar cal) {
		return cal.get(Calendar.DAY_OF_MONTH) + "일";
	}
}
