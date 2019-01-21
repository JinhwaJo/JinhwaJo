package package04;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample2 {
	public static void main(String[] args) {
		// HashSet�� ����Ҷ��� equals�� ???�� �� �־���� �Ѵ�.
		HashSet<Member> members = new HashSet<Member>();
		/* ù ��° ��(itbank1, 1111) �� ������ �߰��� �� ����° �ߺ� ���� ������
		 * �߰��ϱ� ���� �̹� �� �ִ� ù��° ���� ����� �ߺ��� �Ǵ��� �˻縦 �����Ѵ�.
		 * �̶�, add ���ο� equals �޼ҵ带 ȣ���ϴ� �ڵ带 �����ϰ� �����Ƿ�,
		 * if�� �ȿ� ������ equals�� ���� �ʿ䰡 ����.
		 * ������, Member Ŭ������ �θ� Object���� ���� �ƴ� �ּҸ� ���ϰ� �ȴ�.
		 * ����, Member �ȿ��� ���� ���� �� �ֵ��� ���������� �ʿ䰡 �ִ�.
		 * (add�� ���ؼ�, ���� equals�� ȣ���� �ڵ尡 �ʿ����� �ʴٴ� ���� �����Ѵ�.) */
		
		members.add(new Member("itbank1", "1111"));
		members.add(new Member("itbank2", "2222"));
		// Set�� �ߺ������� ������� ������, new�� ����ϸ� �ּҰ� �ٸ��� ������ �����ϴ�. 
		members.add(new Member("itbank1", "1111"));
		// �Ʒ� ���� ���� ��µǴ� package04.Member@4e25154f�� ���� �ؽ� �ڵ尡 �����ؾ� �ߺ��ƴٰ� �Ǵ��� �Ѵ�.
		System.out.println(new Member("itbank1", "1111"));
		System.out.println(new Member("itbank2", "2222"));
		System.out.println(new Member("itbank1", "1111"));
		
		Iterator<Member> i = members.iterator();
		while(i.hasNext()) {
			Member m = i.next();
			System.out.println("ȸ�� ���̵� : " + m.getId());
			System.out.println("ȸ�� ��ȣ : " + m.getPw());
		}
	}
}
