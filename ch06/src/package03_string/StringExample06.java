package package03_string;

public class StringExample06 {
	public static void main(String[] args) {
		String ssn = "900903-2101111";
		
		// ���ڿ��� �κ������� ������ �� (�ε����� ù��°�� 0��° �ڸ��� �ǰ�, endIndex -1 ó���ȴ�.)
		// ���� �׳� "�����ڸ� �̰ڴ�." ��� �����ϸ� �򰥸��� �ʴ´ٰ� �ϽŴ�.
		String frontNum = ssn.substring(0, 6);	// 0 ~ 5(6��)
		// �ڿ� endIndex�� �����Ǿ� ���� ������ �ش� �ε������� ������ �̴´�.
		String endNum = ssn.substring(7);		// 7 ~ ��
		
		System.out.println("�� �ڸ� : " + frontNum);
		System.out.println("�� �ڸ� : " + endNum);
		System.out.println("�� �ڸ� : " + endNum.substring(0, 2) + "*****");	// 0 ~ 1(2��)
		System.out.println("�� �ڸ� : " + ssn.substring(7).substring(0, 2) + "*****");	// 0 ~ 1(2��) ���� �������� *���� ������ ä��
	}
}
