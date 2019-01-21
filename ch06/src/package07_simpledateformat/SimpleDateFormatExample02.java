package package07_simpledateformat;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SimpleDateFormatExample02 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss");
		
		System.out.println(sdf.format(date));
		
		sdf = new SimpleDateFormat("yyyy/MM/dd");
		System.out.println(sdf.format(date));
	}
}
