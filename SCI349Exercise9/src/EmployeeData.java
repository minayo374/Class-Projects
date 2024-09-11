
public class EmployeeData {
	static public void main(String[] arg) {
		EmployeeQ5 emp1 = new EmployeeQ5("Susan Meyers", 47899, "Accounting", "Vice President");
		EmployeeQ5 emp2 = new EmployeeQ5("Mark Jones", 39119, "IT", "Programmer");
		EmployeeQ5 emp3 = new EmployeeQ5("Joy Rogers", 81774, "Manufacturing", "Emgineer");
		
		System.out.println("Compare employee 1 and 2");
		System.out.println(emp1.equals(emp2));
		System.out.println("Compare employee 1 and 3");
		System.out.println(emp1.equals(emp3));
		System.out.println("Compare employee 2 and 3");
		System.out.println(emp2.equals(emp3));
		System.out.println("Display date of 3 employees");
		System.out.println(emp1.toString());
		System.out.println(emp2.toString());
		System.out.println(emp3.toString());
	}
}
