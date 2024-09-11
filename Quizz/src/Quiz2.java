import java.util.Scanner;

public class Quiz2 {
	static int calcAverage(int score1, int score2, int score3, int score4, int score5) {
		int average, total;
		
		total = score1 + score2 + score3 + score4 + score5;
		average = total / 5;
		return average;
	}
	static char determineGrade(int score) {
		char grade;
		if (score >=90 && score <= 100) {grade = 'A';}
		else if(score >= 80 && score < 90) {grade = 'B';}
		else if (score >=70 && score < 80) {grade = 'C';}
		else if(score >= 60 && score < 70) {grade = 'D';}
		else {grade = 'F';}
		return grade;
	}
	
	static public void main(String[] arg) {
		Scanner in = new Scanner(System.in);
		int temp = 0;
		int score1= 0;
		int score2= 0;
		int score3= 0;
		int score4= 0;
		int score5 = 0;
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("Enter yout test score " + i);
			temp = in.nextInt();
			if (i == 1) {score1 = temp;}
			else if (i == 2) {score2 = temp;}
			else if (i == 3) {score3 = temp;}
			else if (i == 4) {score4 = temp;}
			else {score5 = temp;}
		}
		System.out.println("Score | Grade");
		System.out.println(score1 + "    | " + determineGrade(score1));
		System.out.println(score2 + "    | " + determineGrade(score2));
		System.out.println(score3 + "    | " + determineGrade(score3));
		System.out.println(score4 + "    | " + determineGrade(score4));
		System.out.println(score5 + "    | " + determineGrade(score5));

		System.out.println("Your average score is " + calcAverage(score1, score2, score3, score4, score5));
		System.out.println("Your grade for average score is " + determineGrade(calcAverage(score1, score2, score3, score4, score5)));	
	}
}
