package package07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample6 {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		// ��ȭ��ȣ�� �ߺ��Ǹ� X, �̸��� �ߺ��ǵ� O
		map.put("010-1111-1111", "ȫ�浿");
		map.put("010-2222-2222", "���浿");
		map.put("010-3333-3333", "�ϱ浿");
		map.put("010-4444-4444", "���浿");
		map.put("010-5555-5555", "ȫ�浿");
		
		/* 3. Ű�� ���� ��� �ʿ��ϴٸ� entrySet �޼ҵ� ���
		 * entrySet�� Set �ȿ� Entry ��ü�� �����Ƿ�, ���� <>(���׸�)�� ����ؾ� �Ѵ�.
		 * Set�� �����͸� �ϳ��ۿ� ������ �� �����Ƿ�, ���ο� Ű�� ���� ������ �� �ִ� ��Ʈ���� ����������Ѵ�.
		 * entrySet�� �Ʒ��� ���� ���·� �ۿ� �Ⱦ��̹Ƿ� ����ó�� �ܿ�����. */
		Set<Map.Entry<String, String>> set = map.entrySet();
		Iterator<Map.Entry<String, String>> i = set.iterator();
		while(i.hasNext()) {
			// ��Ʈ�� ��ȯ
			Map.Entry<String, String> entry = i.next();
			String tel = entry.getKey();	// ��Ʈ���� Ű ��ȯ
			String name = entry.getValue();	// ��Ʈ���� �� ��ȯ
			System.out.println("�̸� : " + name + ", ���� : " + tel); 
		}
	}
}
