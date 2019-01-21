package package07_for;

public class Example08_16p_3 {
	public static void main(String[] args) {
		// 16 page 3¹ø ¹®Á¦
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(j <= 5 - i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
