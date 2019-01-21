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
		/* ����) �� �÷����� �̿��� �л� �̸��� ������ �Է¹ް�,
		 * �հ�, �ִ밪, �ּҰ��� ����Ͻÿ�.
		 * (��, entrySet�� ����غ���)
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
		 * �ּ� ���� : ? ��	 */
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.print("�л� �� �Է� : ");
		int number = sc.nextInt();
		for(int i = 1; i <= number; i++) {
			System.out.print("�̸� : ");
			String name  = sc.next();
			System.out.print("���� : ");
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
			System.out.println("�̸� : " + name);
			System.out.println("���� : " + score);
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
		System.out.println("�հ� : " + sum + "��"+ ", "+ "��� : " + avg + "��");
		System.out.println("�ְ� ���� : " + Collections.max(scores) + "��");
		System.out.println("���� ���� : " + Collections.min(scores) + "��");
		
	}
}
