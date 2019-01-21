package package06_calendar;

import java.util.Calendar;

public class CalendarExample08_my {
	public static void main(String[] args) {
		int year = 2019;
		int month = 1;
		
		// ���۳� �޷�
		Calendar startDay = Calendar.getInstance();
		startDay.set(year, month -1, 1); // 2019�� 1�� 1�Ϻ���
		
		// �������� �޷�
		Calendar endDay = Calendar.getInstance();
		endDay.set(year, month -1, 1);
		endDay.add(Calendar.DAY_OF_MONTH, -1); // 2������ -1�� �ϴ� 1�� 31���� �ȴ�.
		
		// ���� ���� ���ϱ�
		Calendar lastMonthDay = Calendar.getInstance();
		lastMonthDay.set(year, month -1, 1);
		lastMonthDay.roll(Calendar.DAY_OF_MONTH, -2);
		
		// ���� ���� ���ϱ�
		Calendar nextMonthDay = Calendar.getInstance();
		nextMonthDay.set(year, month -1, 31);
		nextMonthDay.roll(Calendar.DAY_OF_MONTH, 2);
		
		int start = startDay.get(Calendar.DAY_OF_WEEK);	// 1���� ���� ���� ���ϱ�
		int last = startDay.getActualMaximum(Calendar.DAY_OF_MONTH); // 1���� ������ �� ���ϱ�

		System.out.println("     " + year + "�� " + month + "�� �޷�");
		System.out.println("  (����, ���� ���� �ݿ�)");
		System.out.println(" SU MO TU WE TH FR SA");
		for(int i = 1; i < start; i++) {
			System.out.print(toString(lastMonthDay)); // ���� 3��
		}
		for(int i = 1; i <= endDay.get(Calendar.DAY_OF_MONTH); i++) {
			if(i < 10) {
				System.out.print("  " + i);	// 1�ڸ� �����̸� ���� 2��
			} else {
				System.out.print(" " + i);	// 2�ڸ� �����̸� ���� 1��
			}
			if(start++ % 7 == 0) {			// 7�� ����̸� ���� �ٷ� �̵�
				System.out.println();			
			}
		}
	}
	public static String toString(Calendar cal) {
		return cal.get(Calendar.DAY_OF_MONTH) + "��";
	}
}
