package package06_calendar;

import java.util.Calendar;

public class CalendarExample06 {
	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();
		date.set(2002, 8, 30);	// 2002년 9월 30일
		
		System.out.println("[ 날짜 ]");
		System.out.println(toString(date));
		
		System.out.println("[ 2일 후 ]");
		date.add(Calendar.DAY_OF_MONTH, 2);
		System.out.println(toString(date));
		
		System.out.println("[ 5달 전 ]");
		date.add(Calendar.MONTH, -5);
		System.out.println(toString(date));
		
		System.out.println("[ 2일 전 ]");
		date.add(Calendar.DAY_OF_MONTH, -2);
		System.out.println(toString(date));
		// 특정 월의 달력에 전월의 날짜가 있을 경우, roll을 쓰면 월수에 영향을 주지 않아 해당 날짜를 구할 수 있다.
		// roll은 일수에만 영향을 주므로, 30일이 지나도 월수는 올라가지 않는다.
		System.out.println("[ 31일 후1 ]");
		date.roll(Calendar.DAY_OF_MONTH, 31);	// 다른 필드에 영향을 미치지 않는다.
		System.out.println(toString(date));
		
		// add는 roll과 달리 30일이 지나면 월수가 올라간다.
		System.out.println("[ 31일 후2 ]");
		date.add(Calendar.DAY_OF_MONTH, 31);	// 다른 필드에 영향을 미친다.
		System.out.println(toString(date));
		
	}
	
	public static String toString(Calendar cal) {
		return cal.get(Calendar.YEAR) + "년" + (cal.get(Calendar.MONTH) + 1) + "월"
				+ cal.get(Calendar.DAY_OF_MONTH) + "일";
	}
}
