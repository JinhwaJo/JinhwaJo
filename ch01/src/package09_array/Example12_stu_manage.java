package package09_array;

import java.util.Arrays;
import java.util.Scanner;

public class Example12_stu_manage {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		int a =0;
		while (run) {
			System.out.println("------------------------------------------------");
			System.out.println("| 1.�л��� | 2. ���� �Է� | 3.���� Ȯ�� | 4.�м� | 5.���� |");
			System.out.println("------------------------------------------------");
			System.out.print(">> ");
			
			int select = scanner.nextInt();
			
			if (select == 1) {
				System.out.print("�л� �� : ");
				studentNum = scanner.nextInt();
				scores = new int [studentNum];
				// �л� ���� �Է��ϰ� �Է� ���� �� ��ŭ �迭�� �����Ѵ�. (new ������)
			} else if(select == 2) {
				if (studentNum != 0) {
				System.out.println("[ �л����� ���� �Է� ]");
				for(int i = 0; i < scores.length; i++) {
					System.out.print(i + 1 + ")�� �л� ���� : ");
					scores[i] = scanner.nextInt();
				}
			} else {
				System.out.println("�л� ���� �Է����ּ���.");
			}
				// �ݺ����� ���� �л� �� ��ŭ ������ �Է��Ѵ�.
			} else if(select == 3) {
				if (studentNum != 0) {
					System.out.println("[ �л����� ���� Ȯ�� ]");
					for (int i = 0; i < scores.length; i++) {
						System.out.println(i + 1 + ")�� �л� ���� : " + scores[i]);
					}
				} else {
					System.out.println("�л� ���� �Է����ּ���.");
				}
				// ��� �л����� ������ ����Ѵ�.
			} else if(select == 4) {
				if (studentNum != 0) {
					int max, min, sum = scores[0];
					max = min = sum;
					double avg = 0;
					for (int i = 1; i < scores.length; i++) {
						max = (max < scores[i]) ? scores[i] : max;
						min = (min > scores[i]) ? scores[i] : min;
						sum += scores[i];
					}
					avg = (double)sum / studentNum;
					System.out.println("[ �л����� ���� �м� ]");
					System.out.println("�ְ� ���� : " + max);
					System.out.println("�ּ� ���� : " + min);
					System.out.println("��� ���� : " + avg);
				} else {
					System.out.println("�л� ���� �Է����ּ���.");
				}
				// �ְ� ������ �ּ� ���� �׸��� ��� ������ ����Ѵ�.
			} else if(select == 5) {
				System.out.println("�л� ���� ���α׷��� �����մϴ�.");
				run = false;
				// ���α׷��� �����Ѵ�.
			}
		}
	}
}

