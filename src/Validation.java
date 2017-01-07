import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		for (int i = 0; i < 50; i++) {
			// 1. Watch the first 2 minutes of this movie: http://vimeo.com/2485018
			int randomNumber = new Random().nextInt(6);
			// 2. On paper, write all the numbers that get printed when you run this class
			System.out.println(randomNumber);

			// 3. Use the randomNumber to give the user a random compliment.

			if (randomNumber == 0) {
				JOptionPane.showMessageDialog(null, "You're ugly");
			} else if (randomNumber == 1) {
				JOptionPane.showMessageDialog(null, "I like your shirt");
			} else if (randomNumber == 2) {
				JOptionPane.showMessageDialog(null, "Nick is terrible person");
			} else if (randomNumber == 3) {
				JOptionPane.showMessageDialog(null, "Nice shoes");
			} else if (randomNumber == 4) {
				JOptionPane.showMessageDialog(null, "You don't get a compliment");
			} else if (randomNumber == 5) {
				JOptionPane.showMessageDialog(null, "I like your house");
			}
		}
		// 4. Repeat all the code above 10 times

		// 5. Find someone to test out your program. They will like it :)
	}
}
