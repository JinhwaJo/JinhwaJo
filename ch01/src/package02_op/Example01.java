package package02_op;

public class Example01 {
	public static void main(String[] args) {
		int n = -5; //n = -5
		int c;
		c = -n; //c = -(-5)
		System.out.println(n);
		System.out.println(c);
		n = -n;
		System.out.println(n);
		
		boolean is = true;
		is = !is;
		System.out.println(is); // is에 !is를 대입했으므로 false
		System.out.println(!is); // 위의 값을 다시 반전 시키므로 true가 된다.

		int a = 5;
		a++; // ++는 1 증가, --는 1 감소 (2 가 증가되거나 그런건 없다.)
		System.out.println(a++); // 변수 뒤에 ++는 후위증가가 되서 다음 라인에 증가되고 즉시 적용되지 않는다. 그래서 계속 6이다.
		System.out.println(a);
		System.out.println(++a); // ++가 변수 앞에 오면 전위증가라서 즉시 적용된다. 그래서 8이다.
		System.out.println(a);
		int b = (a--);			// 후위감소라서 a는 여전히 8이며 그 값이 b에 저장된다. 다음 줄에는 a가 7이 된다. 
		System.out.println(a);	// 7
		System.out.println(b);	// 8
		
		a = 5;
		b = 2;
		a = (a++) - (--b);
		/* 후위증가가 되므로 a는 여전히 5이므로, 5-1 = 4가 되고, 후위증가되서 아래 출력 값이 5가 될 것 같지만
		 * a에 저장을 하면 후위증가가 적용되지 않는다.
		 * 후위증가나 후위감소의 경우 그 값을 해당 값에 그대로 대입하면 적용되지 않는다. (++ 보다 = 이 우선한다.) 	*/
		System.out.println(a);
		
	}
}
