package package09_array;

import java.util.Arrays;

public class Example09 {
	public static void main(String[] args) {
		/* ���� �Ʒ� �迭�� ������ ���� ū ���� ���� �ڷ� �����ÿ�.
		 * ��� ) [ 3, 7, 1, 5, 44 ]
		 */
		
		int[] arr = new int[] { 3, 44, 7, 1, 5 };
		
		for(int j = 0; j < arr.length - 1; j++) {	// 
			for(int i = 0; i < arr.length - (j + 1); i++) {	
				/* �������� ������ŭ ���� ū ���� �� �ڷ� ������ ���� "����"�� �ȴ�.
				 * i < arr.length - (j + 1);
				 * ù �ݺ������� ���� ū ���� ���� �ڷ� �������� ������
				 * ���� �ݺ����� �� �� ���� ū ���� �� ����� �� �ʿ䰡 ����.
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
