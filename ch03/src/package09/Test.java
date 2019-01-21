package package09;

import java.util.Calendar;

public class Test {
	public static void main(String[] args) {
		/* ��ü�� �����ϴ� 2���� ��� : 
		 * 1. new �����ڸ� ��� - ���α׷��� ������ ������ ���� ��ü�� �����ϰڴپ�
		 * 					- �޸� �δ��� ũ��
		 * 2. getInstance(); ��� - �޷��� ����� �����ϰڴپ�
		 * 						- �����ؼ� ���Ƿ� �޸𸮴� �ϳ��� ����Ǿ� ȿ�����̴�. */
		
		/* Caldenar cal = new Calender(); �� ���� new �����ڸ� ����� �� ������ �ؾ��Ѵ�.
		 * �̸� ���ؼ� Ŭ������ ���� �����Ͽ� new �ڿ� ���� �����ڸ� �������� ���ϵ��� ���� �����ڸ� ����Ѵ�.	 */
		// Singleton ��ü(�̱���) : �޸𸮿� ������ ��ü
		Calendar cal = Calendar.getInstance();
		/* int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.println(hour + " : " + minute + " : " + second); */
		
		// Connection �̸����� getInstance�� ȣ���� �� �־���Ѵ�.
		Connection conn1 = Connection.getInstance();
		Connection conn2 = Connection.getInstance();
		if(conn1 == conn2) {
			System.out.println("�����ϴ� �޸𸮰� �����ϴ�.");
		} else {
			System.out.println("�����ϴ� �޸𸮰� �ٸ��ϴ�.");
		}
	}
}
