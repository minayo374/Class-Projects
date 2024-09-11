package Exercise4;
import javax.swing.JOptionPane;
import java.lang.Math;

public class Exercise4 {
	public static void main (String[] arg) {
		//partA question1
		String name = JOptionPane.showInputDialog("What is your name?");
		String hoursInp = JOptionPane.showInputDialog("How many hours did you work this week?");
		double hours = Double.parseDouble(hoursInp);
		String wageInp = JOptionPane.showInputDialog("What is your hourly pay rate?");
		double wage = Double.parseDouble(wageInp);
		JOptionPane.showMessageDialog(null, "Hello " + name + ". " + "Your total wages this week is " + hours*wage + "pounds.");
		
		//partA question2
		String radInp = JOptionPane.showInputDialog("Enter a radius.");
		double rad = Double.parseDouble(radInp);
		double surface = 4*3.14*rad*rad;
		JOptionPane.showMessageDialog(null, "The surface area is " + surface);
		
		//partB question1
		String numInp = JOptionPane.showInputDialog("Enter a number");
		double num = Double.parseDouble(numInp);
		if (num < 20 && num > 45) {
			JOptionPane.showMessageDialog(null,"Out of range");
		}
		else {
			JOptionPane.showMessageDialog(null,"Number within the range");
		}
		
		//partB question1.1
		String numInput = JOptionPane.showInputDialog("Enter a number");
		boolean isTrue = (num < 20 && num > 45)? true:false;
		if (isTrue) {
			JOptionPane.showMessageDialog(null,"Number within the range");
		}
		else {
			JOptionPane.showMessageDialog(null,"Out of range");
		}
				
		
	}

}
