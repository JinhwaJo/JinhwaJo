package package07;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapExample2 {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
	
		map.put("itbank1", "1111");
		map.put("itbank2", "2222");
		map.put("itbank3", "3333");
		map.put("itbank4", "1111");
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("���̵� : ");
			// trim�� �α��� �� ���� ���Ǹ�, ���ʿ� �ִ� ���鹮�ڸ� �������ִ� ����� �Ѵ�. (���� �߰��� �ִ� ���鹮�ڴ� ���� �� ����.)
			String id = sc.nextLine().trim();
			
			System.out.print("��� : ");
			String pw = sc.nextLine().trim();
			System.out.println();
			
			// ���̵� �ʿ� ������ true �ƴϸ� false
			// �ʿ� id�� Ű ���� ������ �ݺ����� �ٽ� �����ϰڴپ�
			if(!map.containsKey(id)) {	// contain�� ���ԵǾ� �ִ��� ������ ã�� ����̹Ƿ�, Ű ���� ã�� �ȴ�.
				System.out.println("���̵� ã�� �� �����ϴ�.(�ٽ� �Է�");
				continue;
			// id�� ������ else�� ���� pw�� �ִ��� Ȯ���Ѵ�.
			} else {
				// �ʿ� ����� �н����尡 �Է��� �н������ ��ġ���� ������ true �ƴϸ� false
				// �Է��� id�� ����Ǿ� �ִ� pw�� ���� �Է��� pw�� ��ġ�ϴ��� ���ϰڵ��
				if(!(map.get(id).equals(pw))) {
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.(�ٽ� �Է�)");
				} else {
					System.out.println(id + "��, �α��� ��");
					break;
				}
			}
		}
		
	}
}
