package package07_for;

public class Example03 {
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {				// if문을 만족하면
				System.out.print(i + " ");	// 출력 후
				sum += i;					// sum 변수에 i를 누적 저장함.
			}
		}
		
		System.out.println("\n반복문 종료 후");
		System.out.println("1 ~ 10 까지의 짝수 합계 : " + sum);
	}
}
