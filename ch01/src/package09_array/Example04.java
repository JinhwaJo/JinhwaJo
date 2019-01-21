package package09_array;

import java.text.DecimalFormat;

public class Example04 {
	public static void main(String[] args) {
		// 문제 ) 배열에 저장된 값을 모두 합산하여 합계와 평균을 출력하시오.
		int[] arr = { 88, 76, 55, 99, 98};
		
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
			
		
		}
		System.out.println("합계 : " + sum);
		/* 아래와 같이 간단하게 평균을 구할 수도 있다.
		System.out.println("평균 : " + sum / (double)arr.length); */
		double avg = sum / (double)arr.length;
		DecimalFormat df = new DecimalFormat("#.#");
		String a = df.format(avg);
		System.out.println("평균 : " + a);
	}
}
