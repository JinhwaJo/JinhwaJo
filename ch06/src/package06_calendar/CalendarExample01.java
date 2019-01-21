package package06_calendar;

import java.util.Calendar;

public class CalendarExample01 {
	public static void main(String[] args) {
		/* Date 클래스는 날짜와 시간을 다루는 API 클래스로 JDK 1.0이 제공하여, 기능이 매우 적다.
		 * 이를 보완하기 위해 Calendar 클래스를 JDK 1.1 부터 제공한다.		 */
		// 캘린더 객체 생성
		Calendar today = Calendar.getInstance();	// new Calendar(); 사용 금지
		
		System.out.println("현재 해의 년도 : " + today.get(Calendar.YEAR));
		// 배열을 생성하여 월 별로 출력한다든지 하는 경우에, 배열의 첫 시작이 0이므로, Calendar 클래스의 MONTH 메소드의 첫 시작이 0이 아닐까...
		// 0 ~ 11 (1월부터 할려면 아래처럼 + 1을 붙여준다.)
		System.out.println("현재 해의 월(달)(1) : " + today.get(Calendar.MONTH));
		// 1 ~ 12 (문자열과 더하여 문자열 값인 "01"이 나오므로, 괄호처리 해서 숫자로 인식하도록 해준다.)
		System.out.println("현재 해의 월(달)(2) : " + (today.get(Calendar.MONTH) + 1)); 
		System.out.println("현재 해의 일(날) : " + today.get(Calendar.DAY_OF_MONTH));
		System.out.println("현재 해의 몇 번째 주 : " + today.get(Calendar.WEEK_OF_YEAR));	// 52주까지
		System.out.println("현재 달의 몇 번째 주 : " + today.get(Calendar.WEEK_OF_MONTH));	// 4 ~ 5주까지
	}
}
