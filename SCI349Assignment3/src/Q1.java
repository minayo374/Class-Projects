
public class Q1 {
	static public void main(String[] arg) {
		//set up the valuables
		String title = "The Magic Tree";
		String author = "Minayo Stotz";
		String publisher = "Adventure Time Narratives";
		String copiesSold = "Zipangu";
		Book b = new Book(title, author, publisher, copiesSold);
		//Print our the valuables in the class with get functions
		System.out.println(b.getTitle());
		System.out.println(b.getAuthor());
		System.out.println(b.getPublisher());
		System.out.println(b.getCopiesSold());
		//valuable change with set function and print out the changes
		title = "The Magic";
		author = "Minayo";
		publisher = "Adventure Time";
		copiesSold = "Zipangu: Japan";
		b.setTitle(title);
		b.setAuthor(author);
		b.setPublisher(publisher);
		b.setCopiesSold(copiesSold);
		System.out.println();
		System.out.println("Field name changed by set functions");
		System.out.println(b.getTitle());
		System.out.println(b.getAuthor());
		System.out.println(b.getPublisher());
		System.out.println(b.getCopiesSold());
	}
}
