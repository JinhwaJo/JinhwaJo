package package03_string;

public class StringExample08 {
	public static void main(String[] args) {
		String fileName = "itbank.txt";
		
		// "txt" �� fileName ���ڿ��� �� ���� ������ true ������ false
		if(fileName.endsWith("txt")) {
			System.out.println("�ؽ�Ʈ �����Դϴ�.");
		} else if(fileName.endsWith("hwp")) {
			System.out.println("�Ʒ� �ѱ� �����Դϴ�.");
		} else {
			System.out.println("�� ���� �����Դϴ�.");
		}
	}
}
