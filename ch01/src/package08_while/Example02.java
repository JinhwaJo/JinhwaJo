package package08_while;

import java.util.Scanner;

public class Example02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		while(run) {	// ���� ����(while ���ǽĿ� true �� ���� ��)
			System.out.println("�޴� : 1]�Ƹ޸�ī�� 2]ī��� 3]��ī");
			/* ���� ���� ���� �־��� �� ������ ���� ���� �����ϱ� ���� �Ʒ��� ���� ������ ����
			 * ���ڸ� �Է¹޴� �͸� ���� int choice = sc.nextInt();�� ������
			 * ���ڿ��� ���� �Է¹޾��� �� ������ �߻��Ѵ�.
			 * ����ڷκ��� �Է� ���� ���� � ���� ���� �𸣱� ������
			 * �̿� ���� ������ ���ڸ� ���� �� �ְ� �����Ѵ�. 	 */
			String s = sc.next();	// �Է¹��� ���� a �� �˻�
			char ch = s.charAt(0);	// charAt�� �ش� Ű���常 �̾Ƴ� �� ���
			// length() : ���ڿ��� ������ ��ȯ�Ѵ�. ���ڿ��� ������ ��ȯ�ؼ� 1���� ũ��, 4���� = 4, 2���� = 2 ...
			if(s.length() > 1) {
				continue;
			}
			// ���ڸ� ������ ������ ����
			if(!(ch >= '1' && ch <= '9')) {
				continue; // ���ڰ� �ƴϸ� while�� ���ǽ��� �ٽ� �����Ѵ�.(�������� X)
							// continue�� ���ǽ��� �ٽ� ����, break�� �ݺ����� ����������.
				
			}
			// s �� ����� ���ڿ��� int�� ������ ��ȯ�Ѵ�.
			int choice = Integer.parseInt(s);	// ���ڸ� Integer.parseInt�� ����Ͽ� ���ڷ� �ٲ��ֱ�				
			if(choice == 1) {
				System.out.println("5,500��");
			} else if(choice == 2) {
					System.out.println("6,000��");
			} else if(choice == 3) {
					System.out.println("6,500��");
			} else if(choice == 4) {	// 4�� �Է��ϸ�
					run = false;		// �ݺ����� ������.
						}
					}
		System.out.println("�ݺ��� ����");
				}
			}

		
	

