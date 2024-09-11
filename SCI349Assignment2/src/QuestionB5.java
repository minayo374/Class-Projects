import javax.swing.JOptionPane;

public class QuestionB5 {
	static public void main(String[] arg) {
		int num;
		String roman;
		String inp = JOptionPane.showInputDialog("Enter a number between 1 and 10");
		num = Integer.parseInt(inp);
		switch (num) {
			case 1:
				roman = "I";
				break;
			case 2:
				roman = "II";
				break;
			case 3:
				roman = "III";
				break;
			case 4:
				roman = "IV";
				break;
			case 5:
				roman = "V";
				break;
			case 6:
				roman = "VI";
				break;
			case 7:
				roman = "VII";
				break;
			case 8:
				roman = "VIII";
				break;
			case 9:
				roman = "IX";
				break;
			case 10:
				roman = "X";
				break;
			default:
				roman = "Error";
		}
		if (roman == "Error") {
			JOptionPane.showMessageDialog(null, roman + ": Invalid Number");
		}
		else {
			JOptionPane.showMessageDialog(null, roman);
		}
	}
}
