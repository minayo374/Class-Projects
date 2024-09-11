import java.util.Scanner;

public class Q11 {
	static public void main(String[] arg) {
		Scanner in = new Scanner(System.in);	
		Scanner in2 = new Scanner(System.in);
		int total = 0;
		boolean choice = false;
		String answer;
		
		do {
			System.out.println("Enter a positive nonzero integer");
			int inp = in.nextInt();
			for (int i = 0; i <= inp; i++) {
			total += i;
			}
			System.out.println("The sum of all integers from 1 up to " + inp + " is: " + total);
			total = 0;
			System.out.println("Do you want to continue? Enter \'y\' for yes or any other character for no");
			answer = in2.nextLine();
			if (answer.matches("y")) {
				choice = false;
			}
			else {choice = true;}			
		}
		while (!choice);
	}
}
