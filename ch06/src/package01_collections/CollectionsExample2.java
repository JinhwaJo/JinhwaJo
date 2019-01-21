package package01_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExample2 {
	public static void main(String[] args) {
		// 1. 65, 77, 65, 88 �� ����Ʈ�� �����Ͻÿ�.
		List<Integer> list = new ArrayList<Integer>();
		Collections.addAll(list, 65, 77, 65, 88);	
		System.out.println(list);
		
		// 2. ����Ǿ� �ִ� ������ �������� 2ĭ �̵���Ű�ÿ�.
		Collections.rotate(list, 2);
		System.out.println(list);
		
		// 3. ������ �������� �Ͻÿ�.
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		
		// 4. 77�� ����� ���� ��ġ�� ��ȯ�Ͻÿ�.
		int idx = Collections.binarySearch(list, 77);
		System.out.println("77�� ����� ��ġ�� : list["+idx+"] �Դϴ�.");
		
		// 5. ��� ������ ����Ʈ2�� �����Ͻÿ�.
		// List<Integer> list2 = Collections.nCopies(list.size(), 1);
		List<Integer> list2 = new ArrayList<Integer>(list.size());
		System.out.println(list2);
		Collections.addAll(list2, 1, 1, 1, 1);
		System.out.println(list2);
		// �Ʒ��� Collections.copy ��� ��, ������ ĭ�� ArrayList ���� ��ü�� ���� ���´� �� �� ����.
		// Collections.copy(list2, list);
		System.out.println(list);
		System.out.println(list2);
		
		// 6. ����Ʈ2�� 65�� ���� ������ 55�� �����Ͻÿ�.
		Collections.replaceAll(list2, 65, 55);
		System.out.println(list2);
		
		/* 7. if���� �̿��� �� ����Ʈ�� ���� ���� ������ �ִ��� ����Ͻÿ�.
		 * (���� ���� ������ ������ ����ǥ�� �����ϴ�.)
		 * (�ٸ� ���� ������ ������ ����ǥ�� �ٸ��ϴ�.)�� ���		 */
		// �κ������� ���Ƶ� ������ ó���Ͽ� ���ٰ� �� �� �����Ƿ�, ���� ����Ʈ�� ��� �˻��ؾ��Ѵ�.
		// containsAll�� ���� �ϳ��ϳ� ��� ���ϴ� �޼ҵ�
		if(list.containsAll(list2) && list2.containsAll(list)) {
			System.out.println("����ǥ�� �����ϴ�.");
		} else {
			System.out.println("����ǥ�� �ٸ��ϴ�.");
		}
		
		if(list.equals(list2) && list2.equals(list)) {
			System.out.println("����ǥ�� �����ϴ�.");
		} else {
			System.out.println("����ǥ�� �ٸ��ϴ�.");
		}
		
		
		
				
	}
}
