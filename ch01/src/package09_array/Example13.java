package package09_array;

import java.util.Scanner;

public class Example13 {
	public static void main(String[] args) {
		String[] id = new String[] {"kgitbank", "pagoda", "busan"};	// 100번지, 104번지
		// String형 배열은 참조형 배열이므로, 데이터가 직접 저장되는 것이 아니라 그 주소가 저장된다.
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 입력 : ");	
		String input = sc.next();
		
		boolean check = false;
		/* input을 쓰면, 실행 중간에 입력을 했기 때문에 new 연산자를 쓴 것과 동일한 효과를 준다.
		 * 변수를 비교할 때는 ==, 객체를 비교할 때는 equals를 사용
		 * if(id[i] == input) (X)
		 */
		for(int i = 0; i < id.length; i++) {
			if(id[i].equals(input)) {	// 300번지
				check = true;
				break;
			}
		}
		
		if(check) {
			System.out.println("아이디가 등록되어 있습니다.");
		} else {
			System.out.println("아이디가 없습니다.");
		}
	}
}
