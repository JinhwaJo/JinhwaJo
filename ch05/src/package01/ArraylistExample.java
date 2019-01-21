package package01;

import java.util.ArrayList;
import java.util.List;

public class ArraylistExample {
	public static void main(String[] args) {
		/* List�� �÷����� ������� �����ϹǷ�,
		 * �Ʒ��� ���� ArrayList�� LinkedList�� �����ص� �ƹ��� ������ �߻����� �ʴ´�.
		 * List<String> list = new LinkedList<String>();	 */
		
		/* ����Ʈ ����(Ctrl + Shift + O �� ���� util�� �����ؼ� ���丶��¡���ش�.)
		 * <>(����) �� �پ �Ķ����(parameter)��� �ϸ�, �ȿ� � �ڷ����� Ŭ������ ������ �� �Է����ش�.
		 * String�� ������ ���ڿ��� ������ �迭�� ���´´�. (String�� Ŭ������. �򰥸��� �빮�ڷ� �����ϸ� Ŭ������� ��������) */
		List<String> list = new ArrayList<String>();
		list.add("C");
		list.add("C++");
		list.add(0, "Java");
		list.add("Python");
				
		int size = list.size();	// size �޼ҵ�� ����� �������� ���� ��ȯ
		System.out.println("��ü �� : " + size);
		System.out.println();
		
		String language = list.get(2);	// �ε���2�� ���� ��ȯ
		System.out.println("list[2] = " + language);
		System.out.println();
		
		// ����Ʈ�� ������ �����Ƿ�, �ε����� ���� ����� �� �ִ�.
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println("list["+i+"] = " + str);
		}
		System.out.println();
		
		list.remove(2);	// �ε���2�� �� ����
		list.remove(2);	// �ε���2�� �� ����
		/* ������ ������ �迭�� �� �����ϹǷ�, �ε��� [2]�� ����Ǿ� �ִ� C++�� �����ϸ� 1ĭ�� �پ���
		 * 3ĭ�� ���� �迭�� �� ������ ��[2]�� Python�� ����ǰ� [0]=Java,[1]=C,[2]=Python�� ���°� �ȴ�.
		 * ���⼭ �� Python�� ����Ǿ� �ִ� �ε��� [2]�� �����ϸ�, 1ĭ�� �پ�� �迭�� �� �����ϰ� �Ǿ�
		 * [0]=Java,[1]=C �� ���¸� ���� �迭�� �ȴ�. */
		
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println("list["+i+"] = " + str);
		}
		System.out.println();
	}
}
