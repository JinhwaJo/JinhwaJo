package package06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
// import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashSetExample2 {
	public static void main(String[] args) {
		/* 단어를 입력 받고, 오름차순 정렬하여 출력하시오.
		 * (exit를 입력하면 반복문을 종료해야함!)
		 * (단, 저장될 단어는 중복되면 안 됨!!)		 */
		
		Set<String> words = new HashSet<String>();
		Scanner sc = new Scanner(System.in);
		
		// 단어를 반복하여 입력
		String word = null; 
		/* 단어 입력의 횟수를 알수 없으니 for문보다 while문을 쓴다.
		 * 아래처럼 for문을 써도 실행에 문제는 없다.
		
		for(int i = 0; words.size() < words.size() + 1; i++) {
		 	System.out.print("단어를 입력하시오. : ");
			word = sc.next();
			if(word.equals("exit")) {
				break;
			}
			words.add(word);
		}*/
		while(true) {
			System.out.print("단어를 입력하시오. : ");
			word = sc.next();
			if(word.equals("exit")) {
				break;
			}
			words.add(word);
		}
			// 리스트로 단어들을 저장
			List<String> list = new ArrayList<String>(words);
			Collections.sort(list);	// 리스트에 저장된 값 정렬
			/* Iterator<String> i = list.iterator();
			while(i.hasNext()) {
				String n = i.next();
				System.out.println(n + " "); */
			for(int i = 0; i < list.size(); i++) {
				System.out.println((i + 1) + " : " + list.get(i));
		}
	}
}

