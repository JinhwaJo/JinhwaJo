package package03_generics;

import java.util.ArrayList;

class Asia {
	public String toString() {
		return "�ƽþ�";
	}
}
// �ƽþ� �����̸鼭 ������ ������ ����
class Korea extends Asia implements Exportable {
	public String toString() {
		return "���ѹα�";
	}
}
//�ƽþ� �����̳� ������ �Ұ����� ����
class Vietnam extends Asia {
	public String toString() {
		return "��Ʈ��";
	}
}
// �ƽþ� ������ �ƴ����� ������ ������ ����
class America implements Exportable {
	public String toString() {
		return "�̱�";
	}
}

//Ŭ������ �ƴѵ� �θ�� ������ �� �ִ� �������̽��� ����
interface Exportable {	// ���� ������
	
}

// ���ѵ� ���׸� �Ķ���� Ÿ���� ������ �� �ִ�.
// class Box<T extends Exportable> ������ ������ Ŭ���� Ÿ�Ը� ����
// ���ѵ� ���׸� �Ķ���� Ÿ���� ������ ���� implements�� �ƴ� extends�� ����Ѵٴ� ���� ����� ��!!
class Box<T extends Asia & Exportable> {	// �ƽþ� �����̸鼭 ������ ������ Ŭ���� Ÿ�Ը� ����
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
public class Example04 {
	public static void main(String[] args) {
		// Box<Asia> aBox = new Box<Asia>();
		Box<Korea> kBox = new Box<Korea>();	// �ƽþ� �����̸鼭 ������ ������ Ŭ���� Ÿ�Ը� ����
		// Box<Vietnam> vBox = new Box<Vietnam>();
		// Box<America> amBox = new Box<America>();
	}
}
