package package09_array;

public class Example01 {
	public static void main(String[] args) {
		// 5���� ������ ������ �� �ִ� �迭 scores
		// ���� �׿��� ���ڸ� ������ �� ����.
		int[] scores = new int[5];
		
		int k = 1;
		// �迭�� �ε����� ������ �����͸� �����ϴ� ���
		// �ε��� ��ȣ�� �׻� ����, ������, ���� ���� �� �� ������ �Ǽ��� �� �� ����.
		scores[0] = 50;		// ó�� �ε����� �׻� 0
		scores[1] = 35;
		scores[k + 1] = 70;
		scores[3] = 13;
		scores[4] = 88;		// ������ �ε����� �׻� ���� -1
		
		// scores = new int[3]; �ٸ� �ּҸ� �����ϰ� �ǹǷ� �߸��� �����̴�.(���� �ִ� ���� ����� �� ����)
		
		// �ݺ����� �̿��� �迭�� ����� ���� ��� ����Ѵ�.
		// �迭�� ������ �׻� �ݺ����� ����.
		for(int i = 0; i < scores.length; i++) {
			System.out.println("scores["+i+"] = " + scores[i]);
		}
	}
}
