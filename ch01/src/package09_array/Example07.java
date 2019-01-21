package package09_array;

public class Example07 {
	public static void main(String[] args) {
		/* 아래 주어진 배열에서 최대 값을 출력하시오.
		 * 1. scores[0] 값을 미리 최대 값을 저장할 변수에 저장시킨다.
		 * 2. 반복문 내에서
		 * 최대 값과 scores[1]을 비교해, scores[1]의 값이 더 크면 최대 값 변수에 저장한다.
		 * 최대 값과 scores[2]을 비교해, scores[2]의 값이 더 크면 최대 값 변수에 저장한다.
		 * 최대 값과 scores[3]을 비교해, scores[3]의 값이 더 크면 최대 값 변수에 저장한다.
		 * 최대 값과 scores[4]을 비교해, scores[4]의 값이 더 크면 최대 값 변수에 저장한다.
		 * 최대 값과 scores[5]을 비교해, scores[5]의 값이 더 크면 최대 값 변수에 저장한다.
		 * 3. 최대 값 변수를 출력한다.
		 */
		
		int[] scores = { 66, 77, 88, 11, 99, 55 };
		/* 아래와 같이 적어도 되고, new int[]를 생략할 수도 있다.
		 * int[] scores = new int[]{ 66, 77, 88, 11, 99, 55 }; (O)
		 * 하지만 초기화가 되었을 때는 오른쪽 항에 숫자를 기입할 수 없다.
		 * int[] scores = new int[6]{ 66, 77, 88, 11, 99, 55 }; (X)
		 */
		
		int max = scores[0];
		
		for(int i = 1; i < scores.length; i++) {
			if(scores[i] > max) {
				max = scores[i];
				
			}
			}
		System.out.println("최대 값 : " + max);	
	}
}