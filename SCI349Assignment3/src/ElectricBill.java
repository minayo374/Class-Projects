
public class ElectricBill {
	static private double domesticRate = 0.05;
	static private double commercialRate = 0.1;
	static public double computeDomesticCost(double price) {
		double total = price + (price * domesticRate);
		return roundToNearestPenny(total);
	}
	static public double computeCommercialCost(double price) {
		double total = price + (price * commercialRate);
		return roundToNearestPenny(total);
	}
	static public void changeDemesticRateTo(double newRate) {
		domesticRate = newRate/100;
	}
	static public void changeCommercialRateTo(double newRate) {
		commercialRate = newRate/100;
	}
	static public double roundToNearestPenny(double price) {
		return Math.round(price * 100.0)/100.0;
	}
	static public void main(String[] arc) {
		double price = 100.50;
		System.out.println("Domestic Cost");
		System.out.println("$" + computeDomesticCost(price));
		System.out.println("Commercial Cost");
		System.out.println("$" + computeCommercialCost(price));
		//changing rate
		changeDemesticRateTo(10);
		changeCommercialRateTo(5);
		System.out.println("Domestic Cost");
		System.out.println("$" + computeDomesticCost(price));
		System.out.println("Commercial Cost");
		System.out.println("$" + computeCommercialCost(price));
	}
}
