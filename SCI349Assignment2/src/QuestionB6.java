import javax.swing.JOptionPane;

public class QuestionB6 {
	static public void main(String[] arg) {
		String inp1, inp2;
		int option;
		double euros, pounds;
		inp1 = JOptionPane.showInputDialog("Enter 1 to convert from pounds to euros and 2 from euros to pounds: ");
		option = Integer.parseInt(inp1);
		if (option == 1) {
			inp2 = JOptionPane.showInputDialog("Number of pounds: ");
			pounds = Double.parseDouble(inp2);
			euros = pounds / 0.80;
			JOptionPane.showMessageDialog(null, "Number of Euros: " + euros);
		}
		else if (option == 2) {
			inp2 = JOptionPane.showInputDialog("Number of euros: ");
			euros = Double.parseDouble(inp2);
			pounds = euros * 0.80;
			JOptionPane.showMessageDialog(null, "Number of pounds: " + pounds);
		}
		else {
			JOptionPane.showMessageDialog(null, "Invalid Option");
		}
	}
}
