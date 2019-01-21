package package06;
/* Comparable : �ش� Ŭ������ �⺻���� ����(��ȣ��)����
 * Comparator(����) : �ش� Ŭ������ �⺻ ���� ��(�̸���, �����, ...) ����	*/
public class Student implements Comparable<Student> {
	private int number;
	private String name;
	// ���ĵǴ� ����(compareTo �޼ҵ�)
	@Override
	public int compareTo(Student target) {
		// "���� �Ǵ� 0 �Ǵ� ���" �� API ���� ���뿡 ���� �Ʒ��� ���� �ۼ��Ѵ�.
		return this.number - target.number;
	}
	// �ߺ� ����(equals, hashCode �޼ҵ�)	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student target = (Student)obj;
			if(this.number == target.number) {
				return true;
			}
		}
		return false;
	}
	@Override
	public int hashCode() {
		return number;
	}
	public Student() {
		super();
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
}
