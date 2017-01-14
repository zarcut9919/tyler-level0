import javax.swing.JOptionPane;

public class VotingBooth {
public static void main(String[] args) {
String q=JOptionPane.showInputDialog("How old are you?");
int x=Integer.parseInt(q);	
if (x>=18){
	JOptionPane.showInputDialog("Who are you voting for");	
	}
	else {
	JOptionPane.showMessageDialog(null, "Your opinion doesn't matter");	
	}
	
	
	
	
	
}
}
