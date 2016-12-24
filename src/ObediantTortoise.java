import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class ObediantTortoise {
	public static void main(String[] args) {
		Tortoise.show();
		Tortoise.setSpeed(5);
		
String question=JOptionPane.showInputDialog("What shape should the tortoise draw? Type 'sides' to make your own shape");
if (question.equals("square")){
	drawSquare();
}
if (question.equals("triangle")){
drawTriangle();	
}
if (question.equals("circle")){
	drawCircle();
}
if (question.equals("sides")){
String a=JOptionPane.showInputDialog("How many sides do you want");
int sides=Integer.parseInt(a);
drawShape(sides);
}

	}

	private static void drawSquare() {
		for (int i = 0; i < 4; i++) {
			Tortoise.move(50);
			Tortoise.turn(90);
		}

	}

	private static void drawTriangle() {

		for (int i = 0; i < 3; i++) {
			Tortoise.move(50);
			Tortoise.turn(360 / 3);
		}

	}

	private static void drawCircle() {
		
		for (int i = 0; i < 360; i++) {
			Tortoise.setSpeed(10);
			Tortoise.move(2);
			Tortoise.turn(360 / 360);
		}
	}
private static void	drawShape(int numSides){
	for (int i = 0; i < numSides; i++) {
		
	
	Tortoise.setSpeed(8);
	Tortoise.move(50);
	Tortoise.turn(360/numSides);
	}
}
}
