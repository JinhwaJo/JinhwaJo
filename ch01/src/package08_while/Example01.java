package package08_while;

public class Example01 {
	public static void main(String[] args) {
		/* while 문 : 반복 횟수를 예측할 수 없을 때 사용된다.
		 *         : for문과 문법만 다르고 원리는 동일하다.
		 */
		
		int i = 0;
		while(i < 10) {
			System.out.print((i + 1) + " ");
			i++;
		}
		System.out.println();
	}
}
