package package09_array;

import java.util.Arrays;
import java.util.Scanner;

public class Example05 {
	public static void main(String[] args) {
		/* 입력한 값의 구구단을 배열에 저장하시오.
		 * 
		 * 입력 : 5
		 * 결과 )
		 * 5 10 15 20 25 30 35 40 45
		 */
		/*
		int[] arr1 = new int[9];
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String len = sc.next();
		int length = Integer.parseInt(len);
		
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = length * (i + 1);
		}
		System.out.println(Arrays.toString(arr1));
		*/
		
		/* Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int input = sc.nextInt();
		
		for(int i=0; i<9; i++) {
			System.out.print(input *(i+1) + " ");
		} */
		int[] gugudan = new int[9];
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int n = sc.nextInt();
		for(int i = 0; i < gugudan.length; i++) {
			gugudan[i] = n * (i + 1);
		}
		
		System.out.println(Arrays.toString(gugudan));
		
		
		
	}
}
