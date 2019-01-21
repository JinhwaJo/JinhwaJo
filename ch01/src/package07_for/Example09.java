package package07_for;

import java.util.Scanner;

public class Example09 {
	public static void main(String[] args) {
		/*			°Ÿ
		 * 			*
		 * 		   * *
		 *		  * * *
		 *		 * * * *
		 *		* * * * *
		 *		   ||| 
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("≥Ù¿Ã : ");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			for(int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < i * 2 -1; j++) {
				if(i == 1) {
					System.out.print("$");
				} else if(j % 2 == 0) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
					
				}
				System.out.println("");
			}
		
		for(int i = 0; i < n + 1; i++) {
			if(i < n - 2)
				System.out.print(" ");
			else
				System.out.print("|");
		}
	}
}
