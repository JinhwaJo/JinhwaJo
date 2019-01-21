package package09_array;

public class Example07 {
	public static void main(String[] args) {
		/* �Ʒ� �־��� �迭���� �ִ� ���� ����Ͻÿ�.
		 * 1. scores[0] ���� �̸� �ִ� ���� ������ ������ �����Ų��.
		 * 2. �ݺ��� ������
		 * �ִ� ���� scores[1]�� ����, scores[1]�� ���� �� ũ�� �ִ� �� ������ �����Ѵ�.
		 * �ִ� ���� scores[2]�� ����, scores[2]�� ���� �� ũ�� �ִ� �� ������ �����Ѵ�.
		 * �ִ� ���� scores[3]�� ����, scores[3]�� ���� �� ũ�� �ִ� �� ������ �����Ѵ�.
		 * �ִ� ���� scores[4]�� ����, scores[4]�� ���� �� ũ�� �ִ� �� ������ �����Ѵ�.
		 * �ִ� ���� scores[5]�� ����, scores[5]�� ���� �� ũ�� �ִ� �� ������ �����Ѵ�.
		 * 3. �ִ� �� ������ ����Ѵ�.
		 */
		
		int[] scores = { 66, 77, 88, 11, 99, 55 };
		/* �Ʒ��� ���� ��� �ǰ�, new int[]�� ������ ���� �ִ�.
		 * int[] scores = new int[]{ 66, 77, 88, 11, 99, 55 }; (O)
		 * ������ �ʱ�ȭ�� �Ǿ��� ���� ������ �׿� ���ڸ� ������ �� ����.
		 * int[] scores = new int[6]{ 66, 77, 88, 11, 99, 55 }; (X)
		 */
		
		int max = scores[0];
		
		for(int i = 1; i < scores.length; i++) {
			if(scores[i] > max) {
				max = scores[i];
				
			}
			}
		System.out.println("�ִ� �� : " + max);	
	}
}