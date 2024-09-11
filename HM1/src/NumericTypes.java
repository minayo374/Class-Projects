// TASK #2 Add an import statement for the Scanner class
import java.util.Scanner;
// TASK #2(Alternate)
// Add an import statement for the JOptionPane class

/**
   This program demonstrates how numeric types and
   operators behave in Java.
*/

public class NumericTypes
{
   public static void main (String [] args)
   {
      // TASK #2 Create a Scanner object here
      // (not used for alternate)

      // Identifier declarations
      final int NUMBER = 2 ;        // Number of scores
      final double SCORE1 = 100;       // First test score
      final double SCORE2 = 95;        // Second test score
      final double BOILING_IN_F = 212; // Boiling temperature
      double fToC;                     // Temperature Celsius
      double average;               // Arithmetic average
      String output;                // Line of output

      // TASK #2 declare variables used here
      Scanner in = new Scanner(System.in);
      String firstName, lastName, fullName;
      // TASK #3 declare variables used here
      char firstInitial;
      // TASK #4 declare variables used here
      String temp;
      double diameter, rad, vol;

      // Find an arithmetic average.
      average = (SCORE1 + SCORE2) / NUMBER;
      output = SCORE1 + " and " + SCORE2 +
               " have an average of " + average;
      System.out.println(output);

      // Convert Fahrenheit temperature to Celsius.
      fToC = 5.0/9.0 * (BOILING_IN_F - 32);
      output = BOILING_IN_F + " in Fahrenheit is " +
               fToC + " in Celsius.";
      System.out.println(output);
      System.out.println();      // To leave a blank line

      // ADD LINES FOR TASK #2 HERE
      System.out.println("------------- Task #2 -------------");
      // Prompt the user for first name
      System.out.println("Type your first name:");
      // Read the user's first name
      firstName = in.nextLine();
      // Prompt the user for last name
      System.out.println("Type your last name:");
      // Read the user's last name
      lastName = in.nextLine();
      // Concatenate the user's first and last names
      fullName = firstName + " " + lastName;
      // Print out the user's full name
      System.out.println("Your full name is " + fullName);
      System.out.println();      // To leave a blank line

      // ADD LINES FOR TASK #3 HERE
      System.out.println("------------- Task #3 -------------");
      // Get the first character from the user's first name
      firstInitial = firstName.charAt(0);
      // Print out the user's first initial
      System.out.println("The first initial is " + firstInitial);
      // Convert the user's full name to uppercase
      fullName = fullName.toUpperCase();
      // Print out the user's full name in uppercase
      System.out.println(fullName + " has " + fullName.length() + " characters");
      System.out.println();      // To leave a blank line

      // ADD LINES FOR TASK #4 HERE
      System.out.println("------------- Task #4 -------------");
      // Prompt the user for a diameter of a sphere
      System.out.println("Type a number for diameter");
      // Read the diameter
      temp = in.nextLine();
      diameter = Double.parseDouble(temp);
      // Calculate the radius
      rad = diameter/2;
      // Calculate the volume
      vol = 4.0/3.0 * Math.PI * Math.pow(rad, 3);
      // Print out the volume
      System.out.println("The volume is " + vol);
   }
}