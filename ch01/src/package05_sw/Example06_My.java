package package05_sw;

import java.util.Scanner;

public class Example06_My {
	public static void main(String[] args) {
		/* �ֹε�Ϲ�ȣ �� �ڸ��� �Է� �ް�, �������� �������� ����Ͻÿ�.
		 * 
		 * ����1 >
		 * �� �ڸ� �Է� : 1101111 �Ǵ� 3101111
		 * ����� ���� �Դϴ�.
		 * 
		 * ����2 >
		 * �� �ڸ� �Է� : 2101111 �Ǵ� 4101111
		 * ����� ���� �Դϴ�.
		 * 
		 * (�Է� ���� �ֹε�Ϲ�ȣ �� �ڸ����� �� �� �ڸ��� ���� ��
		 * switch ���� �̿��� ����� ����غ���. )
		 */
		
		/* Scanner sc = new Scanner(System.in);
		System.out.print("�� �ڸ� �Է� : ");
		int id = sc.nextInt();
		int idf = (id - "101111"); 
		switch(id) {
		case "idf = 1" : case "idf = 3"
			System.out.println("����� ���� �Դϴ�."); break;
		case "idf = 2" : case "idf = 4"
			System.out.println("����� ���� �Դϴ�."); break;
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �ڸ� �Է� : ");
		String gender = sc.next();
		int g = gender.charAt(0) - 48;
		/*int gender = sc.nextInt() / 1000000; : �䷸�� �� ���� �ִ�.
		* �ֹε�Ϲ�ȣ�� ù��° �ڸ��� 0��° ���� ���ڷ� ���� ���� �ִ�.
		 * ���� ���� - 48(���� 0) = ����
		 * charAt�� 0��° ���ڸ� �̰� ���⿡ - 48('0')�� �ϸ� ����(������)�� �ȴ�.
		 */
		sc.close();
		
		switch(g) {
		case 1: case 3:
			System.out.println("����� ���� �Դϴ�."); break;
		case 2: case 4:
			System.out.println("����� ���� �Դϴ�."); break;
		
		}
		
		
	}
}
