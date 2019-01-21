package package07;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample5 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("ȫ�浿", 77);
		map.put("���浿", 88);
		map.put("�ϱ浿", 66);
		map.put("���浿", 99);
		
		// 1. �ʿ� ����� Ű�� �ʿ��� ���� keySet �޼ҵ� (�������� ����, ���� ���� ����.)
		// Ű�� ����ϱ� ���� (Ű�� �ʿ���)
		Set<String> set = map.keySet();
		Iterator<String> iter1 = set.iterator();
		System.out.println("[ �л� ���� ]");
		while(iter1.hasNext()) {
			String name = iter1.next();	// Ű ��ȯ
			int score = map.get(name);
			System.out.println("�̸� : " + name + ", ���� : " + score);
		}
		
		// 2. �ʿ� ����� ���� �ʿ��� ���� values �޼ҵ�
		// Ű�� �ʿ���� ��
		// values�� Collection���� �޴´�. (Collections�� �����͸� �����ϰ� ó���� �� ���)
		Collection<Integer> scores = map.values();	// �ݷ��� ��ü ��ȯ
		/* �ݷ���(Collection)�� ������ �ִ� List, Set���� ��ȯ�� �����ϳ�, Map���� ��ȯ�� �Ұ����ϴ�.(�������̽��� �ٸ���)
		 * (���� �ߺ��� �� �ֱ� ������ Set ���ٴ� List�� ��ȯ�ϴ� ��찡 ����.)
		 * ArrayList<integer> al = new ArrayList<Integer>(scores);		 */
		Iterator<Integer> iter2 = scores.iterator();
		int sum = 0;
		while(iter2.hasNext()) {
			int score = iter2.next();
			sum += score;
		}
		double avg = (double)sum / scores.size();
		System.out.println("�հ� : " + sum);
		System.out.println("��� : " + avg);
		System.out.println("�ְ� ���� : " + Collections.max(scores));
		System.out.println("���� ���� : " + Collections.min(scores));
	}
}
