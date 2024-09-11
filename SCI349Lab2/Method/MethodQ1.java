import java.util.Scanner;

public class MethodQ1 {
	static int getLength() {
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter the length");
		int length = inp.nextInt();
		return length;
	}
	static int getWidth() {
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter the length");
		int width = inp.nextInt();
		return width;
	}
	static int getArea(int length, int width) {
		return length * width;
	}
	static void getData(int length, int width, int area) {
		System.out.println("Length: " + length);
		System.out.println("Width: " + width);
		System.out.println("Area: " + area);
	}
	
	static public void main(String[] arg) {
		int length = getLength();
		int width = getWidth();
		int area = getArea(length, width);
		getData(length, width, area);
		
		
	}

}
