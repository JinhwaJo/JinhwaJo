package package06;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
public class HashSetExample4 {
	private static Set<Movie> movies = new HashSet<Movie>();
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		/* 영화 클래스(순위, 제목(중복 기준), 평점, 관객수)를 작성하고,
		 * 1.영화 등록 : 입력 받은 영화의 관객수에 따라 순위가 정해져야 함.
		 * 2.순위 순 : 오름차순
		 * 3.제목 순 : 내림차순
		 * 4.평점 순 : 오름차순
		 * 5.종료									 	*/
		while(true) {
			System.out.println("---------------------");
			System.out.println("1.영화 등록(제목,평점,관객수)");
			System.out.println("2.순위 순");
			System.out.println("3.제목 순");
			System.out.println("4.평점 순");
			System.out.println("5.종료");
			System.out.print(">> ");
			int select = sc.nextInt();
			switch(select) {
			case 1:
				registration();
				break;
			case 2:
				rankList();
				break;
			case 3:
				titleList();
				break;
			case 4:
				rateList();
				break;
			case 5:
				System.exit(1);
			}
		}
	}

	private static void rankList() {			// 순위 순
		List<Movie> list = new ArrayList<Movie>(movies);
		Collections.sort(list);
		Iterator<Movie> i = list.iterator();
		while(i.hasNext()) {
			Movie movie = i.next();
			System.out.println(movie.getRank() + "위 : " + movie.getTitle() 
			+ "("+movie.getAudience()+", 평점 "+ movie.getRate() + ")");
		}
	}
	
	private static void titleList() {			// 제목 순
		List<Movie> list = new ArrayList<Movie>(movies);
		Collections.sort(list, new TitleComparator());
		Collections.reverse(list);
		Iterator<Movie> i = list.iterator();
		while(i.hasNext()) {
			Movie movie = i.next();
			System.out.println(movie.getRank() + "위 : " + movie.getTitle() 
			+ "("+movie.getAudience()+", 평점 "+ movie.getRate() + ")");
		}
	}
	
	private static void rateList() {			// 평점 순
		List<Movie> list = new ArrayList<Movie>(movies);
		Collections.sort(list, new RateComparator());
		Iterator<Movie> i = list.iterator();
		while(i.hasNext()) {
			Movie movie = i.next();
			System.out.println(movie.getRank() + "위 : " + movie.getTitle() 
			+ "("+movie.getAudience()+", 평점 "+ movie.getRate() + ")");
		}
	}

	private static void registration() {		// 영화 등록
		sc.nextLine();
		System.out.print("제목 : ");
		String title = sc.nextLine();
		System.out.print("평점 : ");
		double rate = sc.nextDouble();
		System.out.print("관객수 : ");
		int audience = sc.nextInt();
		// 해당 제목 영화가 있으면
		if(movies.contains(new Movie(title))) {
			System.out.println(title + " (은)는 이미 등록되어 있습니다.");
			return;
		}
		Iterator<Movie> i = movies.iterator();
		int rank = movies.size() + 1;
		while(i.hasNext()) {
			Movie target = i.next();
			if(audience > target.getAudience()) {
				// 이미 저장되어 있는 영화의 관객수가 더 적으면 입력한 영화의 랭킹을 올린다.
				rank--;
				// 원래 있던 영화의 순위는 1증가해야 한다.
				target.setRank(target.getRank() + 1);
			} 
		}
		movies.add(new Movie(rank, title, rate, audience));
	}
}
