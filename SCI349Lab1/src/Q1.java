import javax.swing.JOptionPane;

public class Q1 {
	static public void main(String[] arg) {
		String name = JOptionPane.showInputDialog("Enter your name");
		int i = 0;
		while (i < 5) {
			System.out.println(name);
			i++;
		}
	}

}
