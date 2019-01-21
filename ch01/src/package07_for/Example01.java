package package07_for;

public class Example01 {
	public static void main(String[] args) {
		/* 반복문 : 특정 코드(종속 문장)를 여러 번 반복한다.
		 * for(초기식; 조건식; 증감식)로 구성되고,
		 * 실행순서 : 초기식-조건식-출력-증감식-조건식-출력-증감식-조건식-출력-증감식-조건식-출력
		 * 이 순서를 반복하다가 조건식의 범위를 초과하면 나가게 된다.
		 */
		for(int i = 0; i < 10; i++) {
			System.out.println(i + 1 + " ");
		}
		System.out.println("\n반복문 종료");
	}
}
