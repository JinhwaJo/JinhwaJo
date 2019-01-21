package package02;

public class Board_my {
	private String title;
	private String content;
	private String writer;
	private int password;
	
	public Board_my() {}
	public Board_my(String title, String content, String writer, int password) {
		this.title = title;
		this.content = content;
		this.writer = writer;
		this. password = password;
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
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
}
