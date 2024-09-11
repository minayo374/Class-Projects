import java.util.Scanner;

public class MethodQ4 {
	static int calcAverage(int num1, int num2, int num3, int num4, int num5) {
		return (num1+num2+num3+num4+num5)/5;
	}
	static char determineGrade(int num) {
		char grade = 'N';
		if (num >= 90) {grade = 'A';}
		else if (num >= 89) {grade = 'B';}
		else if (num >= 79) {grade = 'C';}
		else if (num >= 69) {grade = 'D';}
		else {grade = 'F';}

		return grade;
	}
	
	static public void main(String[] arg) {
		Scanner in1 = new Scanner(System.in);
		Scanner in2 = new Scanner(System.in);
		Scanner in3 = new Scanner(System.in);
		Scanner in4 = new Scanner(System.in);
		Scanner in5 = new Scanner(System.in);
		
		System.out.println("Enter the first test score");
		int test1 = in1.nextInt();
		System.out.println("Enter the second test score");
		int test2 = in2.nextInt();
		System.out.println("Enter the third test score");
		int test3 = in3.nextInt();
		System.out.println("Enter the forth test score");
		int test4 = in4.nextInt();
		System.out.println("Enter the fifth test score");
		int test5 = in5.nextInt();
		System.out.println("Your average of test score is " + calcAverage(test1, test2, test3, test4, test5));
		System.out.println("Your letter grade from average is " + determineGrade(calcAverage(test1, test2, test3, test4, test5)));
	}
}
