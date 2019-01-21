package package09_array;

import java.util.Arrays;

public class Example11 {
	public static void main(String[] args) {
		// 1. 1 ~ 45������ ���ڸ� ���̰� 45�� �迭�� �����Ų��.
		int[] numbers = new int[45];
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 1;
			}
		System.out.println(Arrays.toString(numbers));
		
		// 2. 1 ~ 45������ ���ڸ� ������ �迭�� �������� ���´�.
		for(int i = 0; i < numbers.length; i++) {
			int r = (int)(Math.random() * 45);	// 0 ~ 44�� �ε����� ���ڸ� ���´�.
			int tmp = numbers[0];	
			numbers[0] = numbers[r];
			numbers[r] = tmp;
		/* �ε����� ���� ������ ���� ran * 45(0 ~ 44)�� + 1�� �ٿ��� 1 ~ 45�� ������ ����������ϰ�,
		 * �ε����� ���� ���� 0 ~ 44�� �̹� �ε����� �� ������ + 1�� ������ �ʾƵ� �ȴ�.
		 * 1 ~ 45 ������ ���� ���� ������ �ߺ��� ���ڰ� ���� �� �ִ�. ������, �ε��� ������ ���� ������ �ߺ��� �߻����� �ʴ´�.
		 * tmp�� ���� ������ �ε����� ���� ��ȯ���ֱ� ���� ������ �ߺ� ���Ÿ� ���� ���� �ƴϴ�. */
		}
		System.out.println(Arrays.toString(numbers));
		
		// 3. 1 ~ 45������ ���ڸ� ���� �迭���� 0 ~ 5������ ���ڸ� ���̰� 6�� �迭�� �����Ų��.
		int[] lotto = new int[6];
		int start = (int)(Math.random() * 39);	// [0] ~ [38]
		System.arraycopy(numbers, start, lotto, 0, lotto.length);
		
		
		// 4. 6���� �����Ͱ� ����� �迭�� �����Ѵ�. (��������)
		for(int i = 0; i < lotto.length - 1; i++) {
			for(int j = 0; j < lotto.length - (i + 1); j++) {
				if(lotto[j] > lotto[j + 1]) {
					int tmp = lotto[j];
					lotto[j] = lotto[j + 1];
					lotto[j + 1] = tmp;
				}
			}
		}
		
		// 5. 6���� �����Ͱ� ����� �迭�� ���� Ȯ���Ѵ�.
		System.out.println(Arrays.toString(lotto));
	}
}
