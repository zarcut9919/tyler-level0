import javax.swing.JOptionPane;

public class BananaQuiz {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {

			// 1. ask the user if they like bananas
			String question = JOptionPane.showInputDialog("Do you like banana's");
			// 2. if they say no,
			// tell them they are crazy
			// and end quiz
			if (question.equals("no")) {
				JOptionPane.showMessageDialog(null, "You're crazy");
				break;
			}
			// 3. if they say yes
			else if (question.equals("yes")) {
				String question2 = JOptionPane.showInputDialog("What's your favorite hobby");

				JOptionPane.showMessageDialog(null, question2 + " is much better with bananas");
			}
			// ask them what is their favorite hobby
			// show a pop up that says "<your hobby> is much better with bananas!"

			// 4. OPTIONAL: if they say something other than “yes” or “no”
			// show a pop up that says “You are bananas!”
			else {
				JOptionPane.showMessageDialog(null, "You're bananas!");
			}
		}
	}
}