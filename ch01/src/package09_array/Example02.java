package package09_array;

import java.util.Scanner;

public class Example02 {
	public static void main(String[] args) {
		int[] scores;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("학생 수를 입력하세요 : ");
		String len = sc.next();
		int n = Integer.parseInt(len);	// 문자열을 숫자로 변환
		
		scores = new int[n];
		System.out.println("총 " + scores.length + "명의 학생이 있습니다.");
		
		System.out.println("[ 학생들의 점수를 입력하세요. ]");
		int sum = 0;
		for(int i = 0; i < scores.length; i++) {
			System.out.print((i + 1) + "번 학생 점수 : ");
			scores[i] = sc.nextInt();
			sum += scores[i];
		}
		System.out.println("합계 : " + sum);
	}
}
