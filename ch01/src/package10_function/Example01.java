package package10_function;

public class Example01 {
	public static void main(String[] args) {
	int n = f(5);			// ��� ���� ���� �޴´�. (���� 2)
	System.out.println(n);	// �������� ��� ���� ����� �� �ִ�. (���� 3)
	
	int scores1[] = { 44, 11, 22, 33, 15};
	n = maxFunc(scores1);	
	System.out.println(n);
	
	int scores2[] = { 33, 11, 55};
	n = maxFunc(scores2);
	System.out.println(n);
	}
	/* f(x)�� class �ȿ� �־�� �Ѵ�. ����� ���� main �Լ� �ȿ��� ����Ѵ�.
	 * �Լ��� ���� ���� public static�� �� ������Ѵ�.
	 * public static(��ȯ��) void f(�Լ���)(int x)(�Ű����� 1��) { - ������ �þ �� �ִ� �� �Ű����� �ۿ� ����.
	 * �Ű������� �Ű�ü�� �Ǵ� ������ ������ �Լ� ������ ������ִ� ������ �Ѵ�.(�μ��� - �� : ����)
	 */
	// �Լ�1 (int �迭��) : ������ ������ ���� ���� �Լ��� �ڷ����� �����ȴ�.
	// ����, �Լ�1 �� int �迭���� ������ ������ �Լ��� ���� �� ������ ���� �迭���̱� �����̴�.
	public static int maxFunc(int[] scores) {	// maxFunc�� ���� ū ���� �����ִ� �ǹ�
		int m = scores[0];
		for(int i = 1; i < scores.length; i++) {
			if(scores[i] > m) {
				m = scores[i];
			}
		}
		return m;
	}
	// �Լ�2 (int ������) : ������ ������ ���� ���� �Լ��� �ڷ����� �����ȴ�.
	public static int f(int x) {	// void�� �� �����̶� �ǹ��̹Ƿ�, ��ȯ�Ǵ� x�� �ڷ����� �Է������ �Ѵ�. 
		return x + 1;				// ��� ���� ����϶�� ����ߴ� �Լ��� �����ش�. (���� 1)
	}
}
