import java.util.Scanner;
public class Q4 {
	static public void main(String[] arg) {
		System.out.println("Enter a ward");
		Scanner in = new Scanner(System.in);
		String inp = in.nextLine();
		int length = inp.length();
		
		for (int i = 0; i < length; i++) {
			char letter = inp.charAt(i);
			System.out.println(letter);
		}
	}
}
