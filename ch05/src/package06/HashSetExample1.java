package package06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HashSetExample1 {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();	// Integer�� int�� Ŭ�������̶� ��������.
		/* �Ʒ� for������ set.size() < 6; �� i < 6; �� ���� : 
		 * ������ ���, for���� ���ට���� i++�� ����ǹǷ�, ������ �ߺ��� �߻��ϸ� �����Ͱ� ������� �ʴ��� i++�� ����ȴ�.
		 * ��, ������ �ߺ��� ��Ÿ���� Ƚ����ŭ ������ �����Ͱ� ����ȴ�. (�ߺ��� 2�� �߻��ϸ� 4���� ����ȴ�.)
		 * ������ ���, �����Ͱ� ����Ǿ�� i++�� ����ǹǷ� ������ �ߺ��� �߻��ϸ� �����͸� �������� �ʰ� �ǰ�,
		 * �����Ͱ� ��� ä���� ������ ����ؼ� for���� ����ȴ�.	 */
		
		// set.size()(�����Ͱ� ����� ����)�� ó���� 0�̾��ٰ�
		for(int i = 0; set.size() < 6; i++) {
			// 1 ~ 45������ ���ڸ�
			int num = (int)(Math.random() * 45) + 1;
			// �� �÷��ǿ� �����Ѵ�.
			set.add(new Integer(num));
		}
		
		// HashSet�� ������� �޸� �����̱� ������ ���ĵ� ���¸� ������ �� ����. (List�� TreeSet���� �ٲپ� �����ؾ� �Ѵ�.)
		// 1. ����Ʈ�� ��ȯ�� �� sort �޼ҵ带 ����Ѵ�.
		
		// set ��ü�� ���� ����Ʈ ��ü�� ����(�迭 ����̹Ƿ� ���̸� �̸� ������ �� ����.)
		List<Integer> list = new ArrayList<Integer>(set);
		Collections.sort(list);	// ����Ʈ�� ����� �� ���� (cf. s�� ���� ���� Collection�� �򰥸��� ����)
		Collections.reverse(list); // ��������(������)
		
		// Iterator<Integer> i = set.iterator();
		Iterator<Integer> i = list.iterator();	// ����Ʈ �ݺ��ڸ� ��ȯ(list�� iterator�� �ֱ���)
		while(i.hasNext()) {
			int n = i.next();
			System.out.print(n + " ");
		}
		System.out.println();
		
		// 2. Ʈ�������� ��ȯ�ϸ� �ڵ� ���ĵȴ�.
		set = new TreeSet(set);
		i = set.iterator();
		while(i.hasNext()) {
			int n = i.next();
			System.out.print(n + " ");
		}
	}
}
