package exception_package;

public class Example06 {
	public static void main(String[] args) {
		int[] data = new int[2];
		
		// 예외가 2개 이상 발생할 때 멀티 catch문을 사용한다.
		 try {
			data[0] = Integer.parseInt("1");
			data[1] = Integer.parseInt("a");
			System.out.println(data[0]);
			System.out.println(data[1]);
			data[2] = 2;
			// 두 개 중 하나의 예외가 발생하였을 때 (두 가지 모두 해당하는 경우는 없다.)
		} catch (NumberFormatException | IndexOutOfBoundsException e) {
			e.printStackTrace(); // 두 개중 예외가 생긴 클래스를 확인할 수 있게 추적
			System.out.println("인덱스를 초과하였거나 숫자로 변환할 수 없습니다.");
		} catch (Exception e) {
			System.out.println("이 외의 에러가 발생하였습니다.");
		}
	}
}


