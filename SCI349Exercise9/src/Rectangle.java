
public class Rectangle implements Shape{
	private double width;
	private double height;
	Rectangle(){
		this.width = 0;
		this.height = 0;
	}
	Rectangle(double w, double h){
		width = w;
		height = h;
	}
	public double getArea() {
		return width*height;
	}
	public double getPerimeter() {
		return 2*(width*height);
	}
}
