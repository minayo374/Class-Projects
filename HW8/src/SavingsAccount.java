public class SavingsAccount extends BankAccount{
	private double rate = 0.025;
	private int savingsNumber = 0;
	private String accountNumber;
	
	SavingsAccount(String name, double amount){
		super(name, amount);
		accountNumber = super.getAccountNumber() + "-" + savingsNumber;
		savingsNumber++;
	}
	SavingsAccount(SavingsAccount oldAccount, double amount){
		super(oldAccount.getOwner(), amount);
		accountNumber = super.getAccountNumber() + "-" + savingsNumber;
		savingsNumber++;
	}
	public void postInterest() {
		double interest  = getBalance() * (rate/12);
		deposit(interest);
	}
	public String getAccountNumber() {
		return accountNumber;
	}
}
