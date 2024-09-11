
public class Square extends GeometrigFigure{
	Square(int h, int w, String t){
		super(h, w, t);
	}
	public double getArea() {
		return super.getHight() * super.getWidth();
	}
	public void ShowType() {
		System.out.println(super.getType() + "'s area is " + getArea());
	}
	public void DisplaySides() {
		System.out.println("This object has 4 sides");
	}
}
