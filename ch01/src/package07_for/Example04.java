package package07_for;

public class Example04 {
	public static void main(String[] args) {
		/* 1 ~ 100까지의 정수 중 3의 배수의 총합을 출력하시오.
		 * 답 : 1683
		 */
		
		int sum = 0;
		
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0) {
				System.out.print(i + " ");
				sum += i;
			}
		}
		System.out.println("\n반복문 종료 후");
		System.out.println("1 ~ 100 까지의 3의 배수의 총합 : " + sum);
	}
}
