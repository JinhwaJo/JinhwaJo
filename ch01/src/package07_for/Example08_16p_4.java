package package07_for;

public class Example08_16p_4 {
	public static void main(String[] args) {
		// 16 page 4�� ����
		for(int i = 1; i <= 5; i++) {	// ���� ��
			for(int j = 1; j <= 5; j++) {	// ���� �ڸ���
				if(j >= i) {				// (���� �ڸ��� >= ���� �����ڸ� = ���� ��)
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				}
			System.out.println();
		} 
	}
}
