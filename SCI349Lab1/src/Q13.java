import java.util.Scanner;
import java.lang.Math;
public class Q13 {
	static public void main(String[] arg) {
		Scanner in = new Scanner(System.in);
		Scanner in2 = new Scanner(System.in);
		Scanner in3 = new Scanner(System.in);
		Scanner in4 = new Scanner(System.in);

		int guess = 0;
		int score = 0;
		int play = 0;
		boolean again = true;
		
		do {
			System.out.println("Give me the value for n:");
			int n = in.nextInt();

			System.out.println("OK. I am now thinking of a number between 1 and " + n);
			int ans = (int)(n * Math.random())+1;
			while(ans != guess) {
				System.out.println("Your Guess: ");
				guess = in2.nextInt();

				if (guess > ans) {
					System.out.println("Too high");
				}
				else if (guess < ans) {
					System.out.println("Too low");
				}
				else {
					System.out.println("That's it!");
				}
				score++;
			}
			System.out.println("Score: " + score + " guesses");
			score = 0;

			System.out.println("Play again? 1 for yes. 0 for no ");
			play = in4.nextInt();
			if(play == 0) {
				again = false;
			}
			

		}while (again);
		System.out.println("Thanks for playing!");


	}
}
