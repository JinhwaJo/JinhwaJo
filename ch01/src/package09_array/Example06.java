package package09_array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Example06 {
	public static void main(String[] args) {
		/* �Ǻ���ġ ������ �迭�� 10��° ĭ���� �����ϰ�, ����Ͻÿ�.
		 * (��Ʈ : ó�� �� ���� �ݺ����� �����ϱ� ���� �̸� �迭�� �����ϰ�,
		 * �ݺ����� �̿��� �� �� ���� ���� ���� ���� ���ϴ� ���� ����.)
		 * 
		 * ��� )
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
