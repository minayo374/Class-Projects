
public class BookArray {
	static public void main(String[] arg) {
		Book[] books = {new Fiction("Minayo is a cat"), new Fiction("Minayo is a dog"), new Fiction("Minayo is healthy"),
						new NonFiction("Minayo is a human"), new NonFiction("Minayo is unhealthy")};
		for (Book b : books) {
			System.out.println(b.getTitle() + ": $" + b.getPrice());
			System.out.println();
		}
	}
}
