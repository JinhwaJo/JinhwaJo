package package01_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExample1 {
	public static void main(String[] args) {
		// Collections API : �÷����� �ٷ� �� ����ϴ� Ŭ������ �޼ҵ带 ���Ѵ�.
		List<Integer> list = new ArrayList<Integer>();
		System.out.println(list); // ��� ����.
		
		Collections.addAll(list, 1, 2, 3, 4, 5);	// ����Ʈ�� �ѹ��� �ټ��� ���� ������ ��
		System.out.println(list); // 1, 2, 3, 4, 5 �� ����Ʈ�� ����Ǿ� ����.
		
		Collections.rotate(list, 2); // ���������� �� ĭ�� �̵�
		System.out.println(list);
		
		Collections.shuffle(list); // ����� ���(��)�� ��ġ�� ���Ƿ� ����
		System.out.println(list);
		
		// ���������� �ƴ� ������������ ����
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		
		int idx = Collections.binarySearch(list,3); // 3�� ����� ��ġ(index)�� ��ȯ
		System.out.println("3�� ����� ��ġ�� : list[" + idx + "] �Դϴ�.");
		
		System.out.println(Collections.max(list)); // �ִ� ��
		System.out.println(Collections.min(list)); // �ּ� ��
		
		Collections.fill(list, 9); // list�� ��Ұ����� ��� 9�� ä��.
		System.out.println(list);
		
		// list�� ���� ũ���� newList�� �����ϰ�, 2�� ä��.
		List<Integer> newList = Collections.nCopies(list.size(), 2);
		System.out.println(newList);
		
		// ����� ��Ұ� ������ true ������ false
		System.out.println(Collections.disjoint(list, newList));
		
		Collections.copy(list, newList); // newList�� ������ list�� ����
		System.out.println(newList);
		System.out.println(list);
		
		Collections.replaceAll(list, 2, 1); // list�� ��Ұ� 2�� ���� 1�� ��� ��ü(����)
		System.out.println(list);
	
	}
}
