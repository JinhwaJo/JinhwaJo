package package07_for;

public class Example08_16p_2 {
	public static void main(String[] args) {
		/* 16 page 2번 문제
		 * 
		 *     * (공백 4개, 별 1개) (n(5) - 1)
		 *    ** (공백 3개, 별 2개) (n(5) - 2)
		 *   *** (공백 2개, 별 3개) (n(5) - 3)
		 *  **** (공백 1개, 별 4개) (n(5) - 4)
		 * ***** (공백 0개, 별 5개) (n(5) - 5)
		 */
				
		for(int i = 1; i <= 5; i++) {
			for(int j = 0; j < 5; j++ ) {
				if(j >= 5 - i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
			}
			}
			System.out.println();
	}
}
}
