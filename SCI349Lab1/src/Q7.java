import java.util.Scanner;

public class Q7 {
	static public void main(String[] arg) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string");
		String inp = in.nextLine();
		System.out.println("Enter the character");
		char ch = in.next().charAt(0);
		
		int counter = 0;
		
		for (int i = 0; i < inp.length(); i++) {
			if (ch == inp.charAt(i)) {
				counter++;
			}
		}
		System.out.println("There are " + counter + " " + ch);
		
		
	}
}
