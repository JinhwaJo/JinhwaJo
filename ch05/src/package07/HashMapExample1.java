package package07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {
	public static void main(String[] args) {
	/* 해시맵
	 * : 키와 값이 한 쌍으로 이루어진 엔트리(Entry)를 저장한다.
	 * : 키는 중복될 수 없고, 값은 중복될 수 있다.
	 * 키와 값, 즉 두 개가 필요하므로 제네릭 안에 두 개를 넣어줘야한다.	 */
	Map<String, Integer> hashMap = new HashMap<String, Integer>();
	
	// list와 set은 add 메소드를 사용하나, map은 인터페이스가 다르므로, put 메소드를 사용한다.
	// 왼쪽이 키, 오른쪽이 값을 나타낸다.
	hashMap.put("홍길동", 87);
	hashMap.put("남길동", 77);
	hashMap.put("북길동", 93);
	// 키 값은 중복될 수 없으므로, 키가 "남길동"인 값을 77에서 100으로 변경한다. (중복이 안되므로 추가가 될 수 없고 변경이 됨을 유의한다.)
	hashMap.put("남길동", 100);
	System.out.println("총 엔트리(데이터) 수 : " + hashMap.size());
	
	// 키가 "북길동" 인 값인 93을 반환한다.
	System.out.println("북길동 점수 : " + hashMap.get("북길동"));
	System.out.println();
	/* 값을 뽑아낼 때는 get메소드를 써서 키값을 넣어주면 값이 도출된다.
	 * 하지만, map에는 키 값을 바로 뽑아낼 수 없는 메소드가 없으므로, Set을 써줘야한다. */
	// 키 값은 중복될 수 없으므로, 셋으로 반환할 수 있다.
	Set<String> key = hashMap.keySet();
	Iterator<String> i = key.iterator();
	while(i.hasNext()) {
		String name = i.next();
		int score = hashMap.get(name);	// '키'로 '값' 반환
		System.out.println(name + "님의 점수 : " + score);
	}
	System.out.println();
	
	hashMap.remove("남길동");	// 키가 "남길동"인 엔트리 삭제
	System.out.println("총 엔트리(데이터) 수 : " + hashMap.size());
	}
}
