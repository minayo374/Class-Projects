import java.util.Scanner;
public class Male extends Child{
	Male(String n){
		super(n, "Male");
		Scanner in = new Scanner(System.in);
		System.out.println("Enter age");
		setAge(in.nextInt());
	}
}
