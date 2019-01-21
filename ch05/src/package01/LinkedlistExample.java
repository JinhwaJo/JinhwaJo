package package01;

import java.util.LinkedList;
import java.util.List;

public class LinkedlistExample {
	public static void main(String[] args) {
		/* List뒤 <>(꺽새)에는 클래스형만 넣을 수 있다. (scores라서 int를 넣을 것 같지만 못 넣는다.)
		 * 이를 위해 Java에서 Integer와 같은 Wrapper 클래스를 생성해 놓았다.
		 * Integer는 int를 감싸고 있는 객체이다.
		 * List를 배웠다고 이것만 사용한다고 생각하지말자. 길이가 정해져 있을 때는 컬렉션보다 배열이 더 유용하다. */
		
		/* List형 컬렉션은 사용방법이 동일하므로,
		 * 아래의 LinkedList를 Vector로 변경해도 아무런 오류가 발생하지 않는다.	 */
		List<Integer> scores = new LinkedList<Integer>();
		// 이전엔 scores.add(new Integer(5)); 처럼 fullname으로 적었으나, autoboxing이 생겨서 생략이 가능하다.
		scores.add(77);	// scores[0] = 77;
		scores.add(88);	// scores[1] = 88;
		scores.add(55);	// scores[2] = 55;
		scores.add(44);	// scores[3] = 44;
		
		scores.clear(); // 초기화
		// is는 뒤의 내용이 맞는지 확인하겠다는 의미이고, 주로 결과 값으로 true나 false를 반환한다.
		/* boolean 타입의 필드의 getter, setter를 만들면,
		 * set은 정상으로 만들어지지만 get은 생성이 불가해서 아래 is의 형태로 사용한다. */
		if(scores.isEmpty()) {	// 비어 있으면 true 아니면 false
			System.out.println("리스트가 비어 있습니다.");
		} else {
			System.out.println(scores.size() + "개의 데이터가 있습니다.");
		}
	}
}
