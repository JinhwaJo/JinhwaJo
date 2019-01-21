package package04;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample1 {
	public static void main(String[] args) {
		Set<Integer> hashSet = new HashSet<Integer>();
		
		hashSet.add(10);
		hashSet.add(20);
		hashSet.add(30);
		// 중복을 허용하지 않으므로, 중복 저장해도 20이 한번만 뜬다.
		hashSet.add(20);	// 중복 저장
		hashSet.add(40);
		
		hashSet.remove(20);	// 20 삭제
		
		System.out.println("HashSet : ");
		
		// 해시셋 자료형은 인덱스(순서가 없으므로(= 인덱스가 없으면), 반복자 사용)
		// hasNext : 데이터가 있는 메모리까지 true를 반환, 없으면 false
		// next : 메모리에 있는 값을 반환
		Iterator<Integer> iter = hashSet.iterator();
		while(iter.hasNext()) {	// iter가 참조하는 메모리가 없으면 false
			int n = iter.next();	// 값을 하나씩 반복할 때마다 전달
			System.out.print(n + " ");
		}
		System.out.println("반복문 종료");
	}
}
