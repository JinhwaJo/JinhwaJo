package package02_op;

public class Example06 {
	public static void main(String[] args) {
		byte var1 = 15;	// 00001111
		byte var2 = 10;	// 00001010
		// ��Ʈ Ȯ��
		System.out.println(Integer.toBinaryString(var1));
		System.out.println(Integer.toBinaryString(var2));
		
		// & : AND ��Ʈ ������
		byte result1 = (byte)(var1 & var2);
		System.out.println(Integer.toBinaryString(result1));
		
		// | : OR ��Ʈ ������
		byte result2 = (byte)(var1 | var2);
		System.out.println(Integer.toBinaryString(result2));
		
		// ^ : XOR ��Ʈ ������
		byte result3 = (byte)(var1 ^ var2);
		System.out.println(Integer.toBinaryString(result3));
		/* ��Ʈ �����̳�, ���� ���� ���꿡���� ���� int�� ����ȴ�.
		 * ū ���� ���� �׸��� ���� �� �����Ƿ� byte�� ���� �� ��ȯ ������Ѵ�.
		 */
	}
}
