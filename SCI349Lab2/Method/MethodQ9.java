
public class MethodQ9 {
	static boolean isPrime(int n) {
		if (n <=1 ) {return false;}
		else if (n == 2) {return false;}
		else if (n %2 == 0) {return false;}
		for (int i = 3; i <= Math.sqrt(n); i += 2) {
			if (n % i == 0) {return false;}
		}
		
		return true;
	}
	static public void main(String[] arg) {
		int counter = 0;
		for (int i = 0; i <= 50; i++) {
			if (isPrime(i)) {System.out.print(i + " ");
			counter++;
			}
			if (counter == 10) {
				System.out.println();
				counter = 0;
			}
		}
	}
}
