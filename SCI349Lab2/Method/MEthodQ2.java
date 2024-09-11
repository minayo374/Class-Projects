
public class MEthodQ2 {
	static double FtoC(double f) {
		return 5.0/9.0*(f-32);
	}
	
	static public void main(String[] arg) {
		System.out.println("Farenheit\tCelsius");
		for (int i = 0; i <= 20; i++) {
			System.out.print(i + "\t\t");
			System.out.print(FtoC(i));
			System.out.println();
			
		}
		
	}
}
