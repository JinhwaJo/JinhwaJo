package package06_calendar;

import java.util.Calendar;

public class CalendarExample08 {
	public static void main(String[] args) {
		int year = 2019;
		int month = 1;
		
		Calendar startDate= Calendar.getInstance();
		startDate.set(year, month - 1, 1);
		// -3(화요일을 음수로) + 1 은 이틀 전이 됨.
		int startWeek = -startDate.get(Calendar.DAY_OF_WEEK) + 1;
		startDate.add(Calendar.DAY_OF_MONTH, startWeek); // 이틀 전으로 되돌림.

		Calendar endDate = Calendar.getInstance();
		endDate.set(year, startDate.get(Calendar.MONTH), startDate.getActualMaximum(Calendar.DAY_OF_MONTH));
		
		int cnt = 0;
		System.out.println("      " + year + "년  " + month + "월");
		System.out.println(" SU MO TU WE TH FR SA");	
		for(int i = startDate.get(Calendar.DAY_OF_MONTH); i <= endDate.get(Calendar.DAY_OF_MONTH); i++) {
			cnt++;
			System.out.print(" " + i);
			startDate.add(Calendar.DAY_OF_MONTH, 1);
		}
		endDate.set(year, month - 1, startDate.getActualMaximum(Calendar.DAY_OF_MONTH));
		
		// 이틀 후
		for(int i = startDate.get(Calendar.DAY_OF_MONTH); i <= endDate.get(Calendar.DAY_OF_MONTH); i++) {
			cnt++;
			String c = i < 10 ? "  " + i : " " + i;
			System.out.print(c);
			if(cnt % 7 == 0)
				System.out.println();
			startDate.add(Calendar.DAY_OF_MONTH, 1);
		}
		
		// 나머지 일(날)
		// 일주일(7일) - 마지막날의 요일(5) 는 이틀 후가 됨.
		int endWeek = 7 - endDate.get(Calendar.DAY_OF_WEEK);
		endDate.add(Calendar.DAY_OF_MONTH, endWeek);
		for(int i = startDate.get(Calendar.DAY_OF_MONTH); i <= endDate.get(Calendar.DAY_OF_MONTH); i++) {
			System.out.print("  " + i);
		}
	}
}
