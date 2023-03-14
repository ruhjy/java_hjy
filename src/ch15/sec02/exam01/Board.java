package ch15.sec02.exam01;

public class Board {

	private String suject;
	private String content;
	private String writer;

	public Board(String suject, String content, String writer) {
		this.suject = suject;
		this.content = content;
		this.writer = writer;
	}

	public String getSuject() {
		return suject;
	}

	public void setSuject(String suject) {
		this.suject = suject;
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

}
