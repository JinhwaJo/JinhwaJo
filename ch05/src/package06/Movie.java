package package06;

public class Movie implements Comparable<Movie>{
	private int rank;
	private String title;
	private double rate;
	private int audience;
	
	// 기본 정렬 : 순위 순
	@Override
	public int compareTo(Movie target) {
		return this.rank - target.rank;
	}
	
	// 중복 기준 : 제목
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Movie) {
			Movie target = (Movie)obj;
			if(this.title.equals(target.title)) {
				return true;
			}
		}
		return false;
	}
	// 중복 기준 : 제목
	@Override
	public int hashCode() {
		return title.hashCode();
	}
	
	public Movie() {
		super();
	}
	public Movie(String title) {
		super();
		this.title = title;
	}

	
	public Movie(String title, double rate, int audience) {
		super();
		this.title = title;
		this.rate = rate;
		this.audience = audience;
	}
	
	public Movie(int rank, String title, double rate, int audience) {
		super();
		this.rank = rank;
		this.title = title;
		this.rate = rate;
		this.audience = audience;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public int getAudience() {
		return audience;
	}
	public void setAudience(int audience) {
		this.audience = audience;
	}
	
	
}
