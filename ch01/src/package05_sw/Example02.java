package package05_sw;

public class Example02 {
	public static void main(String[] args) {
		String position = "대리";
		
		switch(position) {
		case "부장" :
			System.out.println("1,000만원"); break;
		case "차장" :
			System.out.println("800만원"); break;
		case "과장" :
			System.out.println("600만원"); break;
		case "대리" :
			System.out.println("300만원"); break;
		default:
			System.out.println("1억");
		}
	}
}
