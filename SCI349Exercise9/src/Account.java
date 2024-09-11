
public class Account {
	private int id;
	private double balance;
	Account(int i, double b){
		id = i;
		balance = b;
	}
	public double getBalance() {
		return balance;
	}
	public void withdraw(double amount) {
		if (amount > balance) {
			System.out.println("Not enough balance");
		}
		else {
			balance -= amount;
		}
	}
	public void deposit(double amount) {
		balance += amount;
	}
}
