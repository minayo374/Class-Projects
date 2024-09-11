import javax.swing.JOptionPane;
import java.lang.Math;
public class Q3 {
	static public void main(String[] arg) {
		int i  = 10;
		System.out.println("Number\tSquare");
		do {
			System.out.println(i + "\t" + i*i);
			i--;
		}while(i > 0);
	}
}
