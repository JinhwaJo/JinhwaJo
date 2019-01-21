package package07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExample8 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("baby", "�Ʊ�");
		map.put("air", "����");
		map.put("day", "�Ϸ�");
		map.put("cycle", "������");
		
		// Ű�� ����Ʈ�� ��ȯ
		ArrayList<String> list = new ArrayList<String>(map.keySet());
		Collections.sort(list);	// ����Ʈ ����
		Iterator<String> i = list.iterator();	// ����Ʈ �ݺ��� ��ȯ
		while(i.hasNext()) {
			String word = i.next();
			System.out.println(word + " : " + map.get(word));
		}
	}
}
