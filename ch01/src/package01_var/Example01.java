package package01_var;

public class Example01 {
	public static void main(String[] args) {
		System.out.print("Hello, world.\n");
		System.out.println("Hello, Park.");
		System.out.format("Hello, kim.\n");
		System.out.println("Hello, Lee.");
		
		/* 같은 형태의 변수는 ,로 구분할 수 있다.
		아래와 입력한 변수에서 30은 t에만 저장되고, 나머진 쓰레기가 저장된다.
		x에는 5 + 3의 결과 값인 8이 저장된다. 
		*/
		int x, z = 0, t = 30;
		int y = 10;
		x = 5 + 3;
		
		System.out.println(x);
		System.out.println(z);
		System.out.println(t);
		System.out.println(y);
		// int a = 123.456 실수(소수점 이하 수)는 저장할 수 없다.
		// int c = 2147483649; 처럼 int 형의 범위를 넘어가는 수는 저장할 수 없다.
		long c = 2147483649L;
		
		
	}
}
