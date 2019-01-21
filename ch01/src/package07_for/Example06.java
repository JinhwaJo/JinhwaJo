package package07_for;

public class Example06 {
	public static void main(String[] args) {
		// 1 X 2 X 3 X 4 X 5 의 결과는 ?
		
		int mul = 1;
		
		for(int i = 1; i < 6; i++) {
			System.out.println("i = " + i + ", mul = " + mul);
			mul *= i;
		}
		
		System.out.println("1 x 2 x 3 x 4 x 5 의 결과는? " + mul);
	}
}
