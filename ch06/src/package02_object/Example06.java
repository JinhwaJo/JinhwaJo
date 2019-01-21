package package02_object;

class Department {	// 학과 클래스
	String schoolNumber;
	String majorName;
	public Department(String schoolNumber, String majorName) {
		this.schoolNumber = schoolNumber;
		this.majorName = majorName;
		
	}
}

class Student implements Cloneable {	// 학생 클래스
	
	Department dept;	// 객체의 주소 저장
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
			System.out.println("Cloneable을 구현하지 않았습니다.");
		}
		Student s = (Student)obj;
		s.dept = new Department(this.dept.schoolNumber, this.dept.majorName);
		return s;
	}
}

public class Example06 {
	public static void main(String[] args) {
		// 아래 클래스를 작성하시오.(Student(학생) 와 Department(학과))
		Student s1 = new Student(new Department("20071111", "컴퓨터공학과"), "홍길동");
		Student s2 = s1.clone();
		
		s1.dept.majorName = "국제통상학과";	// 전공을 변경하면 s1의 전공만 변경되어야 함.
		// dept는 학생 클래스가 포함하고 있는 객체명(이름)
		System.out.println(s1.dept.majorName);
		System.out.println(s2.dept.majorName);
	}
}
