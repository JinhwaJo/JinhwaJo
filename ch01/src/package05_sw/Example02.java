package package05_sw;

public class Example02 {
	public static void main(String[] args) {
		String position = "�븮";
		
		switch(position) {
		case "����" :
			System.out.println("1,000����"); break;
		case "����" :
			System.out.println("800����"); break;
		case "����" :
			System.out.println("600����"); break;
		case "�븮" :
			System.out.println("300����"); break;
		default:
			System.out.println("1��");
		}
	}
}
