package package01_var;

public class Example04 {
	public static void main(String[] args) {
		// ������ �Է� : '' �ȿ� �Է�
		char var1 = 'P';
		char var2 = 80;
		char var3 = '��';
		char var4 = 48149;
		// �����ڵ�� ������ ����
		char var5 = '\uAC00';
		
	// ���ڷ� ����ϰ� ���� �� (int)�� �ٿ��� ���� ����ȯ�� ���ش�.
		System.out.println((int)var1);	//������ P �� ���������� ���� �� ��ȯ�Ͽ� ��� : 80
		System.out.println(var5);		// �����ڵ� \uAC00 �� ���������� ��� : ��
		System.out.println((int)var5);	// �����ڵ� \uAC00 �� ������ �� �� ���������� ���� �� ��ȯ�Ͽ� ��� : 44032
		System.out.println(var2);		// ���� 80 �� ���������� ��� : P
		System.out.println((int)var3);	// ������ �� �� ���������� ���� �� ��ȯ�Ͽ� ��� : 48149
		System.out.println(var4);		// ���� 48149 �� ���������� ��� : ��
	}
}
