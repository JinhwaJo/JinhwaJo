package package02_op;

public class Example07 {
	public static void main(String[] args) {
		// << 오른쪽에서 왼쪽으로 0 비트 채움 -- 곱하기 개념
		System.out.println("---------------<<(왼쪽)");
		System.out.println("2 << 1 = " + (2 << 1));	// 2 X 2^1
		System.out.println("2 << 2 = " + (2 << 2));	// 2 X 2^2
		System.out.println("2 << 3 = " + (2 << 3));	// 2 X 2^3
		
		System.out.println("---------------<<(왼쪽)");
		System.out.println("3 << 1 = " + (3 << 1));	// 3 X 2^1
		System.out.println("3 << 2 = " + (3 << 2));	// 3 X 2^2
		System.out.println("3 << 3 = " + (3 << 3));	// 3 X 2^3
		
		// >> 왼쪽에서 오른쪽으로 0 비트 채움 (양수일 때) -- 나누기 개념
		System.out.println("(오른쪽)>>---------------");
		System.out.println("32 >> 1 = " + (32 >> 1));	// 32 / 2^1
		System.out.println("28 >> 2 = " + (28 >> 2));	// 28 / 2^2
		System.out.println("16 >> 3 = " + (16 >> 3));	// 16 / 2^3
		
		// >> 왼쪽에서 오른쪽으로 1비트 채움(음수일 때) -- 나누기 개념
		System.out.println("(오른쪽)>>---------------");
		System.out.println("-32 >> 1 = " + (-32 >> 1));	// 32 / 2^1
		System.out.println("-28 >> 2 = " + (-28 >> 2));	// 28 / 2^2
		System.out.println("-16 >> 3 = " + (-16 >> 3));	// 16 / 2^3
		
		// >>> 왼쪽에서 오른쪽으로 0비트 채움(양수와 음수 모두) -- 나누기 개념
		System.out.println("(오른쪽)>>---------------");
		System.out.println("-32 >>> 1 = " + (-32 >>> 1));	// 32 / 2^1
		System.out.println("-28 >>> 2 = " + (-28 >>> 2));	// 28 / 2^2
		System.out.println("-16 >>> 3 = " + (-16 >>> 3));	// 16 / 2^3
	}
}
