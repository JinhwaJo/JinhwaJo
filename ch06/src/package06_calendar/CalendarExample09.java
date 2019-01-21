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
		
		System.out.println("      " + year + "��" + month + "��");
		System.out.println(" SU MO TU WE TH FR SA");
		// ���� ��¥�� ������ ��¥ �����̰ų� ���� ��¥�� ������ ��¥�� ���� ��쿡�� ���� ��¥�� 1�� ������.
		// ���۳�¥�� ��������¥�� ��ġ�� ������ ����Ƿ� startDate.equals(endDate) �� �������ش�.
		for(int n = 1; startDate.before(endDate) || startDate.equals(endDate);
				startDate.add(Calendar.DAY_OF_MONTH, 1)) {
			int day = startDate.get(Calendar.DAY_OF_MONTH); // 1�Ͼ� ������ ��¥�� day�� ����
			System.out.print(day < 10 ? "  " + day : " " + day);
			if(n++ % 7 == 0) { // 7�� ����̸� �����ٷ� �̵�
				System.out.println();
			}
		}
	}
}
