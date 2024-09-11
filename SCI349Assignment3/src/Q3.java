
public class Q3 {
	static public void main(String[] arc) {
		//create variable and set values
		int year = 2023;
		String make = "Nissan";
		Car c = new Car(year, make);
		//call accelerate method and print out the speed
		c.accelerate();
		System.out.println(c.getSpeed());
		//call brake method and print out the speed
		c.brake();
		System.out.println(c.getSpeed());
	}
}
