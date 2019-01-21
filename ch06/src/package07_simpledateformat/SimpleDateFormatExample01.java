package package07_simpledateformat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatExample01 {
	public static void main(String[] args) {
		/* G : ����(BC(�����), AD(�����))
		 * y : �⵵
		 * M : ��(1 ~ 12 �Ǵ� 1�� ~ 12��
		 * w : ���� �� ��° ��(1 ~ 53)
		 * W : ���� �� ��° ��(1 ~ 5)
		 * D : ���� �� ��° ��(1 ~ 366)
		 * d : ���� �� ��° ��(1 ~ 31)
		 * F : ���� �� ��° ����(1 ~ 5)
		 * E : ����(�� ~ ��)
		 * a : ����/����(AM, PM)
		 * H : �ð�(0 ~ 23)
		 * h : �ð�(0 ~ 12)
		 * K : �ð�(0 ~ 11)
		 * k : �ð�(1 ~ 24)
		 * m : ��(0 ~ 59)
		 * s : ��(0 ~ 59)
		 * S : õ ���� ����(0 ~ 999)
		 * z : Time zone(General time zone) GMT+9:00
		 * Z : Time zone(RFC 822 time zone)+0900		 */
		Date today = new Date();	// java,util.Date Ŭ����
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf1.format(today));
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yy��-MMM-dd�� E����");	// M�� 3�� ������ '��' ���ڱ��� ��µ�.
		System.out.println(sdf2.format(today));
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss");
		System.out.println(sdf3.format(today));
		
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf4.format(today));
		
		SimpleDateFormat sdf5 = new SimpleDateFormat("������ �� ���� D��° �� �Դϴ�.");
		System.out.println(sdf5.format(today));
		
		SimpleDateFormat sdf6 = new SimpleDateFormat("������ �� ���� d��° �� �Դϴ�.");
		System.out.println(sdf6.format(today));
		
		SimpleDateFormat sdf7 = new SimpleDateFormat("������ �� ���� w��° �� �Դϴ�.");
		System.out.println(sdf7.format(today));
		
		SimpleDateFormat sdf8 = new SimpleDateFormat("������ �� ���� W��° �� �Դϴ�.");
		System.out.println(sdf8.format(today));
		
		SimpleDateFormat sdf9 = new SimpleDateFormat("������ �� ���� F��° E���� �Դϴ�.");
		System.out.println(sdf9.format(today));
		
		
		
		
		
		
		
		
		
	}
}
