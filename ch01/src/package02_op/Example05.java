package package02_op;

public class Example05 {
	public static void main(String[] args) {
		int var1 = 10;
		System.out.println(var1);	// 2������ ǥ���ϸ� 00001010�̳� �տ� �ٴ� 0�� ��� ���� ǥ�ø� ���� ����.
		System.out.println(Integer.toBinaryString(var1));	// ��Ʈ Ȯ��
		
		// ~ : ��Ʈ ������ �� 1��
		int var2 = ~var1;		// 1�� ����(~ : ��Ʈ ���� ������) : 1�̾��� ���� 0����, 0�̾��� ���� 1�� ������Ŵ.
		System.out.println(Integer.toBinaryString(var2)); 	// ��Ʈ Ȯ��
		System.out.println(var2);
		
		var2 = ~var1 + 1;		// 2�� ����(��Ʈ ���� �� +1)
		System.out.println(Integer.toBinaryString(var2));	// ��Ʈ Ȯ��
		System.out.println(var2);
	}
}
