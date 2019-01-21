package package07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {
	public static void main(String[] args) {
	/* �ؽø�
	 * : Ű�� ���� �� ������ �̷���� ��Ʈ��(Entry)�� �����Ѵ�.
	 * : Ű�� �ߺ��� �� ����, ���� �ߺ��� �� �ִ�.
	 * Ű�� ��, �� �� ���� �ʿ��ϹǷ� ���׸� �ȿ� �� ���� �־�����Ѵ�.	 */
	Map<String, Integer> hashMap = new HashMap<String, Integer>();
	
	// list�� set�� add �޼ҵ带 ����ϳ�, map�� �������̽��� �ٸ��Ƿ�, put �޼ҵ带 ����Ѵ�.
	// ������ Ű, �������� ���� ��Ÿ����.
	hashMap.put("ȫ�浿", 87);
	hashMap.put("���浿", 77);
	hashMap.put("�ϱ浿", 93);
	// Ű ���� �ߺ��� �� �����Ƿ�, Ű�� "���浿"�� ���� 77���� 100���� �����Ѵ�. (�ߺ��� �ȵǹǷ� �߰��� �� �� ���� ������ ���� �����Ѵ�.)
	hashMap.put("���浿", 100);
	System.out.println("�� ��Ʈ��(������) �� : " + hashMap.size());
	
	// Ű�� "�ϱ浿" �� ���� 93�� ��ȯ�Ѵ�.
	System.out.println("�ϱ浿 ���� : " + hashMap.get("�ϱ浿"));
	System.out.println();
	/* ���� �̾Ƴ� ���� get�޼ҵ带 �Ἥ Ű���� �־��ָ� ���� ����ȴ�.
	 * ������, map���� Ű ���� �ٷ� �̾Ƴ� �� ���� �޼ҵ尡 �����Ƿ�, Set�� ������Ѵ�. */
	// Ű ���� �ߺ��� �� �����Ƿ�, ������ ��ȯ�� �� �ִ�.
	Set<String> key = hashMap.keySet();
	Iterator<String> i = key.iterator();
	while(i.hasNext()) {
		String name = i.next();
		int score = hashMap.get(name);	// 'Ű'�� '��' ��ȯ
		System.out.println(name + "���� ���� : " + score);
	}
	System.out.println();
	
	hashMap.remove("���浿");	// Ű�� "���浿"�� ��Ʈ�� ����
	System.out.println("�� ��Ʈ��(������) �� : " + hashMap.size());
	}
}
