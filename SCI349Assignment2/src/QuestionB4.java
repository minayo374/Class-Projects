import javax.swing.JOptionPane;

public class QuestionB4 {
	public static void main(String[] arg) {
		//get three test score from user and store in score1 to 3 with double data type
		double score1, score2, score3;
		String inp1 = JOptionPane.showInputDialog("Enter the first test score");
		score1  = Double.parseDouble(inp1);
		String inp2 = JOptionPane.showInputDialog("Enter the second test score");
		score2  = Double.parseDouble(inp2);
		String inp3 = JOptionPane.showInputDialog("Enter the third test score");
		score3  = Double.parseDouble(inp3);
		//create a variable with double and calculate the average
		double avg = (score1 + score2 + score3)/3;
		char letterGrade;
		if (avg < 60) {
			letterGrade = 'F';
		} 
		else if (avg < 70) {
			letterGrade = 'D';
		}
		else if (avg < 80) {
			letterGrade = 'C';
		}
		else if (avg < 90) {
			letterGrade = 'B';
		}
		else {
			letterGrade  = 'A';
		}
		
		JOptionPane.showMessageDialog(null, "Your average score is " + avg + "\nYour letter grade is " + letterGrade);

	}
}
