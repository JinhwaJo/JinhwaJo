package package08_while;

import java.util.Scanner;

public class Example05 {
	public static void main(String[] args) {
		/* while���� Math.random() �޼ҵ带 �̿��� �� ���� �ֻ�����
		 * ������ �� ������ ���� ����Ѵ�.
		 * (��, ���� ���� 5�� �ƴϸ� �ֻ����� ��� ������ �ϰ�,
		 *     ���� ���� 5�̸� �ݺ����� ������ �Ѵ�.)
		 *     
		 * ��� )
		 * ( 1, 1 )
		 * ( 6, 6 )
		 * ( 2, 3 )
		 * 
		 * ���� �ֻ����� ��� �������ϴ�.
		 * �� 3ȸ ���� ���� ���� 5�� �Ǿ����ϴ�.
		 */
		
		/* Scanner sc = new Scanner(System.in);
		double ran = Math.random();
		int rannum = (int)(ran * 6) + 1;
		while(true) {
			System.out.print("�ֻ��� ���� �Է��Ͻÿ�. : ");
		int num = sc.nextInt();
		sum = 0;
		if(rannum ) */
		
		int cnt = 0;
		while(true) {
			++cnt;
			int dice1 = (int)(Math.random() * 6) + 1;
			int dice2 = (int)(Math.random() * 6) + 1;
			System.out.println("( " + dice1 + ", " + dice2 + " )");
			if(dice1 + dice2 == 5) {
				break;
			}
		}
		System.out.println("��" + cnt + "ȸ ���� ���� ���� 5�� �Ǿ����ϴ�.");
	}
}
