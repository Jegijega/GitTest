
import java.awt.Color;

import acm.graphics.*;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Problem33 extends GraphicsProgram {
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	public void run(){
		drawCircle();
	}
	
	private void drawCircle(){
		int R = rgen.nextInt(0, 100);
		int X = rgen.nextInt(0, 100);
		int Y = rgen.nextInt(0, 100);
		Color color = rgen.nextColor();
		GOval circle = new GOval(R, R);
		circle.setFilled(true);
		circle.setColor(color);
		add(circle, X, Y);
	}
}