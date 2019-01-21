package package04_stringbufferbuilder;

public class StringBuilderExample01 {
	public static void main(String[] args) {
		/* 문자열을 수정하는 작업을 할 때 String 클래스의 메소드는
		 * 새로운 객체를 생성하고 수정하는 형태이므로, 메모리의 성능을 저하시킬 수 있다.
		 * java.lang.StringBuffer 또는 StringBuilder API 클래스를 사용하면
		 * 내부 버퍼(데이터를 임시로 저장하는 메모리)에 문자열을 저장해놓고, 그 안에서
		 * 추가, 수정, 제거 작업을 할 수 있기 때문에 하나의 객체만을 이용해 문자열 조작이
		 * 가능하다. (String의 단점을 보완)
		 * 
		 * StringBuffer : 멀티스레드 환경에서 안전(safe)하도록 동기화되어 있음.
		 * StringBuilder : 동기화로 인한 프로그램 속도 저하로 인해 단일 스레드에서 동기화를 빼고 사용할 수 있도록 설계됨.
		 * (멀티 스레드에서는 Buffer, 단일 스레드에서는 Builder를 주로 사용함.)
		 * 
		 * ※ 단순히 문자열을 저장하고, 사용만 할 때는 String 클래스의 속도가 더 빠르기 때문에
		 * 추가, 삭제, 수정이 빈번할 경우에만 사용하는 것이 좋다.		 */
		StringBuilder sb = new StringBuilder();	// 객체 생성
		
		sb.append("C, ");	// 문자열 추가
		sb.append("Java, ");
		sb.append("C#");
		
		System.out.println(sb);
		// String a = sb.insert(3, "C++, ").toString();	- 다른 변수에 저장하고 싶을 때는 toString을 사용
		sb.insert(3, "C++, ");			// 중간에 문자열 삽입("")
		System.out.println(sb.toString());
		
		sb.setCharAt(1,  'C');			// 중간에 문자 삽입('')
		System.out.println(sb.toString());
		
		String str = sb.toString();		// String str = sb; (불가능한 문법)
		System.out.println(str);
		
		sb.delete(1, sb.length());		// 1 ~ 끝까지 문자열 삭제
		System.out.println(sb.toString());
		
		sb.replace(0, 1, "Java");		// 0 ~ 0의 문자열을 "Java"로 치환
		System.out.println(sb.toString());
	}
}
