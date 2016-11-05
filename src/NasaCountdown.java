import javax.swing.JOptionPane;

public class NasaCountdown {
public static void main(String[] args) {
	
			// 2. ask the user when to start (JOptionPane.showInputDialog)
			String question= JOptionPane.showInputDialog("What number should we countdown from?");
			// 3. convert the user's answer to an int (Integer.parseInt)
			int a= Integer.parseInt(question);

			// 4. countdown from user's starting point
			
			// 1. countdown from 10 to 0
			for (int i=a; i>0; i--){
			System.out.println(i);
			speak(Integer.toString(i));
			}
			speak("BLASTOFF");
			
			// 5. when the counting is done, print "blastoff!"
			
			
		}

		
	static void speak(String words) {
	   	 try {
	   		 Runtime.getRuntime().exec("say " + words).waitFor();
	   	 } catch (Exception e) {
	   		 e.printStackTrace();
	   	 }
	  }
	}


