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
		/* �ܾ �Է� �ް�, �������� �����Ͽ� ����Ͻÿ�.
		 * (exit�� �Է��ϸ� �ݺ����� �����ؾ���!)
		 * (��, ����� �ܾ�� �ߺ��Ǹ� �� ��!!)		 */
		
		Set<String> words = new HashSet<String>();
		Scanner sc = new Scanner(System.in);
		
		// �ܾ �ݺ��Ͽ� �Է�
		String word = null; 
		/* �ܾ� �Է��� Ƚ���� �˼� ������ for������ while���� ����.
		 * �Ʒ�ó�� for���� �ᵵ ���࿡ ������ ����.
		
		for(int i = 0; words.size() < words.size() + 1; i++) {
		 	System.out.print("�ܾ �Է��Ͻÿ�. : ");
			word = sc.next();
			if(word.equals("exit")) {
				break;
			}
			words.add(word);
		}*/
		while(true) {
			System.out.print("�ܾ �Է��Ͻÿ�. : ");
			word = sc.next();
			if(word.equals("exit")) {
				break;
			}
			words.add(word);
		}
			// ����Ʈ�� �ܾ���� ����
			List<String> list = new ArrayList<String>(words);
			Collections.sort(list);	// ����Ʈ�� ����� �� ����
			/* Iterator<String> i = list.iterator();
			while(i.hasNext()) {
				String n = i.next();
				System.out.println(n + " "); */
			for(int i = 0; i < list.size(); i++) {
				System.out.println((i + 1) + " : " + list.get(i));
		}
	}
}

