package package07;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample5 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("홍길동", 77);
		map.put("서길동", 88);
		map.put("북길동", 66);
		map.put("남길동", 99);
		
		// 1. 맵에 저장된 키가 필요할 때는 keySet 메소드 (가독성도 좋고, 제일 많이 쓴다.)
		// 키를 출력하기 위해 (키가 필요함)
		Set<String> set = map.keySet();
		Iterator<String> iter1 = set.iterator();
		System.out.println("[ 학생 점수 ]");
		while(iter1.hasNext()) {
			String name = iter1.next();	// 키 반환
			int score = map.get(name);
			System.out.println("이름 : " + name + ", 점수 : " + score);
		}
		
		// 2. 맵에 저장된 값만 필요할 때는 values 메소드
		// 키가 필요없을 때
		// values는 Collection으로 받는다. (Collections는 데이터를 가공하고 처리할 때 사용)
		Collection<Integer> scores = map.values();	// 콜렉션 객체 반환
		/* 콜렉션(Collection)은 하위에 있는 List, Set으로 변환이 가능하나, Map으로 변환은 불가능하다.(인터페이스가 다르다)
		 * (값은 중복될 수 있기 떄문에 Set 보다는 List로 변환하는 경우가 많다.)
		 * ArrayList<integer> al = new ArrayList<Integer>(scores);		 */
		Iterator<Integer> iter2 = scores.iterator();
		int sum = 0;
		while(iter2.hasNext()) {
			int score = iter2.next();
			sum += score;
		}
		double avg = (double)sum / scores.size();
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("최고 점수 : " + Collections.max(scores));
		System.out.println("최저 점수 : " + Collections.min(scores));
	}
}
