package package07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample6 {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		// 전화번호는 중복되면 X, 이름은 중복되도 O
		map.put("010-1111-1111", "홍길동");
		map.put("010-2222-2222", "서길동");
		map.put("010-3333-3333", "북길동");
		map.put("010-4444-4444", "남길동");
		map.put("010-5555-5555", "홍길동");
		
		/* 3. 키와 값이 모두 필요하다면 entrySet 메소드 사용
		 * entrySet은 Set 안에 Entry 객체가 있으므로, 이중 <>(제네릭)을 사용해야 한다.
		 * Set은 데이터를 하나밖에 저장할 수 없으므로, 내부에 키와 값을 저장할 수 있는 엔트리를 생성해줘야한다.
		 * entrySet은 아래와 같은 형태로 밖에 안쓰이므로 문법처럼 외워두자. */
		Set<Map.Entry<String, String>> set = map.entrySet();
		Iterator<Map.Entry<String, String>> i = set.iterator();
		while(i.hasNext()) {
			// 엔트리 반환
			Map.Entry<String, String> entry = i.next();
			String tel = entry.getKey();	// 엔트리에 키 반환
			String name = entry.getValue();	// 엔트리에 값 반환
			System.out.println("이름 : " + name + ", 전번 : " + tel); 
		}
	}
}
