package package04_if;

import java.util.Scanner;

public class Example04_My {
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
		System.out.print("������ �Է��ϼ���. : ");
		int scores = sc.nextInt();
		
		if(scores > 100 || scores < 0) {
			System.out.println("�Է� ���� �߸��Ǿ����ϴ�.");
		} else {
			if(scores >= 95 && scores <= 100) {
				System.out.println("A++");
			} else if(scores >= 90 && scores <= 94) {
				System.out.println("A");
				} else if(scores >= 85 && scores <= 89) {
					System.out.println("B++");
				} else if(scores >= 80 && scores <= 84) {
					System.out.println("B");
				} else if(scores >= 75 && scores <= 79) {
					System.out.println("C++");
				} else if(scores >= 70 && scores <= 74) {
					System.out.println("C");
				} else if(scores <= 69) {
					System.out.println("F");
				}
		
		
		
		/* �� ���� ��
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt(); 
		if(score < 0 || score > 100) {
			System.out.println("�Է� ���� �߸��Ǿ����ϴ�.");
		}
		if(score >= 95 && score <= 100) {
			System.out.println("�Է��� ������ " + score + "�̸� " + "A++");
		}
		if(score >= 90 && score <= 94) {
			System.out.println("�Է��� ������" + score + "�̸�" + "A");
		}
		if(score >= 85 && score <= 89) {
			System.out.println("�Է��� ������" + score + "�̸�" + "B++");
		}
		if(score >= 80 && score <= 84) {
			System.out.println("�Է��� ������" + score + "�̸�" + "B");
		}
		if(score >= 75 && score <= 79) {
			System.out.println("�Է��� ������" + score + "�̸�" + "C++");
		}
		if(score >= 70 && score <= 74) {
			System.out.println("�Է��� ������" + score + "�̸�" + "C");
		}
		if(score >= 0 && score <= 69) {
			System.out.println("�Է��� ������" + score + "�̸�" + "F"); */
		}
		}
		
		
	}

