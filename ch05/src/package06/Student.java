package package06;
/* Comparable : 해당 클래스의 기본적인 정렬(번호순)기준
 * Comparator(비교자) : 해당 클래스의 기본 정렬 외(이름순, 제목순, ...) 기준	*/
public class Student implements Comparable<Student> {
	private int number;
	private String name;
	// 정렬되는 기준(compareTo 메소드)
	@Override
	public int compareTo(Student target) {
		// "음수 또는 0 또는 양수" 를 API 문서 내용에 따라 아래와 같이 작성한다.
		return this.number - target.number;
	}
	// 중복 제거(equals, hashCode 메소드)	
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
