
public class Q3 {
	
	static public void main (String[] arg) {
		ShiftSupervisor supervisor = new ShiftSupervisor("Minayo Stotz", "1234-Q", "2023-3-12", 1234.44, 3000.00);
		System.out.println("Name     : " + supervisor.getName());
		System.out.println("ID       : " + supervisor.getNumber());
		System.out.println("Date     : " + supervisor.getHireDate());
		System.out.println("Salary   : " + supervisor.getAnualSalary());
		System.out.println("Bonus    : " + supervisor.getProductionBonus());
	}
}
