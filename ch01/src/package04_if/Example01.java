package package04_if;

import java.util.Scanner;

public class Example01 {
	public static void main(String[] args) {
		// ���α׷��� ��� Ȱ�� å 10 page�� ���� �����ϱ�!
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է� : ");
		int score = sc.nextInt();	// ���ڸ� �Է��Ѵ�.
		
		// if�� : if(���ǽ�)�� true�̸� { } �� �����ϰ�, false �̸� �̽���.
		if(score >= 70) {	// �Է��� ���� 70�� �̻��̸� ����
			System.out.print("70�� �̻��̹Ƿ� ");
			System.out.println("�հ��Դϴ�.");
		}
		// if���� ���� ������ �� ���� ���״� if���� { } ������ �����ϴ�.
		if(score < 70) 	// �Է��� ���� 70�� �̸��̸� ����
			System.out.println("70�� �̸��̹Ƿ� ���հ��Դϴ�.");
		
		
	}
}
