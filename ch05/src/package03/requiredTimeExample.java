package package03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class requiredTimeExample {
	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<String>();
		List<String> linkedList = new LinkedList<String>();
		/* �Ϲ������� �����ϸ� ArrayList�� LinkedList���� ��������,
		 * ���������� �����ϸ� LinkedList�� �� ������. */
		// ���⼭���� �迭 ��� ����Ʈ
		long start, end;	// ����, ���� �ð�
		start = System.nanoTime();	// ������(10�� ���� 1��)
		for(int i = 0; i < 100000; i++) {
			arrayList.add(0, String.valueOf(i));
		}
		end = System.nanoTime();
		System.out.println("ArrayList �ҿ�ð� : " + (end - start) + "ns");
		
		// ���⼭���� ���Ḯ��Ʈ ��� ����Ʈ
		start = System.nanoTime(); 	// ������(10�� ���� 1��)
		for(int i = 0; i < 100000; i++) {
			linkedList.add(0, String.valueOf(i));
		}
		end = System.nanoTime();
		System.out.println("LinkedList �ҿ�ð� : " + (end - start) + "ns");
		
		// ������ ���� �迭 ��� ����Ʈ
		start = System.nanoTime();
		for(int i = 0; i < 30000; i++) {
			arrayList.get(i);
		}
		end = System.nanoTime();
		System.out.println("ArrayList �ҿ�ð� : " + (end - start) + "ns");
		
		// ������ ���� ���� ��� ����Ʈ
		start = System.nanoTime();
		for(int i = 0; i < 30000; i++) {
			linkedList.get(i);
		}
		end = System.nanoTime();
		System.out.println("LinkedList �ҿ�ð� : " + (end - start) + "ns");
	}
}
