import java.util.Scanner;

public class Q7 {
	static public void main(String[] arc) {
		String name = "";
		int id = 0;
		Payroll p = new Payroll(name, id);
		Scanner in = new Scanner(System.in);
		Scanner in2 = new Scanner(System.in);
		Scanner in3 = new Scanner(System.in);
		Scanner in4 = new Scanner(System.in);

		System.out.println("Enter your name");
		name = in.nextLine();
		p.setName(name);
		System.out.println("Enter your ID");
		id = in2.nextInt();
		p.setIdNumber(id);
		System.out.println("Enter your pay rate");
		double rate = in3.nextDouble();
		p.setPayRate(rate);
		System.out.println("Enter the hours worked");
		double hours = in4.nextDouble();
		p.setHoursWorked(hours);
		
		System.out.println(p.getName() + ": " + p.getIdNumber());
		System.out.println("Hours worked: " + p.getHoursWorked());
		System.out.println("Hourly rate: " + p.getPayRate());
		System.out.println("Gross pay : " + p.getGrossPay());	
	}
}
