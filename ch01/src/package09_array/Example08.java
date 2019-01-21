package package09_array;

import java.util.Arrays;

public class Example08 {
	public static void main(String[] args) {
		/* 아래 1 ~ 9까지의 숫자를 무작위로 섞는 코드를 작성하시오.(랜덤 값 사용)
		 * 
		 * 반복문 안에서
		 * arr[0] 과 arr[랜덤값(0 ~ 8)] 값을 바꾼다.
		 * arr[1] 과 arr[랜덤값)0 ~ 8)] 값을 바꾼다.
		 * ...
		 * ...
		 * arr[8] 과 arr[랜덤값)0 ~ 8)] 값을 바꾼다.
		 */
		/* int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9};
		double ran = Math.random();
		int a = (int)(ran * 10) + 1;
		for(int i = 0; i < arr.length; i++) {
			arr[i] = arr[a];
		}
		System.out.println(Arrays.toString(arr)); */
		
		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		for(int i = 0; i < arr.length; i++) {
			int r = (int)(Math.random() * 9);	// 0 ~ 8까지
			
			// 두 수를 교환한다. (tmp가 복사한 것을 임시로 담아두는 클립보드의 역할을 한다.)
			int tmp = arr[i];
			arr[i] = arr[r];
			arr[r] = tmp;
		}
		
		System.out.println(Arrays.toString(arr));
		
	}
}
