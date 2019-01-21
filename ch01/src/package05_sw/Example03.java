package package05_sw;

import java.util.Scanner;

public class Example03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("달(월) 입력 : ");
		int month = sc.nextInt();
		switch(month) {
		case 1: case 2: case 3: case 12:
			System.out.println("겨울"); break;
		case 4: case 5: case 6:
			System.out.println("봄"); break;
		case 7: case 8: case 9:
			System.out.println("여름"); break;
		case 10: case 11:
			System.out.println("가을"); break;
		default:
			System.out.println("1 ~ 12까지만 입력하세요.");
		}
	}
}
