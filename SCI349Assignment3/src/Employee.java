
public class Employee {
	private String employeeId;
	private String employeeName;
	private float salary;
	//comstructor
	public Employee(String id, String name, float sa){
		employeeId = id;
		employeeName = name;
		salary = sa;
	}
	//accessor and mutator
		public void setEmployeeId(String newId) {
			employeeId = newId;
		}
		public String getEmployeeId() {
			return employeeId;
		}
		public void setEmployeeName(String newName) {
			employeeId = newName;
		}
		public String getEmployeeName() {
			return employeeName;
		}
		public void setSalary(float newSalary) {
			salary = newSalary;
		}
		public float getSalary() {
			return salary;
		}
		public String toString(String id, String name) {
			String combine = id + ": " + name;
			return combine;
		}
}
