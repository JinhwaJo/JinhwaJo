package package06;
import java.util.Comparator;
public class RateComparator implements Comparator<Movie> {
	@Override
	public int compare(Movie m1, Movie m2) {
		// 0.0 ~ 5.0 �Ǵ� 0.0 ~ 10.0�� ��� �Ҽ��� ���ϼ��� ������ ��ȯ�ϰ� ����
		return (int)(m1.getRate() * 10) - (int)(m2.getRate() * 10);
	}
}
