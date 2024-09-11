import java.text.DecimalFormat;

public class P2Q2 {
	static public void main(String[] arg) {
		Shape[] shapes = {new Rectangle(), new Rectangle(2.00, 3.00), new Circle(), new Circle(2)};
		DecimalFormat df = new DecimalFormat("#.00");
		for (Shape shape: shapes) {
			System.out.println("Shape: " + shape.getClass().getSimpleName());
			System.out.println("Area: " + df.format(shape.getArea()));
			System.out.println("Perimeter: " + df.format(shape.getPerimeter()));
			System.out.println();
		}
	}
}
