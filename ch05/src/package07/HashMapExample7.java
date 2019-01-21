package package07;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
public class HashMapExample7 {
	public static void main(String[] args) {
		/* ���� ) �� �÷����� �̿��� �л� �̸��� ������ �Է� �ް�,
		 * �հ�, �ִ밪, �ּҰ��� ����Ͻÿ�.
		 * (��, entrySet �� ����غ���)		
		 * 
		 * �л� �� �Է� : 3
		 * 
		 * �̸� : ȫ�浿
		 * ���� : 66
		 * �̸� : ���浿
		 * ���� : 55
		 * �̸� : �ϱ浿
		 * ���� : 77
		 * 
		 * �հ� : ? ��, ��� : ? �� 
		 * �ְ� ���� : ? ��
		 * �ּ� ���� : ? ��	 					 */
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> students = new HashMap<String, Integer>(); 
		
		System.out.print("�л� �� �Է� : ");
		int count = sc.nextInt();
		System.out.println();
		
		for( ; students.size() < count ; ) {
			sc.nextLine();
			System.out.print("�̸� �Է� : ");
			String name = sc.next().trim();
			System.out.print("���� �Է� : ");
			int score = sc.nextInt();
			students.put(name, score);  // �Է� ���� �̸��� ������ �����Ѵ�.
			System.out.println();
		}
		
		Set<Map.Entry<String, Integer>> set = students.entrySet();
		Iterator<Map.Entry<String, Integer>> i = set.iterator();
		int sum = 0, max = 0, min = 0;
		if(i.hasNext()) {
			// ó�� ��Ʈ�� ���� �����س��´�.
			Map.Entry<String, Integer> entry = i.next();
			sum = entry.getValue();		// ù ��Ʈ���� ���� ��ȯ�Ѵ�.
			max = entry.getValue();
			min = entry.getValue();
			while(i.hasNext()) {
				entry = i.next();  // ó�� ��Ʈ�� ���� ��Ʈ���� ��ȯ�Ѵ�.
				int score = entry.getValue();
				sum += score;	 	// �հ�
				if(max < score) {	// �ִ� ��
					max = score;
				}
				if(min > score) {	// �ּ� ��
					min = score;
				}
			}
		}
		
		double avg = (double)sum / students.size();
		System.out.println("�հ� : " + sum + ", ��� : " + avg);
		System.out.println("�ְ� ���� : " + max);
		System.out.println("�ּ� ���� : " + min);
	}
}





