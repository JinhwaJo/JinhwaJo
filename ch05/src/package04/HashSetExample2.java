package package04;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample2 {
	public static void main(String[] args) {
		// HashSet을 사용할때는 equals와 ???를 꼭 넣어줘야 한다.
		HashSet<Member> members = new HashSet<Member>();
		/* 첫 번째 줄(itbank1, 1111) 의 내용을 추가한 뒤 세번째 중복 값을 넣으면
		 * 추가하기 전엔 이미 들어가 있는 첫번째 줄의 내용과 중복이 되는지 검사를 실행한다.
		 * 이때, add 내부에 equals 메소드를 호출하는 코드를 포함하고 있으므로,
		 * if문 안에 별도로 equals를 써줄 필요가 없다.
		 * 하지만, Member 클래스의 부모가 Object여서 값이 아닌 주소를 비교하게 된다.
		 * 따라서, Member 안에서 값을 비교할 수 있도록 재정의해줄 필요가 있다.
		 * (add로 인해서, 따로 equals를 호출할 코드가 필요하지 않다는 점에 유의한다.) */
		
		members.add(new Member("itbank1", "1111"));
		members.add(new Member("itbank2", "2222"));
		// Set은 중복저장을 허용하지 않지만, new를 사용하면 주소가 다르기 때문에 가능하다. 
		members.add(new Member("itbank1", "1111"));
		// 아래 식을 통해 출력되는 package04.Member@4e25154f와 같은 해시 코드가 동일해야 중복됐다고 판단을 한다.
		System.out.println(new Member("itbank1", "1111"));
		System.out.println(new Member("itbank2", "2222"));
		System.out.println(new Member("itbank1", "1111"));
		
		Iterator<Member> i = members.iterator();
		while(i.hasNext()) {
			Member m = i.next();
			System.out.println("회원 아이디 : " + m.getId());
			System.out.println("회원 암호 : " + m.getPw());
		}
	}
}
