
public class EmployeeQ5 {
	private String name;
	private int IDNumber;
	private String department;
	private String position;
	
	
	EmployeeQ5(String n, int id, String dep, String pos){
		this.name = n;
		this.IDNumber = id;
		this.department = dep;
		this.position = pos;
	}
	EmployeeQ5(String n, int id){
		this.name = n;
		this.IDNumber = id;
		this.department = "";
		this.position = "";
	}
	EmployeeQ5(){
		this.name = "";
		this.IDNumber = 0;
		this.department = "";
		this.position = "";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIDNumber() {
		return IDNumber;
	}
	public void setIDNumber(int iDNumber) {
		IDNumber = iDNumber;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String toString() {
		return getName() +" " + getIDNumber() + " "
				+ getDepartment() + " " + getPosition();
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeQ5 other = (EmployeeQ5) obj;
		if (IDNumber != other.IDNumber)
			return false;
		if (department == null) {
			if (other.department != null)
				return false;
		} else if (!department.equals(other.department))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (position == null) {
			if (other.position != null)
				return false;
		} else if (!position.equals(other.position))
			return false;
		return true;
	}
}
