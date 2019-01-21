package package03_string;

public class StringExample05 {
	public static void main(String[] args) {
		String str1 = "C���� ��ü������ �Դϴ�.";
		
		// �ش� ���ڿ�(����)�� ������ ���ڿ�(������)�� ġȯ�Ѵ�.
		// �ش� ���ڿ��� ������ �ִٸ� ��� ġȯ�ȴٴ� ���� �����Ѵ�.
		/* String���� replace�� ����ϸ� ���ο� ��ü�� �����Ͽ� �ּ��� ��ġ�� �ٲٰ�, ���ο� �޸𸮸� �����Ѵ�.
		 * �̷ν�, ���ο� ��ü�� �����ϰ� �Ǹ�, ������ �ִ� ��ü�� ������� �ʰ� ���� �ִ�. (���� ������� �𸥴�.)
		 * JAVA������ JVM�� ���� �޸𸮰� �ڵ����� �����Ǵµ�, ����ڰ� ���ϴ´�� ������� �ʴ´ٴ� ������ String Ŭ������ ������ �˼� �ִ�.
		 * (��ü�� �߰�/������ �̷���� �� ���� �޸𸮰� ����)
		 * �̷��� �޸𸮿� ���� String�� ������ ������ ���� StringBuffer�̴�. StringBuffer�� ���ο� ��ü�� �����Ͽ� �����ϴ°��� �ƴ� �� ��ü�� �����Ѵ�. 
		 * �ٽø���, String�� ���ڿ��� �Һ��ϰ�, StringBuffer�� ���ڿ��� �������� Ư���� ������. */
		String str2 = str1.replace("��ü", "����");
		System.out.println(str2);
		
		String str3 = str1.replace("C���", "JAVA");
		System.out.println(str3);
		
		/* replaceAll(�Ǵ� replace) �� �ش� ���ڿ��� ��� ������ ���ڿ��� �����ϰ�,
		 * replaceFirst �� ���� ù ���ڿ��� �����Ѵ�.		 */
		String str4 = str1.replaceFirst("���", "");
		System.out.println(str4);
				
	}
}
