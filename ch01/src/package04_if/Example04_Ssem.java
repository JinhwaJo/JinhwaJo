package package04_if;

import java.util.Scanner;

public class Example04_Ssem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수 입력 : ");
		int score = sc.nextInt();	// 점수 입력
		
		if(score < 0 || score > 100) {	// 입력 값이 음수이거나 100점을 초과하면
			System.out.println("입력 값이 잘못되었습니다.");
		} else {						// 입력 값이 0 ~ 100 사이라면
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
