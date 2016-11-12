import javax.swing.JOptionPane;


/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {


	public static void main(String[] args) {


		// Ask the user how many nickels they have
String nickels=JOptionPane.showInputDialog("How many nickels do you have?");

		// Convert their answer to an int using Integer.parseInt()
int numnickels=Integer.parseInt(nickels);
System.out.println(numnickels);
		// Ask the user how many dimes they have, and convert their answer
String dimes=JOptionPane.showInputDialog("How many dimes do you have?");
int numdimes=Integer.parseInt(dimes);
System.out.println(numdimes);
		// Ask the user how many quarters they have, and convert their answer

String quarters=JOptionPane.showInputDialog("How many quarters do you have?");
int numquarters=Integer.parseInt(quarters);		
System.out.println(numquarters);
// Calculate how much money the user has and save it in a double variable 
double total= (numnickels*.05)+(numdimes*.1)+(numquarters*.25);

		// Tell the user how much money they have
JOptionPane.showInputDialog("You have $"+total);		


	}
}
