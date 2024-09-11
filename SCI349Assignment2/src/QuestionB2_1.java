import javax.swing.JOptionPane;

public class QuestionB2_1 {
	public static void main(String[] arg) {
		//create two flags for the numbers 3, and 4
		//initialize them to false
		boolean divisible3 = false, divisible4 = false;
		//ask user the number and change the data type to integer
		String input1 = JOptionPane.showInputDialog("Enter a first number");
		int num1 = Integer.parseInt(input1);
		//check the number from the user if the number is divisible by 3 and 4 by separated if statement
		if (num1 % 3 == 0) {
			divisible3 = true;
		}
		if (num1 %4 == 0) {
			divisible4 = true;
		}
		//if both flags are true show the message "num is divisible by noth 3 and 4"
		//if only one flag is true shoe the message "num is divisible by 3 or 4 but not both"
		//if both false, show the message "num is not divisible by either 3 or 4"
		if (divisible3 && divisible4) {
			JOptionPane.showMessageDialog(null, num1 + " is divisible by both 3 and 4");
		}
		else if (divisible3 || divisible4) {
			JOptionPane.showMessageDialog(null, num1 + " is divisible by 3 or 4 but not both");
		}
		else {
			JOptionPane.showMessageDialog(null, num1 + " is not divisible by either 3 or 4");
		}
	}
}
