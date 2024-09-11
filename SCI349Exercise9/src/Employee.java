
public class Employee {
	private String name;
	private String employeeNumber;
	private String hireDate;
	Employee(String worker, String num, String date){
		name = worker;
		employeeNumber = num;
		hireDate = date;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return employeeNumber;
	}
	public void setNumber(String number) {
		this.employeeNumber = number;
	}
	public String getHireDate() {
		return hireDate;
	}
	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}
}

