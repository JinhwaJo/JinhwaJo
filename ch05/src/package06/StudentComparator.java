package package06;

import java.util.Comparator;

// �л� ����(�̸���)
public class StudentComparator implements Comparator<Student>{
	@Override
	public int compare(Student s1, Student s2) {
		// ���ڿ� ���� ������ String Ŭ�������� �����س���.
		return s1.getName().compareTo(s2.getName());
	}

}
