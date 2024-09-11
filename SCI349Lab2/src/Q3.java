import java.util.Scanner;

public class Q3 {
	static public void main(String[] arg) {
		Scanner in = new Scanner(System.in);
		String pizza;
		char input;
		
		System.out.println("Enter a pizza size (S, M, L or X)");
		pizza = in.nextLine();
		input = pizza.charAt(0);
		
		if (input == 'S' || input =='s') {
			System.out.println("Pizza price for S size is $6.99");
		} 
		else if (input == 'M' || input =='m') {
			System.out.println("Pizza price for M size is $8.99");

		}
		else if (input == 'L' || input =='l') {
			System.out.println("Pizza price for L size is $12.50");

		}
		else if (input == 'X' || input =='x') {
			System.out.println("Pizza price for X size is $15.00");

		}
		else {
			System.out.println("Invalid size");

		}
		
		
	}
}
