package package04;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample3 {
	public static void main(String[] args) {
		/* ����Ű �Ź��� ��ǰ��ȣ, ��ǰ�̸��� ����ؾ� �Ѵ�. 
		 * (��ǰ��ȣ�� �ߺ��� ���� ������ �� ����.)				 */
		HashSet<Nike> shoes = new HashSet<Nike>();
		// ����Ű(��ǰ��ȣ, "��ǰ�̸�");
		shoes.add(new Nike(1, "�ƽ�95"));
		shoes.add(new Nike(2, "�ƽ�97"));
		shoes.add(new Nike(1, "�ƽ�96")); // ��� �Ұ���
		
		// ��ǰ 1���� ������ true ������ false
		/* contains�� remove���� �޼ҵ� �ڿ���
		 * '1' ���� ��ǰ��ȣ�� �ٷο��� �ȵǰ� �׻� �Ʒ��� ���� ��ü�� ���·� �����Ѵ�. */
		if(shoes.contains(new Nike(1))) {
			System.out.println("��ϵǾ� �ֽ��ϴ�.");
		}
		
		Iterator<Nike> i = shoes.iterator();
		while(i.hasNext()) {
			Nike nike = i.next();
			System.out.println("��ǰ ��ȣ : " + nike.getNumber());
			System.out.println("��ǰ �̸� : " + nike.getName());
		}
	}
}
