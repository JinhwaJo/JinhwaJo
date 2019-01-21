package package04_if;

import java.util.Scanner;

public class Example01 {
	public static void main(String[] args) {
		// 프로그래밍 언어 활용 책 10 page와 같이 공부하긔!
		Scanner sc = new Scanner(System.in);
		System.out.println("점수 입력 : ");
		int score = sc.nextInt();	// 숫자를 입력한다.
		
		// if문 : if(조건식)이 true이면 { } 을 실행하고, false 이면 미실행.
		if(score >= 70) {	// 입력한 값이 70점 이상이면 실행
			System.out.print("70점 이상이므로 ");
			System.out.println("합격입니다.");
		}
		// if문의 종속 문장이 한 줄일 경우네느 if문의 { } 생략이 가능하다.
		if(score < 70) 	// 입력한 값이 70점 미만이면 실행
			System.out.println("70점 미만이므로 불합격입니다.");
		
		
	}
}
