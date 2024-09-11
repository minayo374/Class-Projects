import java.util.Scanner;  // Needed for the Scanner class

public class Quiz1 {
	static public void main (String[] arg) {
		int flag = 1;	//flag for while loop
		int total = 1;	//total sum. added 1 because it will be -1 for ending loop
		int temp;	//temp storage for user input
		Scanner in = new Scanner(System.in);	//scanner object for user input
		//print out the message to user
		System.out.println("Enter a series of positive integers (end with -1):");
		//this loop will keep summing user input until user type -1
		while (flag == 1) {
			temp = in.nextInt();
			if (temp == -1) {flag = -1;}
			total += temp;
		}
		//print out the total 
		System.out.println("Sum of positive intefer is: " + total);
	}
}
