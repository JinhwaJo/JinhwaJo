package package09_array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Example06 {
	public static void main(String[] args) {
		/* 피보나치 수열을 배열의 10번째 칸까지 저장하고, 출력하시오.
		 * (힌트 : 처음 두 수는 반복문을 실행하기 전에 미리 배열에 저장하고,
		 * 반복문을 이용해 앞 두 수를 더한 다음 값을 구하는 것이 좋다.)
		 * 
		 * 결과 )
		 * [1, 1, 2, 3, 5, 8, 13, 21, 34, 55]
		 */
		
		int[] fibo = new int[10];
			fibo[0] = 1;
			fibo[1] = 1;
			
			for(int i = 2; i < fibo.length; i++) {
				fibo[i] = fibo[i-2] + fibo[i-1];
				
				
				
		}
			System.out.println(Arrays.toString(fibo));
	}
}
