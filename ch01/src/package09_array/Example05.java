package package09_array;

import java.util.Arrays;
import java.util.Scanner;

public class Example05 {
	public static void main(String[] args) {
		/* �Է��� ���� �������� �迭�� �����Ͻÿ�.
		 * 
		 * �Է� : 5
		 * ��� )
		 * 5 10 15 20 25 30 35 40 45
		 */
		/*
		int[] arr1 = new int[9];
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է� : ");
		String len = sc.next();
		int length = Integer.parseInt(len);
		
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = length * (i + 1);
		}
		System.out.println(Arrays.toString(arr1));
		*/
		
		/* Scanner sc = new Scanner(System.in);
		System.out.print("�Է� : ");
		int input = sc.nextInt();
		
		for(int i=0; i<9; i++) {
			System.out.print(input *(i+1) + " ");
		} */
		int[] gugudan = new int[9];
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է� : ");
		int n = sc.nextInt();
		for(int i = 0; i < gugudan.length; i++) {
			gugudan[i] = n * (i + 1);
		}
		
		System.out.println(Arrays.toString(gugudan));
		
		
		
	}
}
