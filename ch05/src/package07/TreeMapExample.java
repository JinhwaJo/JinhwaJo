package package07;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) {
		Map<String, String> map = new TreeMap<String, String>();
		map.put("baby", "아기");
		map.put("air", "공기");
		map.put("day", "하루");
		map.put("cycle", "자전거");
		
		Iterator<Map.Entry<String, String>> i = map.entrySet().iterator();
		// 키 값 오름차순 출력~
		while(i.hasNext()) {
			Map.Entry<String, String> entry = i.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
}
