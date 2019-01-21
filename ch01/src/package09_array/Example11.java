package package09_array;

import java.util.Arrays;

public class Example11 {
	public static void main(String[] args) {
		// 1. 1 ~ 45까지의 숫자를 길이가 45인 배열에 저장시킨다.
		int[] numbers = new int[45];
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 1;
			}
		System.out.println(Arrays.toString(numbers));
		
		// 2. 1 ~ 45까지의 숫자를 저장한 배열을 무작위로 섞는다.
		for(int i = 0; i < numbers.length; i++) {
			int r = (int)(Math.random() * 45);	// 0 ~ 44번 인덱스의 숫자를 섞는다.
			int tmp = numbers[0];	
			numbers[0] = numbers[r];
			numbers[r] = tmp;
		/* 인덱스에 값을 저장할 떄는 ran * 45(0 ~ 44)에 + 1을 붙여서 1 ~ 45로 범위를 설정해줘야하고,
		 * 인덱스를 섞을 때는 0 ~ 44가 이미 인덱스에 들어가 있으니 + 1을 해주지 않아도 된다.
		 * 1 ~ 45 범위의 랜덤 값을 섞으면 중복된 숫자가 생길 수 있다. 하지만, 인덱스 내에서 값을 섞으면 중복이 발생하지 않는다.
		 * tmp를 쓰는 이유는 인덱스의 값을 교환해주기 위한 것이지 중복 제거를 위한 것이 아니다. */
		}
		System.out.println(Arrays.toString(numbers));
		
		// 3. 1 ~ 45까지의 숫자를 가진 배열에서 0 ~ 5까지의 숫자를 길이가 6인 배열에 저장시킨다.
		int[] lotto = new int[6];
		int start = (int)(Math.random() * 39);	// [0] ~ [38]
		System.arraycopy(numbers, start, lotto, 0, lotto.length);
		
		
		// 4. 6개의 데이터가 저장된 배열을 정렬한다. (오름차순)
		for(int i = 0; i < lotto.length - 1; i++) {
			for(int j = 0; j < lotto.length - (i + 1); j++) {
				if(lotto[j] > lotto[j + 1]) {
					int tmp = lotto[j];
					lotto[j] = lotto[j + 1];
					lotto[j + 1] = tmp;
				}
			}
		}
		
		// 5. 6개의 데이터가 저장된 배열의 값을 확인한다.
		System.out.println(Arrays.toString(lotto));
	}
}
