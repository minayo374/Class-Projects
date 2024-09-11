
public abstract class Book {
	private String title;
	protected double price;
	Book(String t){
		this.title = t;
	}
	public String getTitle() {
		return title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
