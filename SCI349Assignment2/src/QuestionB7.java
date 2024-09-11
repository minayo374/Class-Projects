import java.util.Scanner;

public class QuestionB7 {
	static public void main(String[] arg) {
		Scanner in = new Scanner(System.in);
		Scanner in2 = new Scanner(System.in);
		double balance = 5423.00;
		double amount = 0;
		int user = 0;
		
		System.out.println("1- Withdrawal");
		System.out.println("2- Deposit");
		System.out.println("3- Check Balance");
		System.out.println("4- Exit");
		user = in.nextInt();
		
		if (user == 1) {
			System.out.println("How much?");
			amount = in.nextDouble();
			balance -= amount;
			System.out.println("Your balance is: " + balance);

		}
		else if (user == 2) {
			System.out.println("How much?");
			amount = in.nextDouble();
			balance += amount;
			System.out.println("Your balance is: " + balance);

		}
		else if (user == 3) {
			System.out.println("Your balance is: " + balance);
		}
		else {
			System.out.println("Thank you");

		}
	}
}
