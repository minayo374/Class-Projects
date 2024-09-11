import javax.swing.JOptionPane;

public class QuestionA2 {
	public static void main(String[] arg) {
	//partA question2
		//ask user the number for radius and change the data type to double
			String radInp = JOptionPane.showInputDialog("Enter a radius.");
			double rad = Double.parseDouble(radInp);
			//calculate the surface area and show to the user
			double surface = 4*3.14*rad*rad;
			JOptionPane.showMessageDialog(null, "The surface area is " + surface);
	}
}

