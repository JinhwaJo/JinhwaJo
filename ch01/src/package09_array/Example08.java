package package09_array;

import java.util.Arrays;

public class Example08 {
	public static void main(String[] args) {
		/* �Ʒ� 1 ~ 9������ ���ڸ� �������� ���� �ڵ带 �ۼ��Ͻÿ�.(���� �� ���)
		 * 
		 * �ݺ��� �ȿ���
		 * arr[0] �� arr[������(0 ~ 8)] ���� �ٲ۴�.
		 * arr[1] �� arr[������)0 ~ 8)] ���� �ٲ۴�.
		 * ...
		 * ...
		 * arr[8] �� arr[������)0 ~ 8)] ���� �ٲ۴�.
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
			int r = (int)(Math.random() * 9);	// 0 ~ 8����
			
			// �� ���� ��ȯ�Ѵ�. (tmp�� ������ ���� �ӽ÷� ��Ƶδ� Ŭ�������� ������ �Ѵ�.)
			int tmp = arr[i];
			arr[i] = arr[r];
			arr[r] = tmp;
		}
		
		System.out.println(Arrays.toString(arr));
		
	}
}
