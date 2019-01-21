package package01;

import java.util.ArrayList;
import java.util.List;

public class ArraylistExample {
	public static void main(String[] args) {
		/* List형 컬렉션은 사용방법이 동일하므로,
		 * 아래와 같이 ArrayList를 LinkedList로 변경해도 아무런 오류가 발생하지 않는다.
		 * List<String> list = new LinkedList<String>();	 */
		
		/* 리스트 생성(Ctrl + Shift + O 한 다음 util을 선택해서 오토마이징해준다.)
		 * <>(꺽새) 가 붙어서 파라미터(parameter)라고 하며, 안에 어떤 자료형의 클래스를 저장할 지 입력해준다.
		 * String을 넣으면 문자열만 저장한 배열을 일컫는다. (String도 클래스다. 헷갈리면 대문자로 시작하면 클래스라고 생각하자) */
		List<String> list = new ArrayList<String>();
		list.add("C");
		list.add("C++");
		list.add(0, "Java");
		list.add("Python");
				
		int size = list.size();	// size 메소드는 저장된 데이터의 개수 반환
		System.out.println("객체 수 : " + size);
		System.out.println();
		
		String language = list.get(2);	// 인덱스2의 값을 반환
		System.out.println("list[2] = " + language);
		System.out.println();
		
		// 리스트는 순서가 있으므로, 인덱스로 값을 사용할 수 있다.
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println("list["+i+"] = " + str);
		}
		System.out.println();
		
		list.remove(2);	// 인덱스2의 값 삭제
		list.remove(2);	// 인덱스2의 값 삭제
		/* 삭제할 때마다 배열을 재 생성하므로, 인덱스 [2]에 저장되어 있던 C++의 삭제하면 1칸이 줄어들어
		 * 3칸을 가진 배열을 재 생성한 후[2]에 Python이 저장되고 [0]=Java,[1]=C,[2]=Python의 형태가 된다.
		 * 여기서 또 Python이 저장되어 있는 인덱스 [2]를 삭제하면, 1칸이 줄어든 배열을 재 성성하게 되어
		 * [0]=Java,[1]=C 의 형태를 가진 배열이 된다. */
		
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println("list["+i+"] = " + str);
		}
		System.out.println();
	}
}
