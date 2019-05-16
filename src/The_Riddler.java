import javax.swing.JOptionPane;

public class The_Riddler {
	public static void main(String [] args){
		int score = 0;
		String answer = JOptionPane.showInputDialog("Here is a riddle. Why did the chicken cross the road?");
		if(answer.equals("To get to the tailor and get a haircut")) {
			score++;
			JOptionPane.showMessageDialog(null, "Correct!");
		}else {
			JOptionPane.showMessageDialog(null, "You are incorrect. The correct answer is To get to the tailor and get a haircut");
		}
		
	}
}
