package package03_scanner;

import java.util.Scanner;

public class Example02 {
	public static void main(String[] args) {
		/* 사용자의 이름과 국, 영, 수 점수를 입력 받고, 합계와 평균을 출력하시오.
		 * 
		 * 사용자 이름 입력 : 박성정
		 * 국어 점수 입력 : 66
		 * 영어 점수 입력 : 55
		 * 수학 점수 입력 : 33
		 * 
		 * 결과) 
		 * 박성정 님의 점수는
		 * 합계 : 154점
		 * 평균 : 51.333333333333점
		 * 입니다.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("사용자 이름 입력 : ");
		String name = sc.next();
		System.out.print("국어 점수 입력 : ");
		int kor = sc.nextInt();
		System.out.print("영어 점수 입력 : ");
		int eng = sc.nextInt();
		System.out.print("수학 점수 입력 : ");
		int math = sc.nextInt();
		sc.nextLine();
		String a = sc.nextLine();
		
		System.out.println(name + " 님의 점수는");
		System.out.println("합계 : " + (kor + eng + math) + "점");
		System.out.println("평균 : " + (double)((kor + eng + math) / 3));
		System.out.println("입니다.");
		
		sc.close();
		
		
		
	}
}
