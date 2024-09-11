import java.util.Scanner;

public class methodQ11 {
	static boolean isValid(String pass) {
		int upper = 0; int lower = 0; int digit = 0;
		for (int i = 0; i < pass.length(); i++) {
			if (Character.isUpperCase(pass.charAt(i))) {
				upper++;
			}
			if (Character.isLowerCase(pass.charAt(i))) {
				lower++;
			}
			if (pass.charAt(i) >= '0' && pass.charAt(i) <= '9') {
				digit++;
			}
		}
		
		if (pass.length()<8 || upper == 0 || lower == 0 || digit == 0) {
			return false;
		}
		
		return true;
	}
	
	static public void main(String[] arg) {
		Scanner in = new Scanner(System.in);
		Scanner in2 = new Scanner(System.in);
		String pass1, pass2;
		boolean matched = false;
		do { 
		System.out.println("Enter passward");
		pass1 = in.nextLine();
		System.out.println("Enter passward again for confimation");
		pass2 = in2.nextLine();
		if (pass1.equals(pass2)) {
			matched = true;
		}
			
		}while(!matched);
		if(isValid(pass1)) {
			System.out.println("Valid");
		}
		else {System.out.println("Invalid passward");}
	}
}
