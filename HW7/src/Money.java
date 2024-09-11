/**
   This class represents nonnegative amounts of money.
*/

public class Money
{
   // The number of dollars
   private long dollars;

   // The number of cents
   private long cents;

   /**
      Constructor
      @param amount The amount in decimal format.
   */

   public Money(double amount)
   {
      if (amount < 0)
      {
         System.out.println("Error: Negative amounts " +
                            "of money are not allowed.");
         System.exit(0);
      }
      else
      {
         long allCents = Math.round(amount * 100);
         dollars = allCents / 100;
         cents = allCents % 100;
      }
   }

   // ADD LINES FOR TASK #1 HERE
   // Document and write a copy constructor
   public Money(Money money)
   {
      this.dollars = money.dollars;
      this.cents = money.cents;
   }
   /**
      The add method
      @param otherAmount The amount of money to add.
      @return The sum of the calling Money object
              and the parameter Money object.
   */

   public Money add(Money otherAmount)
   {
      Money sum = new Money(0);

      sum.cents = this.cents + otherAmount.cents;

      long carryDollars = sum.cents / 100;

      sum.cents = sum.cents % 100;

      sum.dollars = this.dollars +
                    otherAmount.dollars +
                    carryDollars;

      return sum;
   }

   /**
      The subtract method
      @param amount The amount of money to subtract.
      @return The difference between the calling Money
              object and the parameter Money object.
   */

   public Money subtract (Money amount)
   {
      Money difference = new Money(0);

      if (this.cents < amount.cents)
      {
         this.dollars = this.dollars - 1;
         this.cents = this.cents + 100;
      }

      difference.dollars = this.dollars - amount.dollars;
      difference.cents = this.cents - amount.cents;

      return difference;
   }

   /**
      The compareTo method
      @param amount The amount of money to compare against.
      @return -1 if the dollars and the cents of the
              calling object are less than the dollars and
              the cents of the parameter object.
              0 if the dollars and the cents of the calling
              object are equal to the dollars and cents of
              the parameter object.
              1 if the dollars and the cents of the calling
              object are more than the dollars and the
              cents of the parameter object.
   */

   public int compareTo(Money amount)
   {
      int value;

      if(this.dollars < amount.dollars)
         value = -1;
      else if (this.dollars > amount.dollars)
         value = 1;
      else if (this.cents < amount.cents)
         value = -1;
      else if (this.cents > amount.cents)
         value = 1;
      else
         value = 0;

      return value;
   }

   // ADD LINES FOR TASK #2 HERE
   /** equal method. This method compares the instance variables of the calling object 
   * with instance variables of the parameter object for equality and returns true if 
   * the dollars and the cents of the calling object are the same as dollars and the cents 
   * of the parameter object.
   * @param object money
   * @return -if the dollars and cents are equal to the parameter, return true. otherwise false
   */
   public boolean equal(Money money1) {
	   if (this.dollars == money1.dollars && this.cents == money1.cents) {
		   return true;
	   }
	   else {return false;}
   }
   /**toString method. this method will return a String that looks like currency, including
    * the dollar sign. If the cents are less than 10, add 0 in front of it.
    * @return -dollars and cents in format*/

public String toString() {
	if (cents < 10) {
		String centFormat = "0" + cents;
		return "$ " + dollars + "." + centFormat;
	}
	else {return "$ " + dollars + "." + cents;}
	
}
   
}