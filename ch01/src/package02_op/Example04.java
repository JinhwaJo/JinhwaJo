package package02_op;

public class Example04 {
	public static void main(String[] args) {
		// �������� &&(AND), ||(OR), ^(XOR) �� ����� boolean
		System.out.println(5 < 2 && 3 < 2);			// &&(AND)(�� ��)�� ��� ������ ���� �� true�� �ȴ�.
		System.out.println(2 < 5 || 1 < 2);			// ||(OR)(�� ��)�� �ϳ��� ���Ǹ� ���̶� true�� �ȴ�. �� �Ŀ����� ���� ���� ���̶� ���� ���� �˻��� �ʿ䰡 ����.
		System.out.println(5 < 2 ^ 5 > 3);			// �� ����� �ٸ� ��츸 true�� �ȴ�.
		System.out.println(!(1 < 3) || (3 < 7));	// �� �Ŀ����� !�� ���� ��ȣ �� ���� �ٷ� �����ϰ�
		System.out.println(!(1 < 3 || 3 < 7));		// �� �Ŀ����� !�� �������� �����Ѵ�. �ش� �� �Ŀ����� ��ȣ�� ��ġ�� ���� �޶����� ���� ������ �����Ѵ�.
		System.out.println(7 > 10 && 4 > 2 || 4 < 2);          

	}
}
