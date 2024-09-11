
public class Odometer {
	private int mileage;
	private int setPoint; 
	private FuelGauge fuelGauge;
	private final int maxMirage = 999999;
	private final int mpg = 24;

	public Odometer(int m, FuelGauge fg) {
	fuelGauge = fg;
	mileage = m;
	}
	public int getMileage() {
		return mileage;
	}
	public void incrementMileage() {
		mileage += 1;
		mileage = mileage % (maxMirage+1);

		setPoint += 1; 
		while (setPoint >= mpg) {
		fuelGauge.decrementGallons();
		setPoint = setPoint - mpg;
		}
	}
}
