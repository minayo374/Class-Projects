
public class Circle {
	private double radius;
	private double PI = 3.14159;
	public Circle() {}
	public Circle(double r){
		radius = r;
	}
	public void setRadius(double r) {
		radius = r;
	}
	public double getRadius() {
		return radius;
	}
	public double getArea() {
		return PI*radius*radius;
	}
	public double getDiameter() {
		return 2*radius;
	}
	public double getCircumference() {
		return 2*PI*radius;
	}
}
