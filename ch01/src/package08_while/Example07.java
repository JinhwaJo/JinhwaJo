package package08_while;

import java.text.DecimalFormat;

public class Example07 {
	public static void main(String[] args) {
		double n = 1.123456;
		/* �Ҽ��� ��°�ڸ������� ����ȴ�.
		 * #�� �߰��ϰų� �����Ͽ� �Ҽ��� �ڸ��� ������ �� �ִ�.
		 */
		// 1. ������ ������ ���Ѵ�.(���� ���Ѵ�.)
		DecimalFormat df = new DecimalFormat("#.####");
		// 2. �ٲ� ������ ���¸� ���ڿ��� ��ȯ�ؾ� �Ѵ�.
		String a = df.format(n);
		// 3. �ٲ� ������ ���´� ���ڿ� ��ü�� ����Ǿ� �ִ�.
		System.out.println(a);
	}
}
