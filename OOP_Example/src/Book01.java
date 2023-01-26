
public class Book01 {

	private String title;
	private Author01 author;
	private int page;
	
	public Book01(String title, Author01 author, int page) {
		this.title = title;
		this.author = author;
		this.page = page;
	}
	
	public Book01(String title, Author01 author) {
		this.title = title;
		this.author = author;
		this.page = 0;
		//this(title, author, 0);
	}
	
	public Book01() {
		this.title = null;
		this.author = null;
		this.page = 0;
		//this(null, null, 0);
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public Author01 getAuthor() {
		return this.author;
	}
	
	public void setPage(int page) {
		this.page = page;
	}
	
	public int getPage() {
		return this.page;
	}
	
	public String toString() {
		return getTitle() + " has " + getPage() + " page write by " + author;
	}
}
