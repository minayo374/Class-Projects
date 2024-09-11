
public class UseGeometricFigure {
	static public void main(String[] arg) {
		GeometrigFigure g[] = {new Square(1, 2, "Square"), new Triangle(2, 4, "Triangle")};
		 
		for (GeometrigFigure geo:g) {
			geo.ShowType();
			geo.DisplaySides();
		}
	}
}
