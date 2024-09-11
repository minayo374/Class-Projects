
public class FuelGauge {
	private int gallons;
	public final double maxGas = 1.5;
	public FuelGauge() {
	gallons = 0;
	}
	public FuelGauge(int g) {
	gallons = g;
	}
	public int getGallons() {
	return gallons;
	}
	public void incrementGallons() {
	if (gallons < maxGas)
	gallons+= 1;
	}
	public void decrementGallons() {
	if (gallons >= 1)
	gallons -= 1;
	}
}
