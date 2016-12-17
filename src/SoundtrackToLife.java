import java.net.URI;
import java.util.Random;

import javax.swing.JOptionPane;

public class SoundtrackToLife {

	public static void main(String[] args) {

		// 1. Adjust this pop-up to find out what mood the user is in.
		for (int i = 0; i <20; i++) {
		int userMood = JOptionPane.showOptionDialog(null, "How are you feeling today?", "MOOD", 0,
				new Random().nextInt(3), null, new String[] { "Happy", "Sad", "Mad" }, null);
		// 2. Their answer is stored in the userMood variable. Print it out.
System.out.println(userMood);
		// 3. If they are in a sad mood, use the playVideo method to play a calming song from YouTube.

	

if (userMood==1){JOptionPane.showMessageDialog(null, "Well that sucks");}
		// 4. Play different songs for other moods.
if (userMood==2){JOptionPane.showMessageDialog(null, "CALM DOWN!!");
}
if (userMood==0){JOptionPane.showMessageDialog(null, "Good for you.");}
		// If you are seeing ads at the beginning of your videos, install Adblock.

	}
	}
	static void playVideo(String youTubeLink) {
		try {
			URI uri = new URI(youTubeLink);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
