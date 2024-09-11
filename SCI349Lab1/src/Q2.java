import javax.swing.JOptionPane;

public class Q2 {
	static public void main(String[] arg) {
		System.out.println("Miles\tKilometers");
		int miles = 1;
		double kilometer = 1.609;
		
		while (miles < 11) {
			double total = miles * kilometer;
			System.out.println(miles +"\t"+ total);
			miles++;

		}
	}

}
