
public abstract class Child {
	private String name;
	private String gender;
	private int age;
	Child(String n, String g){
		name = n;
		gender = g;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String display() {
		return name + " " + gender + " " + age + " years old";
	}
}
