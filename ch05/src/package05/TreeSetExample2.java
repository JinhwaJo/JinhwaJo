package package05;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample2 {
	public static void main(String[] args) {
		TreeSet<Student> ts = new TreeSet<Student>();
		ts.add(new Student(1, "ȫ�浿"));
		ts.add(new Student(2, "���浿"));
		ts.add(new Student(1, "���浿"));	// �л� ��ȣ �ߺ�
		
		Iterator <Student> i = ts.iterator();
		while(i.hasNext()) {
			Student student = i.next();	// �л� ����
			System.out.println("��ȣ : " + student.getNumber()
			+ ", �̸� : " + student.getName());
		}
	}
}
