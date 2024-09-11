
public class Q1 {
	static public void main (String[] arg) {
		ProductionWorker worker = new ProductionWorker("Minayo Stotz", "1234-Q", "2023-3-12", 5, 15.00);
		
		System.out.println("Name : " + worker.getName());
		System.out.println("ID   : " + worker.getNumber());
		System.out.println("Shift: " + worker.getShift());
		System.out.println("Rate : " + worker.getHourlyPayRate());
		
		System.out.println();
		
		TeamLeader leader = new TeamLeader("Minayo Stotz", "1234-Q", "2023-3-12", 5, 15.00, 10.00, 5);
		System.out.println("Name     : " + leader.getName());
		System.out.println("ID       : " + leader.getNumber());
		System.out.println("Shift    : " + leader.getShift());
		System.out.println("Rate     : " + leader.getHourlyPayRate());
		System.out.println("Bonus    : " + leader.getBonusAmount());
		System.out.println("Training : " + leader.getTrainingHours());


	}
}
