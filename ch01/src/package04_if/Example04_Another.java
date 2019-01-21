package package04_if;

import java.util.Scanner;

public class Example04_Another {
	public static void main(String[] args) {
		/* 문제 )
		 * 입력한 점수가 100 ~ 95이면 A++
		 * 			 94 ~ 90이면 A
		 * 			 89 ~ 85이면 B++
		 * 			 84 ~ 80이면 B
		 * 			 79 ~ 75이면 C++
		 * 			 74 ~ 70이면 C
		 * 			 69 ~  0이면 F
		 * 			  학점을 출력하시오.
		 * (단, 0 ~ 100을 초과하는 점수는 "입력 값이 잘못되었습니다." 를 출력)		*/
		
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt(); 
		if(score < 0 || score > 100) {
			System.out.println("입력 값이 잘못되었습니다.");
		}
		else if(score >= 95) {
			System.out.println("입력한 점수가 " + score + "이면 " + "A++");
		}
		else if(score >= 90) {
			System.out.println("입력한 점수가" + score + "이면" + "A");
		}
		else if(score >= 85) {
			System.out.println("입력한 점수가" + score + "이면" + "B++");
		}
		else if(score >= 80) {
			System.out.println("입력한 점수가" + score + "이면" + "B");
		}
		else if(score >= 75) {
			System.out.println("입력한 점수가" + score + "이면" + "C++");
		}
		else if(score >= 70) {
			System.out.println("입력한 점수가" + score + "이면" + "C");
		}
		else {
			System.out.println("입력한 점수가" + score + "이면" + "F");
		}
		
		
	}
	}

