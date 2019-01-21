package package05;
// �񱳴���� ���������� �ʾ����Ƿ� Comparable�� ����(Comparable�ڿ� generic�� �޾��ش�.)
public class Student implements Comparable<Student> {
	private int number;
	private String name;
	public Student() {
	}
	public Student(int number) {
		super();
		this.number = number;
	}
	public Student(int number, String name) {
		super();
		this.number = number;
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	// ��ȣ�� ��
	// �̰� �츮�� ���� ��
	/*public int compareTo(Student target) {
	 
		if(this.number < target.number) {			// ������ ������ -1
			return -1;
		} else if(this.number > target.number) {	// ������ ũ�� +1
			return 1;
		} else {									// ������ 0
		return 0;
		}
	}*/
	// �̸����� ��
	// �̰� String Ŭ������ ���� ��
	public int compareTo(Student target) {
		/* String Ŭ������ ������� �ִ� compareTo�� �̹� �񱳱����� �ۼ��Ǿ� �־
		 * ���� �Ʒ��� �ۼ��� �ʿ䰡 ����.	 */
		return this.name.compareTo(target.getName());
	}
}
