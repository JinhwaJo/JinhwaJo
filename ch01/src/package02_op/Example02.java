package package02_op;

public class Example02 {
	public static void main(String[] args) {
		int a = 5, b = 2;
		int result = (a + b); // ����
		System.out.println(result);
		
		result = (a - b); // �E��
		System.out.println(result);
		
		result = (a * b); // ����
		System.out.println(result);
		
		result = (a / b); // ������: ��
		System.out.println(result);
		
		result = (a % b); // ������: ������
		System.out.println(result);
		
		double r = ((double)a / b); // ������: �� - �Ǽ��� ���
		System.out.println(r);
		
		r = ((double)a % b); // ������: ������ - �Ǽ��� ���
		System.out.println(r);
		
		// ���ڿ� + ����(�Ǵ� �Ǽ�) = ���ڿ�
		String str = "5";
		System.out.println(0 + str);	//05
		System.out.println(0 + (5+"0"));	//050
		System.out.println(0 + 5 + "0");	//50
		System.out.println(0 + 5 + 0);	//5
		System.out.println(0 + "5" + 0);	//050
		
	
	
}
}
