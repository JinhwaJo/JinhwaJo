package package08_while;

import java.util.Scanner;

public class Example06_my {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int bal = 0;
		while(true) {
			System.out.println("1.���� | 2.��� | 3.�ܱ� | 4.����");
			int num = sc.nextInt();
			if(num == 1) {
				System.out.println("���� : ");
			int money = sc.nextInt();
			bal += money;
			continue;
			} else if(num == 2) {
				System.out.println("��� : ");
			int with = sc.nextInt();
			if(bal < with) {
				System.out.println("�ܾ��� �����մϴ�.");
			} else {
				bal -= with;
			}
			} else if(num == 3) {
				System.out.println("�ܰ� : " + bal);
				continue;
			} else if(num == 4) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			
			
			}
		}
	}
}
