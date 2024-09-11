import javax.swing.JOptionPane;

public class QuestionA1 {
	public static void main (String[] arg) {
		//partA question1
		//ask name and store into the name
		String name = JOptionPane.showInputDialog("What is your name?");
		//ask hours worked and change the data type to double
		String hoursInp = JOptionPane.showInputDialog("How many hours did you work this week?");
		double hours = Double.parseDouble(hoursInp);
		//ask wage and change the date type to double
		String wageInp = JOptionPane.showInputDialog("What is your hourly pay rate?");
		double wage = Double.parseDouble(wageInp);
		//calculate the total amount of the money for a week and show to the user with their name. 
		JOptionPane.showMessageDialog(null, "Hello " + name + ". " + "Your total wages this week is " + hours*wage + " pounds.");
	}
}
