
public class Area {
	public Area() {}
	//area of rectangle
	public double area(int w, int l) {
		return w * l;
	}
	//area of Cylinder
	public double area(double r, double l) {
		return 3.14 * r * r * l;
	}
	//area of circle
	public double area(double r) {
		return 3.14 * r * r;
	}
}
