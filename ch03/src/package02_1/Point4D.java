package package02_1;
import package02.Point;
/* 다른 패키지 JRE System Library안에 저장되는 jar파일로 만들어서
 * import 명령어를 사용해야 상속받을 수 있다. */


public class Point4D extends Point {
	public void method() {
		// super(부모) 명령어로만 접근이 가능하고, 
		super.x = 50;
		// 새로운 부모 객체를 생성한 후에는 접근할 수 없다.(setter & getter를 사용해야함)
		Point point = new Point();
		// point.x = 10; (X)
		// point.y = 20; (X)
	}
}
