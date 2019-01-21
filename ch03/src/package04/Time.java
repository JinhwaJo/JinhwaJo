package package04;

// final Ŭ���� : ����� �� ���� Ŭ������ �ȴ�. (�θ� �� �� ����)
// public final class Time {
	public class Time extends Object {
		// �ƹ��͵� ������ �ڵ����� object Ŭ������ �ڵ� ����ϰ� ������ �����Ǿ� �ִ�.
		// Object�� ��� ��ü�� �ֻ����� �ִ�.
		
		/* �Ű������� � �ڽ� ��ü�� �����Ǵ��Ŀ� ���� �޼ҵ��� ���� ����� �پ����� �� �ִ�.
		 * �̿�����, �θ� �پ��ϰ� ���� �ڽĵ��� ������ �� �ִ� ���� "�Ű������� ������" �̶�� �Ѵ�.
		 * �Է� �޴� ���� ��� ���� ���� �� �˼��� ���� ��Ȳ�̹Ƿ�
		 * ��� ������ �����Ϸ��� ������ �ڵ� �Է��� ���ϰ� �ȴ�.
		 * �̷� �ڵ��� ���ٸ� �����ϱ� ���� �ʿ��� ���� "�Ű������� ������" �̴�.	 */
	private int hour;
	private int minute;
	private int second;
	/* final �ʵ� : ó�� ����� ��(�ʱ�ȭ)�� ����� �� ����. (���)
	 * Static �ʵ� : ���� ��� �߰�
	 * ����ȭ�Ǿ� �߰� ������ ������ ����� final�� �ٿ� ����Ұ��� ������Ų��.
	 * ��� ���� �� ���� �빮�ڷ� �Է�
	 * ����, ���ȭ��Ű�� ���� �����ؼ� ���Ƿ� static�� ���� �ٿ��ش�.	*/
	private static final int MAX_HOUR = 23;
	private static final int MIN_HOUR = 0;
	
	public Time() {	}	// ����Ʈ ������
	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	//final �޼ҵ� : ����� Ŭ������ ������(�θ��� �ش� ��� ���� X) �� �� ����.
	// public final void info() {
	public void info() {
		System.out.println(this.hour + " : " + this.minute + " : " + this.second);
	}
	
	@Override
	public boolean equals(Object obj) {
		// obj �� �����ϰ� �ִ� ��ü�� Time ��ü�̸� true �ƴϸ� false
		if(obj instanceof Time) {	// ���ʿ� �θ� ������, �����ʿ� �ڽ� Ŭ����
			// ��ǻ�ʹ� Time�� American time���� ����� �𸣴� ���� Ÿ�� ��ȯ�� �ʿ�.
			Time target = (Time)obj;	// �ٽ� �ڽ� �ν��Ͻ��� ������ְ�,
			// �ÿ� ���� ���� ��ġ�ϸ� true�� ��ȯ�ϰ�,
			if(this.hour == target.hour && this.minute == target.minute) {
				return true;
				// ���⼭ this.hour == target.hour�� t1.hour = t2.hour�� ����.
			}
			
		}
		// ��ġ���� ������ false�� ��ȯ�Ѵ�.
					return false;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		if(hour > Time.MAX_HOUR || hour < Time.MIN_HOUR) {
			System.out.println("�ð��� �߸��Ǿ����ϴ�.");
			return;
		}
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}

	public static void main(String[] args) {
		Time t1 = new Time(10, 59, 10);
		Time t2 = new Time(10, 59, 10);
		Time t3 = new Time (9, 10, 50);
		
		if(t1.equals(t2)) {
			System.out.println("�˶� �︲.");
		} else {
			System.out.println("�˶� �� �︲.");
		}
	}
}
