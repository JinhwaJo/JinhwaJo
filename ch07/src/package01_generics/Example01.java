package package01_generics;

class Box1 {	// ���׸��� �������� ���� Ŭ����
	private Object item;	// ���׸��� ���ٸ�? Object Ŭ������ ������ Ȱ��(Object�� ��� Ŭ������ �����̹Ƿ�)
	
	public void setItem(Object item) {
		this.item = item;
	}
	
	public Object getItem() {
		return this.item;
	}
}

class Box2<T> {	// ���׸��� �ִ� Ŭ���� ����
	private T item;
	// public static T[] itemArray; ����1) static ������� �Ķ���� Ÿ���� ����� �� ����.
	
	public void setItem(T item) {
		this.item = item;
	}
	
	public T getItem() {
		return this.item;
	}
	
	// T[] toArray() {
		// ����2) T[] tmpArr = new T[itemArray.length]; �迭�� ������ ���� ����� �� ����.
	// }
}

class Japanese {
	
}

public class Example01 {
	public static void main(String[] args) {
		/* ���׸��� �پ��� Ÿ���� ��ü���� ó���ϴ� �޼ҵ峪 �÷��� Ŭ��������
		 * ������ �� Ÿ���� üũ�ϴ� ����� ���Ѵ�.
		 * ���α׷� ���� ���� Ÿ���� ���س��� ������ ��ü ������ �������� �� ��ȯ��
		 * ���ŷο��� ���� �� �ִ�.		 */
	Box1 box1 = new Box1();
	box1.setItem(new Japanese());	// �Ϻ� ��ü�� �ڽ��� �����Ѵ�.
	// Object�� ���׸����� ���� ���� �� get �޼ҵ带 �������� ���� Ÿ�� ��ȯ�� ������Ѵ�.
	// ���� Ÿ�� ��ȯ�� �ʿ��� ���� : Ÿ���� ������ ���� �ʱ� ����.( = � Ÿ���� ������ �� ��)
	Japanese j = (Japanese)box1.getItem();	// �Ϻ� ��ü�� ��ȯ�Ѵ�.
	
	Box2<Japanese> box2 = new Box2<Japanese>();
	box2.setItem(new Japanese());
	Japanese j2 = box2.getItem();	// ���� Ÿ�� ��ȯ�� �ʿ䰡 ����.
			
	}
}
