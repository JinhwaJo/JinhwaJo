package package02_1;
import package02.Point;
/* �ٸ� ��Ű�� JRE System Library�ȿ� ����Ǵ� jar���Ϸ� ����
 * import ��ɾ ����ؾ� ��ӹ��� �� �ִ�. */


public class Point4D extends Point {
	public void method() {
		// super(�θ�) ��ɾ�θ� ������ �����ϰ�, 
		super.x = 50;
		// ���ο� �θ� ��ü�� ������ �Ŀ��� ������ �� ����.(setter & getter�� ����ؾ���)
		Point point = new Point();
		// point.x = 10; (X)
		// point.y = 20; (X)
	}
}
