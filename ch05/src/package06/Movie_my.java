package package06;

public class Movie_my implements Comparable<Movie_my>{
	private int rank;
	private String title;
	private double score;
	private int audience;
	// ���ĵǴ� ����(compareTo �޼ҵ�)
	@Override
	public int compareTo(Movie_my target) {
		return this.title.compareTo(target.getTitle());
	}
	// �ߺ� ����(equals, hashCode �޼ҵ�)
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Movie_my) {
			Movie_my target = (Movie_my)obj;
			if(this.title == target.title) {
				return true;
			}
		}
		return false;
	}
	@Override
	public int hashCode() {
		return title.hashCode();
	}
	public Movie_my() {
		super();
	}
	public Movie_my(String title) {
		super();
		this.title = title;
	}
	public Movie_my(int audience) {
		super();
		this.audience = audience;
	}
	public Movie_my(String title, double score, int audience) {
		super();
		this.title = title;
		this.score = score;
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
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public int getAudience() {
		return audience;
	}
	public void setAudience(int audience) {
		this.audience = audience;
	}
}
