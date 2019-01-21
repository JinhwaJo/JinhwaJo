package package09_array;

import java.util.Arrays;

public class Example10 {
	public static void main(String[] args) {
		int[] arr = { 10, 4, 3, 8, 13, 7, 5, 6};
		int[] copy = new int[arr.length];
		
		// copy = arr;	// 배열의 얕은 복사 (Shallow Copy) : 복사한 배열이 같은 곳을 참조할 때
		/* 배열의 깊은 복사 (Deep Copy) : 복사한 배열이 다른 곳을 참조할 때 (20 page에 수동으로 Deep Copy하는 법이 나와있음.)
		 * 첫 번째 인자 : 복사할 배열의 이름
		 * 두 번째 인자 : 복사할 배열의 시작 인덱스
		 * 세 번째 인자 : 복사 받을 배열의 이름
		 * 네 번쨰 인자 : 복사 받을 배열의 시작 인덱스
		 * 다섯 번쨰 인자 : 복사할 데이터의 개수
		 */
		
		System.arraycopy(arr, 2, copy, 0, 3);
		arr[2] = 100;
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(copy));
	}
}
