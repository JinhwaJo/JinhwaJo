package package10_function;

public class Example01 {
	public static void main(String[] args) {
	int n = f(5);			// 결과 값을 돌려 받는다. (순서 2)
	System.out.println(n);	// 돌려받은 결과 값을 출력할 수 있다. (순서 3)
	
	int scores1[] = { 44, 11, 22, 33, 15};
	n = maxFunc(scores1);	
	System.out.println(n);
	
	int scores2[] = { 33, 11, 55};
	n = maxFunc(scores2);
	System.out.println(n);
	}
	/* f(x)는 class 안에 있어야 한다. 사용할 때는 main 함수 안에서 사용한다.
	 * 함수를 만들 때는 public static을 꼭 써줘야한다.
	 * public static(반환형) void f(함수형)(int x)(매개변수 1개) { - 갯수가 늘어날 수 있는 건 매개변수 밖에 없다.
	 * 매개변수는 매개체가 되는 변수의 내용을 함수 안으로 끌어와주는 역할을 한다.(인셉션 - 꿈 : 현실)
	 */
	// 함수1 (int 배열형) : 위에서 설정한 값에 따라 함수의 자료형이 결정된다.
	// 따라서, 함수1 이 int 배열형인 이유는 위에서 함수를 만들 때 설정한 값이 배열형이기 떄문이다.
	public static int maxFunc(int[] scores) {	// maxFunc는 제일 큰 값을 돌려주는 의미
		int m = scores[0];
		for(int i = 1; i < scores.length; i++) {
			if(scores[i] > m) {
				m = scores[i];
			}
		}
		return m;
	}
	// 함수2 (int 정수형) : 위에서 설정한 값에 따라 함수의 자료형이 결정된다.
	public static int f(int x) {	// void는 빈 공간이란 의미이므로, 반환되는 x의 자료형을 입력해줘야 한다. 
		return x + 1;				// 결과 값을 출력하라고 명령했던 함수로 돌려준다. (순서 1)
	}
}
