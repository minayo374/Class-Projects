import java.util.Scanner;

public class MethodQ7 {
	static int getOccurences(String str, char ch) {
		int total = 0;
		for (int i  = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				total++;
			}
		}
		return total;
	}
	static public void main(String[] arg) {
		Scanner in1 = new Scanner(System.in);
		Scanner in2 = new Scanner(System.in);

		System.out.println("Enter a string");
		String str = in1.nextLine();
		System.out.println("Enter a character");
		String str2 = in2.nextLine();
		char ch = str2.charAt(0);
		
		System.out.println("\'" + ch + "\'" + " occures " + getOccurences(str, ch) 
						   + " times in " + "\"" + str + "\"");
	}
}
