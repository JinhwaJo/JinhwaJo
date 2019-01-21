package package06_random;

public class Example01 {
	public static void main(String[] args) {
		// 0.0 <= Math.random() < 1.0
		double ran = Math.random();
		System.out.println("랜덤 값 : " + ran);
		System.out.println("랜덤 값 : " + (int)(ran * 5));		// (0 ~ 4) 랜덤 값이 5를 넘어가지 않음.
		System.out.println("랜덤 값 : " + (int)(ran * 10));		// (0 ~ 9) 랜덤 값이 10을 넘어가지 않음.
		System.out.println("랜덤 값 : " + (int)(ran * 100));	// (0 ~ 99) 랜덤 값이 100을 넘어가지 않음.
		System.out.println("랜덤 값 : " + (int)(ran * 20));		// (0 ~ 19) 랜덤 값이 20을 넘어가지 않음.
	}
}
