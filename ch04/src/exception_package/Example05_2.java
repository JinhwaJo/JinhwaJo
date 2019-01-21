package exception_package;

public class Example05_2 {
	public static void main(String[] args) {
		int[] data = new int[2];
		
		/* 예외가 2개 이상 발생할 때 다중 catch문을 사용한다.
		 * 단, 상위의 catch문이 실행되면 하위의 catch문은 실행되지 않는다. */
		try {
			data[0] = Integer.parseInt("1");
			data[1] = Integer.parseInt("a");	
			System.out.println(data[0]);
			System.out.println(data[1]);
			System.out.println(data[2]);
		// catch문 안에 try문을 넣어서 예외처리 결과를 두개 이상으로 출력할 수 있다.
		} catch (NumberFormatException ex) {
			try {
				data[2] = 2;
			} catch (IndexOutOfBoundsException e) {
				System.out.println("인덱스를 초과하였습니다.");
			}
			System.out.println("숫자로 변환할 수 없습니다.");
		} catch (Exception e) {
			System.out.println("이 외의 에러가 발생하였습니다.");
		}
	}
}


