package package03_string;

public class StringExample09 {
	public static void main(String[] args) {
		String text = "������&����ũ,�ֿ��-���¿�,��õ��";
		
		// �Ʒ� �Ŀ��� split�� �迭�� ��ȯ�ȴ�.
		// �Ʒ��ʹ� �� �ٸ� ���� : String[] names = text.split("&|,|-");
		String[] names = text.split("&");	// ���ڿ� �и�(������(����ǥ����)�� ���)
		
		// Ȯ�� for �� : �迭 �Ǵ� �÷����� ó������ ������ �ݺ��� �� ���
		for(String nm : names) {
			System.out.println(nm);
		}
		
		// Ȯ�� for��
		int[] scores = new int[] { 44, 33, 22 };
		int sum = 0;
		/* Ȯ�� for������ ���ʿ� (�ϳ��� ������ �� �ִ�) ���� ������ ����,
		 * �����ʿ� (�����͸� ���� ������ �� �ִ�) �迭�̳� Ŭ������ �;��ϰ�, ���� ������ �� �� ����.	 */
		for(int n : scores) {	
			sum += n;
		}
		System.out.println("�հ� : " + sum + "��");
	}
}
