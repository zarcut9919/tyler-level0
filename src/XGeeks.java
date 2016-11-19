import javax.swing.JOptionPane;

/*
 * Everyone has a superpower. Mine is writing recipes. This program will store
 * the superpowers of all the people in the classroom. E.g. When I type "June",
 * your program should say "June's superpower is writing recipes".
 */
public class XGeeks {
	public static void main(String[] args) {

		// 1. Save the superpower for each person in a variable.
		String Nick = "change genders at will";
		String Daniel = "can mimic everyone elses super power";
		String Arslan = "can breathe above water";
		String Apaara = "can write recipes";
		// 2. Ask the user to enter a name. Store their answer in a variable.
		String question = JOptionPane.showInputDialog("What's your name");

		// 3. Show the superpower in a pop-up, depending on the name entered.
		if (question.equals("Nick")) {
			JOptionPane.showMessageDialog(null, "You can " + Nick);
		}
		if (question.equals("Daniel")) {
			JOptionPane.showMessageDialog(null, "You " + Daniel);
		}
if (question.equals("Arslan")){
JOptionPane.showMessageDialog(null, "You "+Arslan);	
}
	}
}
