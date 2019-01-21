package package09_array;

import java.util.Arrays;

public class Example03 {
	public static void main(String[] args) {
		int[] arr1 = new int[10];
		int[] arr2 = new int[10];
		
		// �迭�� ����� �ʱ�ȭ : �̶��� ������ �ۼ��ϸ� �� �ȴ�.
		int[] arr3 = new int[] {100, 95, 66, 45, 76};
		
		for(int i = 0; i < arr1.length; i++) {
			// 1 ~ 10������ ���ڸ� ���������� �迭�� �����Ѵ�.
			arr1[i] = i + 1;
			
		}
		
		for (int i = 0; i < arr2.length; i++) {
			// 1 ~ 10������ ���ڸ� �����ϰ� �迭�� �����Ѵ�.
			arr2[i] = (int)(Math.random() * 10) + 1;
		}
		
		// Arrays.toString �޼ҵ� : �迭�� ���ڿ��� ��ȯ�Ѵ�.
		String str1 = Arrays.toString(arr1);
		String str2 = Arrays.toString(arr2);
		String str3 = Arrays.toString(arr3);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}
	
}
