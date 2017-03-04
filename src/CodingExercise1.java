import java.awt.Color;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

/* Level 0 Exam: Coding  Exercise #1 */
public class CodingExercise1 {

	public static void main(String[] args) {
		Robot robot = new Robot();
		robot.penDown();
		robot.setSpeed(7);
		// 3. ask the user what color they would like the Robot to draw
		String question = JOptionPane.showInputDialog("Would you like the robot to draw a blue or a random color?");
		// 4. use an if/else statement to set the pen color that the user
		if (question.equals("blue")) {
			robot.setPenColor(Color.BLUE);
		} else if (question.equals("random")) {
			robot.setRandomPenColor();
		}
		// requested (minimum of 2 colors)

		// 2. set the pen width to 10
		robot.setPenWidth(10);
		// 1. make the Robot draw a shape

		for (int i = 0; i < 4; i++) {
			robot.move(300);
			robot.turn(90);
		}

	}
}
