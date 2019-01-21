package package02;

public class Point3D extends Point {	// �ڽ� Ŭ����(3���� ��ǥ)
	int z;
	
	public Point3D() {
		super();	// �ڽ��� ����Ʈ �����ڴ� �θ��� ����Ʈ �����ڸ� ȣ���Ѵ�.
		this.z = 5;
		/* �θ� Ŭ������ ��ӹ޾� �ڽ� Ŭ������ ���� �ϵ��� �ϴ� �����̹Ƿ�
		 * x, y�� �켱�ϰ�, �״��� z�� ������� �ȴ�.
		 * �׷��� this.z = 5; �� super();�� ���� �ٲ� �ۼ��ϸ� ������ ����.	 */
	}
	
	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = 5;
	}
	
	public void method() {
		/* ���� ��Ű�� ���� �ڽ� Ŭ������ super ��ɾ�(protected)��
		 * ��ü ���� �� ��� ���� �����ڷ��� ����� ������ ����(default)�ϴ�.	 */
		super.x = 10;	// protected
		super.y = 15;	// protected
		Point point = new Point();
		point.x = 10;	// default
		point.y = 15;	// default
		 
	}
	
	public static void main(String[] args) {
		Point3D point3D1 = new Point3D(1, 2, 3);
		Point3D point3D2 = new Point3D();
		
	}

}
