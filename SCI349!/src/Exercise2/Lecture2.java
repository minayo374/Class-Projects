package Exercise2;
//packege
import java.util.Scanner;

public class Lecture2 {
	public static void main (String[] arg) {
		//question1
		System.out.println(12+5/3);
		System.out.println(8-2+3*2);
		System.out.println(((4*3)/(5-2))-22);
		System.out.println(3*6+5%2);
		System.out.println(3+7/5+-2*3);
		System.out.println(2*(1-(33/4.0)/2)*(2-6%3));
		System.out.println(3+11/2.0-(32%4)+5-21);
		System.out.println(8*(32-2)/12-(5/7)+(11.0/5.0));
		System.out.println(4+22%2-(24-21)+(23/2)+7-3.0/2);
		System.out.println(4+2*3+(5+2)*3-1+(7%2)+23*2);
		System.out.println();
		
		//question 2
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter yout NAME");
		String userName = scan.nextLine();
		System.out.println("Hello, " + userName);
		System.out.println();
		
		//question3
		System.out.println("Enter the first number: ");
		float firstNum = scan.nextFloat();
		System.out.println("Enter the second number: ");
		float secondNum = scan.nextFloat();
		System.out.println("Their sum is : " + (firstNum+secondNum));
		System.out.println("Their difference is: " + (firstNum-secondNum));
		System.out.println("Their product is: " + firstNum*secondNum);
		System.out.println();
		
		//question4
		System.out.println("Enter the DISTANCE in miles: ");
		double miles = scan.nextFloat();
		System.out.println("The DISTANCE in kilometers is: " + (miles * 1.60935));
		System.out.println();
		
		//question5
		String firstName, lastName;
		firstName = "Minayo";
		lastName = "Stotz";
		char firstInitial, lastInitial;
		firstInitial = 'M';
		lastInitial = 'S';
		System.out.println("NAME: " + firstName + lastName);
		System.out.println("INITIAL: " + firstInitial + lastInitial);
		System.out.println();
		
		//question6
		System.out.println("Enter test score #1: ");
		float score1 = scan.nextFloat();
		System.out.println("Enter test score #2: ");
		float score2 = scan.nextFloat();
		System.out.println("Enter test score #3: ");
		float score3 = scan.nextFloat();
		System.out.println("Test average: " + (score1+score2+score3)/3);
		System.out.println();
		
		//question7
		System.out.println("Number of Pizza: ");
		int numOfPizza = scan.nextInt();
		System.out.println("Number of Topping: ");
		int numOfTopping = scan.nextInt();
		double total = numOfPizza * 12 + numOfTopping * 1.5;
		double tax = total * 0.05;
		System.out.println();
		System.out.println("Receipt:");	
		System.out.println("Number of Pizza: " + numOfPizza);
		System.out.println("Number of Topping: " + numOfTopping);
		System.out.println("Cost(inc tax):" + (total+tax));
		System.out.println();
		
		//question8
		System.out.println("Enter an integer between 100 and 999: ");
		int num = scan.nextInt();
		int num1 = num%10;
		int num2 = num/100;
		int num3 = num/10%10;
		int finalAnswer = num1*num2*num3;
		System.out.println("The product of the all its digits is " + finalAnswer);
	}

}
