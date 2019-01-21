package package10_function;

import java.util.Scanner;

public class Example02 {
	static String[] id = new String[] {"kgitbank", "pagoda", "busan"};	// static 형으로 변수 변경
	// 해당 배열을 main 함수도 사용하고, 아래에 생성한 search 함수도 사용하게 할 수 있도록 위쪽으로 빼준다.
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 입력 : ");	
		String input = sc.next();
		boolean check = search(input);	// search 함수 사용(호출)
		if(check) {
			System.out.println("아이디가 등록되어 있습니다.");
		} else {
			System.out.println("아이디가 없습니다.");
		}
		// 아래의 boolean 식을 함수로 만들어 본다.
		/* boolean check = false;
		for(int i = 0; i < id.length; i++) {
			if(id[i].equals(input)) {
				check = true;
				break;
			}
		}
		
		if(check) {
			System.out.println("아이디가 등록되어 있습니다.");
		} else {
			System.out.println("아이디가 없습니다.");
		} */
	}
	
	public static boolean search(String inp) {
		for(int i = 0; i < id.length; i++) {	// id가 static형이므로 위쪽의 변수를 static으로 바꿔준다.
			if(id[i].equals(inp)) {
				return true;	// return의 의미는 1) true를 되돌려주고 2) search 함수를 종료한다
								// break를 쓰면 반복문을 종료하고 return false; 를 실행하게 된다. (차이 알기)
			}
	}	// 반복문 끝
	
	return false;	// 반복문 밖에
	
}
}