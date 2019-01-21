package package02;
/* ����������(Ŭ���� : 2��)
 * public : ��� Ŭ�������� ����� ������ Ŭ����
 * default : �ش� Ŭ������ ���� ��Ű�������� ����� ������ Ŭ����
 * Ŭ�����ʹ� �޸�, �ʵ�, ������, �޼ҵ忡���� ��� ���� �����ڰ� ��밡��	 */
public class Point {	// �θ� Ŭ����(2���� ��ǥ)
	/* ���� �������� ���� : public, private, default, protected 
	 * public�� ���� ȭ���ó�� ��� Ŭ����(��� �����)���� �����Ӱ� ���� ������ ���(�ٸ� ������Ʈ ������ ��� �Ұ�)
	 * private�� �ϵ峪 RAMó�� �ش� Ŭ����(��ǻ��)������ ��� ������ ���
	 * default�� ���� ��Ű��(��) ���� Ŭ�����鸸 ���� ������ ���
	 * protected�� �ش� Ŭ������ ����, �ٸ� ��Ű�� ���� �ڽ� Ŭ�����鸸 ���� ������ ���(�θ� �ڽ� ����)
	 */
	protected int x;	// public ���� ������
	int y;			// ����Ʈ ���� ������
	/* �θ�Ŭ������ ����Ʈ �����ڰ� ������ �ڽ� Ŭ������ ������ �߻��ϹǷ�
	 * �׻� �⺻���� ���������� ����.	 */
	public Point( ) {
		
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}