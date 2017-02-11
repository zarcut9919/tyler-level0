import javax.swing.JOptionPane;

import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;

public class SpiralMaker {

	public static void main(String[] args) {

		// 3. Make a variable to hold the number of sides and set it to 0

		// 4. Ask the user which spiral they would like (square, triangle, or
		// pentagon)
		Tortoise.penDown();
		Tortoise.setSpeed(10);
for (int b = 0; b < 100; b++) {
	

		String question = JOptionPane.showInputDialog("Which spiral would you like?");
		if (question.equals("triangle")) {
			drawShape(3);
		} else if (question.equals("square")) {
			drawShape(4);
		} else if (question.equals("pentagon")) {
			drawShape(100);
		}
		// 5. Set the number of sides depending on what the user entered
		// (multiple lines of code)

		// 6. If the user enters something else, say "Sorry, I don't know how to
		// draw a ..."
		else {
			JOptionPane.showMessageDialog(null, "Sorry I dont know how to draw that!");

		}
}
		// 1. Make the Tortoise draw a square spiral shape. If you get stuck,
		// use these instructions: http://bit.ly/YJUOkn

		// 2. Change your code to turn the square spiral into a triangle spiral

	}

	static void drawShape(int a) {
		for (int i = 0; i < 80; i++) {
			Tortoise.move(4 * i);
			Tortoise.turn(360 / a);

			Tortoise.setPenColor(PenColors.getRandomColor());
		}
	}

}
