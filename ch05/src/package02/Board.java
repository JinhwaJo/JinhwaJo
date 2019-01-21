package package02;

public class Board {
	private String title;
	private String content;
	private String writer;
	private String password;
	
	public Board() { }
	public Board(String title, String content, String writer, String password) {
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.password = password;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
