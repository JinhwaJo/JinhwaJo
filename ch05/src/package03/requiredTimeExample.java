package package03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class requiredTimeExample {
	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<String>();
		List<String> linkedList = new LinkedList<String>();
		/* 일반적으로 접근하면 ArrayList가 LinkedList보다 빠르지만,
		 * 순사적으로 접근하면 LinkedList가 더 빠르다. */
		// 여기서부터 배열 기반 리스트
		long start, end;	// 시작, 종료 시간
		start = System.nanoTime();	// 나노조(10억 분의 1초)
		for(int i = 0; i < 100000; i++) {
			arrayList.add(0, String.valueOf(i));
		}
		end = System.nanoTime();
		System.out.println("ArrayList 소요시간 : " + (end - start) + "ns");
		
		// 여기서부터 연결리스트 기반 리스트
		start = System.nanoTime(); 	// 나노조(10억 분의 1초)
		for(int i = 0; i < 100000; i++) {
			linkedList.add(0, String.valueOf(i));
		}
		end = System.nanoTime();
		System.out.println("LinkedList 소요시간 : " + (end - start) + "ns");
		
		// 순차적 접근 배열 기반 리스트
		start = System.nanoTime();
		for(int i = 0; i < 30000; i++) {
			arrayList.get(i);
		}
		end = System.nanoTime();
		System.out.println("ArrayList 소요시간 : " + (end - start) + "ns");
		
		// 순차적 접근 연결 기반 리스트
		start = System.nanoTime();
		for(int i = 0; i < 30000; i++) {
			linkedList.get(i);
		}
		end = System.nanoTime();
		System.out.println("LinkedList 소요시간 : " + (end - start) + "ns");
	}
}
