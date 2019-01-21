package package09_array;

import java.util.Arrays;

public class Example10 {
	public static void main(String[] args) {
		int[] arr = { 10, 4, 3, 8, 13, 7, 5, 6};
		int[] copy = new int[arr.length];
		
		// copy = arr;	// �迭�� ���� ���� (Shallow Copy) : ������ �迭�� ���� ���� ������ ��
		/* �迭�� ���� ���� (Deep Copy) : ������ �迭�� �ٸ� ���� ������ �� (20 page�� �������� Deep Copy�ϴ� ���� ��������.)
		 * ù ��° ���� : ������ �迭�� �̸�
		 * �� ��° ���� : ������ �迭�� ���� �ε���
		 * �� ��° ���� : ���� ���� �迭�� �̸�
		 * �� ���� ���� : ���� ���� �迭�� ���� �ε���
		 * �ټ� ���� ���� : ������ �������� ����
		 */
		
		System.arraycopy(arr, 2, copy, 0, 3);
		arr[2] = 100;
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(copy));
	}
}
