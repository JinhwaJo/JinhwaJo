package package08_while;

import java.util.Scanner;

public class Example03 {
	public static void main(String[] args) {
		/*
		 * ���� ���߱� ������ �ۼ��Ͻÿ�. 1 ~ 100 ������ ���� �ݺ������� �Է��ؼ� ��ǻ�Ͱ� ������ ����(������) �� ���߸� ������ ����ȴ�.
		 * ����ڰ� ���� �Է��ϸ� ��ǻ�Ͱ� ���� ���� ���� ����� �˷��ְ� �Ͽ��� �Ѵ�.
		 * 
		 * ����� : 101 OUT
		 * 
		 * ����� : 50 DOWN
		 * 
		 * ����� : 25 UP
		 * 
		 * ����� : 28 �� 4ȸ���� ������ϴ�. ������ �����մϴ�.
		 */

		double ran = Math.random(); // 0 <= ~ < 1 : ������ �����Ѵ�.
		int rannum = (int) (ran * 100 + 1);	// int�� ���� ������ ����� 0 ~ 99�� ������ �����ǹǷ�, +1�� �ؼ� 1 ~ 100�� ������ �ϼ��� �� �ִ�.
		// int rannum = (int) (ran * 101) + 1;
		// int rannum = (int) (ran * 100) +1;
		Scanner sc = new Scanner(System.in);
		/* while���� ���� ���� ��쿡 ����ؼ� �˻縦 �ϰԵǴ� �����̹Ƿ�
		 * ��, ������ ��Ÿ�� �� �ִ� ���� ����Ͽ� true�� ����ؼ� �����ϰ�
		 * false�� ������ �ϴ� ������ ���ǽ��� ������ �Ѵ�.
		 * �׷��� boolean �Լ��� ���ų�, �Ʒ��� ���� while ��ü�� true�� �־� ���� ������ �� �� �ִ�.
		 	int cnt = 1;
			while (true) {
			System.out.print("���ڸ� �Է��Ͻÿ�. : ");
			int number = sc.nextInt();
			if (rannum > number) {
				System.out.println("UP");
				cnt++;
			} else if (rannum < number) {
				System.out.println("DOWN");
				cnt++;
			} else if (rannum == number) {
				System.out.println("�� " + cnt + "�� ���� ������ϴ�. ������ �����մϴ�.");
				break; */
		
		boolean a = true;
		int cnt = 1;
		while (a) {
			System.out.print("���ڸ� �Է��Ͻÿ�. : ");
			int number = sc.nextInt();
			if (rannum > number) {
				System.out.println("UP");
				cnt++;
			} else if (rannum < number) {
				System.out.println("DOWN");
				cnt++;
			} else if (rannum == number) {
				System.out.println("�� " + cnt + "�� ���� ������ϴ�. ������ �����մϴ�.");
				a= false;
			}

		}
	}
}
