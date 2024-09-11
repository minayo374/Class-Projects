
public class Circle {
	private double radius;
	private double PI = 3.14159;
	
	//constructor with and without parameter.
	public Circle() {}
	public Circle(double r) {radius = r;}
	//setter and getter for radius

	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	//getting area by PI * radius * radius
	public double getArea() {
		return PI * Math.pow(radius, 2);
	}
	//calculating diameter
	public double getDiameter() {
		return radius * 2;
	}
	//calculating circumference
	public double getCircumference() {
		return 2 * PI * radius;
	}
	
}
