import java.util.Scanner;

public class object {
	
	
	static public void main(String[] args) {
		Rectangle box1 = new Rectangle();
		Rectangle box2 = new Rectangle(5.0, 10.0);

		box1.setLength(4);
		box1.setWidth(5);
		System.out.println(box1.getArea());
		System.out.println(box2.getArea());
	}

}
