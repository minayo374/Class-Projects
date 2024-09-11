import java.util.Scanner;

public class Female extends Child{
	Female(String n){
		super(n, "Female");
		Scanner in = new Scanner(System.in);
		System.out.println("Enter age");
		setAge(in.nextInt());
	}
}
