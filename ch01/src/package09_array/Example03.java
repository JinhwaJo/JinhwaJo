package package09_array;

import java.util.Arrays;

public class Example03 {
	public static void main(String[] args) {
		int[] arr1 = new int[10];
		int[] arr2 = new int[10];
		
		// 배열의 선언과 초기화 : 이때는 길이을 작성하면 안 된다.
		int[] arr3 = new int[] {100, 95, 66, 45, 76};
		
		for(int i = 0; i < arr1.length; i++) {
			// 1 ~ 10까지의 숫자를 순자적으로 배열에 저장한다.
			arr1[i] = i + 1;
			
		}
		
		for (int i = 0; i < arr2.length; i++) {
			// 1 ~ 10까지의 숫자를 랜덤하게 배열에 저장한다.
			arr2[i] = (int)(Math.random() * 10) + 1;
		}
		
		// Arrays.toString 메소드 : 배열을 문자열로 반환한다.
		String str1 = Arrays.toString(arr1);
		String str2 = Arrays.toString(arr2);
		String str3 = Arrays.toString(arr3);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}
	
}
