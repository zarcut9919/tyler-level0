import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {
		String question = JOptionPane.showInputDialog("Are you happy? Answer yes or no");
		if (question.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing!");

		} else {
			String question2 = JOptionPane.showInputDialog("Do you want to be happy?");

			if (question2.equals("no")) {
				JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing!");
			}
			if (question2.equals("yes")) {
				JOptionPane.showMessageDialog(null, "Change something");
			}
		}

	}

}
