import java.awt.Robot;

import javax.swing.JOptionPane;

public class ShowOptionDialog {
public static void main(String[] args) {

int a=JOptionPane.showOptionDialog(null, "What color do you like?", "Robot Drawing", 0, JOptionPane.WARNING_MESSAGE, null, new String[]{"Red", "Random","Green"},null);	

	
}
}
