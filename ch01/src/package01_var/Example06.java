package package01_var;

public class Example06 {
	public static void main(String[] args) {
		/* 가령, a 와 b 는  '부산', c 는 '서울' 의 주소를 참조하고 있다고 하면
		 * a == c는 false의 결과값이 나온다. 
		 */
		String a = "abc";
		String b = "abc";
		String c = new String("abc");
		
		System.out.println(a == b);
		System.out.println(a == c);
		/* 하지만, 아래와 같이 c(서울)를 a에 대입하게 되면,
		 * a 와 c 가 동일하게 서울을 참조하게 되면서
		 * a == c가 true가 된다.
		 */
		a = c;
		System.out.println(a == c);
		
		
		
		
	}
}
