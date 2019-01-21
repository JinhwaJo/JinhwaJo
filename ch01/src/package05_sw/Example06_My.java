package package05_sw;

import java.util.Scanner;

public class Example06_My {
	public static void main(String[] args) {
		/* 주민등록번호 뒷 자리를 입력 받고, 남자인지 여자인지 출력하시오.
		 * 
		 * 예시1 >
		 * 뒷 자리 입력 : 1101111 또는 3101111
		 * 당신은 남성 입니다.
		 * 
		 * 예시2 >
		 * 뒷 자리 입력 : 2101111 또는 4101111
		 * 당신은 여성 입니다.
		 * 
		 * (입력 받은 주민등록번호 뒷 자리에서 맨 앞 자리를 구한 뒤
		 * switch 문을 이용해 결과를 출력해본다. )
		 */
		
		/* Scanner sc = new Scanner(System.in);
		System.out.print("뒷 자리 입력 : ");
		int id = sc.nextInt();
		int idf = (id - "101111"); 
		switch(id) {
		case "idf = 1" : case "idf = 3"
			System.out.println("당신은 남성 입니다."); break;
		case "idf = 2" : case "idf = 4"
			System.out.println("당신은 여성 입니다."); break;
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("뒷 자리 입력 : ");
		String gender = sc.next();
		int g = gender.charAt(0) - 48;
		/*int gender = sc.nextInt() / 1000000; : 요렇게 할 수도 있다.
		* 주민등록번호의 첫번째 자리인 0번째 값을 문자로 뽑을 수가 있다.
		 * 문자 숫자 - 48(문자 0) = 숫자
		 * charAt로 0번째 문자를 뽑고 여기에 - 48('0')을 하면 숫자(정수형)가 된다.
		 */
		sc.close();
		
		switch(g) {
		case 1: case 3:
			System.out.println("당신은 남성 입니다."); break;
		case 2: case 4:
			System.out.println("당신은 여성 입니다."); break;
		
		}
		
		
	}
}
