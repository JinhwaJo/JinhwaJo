package package05_math;

public class MathExample01 {
	public static void main(String[] args) {
		/* ���� ���� API Ŭ����
		 * �޼ҵ尡 static �̹Ƿ� ������ ��ü�� ������ �ʿ䰡 ����.		 */
		System.out.println(Math.PI);			// ���� �� 
		System.out.println(Math.ceil(34.46));	// �ø�
		System.out.println(Math.floor(34.76));	// ����
		System.out.println(Math.round(34.46));	// �ݿø�
		System.out.println(Math.abs(34.46));	// ���밪
		System.out.println(Math.abs(-34));		// ���밪
		System.out.println(Math.max(20, 30));	// �� �� �� ū ��
		System.out.println(Math.min(20, 30));	// �� �� �� ���� ��
		System.out.println(Math.pow(2, 3));		// 2^3 (�ŵ�����)
		System.out.println(Math.sqrt(2));		// ������
		System.out.println(Math.random());		// ���� ��(0.0 <= ���� < 1.0)
	}
}
