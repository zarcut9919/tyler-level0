import javax.swing.JOptionPane;

/**
 * Write a program that asks the user for their age. Tell them which year they
 * were born. If they are over 30, tell them they are too old to play this game.
 **/

public class CodingExercise2 {
	public static void main(String[] args) {

		String age = JOptionPane.showInputDialog("How old are you?");
		int a = Integer.parseInt(age);
		JOptionPane.showMessageDialog(null, "You were born in" + " " + (2017 - a));
		if (a > 30) {
			JOptionPane.showMessageDialog(null, "Your too old to play this game!");
		}

	}
}
