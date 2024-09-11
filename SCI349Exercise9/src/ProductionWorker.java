
public class ProductionWorker extends Employee {
	private int shift;
	private double hourlyPayRate;
	ProductionWorker(String worker, String num, String date, int shift, double rate){
		super(worker, num, date);
		this.shift = shift;
		hourlyPayRate = rate;
	}
	
	public int getShift() {
		return shift;
	}
	public void setShift(int shift) {
		this.shift = shift;
	}
	public double getHourlyPayRate() {
		return hourlyPayRate;
	}
	public void setHourlyPayRate(double hourlyPayRate) {
		this.hourlyPayRate = hourlyPayRate;
	}
}

