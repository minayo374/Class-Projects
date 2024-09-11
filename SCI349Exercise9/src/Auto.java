
public abstract class Auto {
	private String make;
	private double price;
	Auto(String m){
		this.make = m;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
