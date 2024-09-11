import java.util.Scanner;

public class MethodQ5 {
	static double calcArea(int r) {
		return 3.14*r*r;
	}
	static double calcCircumference(int r) {
		return 2*3.14*r;
	}
	static double calcDiameter(int r) {
		return 2*r;
	}
	
	static public void main(String[] arg) {
		Scanner in = new Scanner(System.in);
		Scanner in2 = new Scanner(System.in);
		System.out.println("Enter a radius");
		int r = in.nextInt();
		System.out.println("Enter\nA or a: Area\nC or c: Circumference\nD or d: Diameter");
		String choice = in2.nextLine();
		if (choice.equals("A") || choice.equals("a")) {
			System.out.println("Area is " + calcArea(r));
		}
		else if (choice.equals("C") || choice.equals("c")) {
			System.out.println("Area is " + calcCircumference(r));
		}
		else if (choice.equals("D") || choice.equals("d")) {
			System.out.println("Area is " + calcDiameter(r));
		}
		else {System.out.println("Invalid choice");}
		
	}
}
