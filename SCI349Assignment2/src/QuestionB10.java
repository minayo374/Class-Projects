import java.util.Scanner;

public class QuestionB10 {
	static public void main(String[] arg) {
		Scanner inp1 = new Scanner(System.in);
		Scanner inp2 = new Scanner(System.in);
		Scanner inp3 = new Scanner(System.in);
		String str1, str2, str3;
		
		System.out.println("Type the first string");
		str1 = inp1.nextLine();
		System.out.println("Type the second string");
		str2 = inp2.nextLine();
		System.out.println("Type the third string");
		str3 = inp3.nextLine();
		
		if (str1.length() < str2.length() && str2.length() < str3.length()) {
			System.out.println(str1 + "\t" + str2 + "\t" + str3);
		}
		else if (str1.length() < str2.length() && str2.length() > str3.length()) {
			System.out.println(str1 + "\t" + str3 + "\t" + str2);
		}
		else if (str1.length() > str2.length() && str1.length() > str3.length() && str2.length() < str3.length()) {
			System.out.println(str2 + "\t" + str3 + "\t" + str1);
		}
		else if (str1.length() > str2.length() && str1.length() < str3.length()) {
			System.out.println(str2 + "\t" + str1 + "\t" + str3);
		}
		else if (str1.length() < str2.length() && str1.length() > str3.length()) {
			System.out.println(str3 + "\t" + str1 + "\t" + str2);
		}
		else if (str1.length() > str2.length() && str2.length() > str3.length()) {
			System.out.println(str3 + "\t" + str2 + "\t" + str1);
		}
	}
}
