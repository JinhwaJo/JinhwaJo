package package07_for;

public class Example07 {
	public static void main(String[] args) {
		// ��ø for�� : �ݺ��� �ȿ� �� �ٸ� �ݺ����� �ۼ����� ��
		// ���� �����ϱ� ���� ����, ���� 60���� �Ǿ�� 1�ð��� �ȴ� ?
		// ������
		for(int i = 2; i <= 9; i++) {		// ���� ����
			System.out.println("-----" + i + "�� ���� -----");
			for(int j = 1; j < 10; j++ ) {	// ���� ����
				System.out.println(i + "x" + j + " = " + (i * j));
			}
			System.out.println("-------------");
			
		}
	}
}
