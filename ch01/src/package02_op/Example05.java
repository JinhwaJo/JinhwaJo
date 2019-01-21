package package02_op;

public class Example05 {
	public static void main(String[] args) {
		int var1 = 10;
		System.out.println(var1);	// 2진수로 표현하면 00001010이나 앞에 붙는 0은 결과 값에 표시를 하지 않음.
		System.out.println(Integer.toBinaryString(var1));	// 비트 확인
		
		// ~ : 비트 연산자 중 1개
		int var2 = ~var1;		// 1의 보수(~ : 비트 반전 연산자) : 1이었던 것을 0으로, 0이었던 것을 1로 반전시킴.
		System.out.println(Integer.toBinaryString(var2)); 	// 비트 확인
		System.out.println(var2);
		
		var2 = ~var1 + 1;		// 2의 보수(비트 반전 후 +1)
		System.out.println(Integer.toBinaryString(var2));	// 비트 확인
		System.out.println(var2);
	}
}
