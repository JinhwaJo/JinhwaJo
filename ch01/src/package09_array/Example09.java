package package09_array;

import java.util.Arrays;

public class Example09 {
	public static void main(String[] args) {
		/* 다음 아래 배열의 값에서 제일 큰 수를 제일 뒤로 보내시오.
		 * 결과 ) [ 3, 7, 1, 5, 44 ]
		 */
		
		int[] arr = new int[] { 3, 44, 7, 1, 5 };
		
		for(int j = 0; j < arr.length - 1; j++) {	// 
			for(int i = 0; i < arr.length - (j + 1); i++) {	
				/* 데이터의 갯수만큼 제일 큰 수를 맨 뒤로 보내다 보면 "정렬"이 된다.
				 * i < arr.length - (j + 1);
				 * 첫 반복문에서 제일 큰 수를 제일 뒤로 보내놨기 때문에
				 * 다음 반복문이 돌 때 제일 큰 수는 비교 대상이 될 필요가 없다.
				 */
				if(arr[i] > arr[i + 1]) {
					int tmp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = tmp;
			}
		}
		}
		System.out.println(Arrays.toString(arr));
}
}
