import java.awt.Robot;

import javax.swing.JOptionPane;

public class ShowOptionDialog {
public static void main(String[] args) {
	Robot a= new Robot();
JOptionPane.showOptionDialog(null, "What color do you want the robot to draw?", "Robot Drawing", 0, JOptionPane.WARNING_MESSAGE, null, new String[]{"Red", "Random","Green"},null);	
	
	
}
}
