import java.util.Random;

import javax.swing.JOptionPane;

public class Lottery {
	public static void main(String[] args) {
for (int b = 0; b < 100; b++) {
	
	
		String x="Your winning numbers are ";			
for (int i = 0; i < 5; i++) {
	int a= new Random().nextInt(100)+1;
x+=a+" ";
}	
JOptionPane.showMessageDialog(null, x);
}
	}
}	
	
	
	
	
	

