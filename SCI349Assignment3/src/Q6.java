import java.util.Scanner;

public class Q6 {
	static public void main(String[] arc) {
		Circle c = new Circle();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a radius");
		double r = in.nextDouble();
		c.setRadius(r);
		System.out.println("Area: " + c.getArea());
		System.out.println("Diameter: " + c.getDiameter());
		System.out.println("Circumference: " + c.getCircumference());

	}
}
