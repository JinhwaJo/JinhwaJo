package package05_sw;

public class Example01 {
	public static void main(String[] args) {
		int a = 3;
		/* break�� �ϳ��� ���ù��� �����ϰ� ������ �ϴ� ��ɾ��̴�.
		 * switch���� () �ȿ��� ������(byte, short, int, long), ������(char)�� �� �� �ִ�.
		 * JAVA 7 ���� String(���ڿ�) �� ������ �����ϴ�.
		 */
		switch(a) {	
		default:
			System.out.println("�� �⺻�̴�.!");
		case 1:
			System.out.println("�� 1�̴�."); break;	
		case 7:
			System.out.println("�� 7�̴�."); break;
		case 3:
			System.out.println("�� 3�̴�."); break;
		case 8:
			System.out.println("�� 8�̴�."); break;
		
		}
	}
}
