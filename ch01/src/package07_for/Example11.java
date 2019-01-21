package package07_for;

public class Example11 {
	public static void main(String[] args) {
		/* 방정식 2x + 4y = 10의 모든 해를 출력하시오.
		 * x 와 y 는 10 이하의 자연수이다.
		 * 
		 * x, y
		 * [1, 2]
		 * [3, 1]
		 * [5, 0]
		 */
		
		
		for(int x = 0; x <= 10; x++) {
			for(int y = 0; y <= 10; y++) {
				if(2*x + 4*y == 10) {
					System.out.println("[" + x + ", " + y + "]");
				}
			}
		}
	}
}
