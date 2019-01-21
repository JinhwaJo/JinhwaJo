package package05_1_generics;

import java.util.ArrayList;

class Hyundai {	// 1-1. Hyundai Ŭ���� ����
	}

class Factory { // 4. Factory Ŭ���� ����
	/* 4. ����� ������ ���� carList �ʵ� ����
	 * ��� �Ķ���� Ÿ���� �� �� ������ �� ���� ������ ���׸� �ȿ� ���ϵ�ī��(?)�� ����.
	 * <? extends Hyundai> �� Hyundai�� Hyundai�� �ڼ� Ŭ������ ���׸��� ���� �� �ְ� �����ϴ� ���̴�.
	 * "CarList<? extends Hyundai>" ��ü�� carList �ʵ带 �ٸ��ִ� �ڷ����̶� ��������.	 */
	private CarList<? extends Hyundai> carList;	
	
	// 5. set �޼ҵ� ����
	public void setCarList(CarList<? extends Hyundai> carList) {
		this.carList = carList;
	}
	// ���� ��ɸ� �ʿ��ϹǷ� get �޼ҵ�� ���� ������ �ʿ� ������, Set-Get ¦�� ���ߵ��� �غ���. 
	public CarList<? extends Hyundai> getCarList() {
		return this.carList;
	}
	/* 6. info �޼ҵ� ����
	 * ����� �����͸� �̾Ƴ��ų� �ϴ� ���� �ƴ� ��±�ɸ� �ʿ��ϹǷ� ������ ��ȯ�� ���� void�� ���ش�.
	 * CarList Ŭ���� ���� ������ �÷��� List�� ���������, ������ �����ϴ� ��ü�� carList�̹Ƿ� 
	 * ���������� carList���� toString �޼ҵ带 ����Ͽ� ��¹��� �ϼ��Ѵ�.	 */
	public void info() {
		System.out.println(carList.toString() + " �� ���忡 �ֽ��ϴ�.");
	}
}
//2-1. Sonata, Cona, Sm5 Ŭ���� �����ϰ�, Hyundai�� ���׸��� ���� ������ Ŭ������ ��� ����
class Sonata extends Hyundai {	
	public String toString() {
		return "�Ÿ";
	}
}
class Cona extends Hyundai {
	public String toString() {
		return "�ڳ�";
	}
}
class Sm5 {
	public String toString() {
		return "SM5";
	}
}

class CarList<T> {	// 1-2. ���׸��� ���� CarList Ŭ������ �����ϰ�, (���� ���� �� �𸣹Ƿ�) T�� ���׸����� Ŭ������ ���� �� �ֵ��� �������ش�. 
	ArrayList<T> list = new ArrayList<T>();
	// 2-2. add �޼ҵ带 �������ش�.
	void add(T item) {
		list.add(item); // ������(������) �߰�
	}
	// 3. �÷��� �� list�� ��ü ���� �Ǿ� �ִ� toString �޼ҵ忡 ����, [A, B]�� ���·� ��µȴ�.
	public String toString() {
		return list.toString();	// ����Ʈ�� ������(������)���� ���ڿ��� ��ȯ
	}
}
public class Example06_my {
	public static void main(String[] args) {
		// 1. ���׸��� ���� CarList��� Ŭ������ �� ���׸� �ȿ� �� Hyundai Ŭ���� �����Ǿ�� ��.
		CarList<Hyundai> carlist = new CarList<Hyundai>();
		// 2. Sonata, Cona, Sm5 Ŭ������ �����Ǿ���ϰ�, add �޼ҵ��� ����� �����ؾ� �Ѵ�. 
		carlist.add(new Sonata());	// ����Ʈ �߰� ����
		carlist.add(new Cona());	// ����Ʈ �߰� ����
		// carlist.add(new Sm5());		// ����Ʈ �߰� �Ұ���
		// 3. �������� �䱸�� "[�Ÿ, �ڳ�]" ���·� ��µ� �� �ֵ��� CarList Ŭ�������� ���� ������ �ʿ���.
		System.out.println(carlist.toString()); // "[�Ÿ, �ڳ�]"�� ��µǾ�� ��.
		// 4. Factory Ŭ���� ���� ���.
		Factory factory = new Factory();
		// 5. Factory Ŭ���� ���� Set �޼ҵ� ���� ���.
		factory.setCarList(carlist);
		// 6. ��� ����� ���� Factory Ŭ���� ���� info �޼ҵ� ����
		factory.info(); // "[�Ÿ, �ڳ�]" �� ���忡 �ֽ��ϴ�."�� ��µǾ�� ��.
	}
}
