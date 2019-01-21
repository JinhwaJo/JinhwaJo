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
		/* ��ȭ Ŭ����(����, ����(�ߺ� ����), ����, ������)�� �ۼ��ϰ�,
		 * 1.��ȭ ��� : �Է� ���� ��ȭ�� �������� ���� ������ �������� ��.
		 * 2.���� �� : ��������
		 * 3.���� �� : ��������
		 * 4.���� �� : ��������
		 * 5.����									 	*/
		while(true) {
			System.out.println("---------------------");
			System.out.println("1.��ȭ ���(����,����,������)");
			System.out.println("2.���� ��");
			System.out.println("3.���� ��");
			System.out.println("4.���� ��");
			System.out.println("5.����");
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

	private static void rankList() {			// ���� ��
		List<Movie> list = new ArrayList<Movie>(movies);
		Collections.sort(list);
		Iterator<Movie> i = list.iterator();
		while(i.hasNext()) {
			Movie movie = i.next();
			System.out.println(movie.getRank() + "�� : " + movie.getTitle() 
			+ "("+movie.getAudience()+", ���� "+ movie.getRate() + ")");
		}
	}
	
	private static void titleList() {			// ���� ��
		List<Movie> list = new ArrayList<Movie>(movies);
		Collections.sort(list, new TitleComparator());
		Collections.reverse(list);
		Iterator<Movie> i = list.iterator();
		while(i.hasNext()) {
			Movie movie = i.next();
			System.out.println(movie.getRank() + "�� : " + movie.getTitle() 
			+ "("+movie.getAudience()+", ���� "+ movie.getRate() + ")");
		}
	}
	
	private static void rateList() {			// ���� ��
		List<Movie> list = new ArrayList<Movie>(movies);
		Collections.sort(list, new RateComparator());
		Iterator<Movie> i = list.iterator();
		while(i.hasNext()) {
			Movie movie = i.next();
			System.out.println(movie.getRank() + "�� : " + movie.getTitle() 
			+ "("+movie.getAudience()+", ���� "+ movie.getRate() + ")");
		}
	}

	private static void registration() {		// ��ȭ ���
		sc.nextLine();
		System.out.print("���� : ");
		String title = sc.nextLine();
		System.out.print("���� : ");
		double rate = sc.nextDouble();
		System.out.print("������ : ");
		int audience = sc.nextInt();
		// �ش� ���� ��ȭ�� ������
		if(movies.contains(new Movie(title))) {
			System.out.println(title + " (��)�� �̹� ��ϵǾ� �ֽ��ϴ�.");
			return;
		}
		Iterator<Movie> i = movies.iterator();
		int rank = movies.size() + 1;
		while(i.hasNext()) {
			Movie target = i.next();
			if(audience > target.getAudience()) {
				// �̹� ����Ǿ� �ִ� ��ȭ�� �������� �� ������ �Է��� ��ȭ�� ��ŷ�� �ø���.
				rank--;
				// ���� �ִ� ��ȭ�� ������ 1�����ؾ� �Ѵ�.
				target.setRank(target.getRank() + 1);
			} 
		}
		movies.add(new Movie(rank, title, rate, audience));
	}
}
