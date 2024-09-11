
public class Q2 {
	static public void main(String[] arg) {
		//create valuable and set values
		String id = "12345";
		String name = "Minayo Stotz";
		float salary = (float) 123.4;
		Employee e = new Employee(id, name, salary);
		//print out the value with get function
		System.out.println(e.getEmployeeId());
		System.out.println(e.getEmployeeName());
		System.out.println("$" + e.getSalary());
		System.out.println(e.toString(id, name));
		//changing value
		id = "54321";
		name = "Stotz Minayo";
		salary = (float) 543.21;
		//set values
		e.setEmployeeId(id);
		e.setEmployeeName(name);
		e.setSalary(salary);
		//print out the new value
		System.out.println();
		System.out.println("Value changed");
		System.out.println(e.getEmployeeId());
		System.out.println(e.getEmployeeName());
		System.out.println("$" + e.getSalary());
		System.out.println(e.toString(id, name));
	}
}
