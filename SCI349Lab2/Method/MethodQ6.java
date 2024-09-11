import java.util.Scanner;

public class MethodQ6 {
	static boolean isEven(int num) {
		boolean ans = false;
		if (num%2==0) {
			ans = true;
		}
		return ans;
	}
	
	static public void main(String[] arg) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = in.nextInt();
		if(isEven(num)) {
			System.out.println("This is an even number");
		}
		else {System.out.println("This is not an even number");}
		
	}
}
