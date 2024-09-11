
public class Circle implements Shape{
	private double radius;
	Circle(){
		this.radius = 0;
	}
	Circle(double r){
		radius = r;
	}
	public double getArea() {
		return 3.1415*radius*radius;
	}
	public double getPerimeter() {
		return 2*3.1415*radius;
	}
}
