package package06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class HashSetExample4_my {
	public static Set<Movie_my> set = new HashSet<Movie_my>();
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		/* 영화 클래스(순위, 제목(중복 기준), 평점, 관객수)를 작성하고,
		 * 1. 영화 등록 : 입력 받은 영화의 관객수에 따라 순위가 정해져야 함.
		 * 2. 순위 순 : 오름차순
		 * 3. 제목 순 : 내림차순
		 * 4. 평점 순 : 오름차순
		 * 5. 종료		 */
		
		while(true) {
			System.out.println("[ 주말엔 영화를!! CGV 입니다. ]");
			System.out.println("1. 영화 등록");
			System.out.println("2. 현재 상영 영화 보기 (순위 순)");
			System.out.println("3. 현재 상영 영화 보기 (제목 순)");
			System.out.println("4. 현재 상영 영화 보기 (평점 순)");
			System.out.println("5. 종료");
			int select = sc.nextInt();
			switch(select) {
			case 1:
				registration(); break;	// 영화 등록 메소드
			case 2:
				rank_asc(); break;		// 순위순 오름차순 메소드
			case 3:
				title_desc(); break;	// 제목순 내림차순 메소드
			case 4:
				score_asc(); break;		// 평점순 오름차순 메소드
			case 5:
				System.exit(1);			// 종료
			
			}
		}
	}

	private static void rank_asc() {
		System.out.println("[ 현재 상영 영화 보기 (순위 순) ]");
		List<Movie_my> list = new ArrayList<Movie_my>(set);
		Collections.sort(list);
		Collections.reverse(list);
		
	}

	private static void registration() {	// 영화 등록 메소드
		System.out.println("[ 영화 등록 ]");
		System.out.print("제목 : ");
		String title = sc.next();
		System.out.print("평점 : ");
		double score = sc.nextDouble();
		System.out.print("관객수 : ");
		int audience = sc.nextInt();
		Movie_my movie = new Movie_my (title, score, audience);
		if(set.contains(new Movie_my(title))) {
			System.out.println("해당 영화는 이미 등록되어 있습니다.");
			return;
		}
		set.add(movie);
		System.out.println("영화가 등록되었습니다.");
		
	}
}
