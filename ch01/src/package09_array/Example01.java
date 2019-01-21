package package09_array;

public class Example01 {
	public static void main(String[] args) {
		// 5개의 정수를 저장할 수 있는 배열 scores
		// 왼쪽 항에는 숫자를 기입할 수 없다.
		int[] scores = new int[5];
		
		int k = 1;
		// 배열에 인덱스에 접근해 데이터를 저장하는 방법
		// 인덱스 번호는 항상 정수, 연산자, 변수 등이 올 수 있지만 실수는 올 수 없다.
		scores[0] = 50;		// 처음 인덱스는 항상 0
		scores[1] = 35;
		scores[k + 1] = 70;
		scores[3] = 13;
		scores[4] = 88;		// 마지막 인덱스는 항상 길이 -1
		
		// scores = new int[3]; 다른 주소를 참조하게 되므로 잘못된 문법이다.(원래 있던 값을 사용할 수 없음)
		
		// 반복문을 이용해 배열에 저장된 값을 모두 출력한다.
		// 배열이 있으면 항상 반복문이 들어간다.
		for(int i = 0; i < scores.length; i++) {
			System.out.println("scores["+i+"] = " + scores[i]);
		}
	}
}
