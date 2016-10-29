import javax.swing.JOptionPane;

public class IKnowWhatYouDid {
public static void main(String[] args) {
	String name=JOptionPane.showInputDialog("Whats your name?");
	String activity=JOptionPane.showInputDialog("What did you do last summer?");
	JOptionPane.showMessageDialog(null, "I know your name is " + name + " and last summer you " + activity);
	if (name.equals ("Nick")){
	JOptionPane.showMessageDialog(null, "You go to my school!");
	}
	else if (name.equals("Daniel")){
	JOptionPane.showMessageDialog(null, "Nice to meet you");	
	}
	}
}
