package package07_for;

public class Example08_16p_4 {
	public static void main(String[] args) {
		// 16 page 4번 문제
		for(int i = 1; i <= 5; i++) {	// 줄의 수
			for(int j = 1; j <= 5; j++) {	// 줄의 자릿수
				if(j >= i) {				// (줄의 자릿수 >= 별의 시작자리 = 줄의 수)
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				}
			System.out.println();
		} 
	}
}
