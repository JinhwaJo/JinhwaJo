package package02_op;

public class Example08 {
	public static void main(String[] args) {
		int score = 95;
		
		// char grade = '��'; 	���� ����ǥ
		char grade = (score > 90) ? 'A' : 'B';
		// "(���ǽ�)? �����ϸ� X : �ƴϸ� Y" �� �����̴�.
		// 'A', 'B' ó��, ���� ���� ����ǥ�� �Ǿ������Ƿ� char�� �־��ش�.
		System.out.println(score + "���� " + grade + "�Դϴ�.");

		
		// String g = "��";		ū ����ǥ
		String g = (score > 90) ? "A" : "B";
		System.out.println(score + "���� " + g + "�Դϴ�.");
		
		char ch = 'B';
		// ch�� ���� �빮���̸�? [(char)(ch + 32) ����] �ƴϸ� [ch ����]
		ch = (ch >= 'A' && ch <= 'Z') ? (char)(ch + 32) : ch;
		System.out.println(ch);
		// �ҹ��ڰ� �빮�ں��� 32 ũ��. A = 65, a = 97, ���� 0 = 48
		
		// ������ �޾� ����̾簡�� ����Ͻÿ�.
		String s = 
				(score > 100 || score < 0) ? "1 ~ 100������ �Է��ϼ���." :
				(score >= 90) ? "��" : 
				(score >= 80) ? "��" : 
				(score >= 70) ? "��" : 
				(score >= 60) ? "��" : "��";
		System.out.println(s);
		// ���ǽ��� �����ϴ� ���� ����Ǹ� �ش� ���� �����ϰ� ������ �Ǹ�, ������ ���ǽ��� ������� �ʴ´�.
		
		
	}
}
