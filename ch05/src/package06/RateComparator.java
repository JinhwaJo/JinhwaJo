package package06;
import java.util.Comparator;
public class RateComparator implements Comparator<Movie> {
	@Override
	public int compare(Movie m1, Movie m2) {
		// 0.0 ~ 5.0 또는 0.0 ~ 10.0점 등등 소수점 이하수를 정수로 변환하고 연산
		return (int)(m1.getRate() * 10) - (int)(m2.getRate() * 10);
	}
}
