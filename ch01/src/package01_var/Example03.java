package package01_var;

public class Example03 {
	public static void main(String[] args) {
		/* 123.456는 상수이며  double형 크기의 데이터라 float에 저장할 수 없으므로,
		뒤에 F를 붙여 float으로 변경해준다.
		*/
		float a = 123.456F; // float a = (float) 123.456과 같이 강제 형변환 해주는 방법이다.
		double b = 123.456;
		
		a = 0.123456789123456789F;
		b = 0.123456789123456789;
		System.out.println(a); // 7자리 : float이 표현할 수 있는 자리까지만 출력된다.
		System.out.println(b); // 15자리 : double이 표현할 수 있는 자리까지만 출력된다.
		// 자바는 계속 업데이트되며 아직 불완전하기 떄문에, 출력되는 자리에 약간의 차이는 발생할 수 있다. 
		
		//e지수 저장(e뒤의 숫자가 양수이면 뒤로 0을 붙여주고, 음수이면 앞으로 소숫점을 해당하는 수만큼 이동하면 된다.)
		a = 1e3F;
		b = 1e3;
		System.out.println(a);
		System.out.println(b);
	}
}
