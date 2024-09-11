import java.util.Scanner;

public class Q10 {
	static public void main(String[] arg) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a positive nonzero integer");
		int inp = in.nextInt();
		
		int total = 0;
		
		for (int i = 0; i <= inp; i++) {
			total += i;
		}
		
		System.out.println("The sum of all integers from 1 up to " + inp + " is: " + total);
	}
}
