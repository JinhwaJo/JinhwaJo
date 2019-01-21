package package10_function;

import java.util.Scanner;

public class Example02 {
	static String[] id = new String[] {"kgitbank", "pagoda", "busan"};	// static ������ ���� ����
	// �ش� �迭�� main �Լ��� ����ϰ�, �Ʒ��� ������ search �Լ��� ����ϰ� �� �� �ֵ��� �������� ���ش�.
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���̵� �Է� : ");	
		String input = sc.next();
		boolean check = search(input);	// search �Լ� ���(ȣ��)
		if(check) {
			System.out.println("���̵� ��ϵǾ� �ֽ��ϴ�.");
		} else {
			System.out.println("���̵� �����ϴ�.");
		}
		// �Ʒ��� boolean ���� �Լ��� ����� ����.
		/* boolean check = false;
		for(int i = 0; i < id.length; i++) {
			if(id[i].equals(input)) {
				check = true;
				break;
			}
		}
		
		if(check) {
			System.out.println("���̵� ��ϵǾ� �ֽ��ϴ�.");
		} else {
			System.out.println("���̵� �����ϴ�.");
		} */
	}
	
	public static boolean search(String inp) {
		for(int i = 0; i < id.length; i++) {	// id�� static���̹Ƿ� ������ ������ static���� �ٲ��ش�.
			if(id[i].equals(inp)) {
				return true;	// return�� �ǹ̴� 1) true�� �ǵ����ְ� 2) search �Լ��� �����Ѵ�
								// break�� ���� �ݺ����� �����ϰ� return false; �� �����ϰ� �ȴ�. (���� �˱�)
			}
	}	// �ݺ��� ��
	
	return false;	// �ݺ��� �ۿ�
	
}
}