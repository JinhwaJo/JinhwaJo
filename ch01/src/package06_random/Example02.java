package package06_random;

import org.omg.Messaging.SyncScopeHelper;

public class Example02 {
	public static void main(String[] args) {
		double ran = Math.random();
		int a  = (int)(ran * 10) + 1;	// 1 ~ 10
		System.out.println("a = " + a);
		
		int b = (int)(ran * 10) + 2;	// 2 ~ 11
		System.out.println("a = " + b);
		
		int c = (int)(ran * 10) + 3;	// 3 ~ 12
		System.out.println("a = " + c);
		
		int d = (int)(ran * 6) + 5;		// 5 ~ 10
		System.out.println("d = " + d);
		
		int e = (int)(ran * 51) + 50;	// 50 ~ 100 
		System.out.println("e = " + e);
		
		int f = (int)(ran * 12) + 77;	// 77 ~ 88
		System.out.println("f = " + f);
		/* ���ϰ��� �ϴ� ������ �� ������ ���� ���� �A ����
		 * ���� ���� ������ 0 ~ �� �������� ������ ���� �����ϰ�
		 * �ڿ��� ���� ���� �����ָ� �ȴ�.
		 */
		
		int g = (int)(ran * 46) + 30; 		// 30 ~ 75
		System.out.println("g = " + g);
		
		int h = (int)(ran * 75) + 13;		// 13 ~ 87
		System.out.println("h = " + h);
		
		int i = (int)(ran * 21) + 7; 		// 7 ~ 27
		System.out.println("i = " + i);
		
		
	}
}
