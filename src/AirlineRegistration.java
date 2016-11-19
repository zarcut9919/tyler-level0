import javax.swing.JOptionPane;

import org.omg.Messaging.SyncScopeHelper;

/**
 * Airline registration
 * 
 * You are writing a program for a new airline to take their registration
 * information at the check-in counter and print their boarding pass. You need
 * to collect the following information: First name Last name Destination
 * airport Birthday (for security purposes) Male/female (for security purposes)
 * 
 * Print the boarding pass in this format: LAST NAME / FIRST NAME (BIRTHDAY,
 * M/F) Traveling to: DESTINATION
 * 
 * Toolbox: main() method, JOptionPane.showInputDialog, variables
 * 
 **/
public class AirlineRegistration {
	public static void main(String[] args) {

		String name = JOptionPane.showInputDialog("What's your full name. Type it last name first, first name last");
		String airport = JOptionPane.showInputDialog("What airport are you traveling to?");
		String birthday = JOptionPane.showInputDialog("Whats is your date of birth?");
		String gender = JOptionPane.showInputDialog("What's your gender, type M or F");
		System.out.println(" " + name + " (" + birthday + "," + gender + ") " + "\nTraveling to " + airport);

	}
}
/**
 * Extra Difficult Challenge: have the program repeat until plane is full (10
 * passenger plan) and print out the number of passengers after each boarding
 * pass.
 */