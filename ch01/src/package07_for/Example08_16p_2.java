package package07_for;

public class Example08_16p_2 {
	public static void main(String[] args) {
		/* 16 page 2�� ����
		 * 
		 *     * (���� 4��, �� 1��) (n(5) - 1)
		 *    ** (���� 3��, �� 2��) (n(5) - 2)
		 *   *** (���� 2��, �� 3��) (n(5) - 3)
		 *  **** (���� 1��, �� 4��) (n(5) - 4)
		 * ***** (���� 0��, �� 5��) (n(5) - 5)
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
