package package01_generics;

import java.util.ArrayList;

class Asia {
	public String toString() {
		return "�ƽþ�";
	}
}
class Korea extends Asia {
	public String toString() {
		return "���ѹα�";
	}
}
class Vietnam extends Asia {
	public String toString() {
		return "��Ʈ��";
	}
}
class America {
	public String toString() {
		return "�̱�";
	}
}

class Box<T> {	// T�� Asia��� �����ؾ��Ѵ�. (Asia�� �־����ϱ�)
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) {
		list.add(item);	// ������(������) �߰�
	}
	T get(int i) {
		return list.get(i);	// �ε����� �̿��� ������(������) ��ȯ
	}
	ArrayList<T> getList() {
		return list;	// ����Ʈ ��ü�� ��ȯ
	}
	int size() {
		return list.size();	// ������(������) ������ ��ȯ
	}
	public String toString() {
		return list.toString();	// ����Ʈ�� ������(������)���� ���ڿ��� ��ȯ
	}
}

public class Example02 {
	public static void main(String[] args) {
		// �Ķ���� Ÿ��(�θ�(Asia))
		Box<Asia> asiaBox = new Box<Asia>();
		asiaBox.add(new Korea());	// �ڽ�(Korea) ���� ����
		asiaBox.add(new Vietnam());	// �ڽ�(Vietnam) ���� ����
		// asiaBox.add(new America()); // ���� �Ұ���
		
		Box<Korea> korBox = new Box<Korea>();
		korBox.add(new Korea());
		// korBox.add(new Asia()); // ���� �Ұ��� (�θ��)
		// korBox.add(new Vietnam()); // ���� �Ұ��� (�ڽ��� �ƴ϶�)
		// korBox.add(new America()); // ���� �Ұ��� (�� �ڽĵ� �θ� �ƴϴϱ�)
		System.out.println(korBox.toString());
	}
}
