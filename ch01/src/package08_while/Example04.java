package package08_while;

import java.util.Scanner;

public class Example04 {
	public static void main(String[] args) {
		/* ������ �Է� �޾� ���� �Ʒ��� ���� ����� ����Ͻÿ�.
		 * 
		 * ���� 1>
		 * �Է� : 12345
		 * ��� : 15
		 * 
		 * ���� 2>
		 * �Է� : 333
		 * ��� : 9
		 * (������ ������ : / , % �Ǵ� charAt(�ε�����ȣ) Ȱ��)
		 */
		
		/* �Ǵٸ� ��
	    Scanner sc = new Scanner(System.in);
		System.out.print("�Է� : ");	// 12345
		int sum = 0;
		String number = sc.next();
		for(int i = 0; i < number.length(); i++) {
		sum += number.charAt(i) - 48;	// 48�� �ƽ�Ű�ڵ� 0
		}
		System.out.println("��� : " + sum); */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է� : ");	// 12345
		int num = sc.nextInt(), sum = 0;
		while(num > 0) {
			sum += num % 10;	// 5+4+3+2+1 (������)
			num /= 10;			// 1234 -> 123 -> 12 -> 1 ->0(��)
		}
		System.out.println("��� : " + sum);
		
		}
	}

