package package05;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample1 {
	public static void main(String[] args) {
		Set<Integer> scores = new HashSet<Integer>();
		scores.add(55);
		scores.add(66);
		scores.add(11);
		scores.add(22);
		scores.add(44);
		
		Iterator<Integer> iter = scores.iterator();
		System.out.println("[ HashSet을 순차적으로 반복했을 때 ]");
		while(iter.hasNext()) {
			int n = iter.next();
			System.out.println(n);
		}
		/**************************************************/
		scores = new TreeSet<Integer>();
		scores.add(55);
		scores.add(66);
		scores.add(11);
		scores.add(22);
		scores.add(44);
		iter = scores.iterator();
		System.out.println("[ TreeSet을 순차적으로 반복했을 때 ]");
		while(iter.hasNext()) {
			int n = iter.next();
			System.out.println(n);
		}
	}
}
