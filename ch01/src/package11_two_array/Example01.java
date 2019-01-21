package package11_two_array;

public class Example01 {
	public static void main(String[] args) {
		// "프로그래밍 언어 활용" 책 21 page 참조
		// 2차원 배열의 선언과 초기화
		int[][] arr = {		// 계단식 구조
				{ 11, 12, 13, 14 },		// arr[0]
				{ 21, 22, 23, 24, 25 },	// arr[1]
				{ 31, 32, 33 }			// arr[2]
		};
		
		// 배열의 길이
		System.out.println("행의 길이(개수) : " + arr.length);	// 3 : 배열이 3개니까
		System.out.println("첫 번째 행의 열 길이(개수) : " + arr[0].length);	// 4 : 각 배열의 길이만큼 출력
		System.out.println("두 번째 행의 열 길이(개수) : " + arr[1].length);	// 5 : 각 배열의 길이만큼 출력
		System.out.println("세 번째 행의 열 길이(개수) : " + arr[2].length);	// 3 : 각 배열의 길이만큼 출력
		
		// 출력
		for(int i = 0; i < arr.length; i++) {
			// 안쪽 배열은 한 행씩 출력하도록 한다.
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println(); 	// 다음 행이면 다음 줄로 이동
		}
	}
}
