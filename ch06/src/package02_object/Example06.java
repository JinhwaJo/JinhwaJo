package package02_object;

class Department {	// �а� Ŭ����
	String schoolNumber;
	String majorName;
	public Department(String schoolNumber, String majorName) {
		this.schoolNumber = schoolNumber;
		this.majorName = majorName;
		
	}
}

class Student implements Cloneable {	// �л� Ŭ����
	
	Department dept;	// ��ü�� �ּ� ����
	String name;
	public Student(Department dept, String name) {
		this.dept = dept;
		this.name = name;
		
	}
	public Student( Student s) {
		this.dept = s.dept;
		this.name = s.name;
	}
	@Override
	public Student clone() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch(CloneNotSupportedException e) {
			System.out.println("Cloneable�� �������� �ʾҽ��ϴ�.");
		}
		Student s = (Student)obj;
		s.dept = new Department(this.dept.schoolNumber, this.dept.majorName);
		return s;
	}
}

public class Example06 {
	public static void main(String[] args) {
		// �Ʒ� Ŭ������ �ۼ��Ͻÿ�.(Student(�л�) �� Department(�а�))
		Student s1 = new Student(new Department("20071111", "��ǻ�Ͱ��а�"), "ȫ�浿");
		Student s2 = s1.clone();
		
		s1.dept.majorName = "��������а�";	// ������ �����ϸ� s1�� ������ ����Ǿ�� ��.
		// dept�� �л� Ŭ������ �����ϰ� �ִ� ��ü��(�̸�)
		System.out.println(s1.dept.majorName);
		System.out.println(s2.dept.majorName);
	}
}
