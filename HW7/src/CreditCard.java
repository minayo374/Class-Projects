
public class CreditCard {
	Money balance;
	Money creditLimit;
	Person owner;
	
	CreditCard(Person newCardHolder, Money limit){
		this.owner = newCardHolder;
		this.creditLimit = limit;
		this.balance = new Money(0);
	}
	Money getBalance() {
		
		return new Money(balance);
	}
	Money getCreditLimit() {
		return new Money(creditLimit);
	}
	String getPersonals() {
		return owner.toString();
	}
	void charge (Money amount) {
		Money temp = balance.add(amount);
		
		if (creditLimit.compareTo(temp) == -1) {
			System.out.println("Exceeds Credit Limit");
		}
		else {
			System.out.println("Charge: " +  amount.toString());
			balance = balance.add(amount);
		}
	}
	void payment (Money amount) {
		System.out.println("Payment: " +  amount.toString());
		balance = balance.subtract(amount);
	}
}
