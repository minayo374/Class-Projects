import java.util.Scanner;
// TASK #3 Add the file I/O import statement here
import java.io.*;
/**
   This class reads numbers from a file, calculates the
   mean and standard deviation, and writes the results
   to a file.
*/

public class StatsDemo
{
   // TASK #3 Add the throws clause
   public static void main(String[] args) throws IOException
   {
      double sum = 0;      // The sum of the numbers
      int count = 0;       // The number of numbers added
      double mean = 0;     // The average of the numbers
      double stdDev = 0;   // The standard deviation
      String line = "";         // To hold a line from the file
      double difference;   // The value and mean difference

      // Create an object of type Scanner
      Scanner keyboard = new Scanner (System.in);
      String filename;     // The user input file name

      // Prompt the user and read in the file name
      System.out.println("This program calculates " +
                         "statistics on a file " +
                         "containing a series of numbers");
      System.out.print("Enter the file name:  ");
      filename = keyboard.nextLine();

      // ADD LINES FOR TASK #4 HERE
      // Create a FileReader object passing it the filename
      File myFile = new File(filename);
      // Create a BufferedReader object passing FileReader
      // object
      Scanner inpFile = new Scanner(myFile);
      // Perform a priming read to read the first line of
      // the file
      // Loop until you are at the end of the file
      // Convert the line to a double value and add the
      // value to sum
      // Increment the counter
      // Read a new line from the file
      while (inpFile.hasNext()) {
    	  line = inpFile.nextLine();
    	  sum += Double.parseDouble(line);
    	  count++;
      }
      // Close the input file
      inpFile.close();
      // Store the calculated mean
      mean = sum / count;
      
      // ADD LINES FOR TASK #5 HERE
      // Reconnect FileReader object passing it the
      // filename
      File myFile2 = new File(filename);
      // Reconnect BufferedReader object passing
      // FileReader object
      Scanner inpFile2 = new Scanner(myFile);
      // Reinitialize the sum of the numbers
      sum = 0;
      // Reinitialize the number of numbers added
      count = 0;
      // Perform a priming read to read the first line of
      // the file
      line = "";
      // Loop until you are at the end of the file
      while (inpFile2.hasNext()) {
       // Read a new line from the file
    	  line = inpFile2.nextLine();
      // Convert the line into a double value and
      // subtract the mean
    	  difference = mean - Double.parseDouble(line);
      // Add the square of the difference to the sum
    	  sum += Math.pow(difference, 2);
      // Increment the counter
    	  count++;
      }
      // Close the input file
      inpFile2.close();
      // Store the calculated standard deviation
      stdDev = Math.sqrt(sum / count);

      // ADD LINES FOR TASK #3 HERE
      // Create a FileWriter object using "Results.txt"
      PrintWriter outputFile = new PrintWriter("Results.txt");
      // Create a PrintWriter object passing the
      // FileWriter object
      PrintWriter printWriter = new PrintWriter(outputFile);
      // Print the results to the output file
      line = String.format("%.3f", stdDev);
      printWriter.print(line);
      printWriter.print("\n");
      
      line = String.format("%.3f", mean);
      printWriter.print(line);
      // Close the output file
      printWriter.close();
   }
}