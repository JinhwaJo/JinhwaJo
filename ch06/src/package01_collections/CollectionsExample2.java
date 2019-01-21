package package01_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExample2 {
	public static void main(String[] args) {
		// 1. 65, 77, 65, 88 을 리스트에 저장하시오.
		List<Integer> list = new ArrayList<Integer>();
		Collections.addAll(list, 65, 77, 65, 88);	
		System.out.println(list);
		
		// 2. 저장되어 있는 값들을 왼쪽으로 2칸 이동시키시오.
		Collections.rotate(list, 2);
		System.out.println(list);
		
		// 3. 값들을 내림차순 하시오.
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		
		// 4. 77이 저장된 값의 위치를 반환하시오.
		int idx = Collections.binarySearch(list, 77);
		System.out.println("77이 저장된 위치는 : list["+idx+"] 입니다.");
		
		// 5. 모든 값들을 리스트2에 저장하시오.
		// List<Integer> list2 = Collections.nCopies(list.size(), 1);
		List<Integer> list2 = new ArrayList<Integer>(list.size());
		System.out.println(list2);
		Collections.addAll(list2, 1, 1, 1, 1);
		System.out.println(list2);
		// 아래의 Collections.copy 사용 시, 오른쪽 칸에 ArrayList 같이 객체를 가진 형태는 올 수 없다.
		// Collections.copy(list2, list);
		System.out.println(list);
		System.out.println(list2);
		
		// 6. 리스트2에 65를 가진 값들을 55로 변경하시오.
		Collections.replaceAll(list2, 65, 55);
		System.out.println(list2);
		
		/* 7. if문을 이용해 두 리스트가 같은 값만 가지고 있는지 출력하시오.
		 * (같은 값만 가지고 있으면 성적표가 같습니다.)
		 * (다른 값을 가지고 있으면 성적표가 다릅니다.)를 출력		 */
		// 부분적으만 같아도 교집합 처리하여 같다고 할 수 있으므로, 양쪽 리스트를 모두 검사해야한다.
		// containsAll은 값을 하나하나 모두 비교하는 메소드
		if(list.containsAll(list2) && list2.containsAll(list)) {
			System.out.println("성적표가 같습니다.");
		} else {
			System.out.println("성적표가 다릅니다.");
		}
		
		if(list.equals(list2) && list2.equals(list)) {
			System.out.println("성적표가 같습니다.");
		} else {
			System.out.println("성적표가 다릅니다.");
		}
		
		
		
				
	}
}
