import java.util.Scanner;

public class Q2 {
	static public void main(String[] arg) {
		Scanner in = new Scanner(System.in);
		int size = 5;
		double num[] = new double[size];
		double input;
		//get input from user for size times
		for (int i = 0; i < size; i++) {
			System.out.println("Type the double number: ");
			num[i] = in.nextDouble();;
		}
		//print out the array
		for (int i = 0; i < size; i++) {
			System.out.print(num[i] + " ");
		}
		
	}
}
