package package07;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
public class HashMapExample7 {
	public static void main(String[] args) {
		/* 문제 ) 맵 컬렉션을 이용해 학생 이름과 점수를 입력 받고,
		 * 합계, 최대값, 최소값을 출력하시오.
		 * (단, entrySet 을 사용해보기)		
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
		 * 최소 점수 : ? 점	 					 */
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> students = new HashMap<String, Integer>(); 
		
		System.out.print("학생 수 입력 : ");
		int count = sc.nextInt();
		System.out.println();
		
		for( ; students.size() < count ; ) {
			sc.nextLine();
			System.out.print("이름 입력 : ");
			String name = sc.next().trim();
			System.out.print("점수 입력 : ");
			int score = sc.nextInt();
			students.put(name, score);  // 입력 받은 이름과 점수를 저장한다.
			System.out.println();
		}
		
		Set<Map.Entry<String, Integer>> set = students.entrySet();
		Iterator<Map.Entry<String, Integer>> i = set.iterator();
		int sum = 0, max = 0, min = 0;
		if(i.hasNext()) {
			// 처음 엔트리 값을 저장해놓는다.
			Map.Entry<String, Integer> entry = i.next();
			sum = entry.getValue();		// 첫 엔트리의 값을 반환한다.
			max = entry.getValue();
			min = entry.getValue();
			while(i.hasNext()) {
				entry = i.next();  // 처음 엔트리 이후 엔트리를 반환한다.
				int score = entry.getValue();
				sum += score;	 	// 합계
				if(max < score) {	// 최대 값
					max = score;
				}
				if(min > score) {	// 최소 값
					min = score;
				}
			}
		}
		
		double avg = (double)sum / students.size();
		System.out.println("합계 : " + sum + ", 평균 : " + avg);
		System.out.println("최고 점수 : " + max);
		System.out.println("최소 점수 : " + min);
	}
}





