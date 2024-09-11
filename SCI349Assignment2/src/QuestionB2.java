import javax.swing.JOptionPane;

public class QuestionB2 {
	public static void main(String[] arg) {
		String input1 = JOptionPane.showInputDialog("Enter a first number");
		String input2 = JOptionPane.showInputDialog("Enter a second number");

		int num1 = Integer.parseInt(input1);
		int num2 = Integer.parseInt(input2);

		if (num1 > num2) {
			JOptionPane.showMessageDialog(null, num1 + " is bigger than " + num2);
		}
		else if (num1 < num2) {
			JOptionPane.showMessageDialog(null, num1 + " is smaller than " + num2);		
		}
		else {
			JOptionPane.showMessageDialog(null, num1 + " is equal to " + num2);

		}
		
	}
}
