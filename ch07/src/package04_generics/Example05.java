package package04_generics;

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

class Box<T> {
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) {
		list.add(item);
	}
	T get(int i) {
		return list.get(i);
	}
	ArrayList<T> getList() {
		return list;
	}
	int size() {
		return list.size();
	}
	public String toString() {
		return list.toString();
	}
}

class PacificOcean {	// ����� Ŭ����
	// �Ʒ��� ���� �ڽ��� ����ϴ� ����� ������ ��.
	Box<? extends Asia> box = new Box<Asia>();	// �ڽ� �ʵ�
// �Ű� ������ ���׸��� ���Ե� Ŭ���� Ÿ���� ��
// ���׸��� �Ķ���� Ÿ�Ը����δ� �����ε��� ������� �ʴ´�.
//	String toString(Box<Asia> box) {
//		return box.toString() + " �����";
//	}
//	String toString(Box<America> box) {
//		return box.toString() + " �����"
//	}
	// ? : ���ϵ� ī��(��� �Ķ���� Ÿ���� �� �� ������ �� ���� ������ ?�� ����.)
	// <? super Asia> : �Ķ���� Ÿ���� Asia �Ǵ� Asia ���� Ŭ������ �� �� �ִ�.
	// <? extends Asia> : �Ķ���� Ÿ���� Asia �Ǵ� Asia �ڼ� Ŭ������ �� �� �ִ�.
	String toString(Box<? extends Asia> box) {
		return box.toString() + " �����";
	}
	// �ڽ� ����
	void setBox(Box<? extends Asia> box) {
		this.box = box;
	}
	// �ڽ� ��ȯ
	Box<? extends Asia> getBox() {
		return box;
	}
}

public class Example05 {
	public static void main(String[] args) {
		PacificOcean po = new PacificOcean();
		
		Box<Asia> abox = new Box<Asia>();
		abox.add(new Asia());
		System.out.println(po.toString(abox));
		
		Box<Korea> kbox = new Box<Korea>();
		kbox.add(new Korea());
		System.out.println(po.toString(kbox));	// �ƽþ��� �ڼ��̹Ƿ� ����
		
		Box<America> ambox = new Box<America>();
		ambox.add(new America());
		// System.out.println(po.toString(ambox)); // �ƽþ��� �ڼ��� �ƴϹǷ� �Ұ���
	}
}
