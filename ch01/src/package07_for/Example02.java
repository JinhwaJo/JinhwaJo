package package07_for;

public class Example02 {
	public static void main(String[] args) {
		int sum = 0;
		
		// 1 ~ 10까지 총 10번 반복한다.
		for(int i = 1; i <= 10; i++) {
			System.out.println("i = " + i + ", sum = " + sum);
			sum += i;	// 1 ~10까지의 값을 sum 변수에 누적한다.
		}
		
		System.out.println("1 ~ 10 까지의 합 : " + sum);
		System.out.println("반복문 종료");
	}
}
