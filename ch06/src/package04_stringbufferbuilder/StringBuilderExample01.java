package package04_stringbufferbuilder;

public class StringBuilderExample01 {
	public static void main(String[] args) {
		/* ���ڿ��� �����ϴ� �۾��� �� �� String Ŭ������ �޼ҵ��
		 * ���ο� ��ü�� �����ϰ� �����ϴ� �����̹Ƿ�, �޸��� ������ ���Ͻ�ų �� �ִ�.
		 * java.lang.StringBuffer �Ǵ� StringBuilder API Ŭ������ ����ϸ�
		 * ���� ����(�����͸� �ӽ÷� �����ϴ� �޸�)�� ���ڿ��� �����س���, �� �ȿ���
		 * �߰�, ����, ���� �۾��� �� �� �ֱ� ������ �ϳ��� ��ü���� �̿��� ���ڿ� ������
		 * �����ϴ�. (String�� ������ ����)
		 * 
		 * StringBuffer : ��Ƽ������ ȯ�濡�� ����(safe)�ϵ��� ����ȭ�Ǿ� ����.
		 * StringBuilder : ����ȭ�� ���� ���α׷� �ӵ� ���Ϸ� ���� ���� �����忡�� ����ȭ�� ���� ����� �� �ֵ��� �����.
		 * (��Ƽ �����忡���� Buffer, ���� �����忡���� Builder�� �ַ� �����.)
		 * 
		 * �� �ܼ��� ���ڿ��� �����ϰ�, ��븸 �� ���� String Ŭ������ �ӵ��� �� ������ ������
		 * �߰�, ����, ������ ����� ��쿡�� ����ϴ� ���� ����.		 */
		StringBuilder sb = new StringBuilder();	// ��ü ����
		
		sb.append("C, ");	// ���ڿ� �߰�
		sb.append("Java, ");
		sb.append("C#");
		
		System.out.println(sb);
		// String a = sb.insert(3, "C++, ").toString();	- �ٸ� ������ �����ϰ� ���� ���� toString�� ���
		sb.insert(3, "C++, ");			// �߰��� ���ڿ� ����("")
		System.out.println(sb.toString());
		
		sb.setCharAt(1,  'C');			// �߰��� ���� ����('')
		System.out.println(sb.toString());
		
		String str = sb.toString();		// String str = sb; (�Ұ����� ����)
		System.out.println(str);
		
		sb.delete(1, sb.length());		// 1 ~ ������ ���ڿ� ����
		System.out.println(sb.toString());
		
		sb.replace(0, 1, "Java");		// 0 ~ 0�� ���ڿ��� "Java"�� ġȯ
		System.out.println(sb.toString());
	}
}
