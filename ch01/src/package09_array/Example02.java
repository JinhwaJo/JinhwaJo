package package09_array;

import java.util.Scanner;

public class Example02 {
	public static void main(String[] args) {
		int[] scores;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�л� ���� �Է��ϼ��� : ");
		String len = sc.next();
		int n = Integer.parseInt(len);	// ���ڿ��� ���ڷ� ��ȯ
		
		scores = new int[n];
		System.out.println("�� " + scores.length + "���� �л��� �ֽ��ϴ�.");
		
		System.out.println("[ �л����� ������ �Է��ϼ���. ]");
		int sum = 0;
		for(int i = 0; i < scores.length; i++) {
			System.out.print((i + 1) + "�� �л� ���� : ");
			scores[i] = sc.nextInt();
			sum += scores[i];
		}
		System.out.println("�հ� : " + sum);
	}
}
