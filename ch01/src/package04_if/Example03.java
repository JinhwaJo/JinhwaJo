package package04_if;

public class Example03 {
	public static void main(String[] args) {
		int kor = 95, eng = 46;
		double avg = (kor + eng) / 2.0;
		
		// �� ���� ����� �� ���� �ۼ��ϴ� ���� ����.
		if((kor < 0 || kor > 100) || (eng < 0 || eng > 100)) {
			System.out.println("������ �ٽ� �Է����ּ���.");
		} else {
			// ��ø if�� (if �Ǵ� else �� �ȿ� �Ǵٸ� if��)
			if(kor < 50 || eng < 50) {
			System.out.print("�� ������ 50�� �̸��̹Ƿ�, ");
			System.out.println("���հ�(����) �Դϴ�.");
		} else if(avg >= 70) {
			System.out.print("�� ������ ��� ������ 70�� �̻��̹Ƿ�, ");
			System.out.println("�հ��Դϴ�.");
		} else if(avg < 70) {
			System.out.print("�� ������ ��� ������ 70�� �̸��̹Ƿ�, ");
			System.out.println("���հ��Դϴ�.");
		} /* else {
			System.out.println("������ �ٽ� �Է����ּ���."); */
			/* if, else if, else ���� ���� ����� �� else ���� �� �ؿ� ���� �Ǽ��� ���� �Ѵ�.
			 * ������, �� �ϳ��� �ĸ� �����ϰԵǾ� �����Ƿ� �� ���� ���� �� �ؿ� ���� ��� ����� ������� �ʴ´�.
			 */
		}
	}
}
