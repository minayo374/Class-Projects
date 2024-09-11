
public class TeamLeader extends ProductionWorker{
	private double bonusAmount;
	private int trainingHours;

	TeamLeader(String worker, String num, String date, int shift, double rate, double bonus, int hours){
		super(worker, num, date, shift, rate);
		bonusAmount = bonus;
		trainingHours = hours;
	}
	public double getBonusAmount() {
		return bonusAmount;
	}

	public void setBonusAmount(double bonusAmount) {
		this.bonusAmount = bonusAmount;
	}

	public int getTrainingHours() {
		return trainingHours;
	}

	public void setTrainingHours(int trainingHours) {
		this.trainingHours = trainingHours;
	}	
}
