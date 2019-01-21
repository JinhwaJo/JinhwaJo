package package02_op;

public class Example06 {
	public static void main(String[] args) {
		byte var1 = 15;	// 00001111
		byte var2 = 10;	// 00001010
		// 비트 확인
		System.out.println(Integer.toBinaryString(var1));
		System.out.println(Integer.toBinaryString(var2));
		
		// & : AND 비트 연산자
		byte result1 = (byte)(var1 & var2);
		System.out.println(Integer.toBinaryString(result1));
		
		// | : OR 비트 연산자
		byte result2 = (byte)(var1 | var2);
		System.out.println(Integer.toBinaryString(result2));
		
		// ^ : XOR 비트 연산자
		byte result3 = (byte)(var1 ^ var2);
		System.out.println(Integer.toBinaryString(result3));
		/* 비트 연산이나, 정수 간의 연산에서는 값이 int로 도출된다.
		 * 큰 값을 작은 그릇에 담을 순 없으므로 byte로 강제 형 변환 해줘야한다.
		 */
	}
}
