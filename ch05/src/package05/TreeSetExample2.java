package package05;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample2 {
	public static void main(String[] args) {
		TreeSet<Student> ts = new TreeSet<Student>();
		ts.add(new Student(1, "홍길동"));
		ts.add(new Student(2, "남길동"));
		ts.add(new Student(1, "서길동"));	// 학생 번호 중복
		
		Iterator <Student> i = ts.iterator();
		while(i.hasNext()) {
			Student student = i.next();	// 학생 저장
			System.out.println("번호 : " + student.getNumber()
			+ ", 이름 : " + student.getName());
		}
	}
}
