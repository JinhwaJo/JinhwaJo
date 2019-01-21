package package07;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapExample2 {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
	
		map.put("itbank1", "1111");
		map.put("itbank2", "2222");
		map.put("itbank3", "3333");
		map.put("itbank4", "1111");
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("아이디 : ");
			// trim은 로그인 시 많이 사용되며, 양쪽에 있는 공백문자를 삭제해주는 기능을 한다. (문자 중간에 있는 공백문자는 없앨 수 없다.)
			String id = sc.nextLine().trim();
			
			System.out.print("비번 : ");
			String pw = sc.nextLine().trim();
			System.out.println();
			
			// 아이디가 맵에 없으면 true 아니면 false
			// 맵에 id의 키 값이 없으면 반복문을 다시 시작하겠다아
			if(!map.containsKey(id)) {	// contain이 포함되어 있는지 없는지 찾는 기능이므로, 키 값을 찾게 된다.
				System.out.println("아이디를 찾을 수 없습니다.(다시 입력");
				continue;
			// id가 있으면 else로 가서 pw가 있는지 확인한다.
			} else {
				// 맵에 저장된 패스워드가 입력한 패스워드와 일치하지 않으면 true 아니면 false
				// 입력한 id에 저장되어 있는 pw와 내가 입력한 pw가 일치하는지 비교하겠드아
				if(!(map.get(id).equals(pw))) {
					System.out.println("비밀번호가 일치하지 않습니다.(다시 입력)");
				} else {
					System.out.println(id + "님, 로그인 중");
					break;
				}
			}
		}
		
	}
}
