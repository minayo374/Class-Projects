import java.util.Scanner;

public class Q5 {
	static public void main(String[] arg) {
		int total = 0, inp = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a series of positive intefers (end with -1)");
		
		while (inp != -1) {
			inp = in.nextInt();
			if (inp != -1) {
				total += inp;
			}
		}
		System.out.println("Sum of all positive integer is:" + total);

	}
}
