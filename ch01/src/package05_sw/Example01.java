package package05_sw;

public class Example01 {
	public static void main(String[] args) {
		int a = 3;
		/* break는 하나의 선택문만 실행하고 나가게 하는 명령어이다.
		 * switch문의 () 안에는 정수형(byte, short, int, long), 문자형(char)만 올 수 있다.
		 * JAVA 7 부터 String(문자열) 형 지정이 가능하다.
		 */
		switch(a) {	
		default:
			System.out.println("와 기본이다.!");
		case 1:
			System.out.println("와 1이다."); break;	
		case 7:
			System.out.println("와 7이다."); break;
		case 3:
			System.out.println("와 3이다."); break;
		case 8:
			System.out.println("와 8이다."); break;
		
		}
	}
}
