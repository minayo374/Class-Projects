
public class Q5 {
	static public void main(String[] arg) {
		double[] prices = {2.34, 7.89, 1.34, 50.37, 26.49, 10.15, 43.61,
						   71.32, 110.57, 81.99, 61.58, 63.17, 29.77};
		double total = 0;
		//(i)calculate the sum and display
		for (int i = 0; i < 10; i++) {
			total += prices[i];
		}
		System.out.println("Sum of all the prices: " + "\n" + "$" + total);
		
		//(ii)display all the prices less than 5.00
		System.out.println("Prices that less than 5.00:");
		for (int i = 0; i < 10; i++) {
			if (prices[i] < 5.00) {
				System.out.print("$" + prices[i] + " ");
			}
		}
		
		//(iii)calculate the average of the prices and display
		double avg = total / 10;
		System.out.println("\nAverage of the prices:" + "\n" + "$" + avg);
		
		//(iv)display all values that are higher than the calculated average value
		System.out.println("Prices that more than average:");
		for (int i = 0; i < 10; i++) {
			if (prices[i] > avg) {
				System.out.print("$" + prices[i] + " ");
			}
		}
	}
}
