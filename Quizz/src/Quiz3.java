import javax.swing.JOptionPane;

public class Quiz3 {
	static public void main (String[] arg) {
		String input;
		double radius;

		//get the radius from user
		input = JOptionPane.showInputDialog("Enter the eadius");
		radius = Double.parseDouble(input);
		
		//create an object of the circle class
		//Circle circle = new Circle(radius);
		Circle circle = new Circle();
		circle.setRadius(radius);
		
		//show circle computations
		JOptionPane.showMessageDialog(null, "Area: " + circle.getArea() + "\n"
									 + "Diameter: " + circle.getDiameter() + "\n"
									 + "Circumference: " + circle.getCircumference());
	}
}
