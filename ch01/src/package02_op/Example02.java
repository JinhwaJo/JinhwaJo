package package02_op;

public class Example02 {
	public static void main(String[] args) {
		int a = 5, b = 2;
		int result = (a + b); // µ¡¼À
		System.out.println(result);
		
		result = (a - b); // –E¼À
		System.out.println(result);
		
		result = (a * b); // °ö¼À
		System.out.println(result);
		
		result = (a / b); // ³ª´°¼À: ¸ò
		System.out.println(result);
		
		result = (a % b); // ³ª´°¼À: ³ª¸ÓÁö
		System.out.println(result);
		
		double r = ((double)a / b); // ³ª´°¼À: ¸ò - ½Ç¼öÀÇ »ç¿ë
		System.out.println(r);
		
		r = ((double)a % b); // ³ª´°¼À: ³ª¸ÓÁö - ½Ç¼öÀÇ »ç¿ë
		System.out.println(r);
		
		// ¹®ÀÚ¿­ + Á¤¼ö(¶Ç´Â ½Ç¼ö) = ¹®ÀÚ¿­
		String str = "5";
		System.out.println(0 + str);	//05
		System.out.println(0 + (5+"0"));	//050
		System.out.println(0 + 5 + "0");	//50
		System.out.println(0 + 5 + 0);	//5
		System.out.println(0 + "5" + 0);	//050
		
	
	
}
}
