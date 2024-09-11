
public class Triangle extends GeometrigFigure{
	Triangle(int h, int w, String t){
		super(h, w, t);
	}
	public double getArea() {
		return (super.getHight() * super.getWidth())/2;
	}
	public void ShowType() {
		System.out.println(super.getType() + "'s area is " + getArea());
	}
	public void DisplaySides() {
		System.out.println("This object has 3 sides");
	}
}
