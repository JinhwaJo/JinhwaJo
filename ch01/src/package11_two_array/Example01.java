package package11_two_array;

public class Example01 {
	public static void main(String[] args) {
		// "���α׷��� ��� Ȱ��" å 21 page ����
		// 2���� �迭�� ����� �ʱ�ȭ
		int[][] arr = {		// ��ܽ� ����
				{ 11, 12, 13, 14 },		// arr[0]
				{ 21, 22, 23, 24, 25 },	// arr[1]
				{ 31, 32, 33 }			// arr[2]
		};
		
		// �迭�� ����
		System.out.println("���� ����(����) : " + arr.length);	// 3 : �迭�� 3���ϱ�
		System.out.println("ù ��° ���� �� ����(����) : " + arr[0].length);	// 4 : �� �迭�� ���̸�ŭ ���
		System.out.println("�� ��° ���� �� ����(����) : " + arr[1].length);	// 5 : �� �迭�� ���̸�ŭ ���
		System.out.println("�� ��° ���� �� ����(����) : " + arr[2].length);	// 3 : �� �迭�� ���̸�ŭ ���
		
		// ���
		for(int i = 0; i < arr.length; i++) {
			// ���� �迭�� �� �྿ ����ϵ��� �Ѵ�.
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println(); 	// ���� ���̸� ���� �ٷ� �̵�
		}
	}
}
