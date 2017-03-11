import java.util.Scanner;

import javax.swing.JOptionPane;

public class TextGame {

	public static void main(String[] args) {
		System.out.println("Type start and then press enter.");

		Scanner kb = new Scanner(System.in);
		String answer = kb.next();
		System.out.println(
				"You're in front of the Castle's huge double doors, one is slightly ajar. Type enter to continue");
		answer = kb.next();

		if (answer.equals("enter")) {

			System.out.println(
					"You have now entered the castle. The doors close and lock behind you. In front of you are two hallways. The one on the left shines with sunlight while the one on the right is emerged in darkness. Type left or right.");

		}
		answer = kb.next();
		if (answer.equals("left")) {
			System.out.println(
					"You walk down the left hallway. Suddenly two doors on both sides of you appear. Type left or right");
		}
		answer = kb.next();
		if (answer.equals("left")) {
			System.out.println("The door is locked");
			answer = kb.next();

			if (answer.equals("right")) {
				System.out.println(
						"The right door opens. You enter a dining room with a huge table. Type leave or explore");
			}
		}
		answer = kb.next();
		if (answer.equals("leave")) {
			System.out.println(
					"When you exit the room you find yourself back in front of the two hallways, the left hallway is now barred.");
			answer = kb.next();

			if (answer.equals("explore")) {
				System.out.println(
						"A figure emerges and you are hit in the head. When you wake up, you are in front of the two hallways and the left one is barred.");
			}
		}
	}
}
