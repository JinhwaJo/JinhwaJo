package package02_op;

public class Example07 {
	public static void main(String[] args) {
		// << �����ʿ��� �������� 0 ��Ʈ ä�� -- ���ϱ� ����
		System.out.println("---------------<<(����)");
		System.out.println("2 << 1 = " + (2 << 1));	// 2 X 2^1
		System.out.println("2 << 2 = " + (2 << 2));	// 2 X 2^2
		System.out.println("2 << 3 = " + (2 << 3));	// 2 X 2^3
		
		System.out.println("---------------<<(����)");
		System.out.println("3 << 1 = " + (3 << 1));	// 3 X 2^1
		System.out.println("3 << 2 = " + (3 << 2));	// 3 X 2^2
		System.out.println("3 << 3 = " + (3 << 3));	// 3 X 2^3
		
		// >> ���ʿ��� ���������� 0 ��Ʈ ä�� (����� ��) -- ������ ����
		System.out.println("(������)>>---------------");
		System.out.println("32 >> 1 = " + (32 >> 1));	// 32 / 2^1
		System.out.println("28 >> 2 = " + (28 >> 2));	// 28 / 2^2
		System.out.println("16 >> 3 = " + (16 >> 3));	// 16 / 2^3
		
		// >> ���ʿ��� ���������� 1��Ʈ ä��(������ ��) -- ������ ����
		System.out.println("(������)>>---------------");
		System.out.println("-32 >> 1 = " + (-32 >> 1));	// 32 / 2^1
		System.out.println("-28 >> 2 = " + (-28 >> 2));	// 28 / 2^2
		System.out.println("-16 >> 3 = " + (-16 >> 3));	// 16 / 2^3
		
		// >>> ���ʿ��� ���������� 0��Ʈ ä��(����� ���� ���) -- ������ ����
		System.out.println("(������)>>---------------");
		System.out.println("-32 >>> 1 = " + (-32 >>> 1));	// 32 / 2^1
		System.out.println("-28 >>> 2 = " + (-28 >>> 2));	// 28 / 2^2
		System.out.println("-16 >>> 3 = " + (-16 >>> 3));	// 16 / 2^3
	}
}
