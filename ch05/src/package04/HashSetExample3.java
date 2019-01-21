package package04;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample3 {
	public static void main(String[] args) {
		/* 나이키 신발의 상품번호, 상품이름을 등록해야 한다. 
		 * (상품번호가 중복된 값은 저장할 수 없다.)				 */
		HashSet<Nike> shoes = new HashSet<Nike>();
		// 나이키(상품번호, "상품이름");
		shoes.add(new Nike(1, "맥스95"));
		shoes.add(new Nike(2, "맥스97"));
		shoes.add(new Nike(1, "맥스96")); // 등록 불가능
		
		// 상품 1번이 있으면 true 없으면 false
		/* contains나 remove등의 메소드 뒤에는
		 * '1' 같은 상품번호가 바로오면 안되고 항상 아래와 같이 객체의 형태로 들어가야한다. */
		if(shoes.contains(new Nike(1))) {
			System.out.println("등록되어 있습니다.");
		}
		
		Iterator<Nike> i = shoes.iterator();
		while(i.hasNext()) {
			Nike nike = i.next();
			System.out.println("상품 번호 : " + nike.getNumber());
			System.out.println("상품 이름 : " + nike.getName());
		}
	}
}
