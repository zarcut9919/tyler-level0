import javax.swing.JOptionPane;

public class BirthdayReminder {
	public static void main(String[] args) {
		{
			
			// 1. correct the birthdays for your family below
			String momsBirthday = "April 16th";
			String dadsBirthday = "June 6th";
			String myBirthday = "October 4th";


			// 2. Find out which birthday the user wants and and store their response in a variable
			String question=(JOptionPane.showInputDialog("Do you want to know my birthday, or my mom or dads?"));
			// 3. Print out what the user typed
			
			System.out.println(question);
			// 4. if user asked for "mom"
			String name= "Mom";
			String name2="Dad";
			String name3="Yours";
			if (question.equals(name))
			{ System.out.println(momsBirthday);
				}
				
		
			//print mom's birthday
			
			// 5. if user asked for "dad"
				// print dad's birthday
			else if (question.equals(name2))
			{ System.out.println(dadsBirthday);
				}
			// 6. if user asked for your name
				// print myBirthday
			else if (question.equals(name3))
			{System.out.println(myBirthday);
			}
			//7. otherwise print "Sorry, i don't remember that person's birthday!"
			else {System.out.println("I dont remember that persons birthday!");
			}
		}
	}
}
