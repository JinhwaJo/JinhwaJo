package package09_array;

import java.util.Scanner;

public class Example13 {
	public static void main(String[] args) {
		String[] id = new String[] {"kgitbank", "pagoda", "busan"};	// 100����, 104����
		// String�� �迭�� ������ �迭�̹Ƿ�, �����Ͱ� ���� ����Ǵ� ���� �ƴ϶� �� �ּҰ� ����ȴ�.
		Scanner sc = new Scanner(System.in);
		System.out.print("���̵� �Է� : ");	
		String input = sc.next();
		
		boolean check = false;
		/* input�� ����, ���� �߰��� �Է��� �߱� ������ new �����ڸ� �� �Ͱ� ������ ȿ���� �ش�.
		 * ������ ���� ���� ==, ��ü�� ���� ���� equals�� ���
		 * if(id[i] == input) (X)
		 */
		for(int i = 0; i < id.length; i++) {
			if(id[i].equals(input)) {	// 300����
				check = true;
				break;
			}
		}
		
		if(check) {
			System.out.println("���̵� ��ϵǾ� �ֽ��ϴ�.");
		} else {
			System.out.println("���̵� �����ϴ�.");
		}
	}
}
