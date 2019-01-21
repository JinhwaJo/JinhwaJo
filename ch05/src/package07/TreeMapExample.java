package package07;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) {
		Map<String, String> map = new TreeMap<String, String>();
		map.put("baby", "�Ʊ�");
		map.put("air", "����");
		map.put("day", "�Ϸ�");
		map.put("cycle", "������");
		
		Iterator<Map.Entry<String, String>> i = map.entrySet().iterator();
		// Ű �� �������� ���~
		while(i.hasNext()) {
			Map.Entry<String, String> entry = i.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
}
