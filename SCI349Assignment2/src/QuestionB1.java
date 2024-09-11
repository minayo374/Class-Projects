import javax.swing.JOptionPane;

public class QuestionB1 {
	public static void main(String[] arg) {
		//ask user for number and change the data type to double
		String numInp = JOptionPane.showInputDialog("Enter a number");
		double num = Double.parseDouble(numInp);
		//if the number is less than 20 and more than 45, show the message "out of range"
		//otherwise show the message "number within the range"
		if (num < 20 && num > 45) {
			JOptionPane.showMessageDialog(null,"Out of range");
		}
		else {
			JOptionPane.showMessageDialog(null,"Number within the range");
		}
		
		//partB question1.1
		//ask user for number and change the data type
		String numInput = JOptionPane.showInputDialog("Enter a number");
		//creating flag if the number is within the range of 20<num<45.
		//true: if the number is in the range. false: if the number if out of the range
		boolean isTrue = (num < 20 && num > 45)? true:false;
		//if the flag is true show the message "number within the range"
		//else show the message "out of range"
		if (isTrue) {
			JOptionPane.showMessageDialog(null,"Number within the range");
		}
		else {
			JOptionPane.showMessageDialog(null,"Out of range");
		}
	}

}
