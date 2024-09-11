import java.util.Scanner;

public class QuestionB9 {
	static public void main(String[] arg) {
		Scanner inp1 = new Scanner(System.in);
		Scanner inp2 = new Scanner(System.in);
		System.out.println("Type first string");
		String str1 = inp1.nextLine();
		System.out.println("Type second string");
		String str2 = inp2.nextLine();

		if (str1.length() > str2.length()) {
			System.out.println("First string is longer");
		}
		else if (str1.length() < str2.length()) {
			System.out.println("First string is shorter");
		}
		else {
			System.out.println("Same length");
		}
	}
}
