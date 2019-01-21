package package06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetExample3 {
	public static void main(String[] args) {
		Set<Student> set = new HashSet<Student>();
		set.add(new Student(1, "ȫ�浿"));
		set.add(new Student(48, "�ϱ浿"));
		set.add(new Student(33, "���浿"));
		set.add(new Student(1, "���浿"));
				
		
		List<Student> list = new ArrayList<Student>(set);
		// Comparator �����Ͽ� �̸������� ����
		Collections.sort(list, new StudentComparator());
		// Collections.reverse(list);	// �������� ����
		
		Iterator<Student> i = list.iterator();
		while(i.hasNext()) {
			Student s = i.next();
			System.out.println("�й� : " + s.getNumber()
			+ ", �̸� : " + s.getName());
		}
	}
}
