package package07;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HashMapExample7_my {
	public static void main(String[] args) {
		/* 문제) 맵 컬렉션을 이용해 학생 이름과 점수를 입력받고,
		 * 합계, 최대값, 최소값을 출력하시오.
		 * (단, entrySet을 사용해보기)
		 * 
		 * 학생 수 입력 : 3
		 * 
		 * 이름 : 홍길동
		 * 점수 : 66
		 * 이름 : 서길동
		 * 점수 : 55
		 * 이름 : 북길동
		 * 점수 : 77
		 * 
		 * 합계 : ? 점, 평균 : ? 점
		 * 최고 점수 : ? 점
		 * 최소 점수 : ? 점	 */
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.print("학생 수 입력 : ");
		int number = sc.nextInt();
		for(int i = 1; i <= number; i++) {
			System.out.print("이름 : ");
			String name  = sc.next();
			System.out.print("점수 : ");
			int score = sc.nextInt();
			map.put(name, score);
		}
		System.out.println();
						
		Set<Map.Entry<String, Integer>> set = map.entrySet();
		Iterator<Map.Entry<String, Integer>> i1 = set.iterator();
		while(i1.hasNext()) {
			Map.Entry<String, Integer> entry = i1.next();
			String name = entry.getKey();
			int score = entry.getValue();
			System.out.println("이름 : " + name);
			System.out.println("점수 : " + score);
			}
			System.out.println();
			
		Collection<Integer> scores = map.values();
		Iterator<Integer> i2 = scores.iterator();
		int sum = 0;
		while(i2.hasNext()) {
			int score = i2.next();
			sum += score;
		}
		double avg = (double)sum / map.size();
		System.out.println("합계 : " + sum + "점"+ ", "+ "평균 : " + avg + "점");
		System.out.println("최고 점수 : " + Collections.max(scores) + "점");
		System.out.println("최저 점수 : " + Collections.min(scores) + "점");
		
	}
}
