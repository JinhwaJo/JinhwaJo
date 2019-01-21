package package08_while;

import java.util.Scanner;

public class Example02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		while(run) {	// 무한 루프(while 조건식에 true 가 있을 때)
			System.out.println("메뉴 : 1]아메리카노 2]카페라떼 3]모카");
			/* 숫자 외의 것을 넣었을 때 오류가 나는 것을 방지하기 위해 아래와 같이 로직을 구성
			 * 숫자를 입력받는 것만 보고 int choice = sc.nextInt();로 넣으면
			 * 숫자외의 것을 입력받았을 떄 오류가 발생한다.
			 * 사용자로부터 입력 받을 것이 어떤 것이 될지 모르기 때문에
			 * 이와 같이 강제로 숫자만 들어올 수 있게 구성한다. 	 */
			String s = sc.next();	// 입력받은 문자 a 를 검사
			char ch = s.charAt(0);	// charAt는 해당 키워드만 뽑아낼 때 사용
			// length() : 문자열의 개수를 반환한다. 문자열의 개수를 반환해서 1보다 크면, 4글자 = 4, 2글자 = 2 ...
			if(s.length() > 1) {
				continue;
			}
			// 숫자만 들어오게 조건을 설정
			if(!(ch >= '1' && ch <= '9')) {
				continue; // 숫자가 아니면 while의 조건식을 다시 실행한다.(하위문장 X)
							// continue는 조건식을 다시 실행, break는 반복문을 나가버린다.
				
			}
			// s 에 저장된 문자열을 int형 정수로 반환한다.
			int choice = Integer.parseInt(s);	// 문자를 Integer.parseInt를 사용하여 숫자로 바꿔주기				
			if(choice == 1) {
				System.out.println("5,500원");
			} else if(choice == 2) {
					System.out.println("6,000원");
			} else if(choice == 3) {
					System.out.println("6,500원");
			} else if(choice == 4) {	// 4를 입력하면
					run = false;		// 반복문을 나간다.
						}
					}
		System.out.println("반복문 종료");
				}
			}

		
	

