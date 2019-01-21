package package05;
// 비교대상을 설정해주지 않았으므로 Comparable을 설정(Comparable뒤에 generic을 달아준다.)
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
	// 번호로 비교
	// 이건 우리가 만든 거
	/*public int compareTo(Student target) {
	 
		if(this.number < target.number) {			// 왼쪽이 작으면 -1
			return -1;
		} else if(this.number > target.number) {	// 왼쪽이 크면 +1
			return 1;
		} else {									// 같으면 0
		return 0;
		}
	}*/
	// 이름으로 비교
	// 이건 String 클래스가 만든 거
	public int compareTo(Student target) {
		/* String 클래스에 만들어져 있는 compareTo로 이미 비교구문이 작성되어 있어서
		 * 따로 아래에 작성할 필요가 없다.	 */
		return this.name.compareTo(target.getName());
	}
}
