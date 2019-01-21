package package06_calendar;

import java.util.Calendar;

public class CalendarExample06 {
	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();
		date.set(2002, 8, 30);	// 2002�� 9�� 30��
		
		System.out.println("[ ��¥ ]");
		System.out.println(toString(date));
		
		System.out.println("[ 2�� �� ]");
		date.add(Calendar.DAY_OF_MONTH, 2);
		System.out.println(toString(date));
		
		System.out.println("[ 5�� �� ]");
		date.add(Calendar.MONTH, -5);
		System.out.println(toString(date));
		
		System.out.println("[ 2�� �� ]");
		date.add(Calendar.DAY_OF_MONTH, -2);
		System.out.println(toString(date));
		// Ư�� ���� �޷¿� ������ ��¥�� ���� ���, roll�� ���� ������ ������ ���� �ʾ� �ش� ��¥�� ���� �� �ִ�.
		// roll�� �ϼ����� ������ �ֹǷ�, 30���� ������ ������ �ö��� �ʴ´�.
		System.out.println("[ 31�� ��1 ]");
		date.roll(Calendar.DAY_OF_MONTH, 31);	// �ٸ� �ʵ忡 ������ ��ġ�� �ʴ´�.
		System.out.println(toString(date));
		
		// add�� roll�� �޸� 30���� ������ ������ �ö󰣴�.
		System.out.println("[ 31�� ��2 ]");
		date.add(Calendar.DAY_OF_MONTH, 31);	// �ٸ� �ʵ忡 ������ ��ģ��.
		System.out.println(toString(date));
		
	}
	
	public static String toString(Calendar cal) {
		return cal.get(Calendar.YEAR) + "��" + (cal.get(Calendar.MONTH) + 1) + "��"
				+ cal.get(Calendar.DAY_OF_MONTH) + "��";
	}
}
