import org.teachingextensions.logo.Tortoise;

/*** Teacher's note ***/
/*
 * Start by reviewing the 3 pieces of a for loop (initialization, condition,
 * increment). Do not give the students the answer to the challenge.
 */

public class TortoiseWalkOfFame {

	public static void main(String[] args) {
Tortoise.setSpeed(5);
		// 1. Set the X position of the Tortoise so that it starts on the left. You also need to show the Tortoise to see the result of this line.
		
		int pos=50;
		Tortoise.setX(pos);
		// 2. Make the Tortoise draw a star shape. Hint: 144.
		for (int x = 0; x < 10; x++) {
	    Tortoise.setX(pos);
			pos+=50;
		for (int i = 0; i < 5; i++) {
		Tortoise.move(30);
		Tortoise.turn(144);
		}
		
		}
		// 3. Set the size of the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the Tortoise draw a line of stars like this:
		 * http://bit.ly/walk-of-fame
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
