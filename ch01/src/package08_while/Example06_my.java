package package08_while;

import java.util.Scanner;

public class Example06_my {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int bal = 0;
		while(true) {
			System.out.println("1.예금 | 2.출금 | 3.잔금 | 4.종료");
			int num = sc.nextInt();
			if(num == 1) {
				System.out.println("예금 : ");
			int money = sc.nextInt();
			bal += money;
			continue;
			} else if(num == 2) {
				System.out.println("출금 : ");
			int with = sc.nextInt();
			if(bal < with) {
				System.out.println("잔액이 부족합니다.");
			} else {
				bal -= with;
			}
			} else if(num == 3) {
				System.out.println("잔고 : " + bal);
				continue;
			} else if(num == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			
			
			}
		}
	}
}
