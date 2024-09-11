//Import scanner
import java.util.Scanner;
/**
 * Minayo Stotz 6/11/2023 Task #5 & #6
 * This program will calculate the miles per gallons
 */

public class Mileage {
	public static void main(String arg[]) {
		//Identifier declarations
		double mileage, gallon, milesPerGallon;	//Number of mileage, gallon, and miles per gallon
		String temp; // String variable for holding input temporary  
	    Scanner in = new Scanner(System.in); //Scanner object

		//Print a line about this program
		System.out.println("This progtam wil calclate mileage.");
		
		//Print prompt to user asking for miles driven
		System.out.println("Type the mileage");
		
		//Store user input to temp and convert from string to double
		temp = in.nextLine();
		mileage = Double.parseDouble(temp);
		
		//Print prompt to user asking for gallons used
		System.out.println("Type the gallons used");
		
		//Store user input to temp and convert from string to double
		temp  = in.nextLine();
		gallon = Double.parseDouble(temp);
		
		//calculate miles per gallons
		milesPerGallon = mileage / gallon;
		
		//print put the result 
		System.out.println("The gas mileage is " + milesPerGallon + " mpg");
	}
}
