package exception_package;

public class Example05_1 {
	public static void main(String[] args) {
		int[] data = new int[2];
		
		/* 예외가 2개 이상 발생할 때 다중 catch문을 사용한다.
		 * 단, 상위의 catch문이 실행되면 하위의 catch문은 실행되지 않는다. */
		try {
			data[0] = Integer.parseInt("1");
			data[1] = Integer.parseInt("a");	// 이 줄에 오류가 발생하면 바로 캐치문으로 넘어가고 
			data[2] = 2;						// 이 줄은 실행하지 않는다.
			System.out.println(data[0]);
			System.out.println(data[1]);
			System.out.println(data[2]);
		// } catch (Exception e) {	부모 catch문이 위에 있으면 요것만 실행하게 되므로 아래쪽에 둬야한다.
			
		} catch (NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("인덱스를 초과하였습니다.");
		} catch (Exception e) {
			System.out.println("이 외의 에러가 발생하였습니다.");
		}
	}
}


