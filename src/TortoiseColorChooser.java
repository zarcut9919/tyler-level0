import javax.swing.JOptionPane;
import javax.swing.text.StyledEditorKit.ForegroundAction;

import java.awt.Color;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class TortoiseColorChooser {
	public static void main(String[] args) {
		for (int a = 0; a < 100; a++) {

			// 3. ask the user what color they would like the tortoise to draw
			String question = JOptionPane.showInputDialog(
					"What color would you like the tortoise to draw? You can choose from blue, green, or red.");
			// 4. use an if/else statement to set the pen color that the user
			// requested
			if (question.equals("blue")) {
				Tortoise.setPenColor(Color.blue);
			} else if (question.equals("green")) {
				Tortoise.setPenColor(Color.green);
			} else if (question.equals("red")) {
				Tortoise.setPenColor(Color.red);
			}
			// 5. if the user doesn’t enter anything, choose a random color
			else {
				Tortoise.setPenColor(Colors.getRandomColor());
				// 6. put a loop around your code so that you keep asking the
				// user
				// for
				// more colors & drawing them

				// 2. set the pen width to 10
				Tortoise.setPenWidth(10);
				Tortoise.setSpeed(5);
				// 1. make the tortoise draw a shape (this will take more than
				// one
				// line
				// of code)

				Tortoise.penDown();
				DrawSquare();
				
				}
			}
		}
	

	public static void DrawSquare() {
		for (int i = 0; i < 4; i++) {
			Tortoise.move(100);
			Tortoise.turn(90);

		}
	}
}
