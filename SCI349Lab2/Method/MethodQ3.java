import java.util.Scanner;

public class MethodQ3 {
	static int getSquare(int num) {
		return num*num;
	}
	static double getSquare(double num) {
		return num*num;
	}
	static int getCube(int num) {
		return num*num*num;
	}
	static double getCube(double num) {
		return num*num*num;
	}
	
	static public void main(String[] arg) {
		Scanner in = new Scanner(System.in);
		Scanner in2 = new Scanner(System.in);
		
		System.out.println("Enter the integer");
		int num1 = in.nextInt();
		System.out.println("Enter the double");
		double num2 = in2.nextDouble();
		
		System.out.println("Square integer: " + getSquare(num1));
		System.out.println("Square double : " + getSquare(num2));
		System.out.println("Cube integer: " + getCube(num1));
		System.out.println("Cube double : " + getCube(num2));

	}
}
