package package01_generics;

import java.util.ArrayList;

class Asia {
	public String toString() {
		return "아시아";
	}
}
class Korea extends Asia {
	public String toString() {
		return "대한민국";
	}
}
class Vietnam extends Asia {
	public String toString() {
		return "베트남";
	}
}
class America {
	public String toString() {
		return "미국";
	}
}

class Box<T> {	// T는 Asia라고 생각해야한다. (Asia를 넣었으니까)
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) {
		list.add(item);	// 아이템(데이터) 추가
	}
	T get(int i) {
		return list.get(i);	// 인덱스를 이용해 아이템(데이터) 반환
	}
	ArrayList<T> getList() {
		return list;	// 리스트 자체를 반환
	}
	int size() {
		return list.size();	// 아이템(데이터) 개수를 반환
	}
	public String toString() {
		return list.toString();	// 리스트에 아이템(데이터)들을 문자열로 반환
	}
}

public class Example02 {
	public static void main(String[] args) {
		// 파라미터 타입(부모(Asia))
		Box<Asia> asiaBox = new Box<Asia>();
		asiaBox.add(new Korea());	// 자식(Korea) 저장 가능
		asiaBox.add(new Vietnam());	// 자식(Vietnam) 저장 가능
		// asiaBox.add(new America()); // 저장 불가능
		
		Box<Korea> korBox = new Box<Korea>();
		korBox.add(new Korea());
		// korBox.add(new Asia()); // 저장 불가능 (부모라서)
		// korBox.add(new Vietnam()); // 저장 불가능 (자식이 아니라서)
		// korBox.add(new America()); // 저장 불가능 (얜 자식도 부모도 아니니까)
		System.out.println(korBox.toString());
	}
}
