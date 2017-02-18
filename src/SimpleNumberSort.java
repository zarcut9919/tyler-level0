import javax.swing.JOptionPane;

public class SimpleNumberSort {
	public static void main(String[] args) {
		String question = JOptionPane.showInputDialog("What number?");
		String question2 = JOptionPane.showInputDialog("What number?");
		String question3 = JOptionPane.showInputDialog("What number?");
		int num1 = Integer.parseInt(question);
		int num2 = Integer.parseInt(question2);
		int num3 = Integer.parseInt(question3);
		if (num1 < num2 && num1 < num3) {
			if (num2 < num3) {
				System.out.println(num1 + " " + num2 + " " + num3);
			}

		}

	}
}
