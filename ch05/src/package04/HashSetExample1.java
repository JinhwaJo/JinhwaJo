package package04;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample1 {
	public static void main(String[] args) {
		Set<Integer> hashSet = new HashSet<Integer>();
		
		hashSet.add(10);
		hashSet.add(20);
		hashSet.add(30);
		// �ߺ��� ������� �����Ƿ�, �ߺ� �����ص� 20�� �ѹ��� ���.
		hashSet.add(20);	// �ߺ� ����
		hashSet.add(40);
		
		hashSet.remove(20);	// 20 ����
		
		System.out.println("HashSet : ");
		
		// �ؽü� �ڷ����� �ε���(������ �����Ƿ�(= �ε����� ������), �ݺ��� ���)
		// hasNext : �����Ͱ� �ִ� �޸𸮱��� true�� ��ȯ, ������ false
		// next : �޸𸮿� �ִ� ���� ��ȯ
		Iterator<Integer> iter = hashSet.iterator();
		while(iter.hasNext()) {	// iter�� �����ϴ� �޸𸮰� ������ false
			int n = iter.next();	// ���� �ϳ��� �ݺ��� ������ ����
			System.out.print(n + " ");
		}
		System.out.println("�ݺ��� ����");
	}
}
