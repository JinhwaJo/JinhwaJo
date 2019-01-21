package package07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExample8 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("baby", "아기");
		map.put("air", "공기");
		map.put("day", "하루");
		map.put("cycle", "자전거");
		
		// 키를 리스트로 변환
		ArrayList<String> list = new ArrayList<String>(map.keySet());
		Collections.sort(list);	// 리스트 정렬
		Iterator<String> i = list.iterator();	// 리스트 반복자 반환
		while(i.hasNext()) {
			String word = i.next();
			System.out.println(word + " : " + map.get(word));
		}
	}
}
