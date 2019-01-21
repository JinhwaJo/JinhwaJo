package package06_calendar;

import java.util.Calendar;

public class CalendarExample09 {
	public static void main(String[] args) {
		int year = 2019;
		int month = 1;
		Calendar startDate = Calendar.getInstance();
		Calendar endDate = Calendar.getInstance();
		
		startDate.set(year, month -1, 1);
		endDate.set(year, month -1, startDate.getActualMaximum(Calendar.DAY_OF_MONTH));
		
		startDate.add(Calendar.DAY_OF_MONTH, - startDate.get(Calendar.DAY_OF_WEEK) + 1);
		endDate.add(Calendar.DAY_OF_MONTH, 7 - endDate.get(Calendar.DAY_OF_WEEK));
		
		System.out.println("      " + year + "년" + month + "월");
		System.out.println(" SU MO TU WE TH FR SA");
		// 시작 날짜가 마지막 날짜 이전이거나 시작 날짜가 마지막 날짜와 같은 경우에만 시작 날짜가 1씩 증가됨.
		// 시작날짜와 마지막날짜가 겹치는 구간이 생기므로 startDate.equals(endDate) 를 설정해준다.
		for(int n = 1; startDate.before(endDate) || startDate.equals(endDate);
				startDate.add(Calendar.DAY_OF_MONTH, 1)) {
			int day = startDate.get(Calendar.DAY_OF_MONTH); // 1일씩 증가된 날짜를 day에 저장
			System.out.print(day < 10 ? "  " + day : " " + day);
			if(n++ % 7 == 0) { // 7의 배수이면 다음줄로 이동
				System.out.println();
			}
		}
	}
}
