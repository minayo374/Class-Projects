import javax.swing.JOptionPane;

public class QuestionB3 {
	public static void main(String[] arg) {
		//initialize 3 variables with double
		double num1, num2, num3;
		//ask user for three numbers and put the user input to the variables 
		String input = JOptionPane.showInputDialog("Enter the first number");
		num1 = Double.parseDouble(input);
		String input2 = JOptionPane.showInputDialog("Enter the second number");
		num2 = Double.parseDouble(input2);
		String input3 = JOptionPane.showInputDialog("Enter the third number");
		num3 = Double.parseDouble(input3);
		//create two boolean variables.
		//Compare1: if num1 is smaller than num2 then true
		//Compare2: if num2 is smaller then num3 then true
		boolean compare1 = false, compare2 = false, compare3 = false;
		if (num1 < num2) {compare1 = true;}
		if (num2 < num3) {compare2 = true;}
		//compare the flags(compare1, compare2) and display the smallest number
		//if compare1 and compare2 are both true: num1 is the smallest
		//else if compare1 is false and compare2 is true: num2 is the smallest
		//if both false: num3 is the smallest
		if (compare1 && compare2) {
			JOptionPane.showMessageDialog(null, num1 + " is the smallest");
		}
		else if (!compare1 && compare2) {
			JOptionPane.showMessageDialog(null, num2 + " is the smallest");
		}
		else {
			JOptionPane.showMessageDialog(null, num3 + " is the smallest");
		}
		
	}
}
