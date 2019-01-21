package package01_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExample1 {
	public static void main(String[] args) {
		// Collections API : 컬렉션을 다룰 때 사용하는 클래스와 메소드를 말한다.
		List<Integer> list = new ArrayList<Integer>();
		System.out.println(list); // 비어 있음.
		
		Collections.addAll(list, 1, 2, 3, 4, 5);	// 리스트에 한번에 다수의 값을 저장할 때
		System.out.println(list); // 1, 2, 3, 4, 5 가 리스트에 저장되어 있음.
		
		Collections.rotate(list, 2); // 오른쪽으로 두 칸씩 이동
		System.out.println(list);
		
		Collections.shuffle(list); // 저장된 요소(값)의 위치를 임의로 변경
		System.out.println(list);
		
		// 오름차순이 아닌 내림차순으로 정렬
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		
		int idx = Collections.binarySearch(list,3); // 3이 저장된 위치(index)를 반환
		System.out.println("3이 저장된 위치는 : list[" + idx + "] 입니다.");
		
		System.out.println(Collections.max(list)); // 최대 값
		System.out.println(Collections.min(list)); // 최소 값
		
		Collections.fill(list, 9); // list의 요소값들을 모두 9로 채움.
		System.out.println(list);
		
		// list와 같은 크기의 newList를 생성하고, 2로 채움.
		List<Integer> newList = Collections.nCopies(list.size(), 2);
		System.out.println(newList);
		
		// 공통된 요소가 없으면 true 있으면 false
		System.out.println(Collections.disjoint(list, newList));
		
		Collections.copy(list, newList); // newList의 값들을 list로 복사
		System.out.println(newList);
		System.out.println(list);
		
		Collections.replaceAll(list, 2, 1); // list에 요소가 2인 값을 1로 모두 대체(변경)
		System.out.println(list);
	
	}
}
