import java.util.Scanner;
public class Q9 {
	static public void main(String[] arg) {
		Account[] accounts = new Account[10];
		for (int i = 0; i < accounts.length; i++) {
			accounts[i] = new Account(i, 50.00);
		}
		
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.println("Enter ID: ");
			int id = in.nextInt();
			if (id > accounts.length) {
				System.out.println("Invalid id");
				continue;
			}
			
			System.out.println("Main menue");
			System.out.println("1. Check balance");
			System.out.println("2. Withdraw");
			System.out.println("3. Deposit");
			System.out.println("4. Exit");
			System.out.println("Enter a choice");
			int imp = in.nextInt();
			switch(imp) {
			case 1:
				System.out.println("Balance: " + accounts[id].getBalance());
				break;
			case 2:
				System.out.println("Enter an amount");
				double amountW = in.nextDouble();
				accounts[id].withdraw(amountW);
				break;
			case 3:
				System.out.println("Enter an amount");
				double amountD = in.nextDouble();
				accounts[id].deposit(amountD);
				break;
			case 4:
				System.out.println("Exit");
				System.exit(0);
			default:
				System.out.println("Invalid chouce");
			}
		}
	}
}
