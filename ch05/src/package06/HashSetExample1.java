package package06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HashSetExample1 {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();	// Integer는 int의 클래스형이라 생각하자.
		/* 아래 for문에서 set.size() < 6; 과 i < 6; 의 차이 : 
		 * 후자의 경우, for문이 실행때마다 i++도 실행되므로, 데이터 중복이 발생하면 데이터가 저장되지 않더라도 i++가 실행된다.
		 * 즉, 데이터 중복이 나타나는 횟수만큼 차감된 데이터가 저장된다. (중복이 2번 발생하면 4개만 저장된다.)
		 * 전자의 경우, 데이터가 저장되어야 i++가 실행되므로 데이터 중복이 발생하면 데이터를 저장하지 않게 되고,
		 * 데이터가 모두 채워질 때까지 계속해서 for문이 실행된다.	 */
		
		// set.size()(데이터가 저장된 갯수)는 처음에 0이었다가
		for(int i = 0; set.size() < 6; i++) {
			// 1 ~ 45까지의 숫자를
			int num = (int)(Math.random() * 45) + 1;
			// 셋 컬렉션에 저장한다.
			set.add(new Integer(num));
		}
		
		// HashSet은 비순차적 메모리 구조이기 떄문에 정렬된 상태를 저장할 수 없음. (List나 TreeSet으로 바꾸어 정렬해야 한다.)
		// 1. 리스트로 변환한 후 sort 메소드를 사용한다.
		
		// set 객체의 값을 리스트 객체로 복사(배열 기반이므로 길이를 미리 지정할 수 있음.)
		List<Integer> list = new ArrayList<Integer>(set);
		Collections.sort(list);	// 리스트에 저장된 값 정렬 (cf. s가 붙지 않은 Collection과 헷갈리지 말기)
		Collections.reverse(list); // 내림차순(뒤집기)
		
		// Iterator<Integer> i = set.iterator();
		Iterator<Integer> i = list.iterator();	// 리스트 반복자를 반환(list도 iterator가 있구나)
		while(i.hasNext()) {
			int n = i.next();
			System.out.print(n + " ");
		}
		System.out.println();
		
		// 2. 트리셋으로 변환하면 자동 정렬된다.
		set = new TreeSet(set);
		i = set.iterator();
		while(i.hasNext()) {
			int n = i.next();
			System.out.print(n + " ");
		}
	}
}
