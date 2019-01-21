package package04_if;

import java.util.Scanner;

public class Example04_Ssem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է� : ");
		int score = sc.nextInt();	// ���� �Է�
		
		if(score < 0 || score > 100) {	// �Է� ���� �����̰ų� 100���� �ʰ��ϸ�
			System.out.println("�Է� ���� �߸��Ǿ����ϴ�.");
		} else {						// �Է� ���� 0 ~ 100 ���̶��
			String grade = "";
			if(score >= 90) {			// 100 ~ 90
				grade = score >= 95 ? "A++" : "A";
			} else if(score >= 80) {	// 89 ~ 80
				grade = score >= 85 ? "B++" : "B";
			} else if(score >= 70) {	// 79 ~ 70
				grade = score >= 75 ? "C++" : "C";
			} else {					// 69 ~ 0
				grade = "F";
			}
			System.out.println(grade);
		}
	}
}
