package package06_calendar;

import java.util.Calendar;

public class CalendarExample04 {
	public static void main(String[] args) {
		// 요일 상수
		final String[] DAY_OF_THE_WEEK =
			{"", "일", "월", "화", "수", "목", "금", "토"};	// 날짜는 0부터 시작하니 첫번째 칸을 비워둔다.
		
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
		date1.set(1988, 11, 20); // 날짜 객체의 년, 월, 일을 변경한다.	
		System.out.println("date1은 " + toString(date1)
		+ DAY_OF_THE_WEEK[date1.get(Calendar.DAY_OF_WEEK)] + "요일 입니다.");
		System.out.println("date2는 " + toString(date2)
		+ DAY_OF_THE_WEEK[date2.get(Calendar.DAY_OF_WEEK)] + "요일 입니다.");
		
		// 두 시간의 차이를 구할 때(밀리초(1/1000초)로 환산되기 때문에 1000으로 나누어준다.
		long diff = Math.abs((date1.getTimeInMillis() - date2.getTimeInMillis())) / 1000;	// 음수 방지
		//long diff = (date2.getTimeInMillis() - date1.getTimeInMillis()) / 1000;
		System.out.println("그 날부터 지금까지 " + diff + "초가 지났습니다.");
		long diffDay = diff / (24 * 60 * 60);	// 하루(24시간X60분X60초)를 초로 환산하고 나눠준다.
		System.out.println("그 날부터 지금까지 " + diffDay + "일이 지났습니다.");
	}
	
	// 날짜 객체에 저장된 년, 월, 일 값을 이용해 문자열로 반환하는 메소드
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR) + "년 " + (date.get(Calendar.MONTH) + 1)
		+ "월 " + date.get(Calendar.DAY_OF_MONTH) + "일 ";
	}
}
