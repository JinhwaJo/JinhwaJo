package package04;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample3_my {
	public static void main(String[] args) {
		/* ����Ű �Ź��� ��ǰ��ȣ, ��ǰ�̸��� ����ؾ� �Ѵ�.
		 * (��ǰ��ȣ�� �ߺ��� ���� ������ �� ����.)		 */
		HashSet<Nike_my> shoes = new HashSet<Nike_my>();
		// ����Ű(��ǰ��ȣ, "��ǰ�̸�");
		shoes.add(new Nike_my(1, "�ƽ�95"));
		shoes.add(new Nike_my(2, "�ƽ�97"));
		shoes.add(new Nike_my(1, "�ƽ�96"));	// ��� �Ұ���
		
		System.out.println(new Nike_my(1, "�ƽ�95"));
		System.out.println(new Nike_my(2, "�ƽ�97"));
		System.out.println(new Nike_my(1, "�ƽ�96"));
		
		Iterator<Nike_my> i = shoes.iterator();
		while(i.hasNext()) {
			Nike_my nike = i.next();
			System.out.println("��ǰ ��ȣ : " + nike.getNumber());
			System.out.println("��ǰ �̸� : " + nike.getName());
		}
	}
}
