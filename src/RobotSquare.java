import org.jointheleague.graphical.robot.Robot;


public class RobotSquare {
		public static void main(String[] args) throws Exception {
			// 1. Make a new Robot
			Robot a=new Robot();

			// 3. Put the robot's pen down
			a.penDown();
			a.setRandomPenColor();
			// 6. Make the robot move as fast as possible
			a.setSpeed(10);

			// 5. Do everything below here 4 times


			// 		2. Move your robot 200 pixels
			

			// 		4. Turn the robot 90 degrees to the right (90 degrees)
			for (int i = 0; i < 4; i++) {
			a.move(200);
			a.turn(90);
			a.setRandomPenColor();
			}
			

		}
	

}

