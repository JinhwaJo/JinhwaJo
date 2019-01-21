package package02_op;

public class Example04 {
	public static void main(String[] args) {
		// 논리연산자 &&(AND), ||(OR), ^(XOR) 의 결과는 boolean
		System.out.println(5 < 2 && 3 < 2);			// &&(AND)(논리 곱)는 모든 조건이 참일 때 true이 된다.
		System.out.println(2 < 5 || 1 < 2);			// ||(OR)(논리 합)은 하나의 조건만 참이라도 true가 된다. 이 식에서는 앞의 것이 참이라서 뒤의 식을 검사할 필요가 없다.
		System.out.println(5 < 2 ^ 5 > 3);			// 두 결과가 다를 경우만 true가 된다.
		System.out.println(!(1 < 3) || (3 < 7));	// 이 식에서는 !를 앞의 괄호 식 다음 바로 연산하고
		System.out.println(!(1 < 3 || 3 < 7));		// 이 식에서는 !를 마지막에 연산한다. 해당 두 식에서의 괄호의 위치에 따라 달라지는 연산 순서를 유의한다.
		System.out.println(7 > 10 && 4 > 2 || 4 < 2);          

	}
}
