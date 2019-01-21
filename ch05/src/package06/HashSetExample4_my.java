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
		/* ��ȭ Ŭ����(����, ����(�ߺ� ����), ����, ������)�� �ۼ��ϰ�,
		 * 1. ��ȭ ��� : �Է� ���� ��ȭ�� �������� ���� ������ �������� ��.
		 * 2. ���� �� : ��������
		 * 3. ���� �� : ��������
		 * 4. ���� �� : ��������
		 * 5. ����		 */
		
		while(true) {
			System.out.println("[ �ָ��� ��ȭ��!! CGV �Դϴ�. ]");
			System.out.println("1. ��ȭ ���");
			System.out.println("2. ���� �� ��ȭ ���� (���� ��)");
			System.out.println("3. ���� �� ��ȭ ���� (���� ��)");
			System.out.println("4. ���� �� ��ȭ ���� (���� ��)");
			System.out.println("5. ����");
			int select = sc.nextInt();
			switch(select) {
			case 1:
				registration(); break;	// ��ȭ ��� �޼ҵ�
			case 2:
				rank_asc(); break;		// ������ �������� �޼ҵ�
			case 3:
				title_desc(); break;	// ����� �������� �޼ҵ�
			case 4:
				score_asc(); break;		// ������ �������� �޼ҵ�
			case 5:
				System.exit(1);			// ����
			
			}
		}
	}

	private static void rank_asc() {
		System.out.println("[ ���� �� ��ȭ ���� (���� ��) ]");
		List<Movie_my> list = new ArrayList<Movie_my>(set);
		Collections.sort(list);
		Collections.reverse(list);
		
	}

	private static void registration() {	// ��ȭ ��� �޼ҵ�
		System.out.println("[ ��ȭ ��� ]");
		System.out.print("���� : ");
		String title = sc.next();
		System.out.print("���� : ");
		double score = sc.nextDouble();
		System.out.print("������ : ");
		int audience = sc.nextInt();
		Movie_my movie = new Movie_my (title, score, audience);
		if(set.contains(new Movie_my(title))) {
			System.out.println("�ش� ��ȭ�� �̹� ��ϵǾ� �ֽ��ϴ�.");
			return;
		}
		set.add(movie);
		System.out.println("��ȭ�� ��ϵǾ����ϴ�.");
		
	}
}
