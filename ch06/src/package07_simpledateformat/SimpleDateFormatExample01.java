package package07_simpledateformat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatExample01 {
	public static void main(String[] args) {
		/* G : 연대(BC(기원전), AD(기원후))
		 * y : 년도
		 * M : 월(1 ~ 12 또는 1월 ~ 12월
		 * w : 년의 몇 번째 주(1 ~ 53)
		 * W : 월의 몇 번째 주(1 ~ 5)
		 * D : 년의 몇 번째 일(1 ~ 366)
		 * d : 월의 몇 번째 일(1 ~ 31)
		 * F : 월의 몇 번째 요일(1 ~ 5)
		 * E : 요일(일 ~ 토)
		 * a : 오전/오후(AM, PM)
		 * H : 시간(0 ~ 23)
		 * h : 시간(0 ~ 12)
		 * K : 시간(0 ~ 11)
		 * k : 시간(1 ~ 24)
		 * m : 분(0 ~ 59)
		 * s : 초(0 ~ 59)
		 * S : 천 분의 일초(0 ~ 999)
		 * z : Time zone(General time zone) GMT+9:00
		 * Z : Time zone(RFC 822 time zone)+0900		 */
		Date today = new Date();	// java,util.Date 클래스
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf1.format(today));
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yy년-MMM-dd일 E요일");	// M를 3개 적으면 '월' 글자까지 출력됨.
		System.out.println(sdf2.format(today));
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss");
		System.out.println(sdf3.format(today));
		
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf4.format(today));
		
		SimpleDateFormat sdf5 = new SimpleDateFormat("오늘은 올 해의 D번째 날 입니다.");
		System.out.println(sdf5.format(today));
		
		SimpleDateFormat sdf6 = new SimpleDateFormat("오늘은 이 달의 d번째 날 입니다.");
		System.out.println(sdf6.format(today));
		
		SimpleDateFormat sdf7 = new SimpleDateFormat("오늘은 올 해의 w번째 주 입니다.");
		System.out.println(sdf7.format(today));
		
		SimpleDateFormat sdf8 = new SimpleDateFormat("오늘은 이 달의 W번째 주 입니다.");
		System.out.println(sdf8.format(today));
		
		SimpleDateFormat sdf9 = new SimpleDateFormat("오늘은 이 달의 F번째 E요일 입니다.");
		System.out.println(sdf9.format(today));
		
		
		
		
		
		
		
		
		
	}
}
