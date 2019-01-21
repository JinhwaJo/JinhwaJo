package package01;

import java.util.LinkedList;
import java.util.List;

public class LinkedlistExample {
	public static void main(String[] args) {
		/* List�� <>(����)���� Ŭ�������� ���� �� �ִ�. (scores�� int�� ���� �� ������ �� �ִ´�.)
		 * �̸� ���� Java���� Integer�� ���� Wrapper Ŭ������ ������ ���Ҵ�.
		 * Integer�� int�� ���ΰ� �ִ� ��ü�̴�.
		 * List�� ����ٰ� �̰͸� ����Ѵٰ� ������������. ���̰� ������ ���� ���� �÷��Ǻ��� �迭�� �� �����ϴ�. */
		
		/* List�� �÷����� ������� �����ϹǷ�,
		 * �Ʒ��� LinkedList�� Vector�� �����ص� �ƹ��� ������ �߻����� �ʴ´�.	 */
		List<Integer> scores = new LinkedList<Integer>();
		// ������ scores.add(new Integer(5)); ó�� fullname���� ��������, autoboxing�� ���ܼ� ������ �����ϴ�.
		scores.add(77);	// scores[0] = 77;
		scores.add(88);	// scores[1] = 88;
		scores.add(55);	// scores[2] = 55;
		scores.add(44);	// scores[3] = 44;
		
		scores.clear(); // �ʱ�ȭ
		// is�� ���� ������ �´��� Ȯ���ϰڴٴ� �ǹ��̰�, �ַ� ��� ������ true�� false�� ��ȯ�Ѵ�.
		/* boolean Ÿ���� �ʵ��� getter, setter�� �����,
		 * set�� �������� ����������� get�� ������ �Ұ��ؼ� �Ʒ� is�� ���·� ����Ѵ�. */
		if(scores.isEmpty()) {	// ��� ������ true �ƴϸ� false
			System.out.println("����Ʈ�� ��� �ֽ��ϴ�.");
		} else {
			System.out.println(scores.size() + "���� �����Ͱ� �ֽ��ϴ�.");
		}
	}
}
