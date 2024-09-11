import javax.swing.JOptionPane;
import java.util.Scanner;

public class Q4 {
	static public void main (String[] arg) {
		int size = 10;
		int[] id = new int[size];
		//putting ids into array
		for (int i = 0; i < size; i++) {
			id[i] = i;
		}
		
		String[] names = {"Mccoy", "Mccormick", "Murillo", "Stevenson", "Hendricks", 
						  "Crosby", "Cuevas", "Villanueva", "Hooper", "Ibarra"};
		
		//ask user id
		String userInp = JOptionPane.showInputDialog("Enter ID");
		int inp = Integer.parseInt(userInp);
		
		for (int i = 0; i < size; i++) {
			
			if (id[i] == inp) {
				JOptionPane.showMessageDialog(null, "Employee: " + names[i]);
			}
		}
	}
}
