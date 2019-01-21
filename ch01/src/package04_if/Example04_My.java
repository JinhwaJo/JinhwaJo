package package04_if;

import java.util.Scanner;

public class Example04_My {
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
		System.out.print("점수를 입력하세요. : ");
		int scores = sc.nextInt();
		
		if(scores > 100 || scores < 0) {
			System.out.println("입력 값이 잘못되었습니다.");
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
		
		
		
		/* 내 이전 답
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt(); 
		if(score < 0 || score > 100) {
			System.out.println("입력 값이 잘못되었습니다.");
		}
		if(score >= 95 && score <= 100) {
			System.out.println("입력한 점수가 " + score + "이면 " + "A++");
		}
		if(score >= 90 && score <= 94) {
			System.out.println("입력한 점수가" + score + "이면" + "A");
		}
		if(score >= 85 && score <= 89) {
			System.out.println("입력한 점수가" + score + "이면" + "B++");
		}
		if(score >= 80 && score <= 84) {
			System.out.println("입력한 점수가" + score + "이면" + "B");
		}
		if(score >= 75 && score <= 79) {
			System.out.println("입력한 점수가" + score + "이면" + "C++");
		}
		if(score >= 70 && score <= 74) {
			System.out.println("입력한 점수가" + score + "이면" + "C");
		}
		if(score >= 0 && score <= 69) {
			System.out.println("입력한 점수가" + score + "이면" + "F"); */
		}
		}
		
		
	}

