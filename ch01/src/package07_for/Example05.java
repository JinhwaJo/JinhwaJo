package package07_for;

public class Example05 {
	public static void main(String[] args) {
		/* 1 ~ 10까지
		 * 1 + (1 + 2) + (1 + 2 + 3) + (1 + 2 + 3 + 4) +
		 * ... + (1 + 2 + 3 + ... + 8 + 9 + 10)의 결과를 출력하시오.
		 * 
		 * 답 : 220
		 */
		
		int sum = 0, total = 0;
		
		for(int i = 1; i <= 10; i++) {
			sum += i;		// sum = 1, 3, 6, 10 ...
			total += sum;	// total = 1 + 3 + 6 + 10 ...
		}
		
		System.out.println("답 : " + total);
	}
}
