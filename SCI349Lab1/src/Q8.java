import java.util.Scanner;

public class Q8 {
	static public void main(String[] arg) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a ward");
		String keyboard = in.nextLine();
		
		while (!keyboard.matches("done")) {
			if (keyboard.charAt(0) == keyboard.charAt(keyboard.length()-1)) {
				System.out.println("The first letter and the last letter are the same.");
			}
			else {
				System.out.println("The first letter and the last letter are not the same.");
			}
			keyboard = in.nextLine();
		}
		System.out.println("done!");
	}
}
