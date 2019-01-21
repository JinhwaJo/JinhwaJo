package package07_for;

public class Example07 {
	public static void main(String[] args) {
		// 중첩 for문 : 반복문 안에 또 다른 반복문을 작성했을 때
		// 쉽게 이해하기 위해 가령, 분이 60분이 되어야 1시간이 된다 ?
		// 구구단
		for(int i = 2; i <= 9; i++) {		// 시의 개념
			System.out.println("-----" + i + "단 시작 -----");
			for(int j = 1; j < 10; j++ ) {	// 분의 개념
				System.out.println(i + "x" + j + " = " + (i * j));
			}
			System.out.println("-------------");
			
		}
	}
}
