import javax.swing.JOptionPane;

public class DoYouLikePizza {
	public static void main(String[] args) {
		String p = JOptionPane.showInputDialog("Do you like pizza?");
		if (p.equals("yes")) {
			String pep = JOptionPane.showInputDialog("Do you like pepporoni?");
			if (pep.equals("yes")) {
				JOptionPane.showMessageDialog(null, "Enjoy your pepporoni pizza!");

			} else {
				JOptionPane.showMessageDialog(null, "Enjoy your cheese pizza!");
			}
		}
		if (p.equals("no")) {
			String sal = JOptionPane.showInputDialog("Then do you like salad?");
			if (sal.equals("no")) {
				JOptionPane.showMessageDialog(null, "Looks like you'll starve!");
			} else {
				JOptionPane.showMessageDialog(null, "Enjoy your pepperoni salad!");
			}
		}

	}
}
