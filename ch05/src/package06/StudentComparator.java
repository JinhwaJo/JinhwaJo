package package06;

import java.util.Comparator;

// 학생 비교자(이름순)
public class StudentComparator implements Comparator<Student>{
	@Override
	public int compare(Student s1, Student s2) {
		// 문자열 정렬 기준은 String 클래스에서 구현해놓음.
		return s1.getName().compareTo(s2.getName());
	}

}
