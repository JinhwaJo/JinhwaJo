package package07_simpledateformat;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SimpleDateFormatExample03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/* DateFormat 메소드는 SimpleDateFormat 클래스의 조상으로
		 * parse 메소드를 사용하며,
		 * 문자열을 날짜(Date) 객체로 자동으로 변환해주기 떄문에 편리하게 사용할 수 있다.
		 * (String의 substring 메소드를 사용할 필요가 없게 된다.)		 */
		String pattern = "yyyy/MM/dd";
		DateFormat df = new SimpleDateFormat(pattern); // 조상 = 자손
		System.out.println("날짜를" + pattern + "형태로 입력(예시 : 1988/7/27)");
		System.out.print("날짜 입력 : ");
		Date date = null;
		while(true) {
			try {
				// parse메소드는 DateFormat 메소드에서만 쓸수 있고, SimpleDateFormat 메소드에서는 쓸 수 없다.
				date = df.parse(sc.nextLine()); // 입력한 문자열(String)을 날짜(Date) 객체로 변환
				break;
			} catch(Exception e) {
				System.out.println("날짜를" + pattern + "형태로 입력해야 합니다.");
			}
		}
		System.out.println(df.format(date));
	}
}
