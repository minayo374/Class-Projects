import java.util.Scanner;

public class QuestionB8 {
	static public void main(String[] arg) {
		Scanner in1 = new Scanner(System.in);
		Scanner in2 = new Scanner(System.in);
		
		System.out.println("Enter the radiusof a circle(integer): ");
		int rad = in1.nextInt();
		
			System.out.println("(1) Enter A or a to calculate area of circle ");
			System.out.println("(2) Enter  C or c to calculate circumference of circle ");
			System.out.println("(3) Enter D or d to calculate diameter of circle ");
			String user = in2.nextLine();
		
			if (user.matches("A") || user.matches("a")) {
				float area = (float) (3.14 * rad * rad);
				System.out.println("Area is: " + area);
			}
			else if (user.matches("C") || user.matches("c")) {
				float circum = (float) (3.14 * 2 * rad);
				System.out.println("Circumference is: " + circum);
			}
			else if (user.matches("D") || user.matches("d")) {
				float diam = (float) (2 * rad);
				System.out.println("Diameter is: " + diam);
			}
			else {
				System.out.println("Invalid choice");
			}
		
		
		
	}
}
