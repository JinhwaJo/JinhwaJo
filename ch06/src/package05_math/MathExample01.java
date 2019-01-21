package package05_math;

public class MathExample01 {
	public static void main(String[] args) {
		/* 수학 관련 API 클래스
		 * 메소드가 static 이므로 별도의 객체를 생성할 필요가 없다.		 */
		System.out.println(Math.PI);			// 파이 값 
		System.out.println(Math.ceil(34.46));	// 올림
		System.out.println(Math.floor(34.76));	// 내림
		System.out.println(Math.round(34.46));	// 반올림
		System.out.println(Math.abs(34.46));	// 절대값
		System.out.println(Math.abs(-34));		// 절대값
		System.out.println(Math.max(20, 30));	// 두 수 중 큰 수
		System.out.println(Math.min(20, 30));	// 두 수 중 작은 수
		System.out.println(Math.pow(2, 3));		// 2^3 (거듭제곱)
		System.out.println(Math.sqrt(2));		// 제곱근
		System.out.println(Math.random());		// 랜덤 값(0.0 <= 난수 < 1.0)
	}
}
