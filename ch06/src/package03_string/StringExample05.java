package package03_string;

public class StringExample05 {
	public static void main(String[] args) {
		String str1 = "C언어는 객체지향언어 입니다.";
		
		// 해당 문자열(왼쪽)을 지정된 문자열(오른쪽)로 치환한다.
		// 해당 문자열이 여러개 있다면 모두 치환된다는 점을 유의한다.
		/* String에서 replace를 사용하면 새로운 객체를 생성하여 주소의 위치를 바꾸고, 새로운 메모리를 생성한다.
		 * 이로써, 새로운 객체를 참조하게 되면, 기존에 있던 객체는 사라지지 않고 남아 있다. (언제 사라질지 모른다.)
		 * JAVA에서는 JVM에 의해 메모리가 자동으로 관리되는데, 사용자가 원하는대로 실행되지 않는다는 점에서 String 클래스의 단점을 알수 있다.
		 * (객체의 추가/변경이 이루어질 떄 마다 메모리가 증가)
		 * 이러한 메모리에 대한 String의 단점을 보완한 것이 StringBuffer이다. StringBuffer는 새로운 객체를 형성하여 변경하는것이 아닌 내 객체를 변경한다. 
		 * 다시말해, String의 문자열은 불변하고, StringBuffer의 문자열은 가변적인 특성을 가진다. */
		String str2 = str1.replace("객체", "절차");
		System.out.println(str2);
		
		String str3 = str1.replace("C언어", "JAVA");
		System.out.println(str3);
		
		/* replaceAll(또는 replace) 는 해당 문자열을 모두 지정된 문자열로 변경하고,
		 * replaceFirst 는 제일 첫 문자열만 변경한다.		 */
		String str4 = str1.replaceFirst("언어", "");
		System.out.println(str4);
				
	}
}
