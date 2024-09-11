
public class Book {
	private String title;
	private String author;
	private String publisher;
	private String copiesSold;
	
	//instructor with argument
	public Book(String t, String a, String p, String c) {
		title = t;
		author = a;
		publisher = p;
		copiesSold = c;
	}
	
	//accessor and mutator
	public void setTitle(String t) {
		title = t;
	}
	public String getTitle() {
		return title;
	}
	public void setAuthor(String a) {
		author = a;
	}
	public String getAuthor() {
		return author;
	}
	public void setPublisher(String p) {
		publisher = p;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setCopiesSold(String c) {
		copiesSold = c;
	}
	public String getCopiesSold() {
		return copiesSold;
	}
}
