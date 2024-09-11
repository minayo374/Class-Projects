
public class Q10 {
	static public void main(String[] args){
	FuelGauge fuel = new FuelGauge();
	Odometer odometer = new Odometer(10, fuel);

	for (int i = 0; i < fuel.maxGas; i++)
	fuel.incrementGallons();
	while (fuel.getGallons() > 0){
		odometer.incrementMileage();
		System.out.println("Mileage: " + odometer.getMileage());
		System.out.println("Fuel level: " + fuel.getGallons() +
						   " gallons");
		System.out.println();
		}
	}
}
