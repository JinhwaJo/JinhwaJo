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
			System.out.println("| 1.학생수 | 2. 점수 입력 | 3.점수 확인 | 4.분석 | 5.종료 |");
			System.out.println("------------------------------------------------");
			System.out.print(">> ");
			
			int select = scanner.nextInt();
			
			if (select == 1) {
				System.out.print("학생 수 : ");
				studentNum = scanner.nextInt();
				scores = new int [studentNum];
				// 학생 수를 입력하고 입력 받은 수 만큼 배열을 생성한다. (new 연산자)
			} else if(select == 2) {
				if (studentNum != 0) {
				System.out.println("[ 학생들의 점수 입력 ]");
				for(int i = 0; i < scores.length; i++) {
					System.out.print(i + 1 + ")번 학생 점수 : ");
					scores[i] = scanner.nextInt();
				}
			} else {
				System.out.println("학생 수를 입력해주세요.");
			}
				// 반복문을 통해 학생 수 만큼 점수를 입력한다.
			} else if(select == 3) {
				if (studentNum != 0) {
					System.out.println("[ 학생들의 점수 확인 ]");
					for (int i = 0; i < scores.length; i++) {
						System.out.println(i + 1 + ")번 학생 점수 : " + scores[i]);
					}
				} else {
					System.out.println("학생 수를 입력해주세요.");
				}
				// 모든 학생들의 점수를 출력한다.
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
					System.out.println("[ 학생들의 점수 분석 ]");
					System.out.println("최고 점수 : " + max);
					System.out.println("최소 점수 : " + min);
					System.out.println("평균 점수 : " + avg);
				} else {
					System.out.println("학생 수를 입력해주세요.");
				}
				// 최고 점수와 최소 점수 그리고 평균 점수를 출력한다.
			} else if(select == 5) {
				System.out.println("학생 관리 프로그램을 종료합니다.");
				run = false;
				// 프로그램을 종료한다.
			}
		}
	}
}

