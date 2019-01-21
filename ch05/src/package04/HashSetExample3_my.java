package package04;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample3_my {
	public static void main(String[] args) {
		/* 나이키 신발의 상품번호, 상품이름을 등록해야 한다.
		 * (상품번호가 중복된 값은 저장할 수 없다.)		 */
		HashSet<Nike_my> shoes = new HashSet<Nike_my>();
		// 나이키(상품번호, "상품이름");
		shoes.add(new Nike_my(1, "맥스95"));
		shoes.add(new Nike_my(2, "맥스97"));
		shoes.add(new Nike_my(1, "맥스96"));	// 등록 불가능
		
		System.out.println(new Nike_my(1, "맥스95"));
		System.out.println(new Nike_my(2, "맥스97"));
		System.out.println(new Nike_my(1, "맥스96"));
		
		Iterator<Nike_my> i = shoes.iterator();
		while(i.hasNext()) {
			Nike_my nike = i.next();
			System.out.println("상품 번호 : " + nike.getNumber());
			System.out.println("상품 이름 : " + nike.getName());
		}
	}
}
