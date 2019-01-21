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
		set.add(new Student(1, "홍길동"));
		set.add(new Student(48, "북길동"));
		set.add(new Student(33, "남길동"));
		set.add(new Student(1, "서길동"));
				
		
		List<Student> list = new ArrayList<Student>(set);
		// Comparator 적용하여 이름순으로 정렬
		Collections.sort(list, new StudentComparator());
		// Collections.reverse(list);	// 내림차순 정렬
		
		Iterator<Student> i = list.iterator();
		while(i.hasNext()) {
			Student s = i.next();
			System.out.println("학번 : " + s.getNumber()
			+ ", 이름 : " + s.getName());
		}
	}
}
