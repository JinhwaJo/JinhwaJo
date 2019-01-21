package package03_string;

public class StringExample09 {
	public static void main(String[] args) {
		String text = "박지성&히딩크,최용수-신태용,이천수";
		
		// 아래 식에서 split은 배열로 반환된다.
		// 아래와는 또 다른 예시 : String[] names = text.split("&|,|-");
		String[] names = text.split("&");	// 문자열 분리(구분자(정규표현식)를 사용)
		
		// 확장 for 문 : 배열 또는 컬렉션을 처음부터 끝까지 반복할 때 사용
		for(String nm : names) {
			System.out.println(nm);
		}
		
		// 확장 for문
		int[] scores = new int[] { 44, 33, 22 };
		int sum = 0;
		/* 확장 for문에서 왼쪽엔 (하나씩 저장할 수 있는) 단일 변수가 오고,
		 * 오른쪽엔 (데이터를 많이 저장할 수 있는) 배열이나 클래스가 와야하고, 단일 변수가 올 수 없다.	 */
		for(int n : scores) {	
			sum += n;
		}
		System.out.println("합계 : " + sum + "점");
	}
}
