package package06_calendar;

import java.util.Calendar;

public class CalendarExample07 {
	public static void main(String[] args) {
		int year = 2019;
		int month = 1;
		
		// 시작날 달력
		Calendar startDay = Calendar.getInstance();
		startDay.set(year, month -1, 1); // 2019년 1월 1일부터
		
		// 마지막날 달력
		Calendar endDay = Calendar.getInstance();
		/* endDay.set(year, month -1, startDay.getActualMaximum(Calendar.DAY_OF_MONTH));
		 * 아래 식이 버그가 발생하는 경우 위와 같이 설정하자.		 */
		endDay.set(year, month -1, 1);
		endDay.add(Calendar.DAY_OF_MONTH, -1); // 2월에서 -1을 하니 1월 31일이 된다.
		
		int start = startDay.get(Calendar.DAY_OF_WEEK); // 필드에서 month를 1월로 설정해놓았으므로, 1월의 시작 요일인 3을 반환하게 된다.
			
		System.out.println("     " + year + "년 " + month + "월 달력");
		System.out.println(" SU MO TU WE TH FR SA");
		for(int i = 1; i < start; i++) {
			System.out.print("   "); // 공백 3개
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
}
