package package04_if;

import java.util.Scanner;

public class Example04_Another {
	public static void main(String[] args) {
		/* ���� )
		 * �Է��� ������ 100 ~ 95�̸� A++
		 * 			 94 ~ 90�̸� A
		 * 			 89 ~ 85�̸� B++
		 * 			 84 ~ 80�̸� B
		 * 			 79 ~ 75�̸� C++
		 * 			 74 ~ 70�̸� C
		 * 			 69 ~  0�̸� F
		 * 			  ������ ����Ͻÿ�.
		 * (��, 0 ~ 100�� �ʰ��ϴ� ������ "�Է� ���� �߸��Ǿ����ϴ�." �� ���)		*/
		
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt(); 
		if(score < 0 || score > 100) {
			System.out.println("�Է� ���� �߸��Ǿ����ϴ�.");
		}
		else if(score >= 95) {
			System.out.println("�Է��� ������ " + score + "�̸� " + "A++");
		}
		else if(score >= 90) {
			System.out.println("�Է��� ������" + score + "�̸�" + "A");
		}
		else if(score >= 85) {
			System.out.println("�Է��� ������" + score + "�̸�" + "B++");
		}
		else if(score >= 80) {
			System.out.println("�Է��� ������" + score + "�̸�" + "B");
		}
		else if(score >= 75) {
			System.out.println("�Է��� ������" + score + "�̸�" + "C++");
		}
		else if(score >= 70) {
			System.out.println("�Է��� ������" + score + "�̸�" + "C");
		}
		else {
			System.out.println("�Է��� ������" + score + "�̸�" + "F");
		}
		
		
	}
	}

