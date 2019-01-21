package package01_var;

public class Example04 {
	public static void main(String[] args) {
		// 문자의 입력 : '' 안에 입력
		char var1 = 'P';
		char var2 = 80;
		char var3 = '박';
		char var4 = 48149;
		// 유니코드로 데이터 기입
		char var5 = '\uAC00';
		
	// 숫자로 출력하고 싶을 땐 (int)를 붙여서 강제 형변환을 해준다.
		System.out.println((int)var1);	//문자형 P 를 정수형으로 강제 형 변환하여 출력 : 80
		System.out.println(var5);		// 유니코드 \uAC00 가 문자형으로 출력 : 가
		System.out.println((int)var5);	// 유니코드 \uAC00 의 문자형 가 를 정수형으로 강제 형 변환하여 출력 : 44032
		System.out.println(var2);		// 정수 80 을 문자형으로 출력 : P
		System.out.println((int)var3);	// 문자형 박 을 정수형으로 강제 형 변환하여 출력 : 48149
		System.out.println(var4);		// 정수 48149 를 문자형으로 출력 : 박
	}
}
