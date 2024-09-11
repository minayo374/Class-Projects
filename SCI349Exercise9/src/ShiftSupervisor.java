
public class ShiftSupervisor extends Employee{
	private double anualSalary;
	private double productionBonus;
	
	ShiftSupervisor(String name, String num, String date, double salary, double bonus){
		super(name, num, date);
		anualSalary = salary;
		productionBonus = bonus;
	}
	public double getAnualSalary() {
		return anualSalary;
	}
	public void setAnualSalary(double anualSalary) {
		this.anualSalary = anualSalary;
	}
	public double getProductionBonus() {
		return productionBonus;
	}
	public void setProductionBonus(double productionBonus) {
		this.productionBonus = productionBonus;
	}
}
