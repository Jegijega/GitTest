
import java.awt.Color;

import acm.graphics.*;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Problem34 extends GraphicsProgram {
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	public void run(){
		for(int i = 1; i <= 1000; i++){
			drawCircle();
		}
	}
	
	private void drawCircle(){
		int R = rgen.nextInt(0, 100);
		int X = rgen.nextInt(0, getWidth());
		int Y = rgen.nextInt(0, getHeight());
		Color color = rgen.nextColor();
		GOval circle = new GOval(R, R);
		circle.setFilled(true);
		circle.setColor(color);
		add(circle, X, Y);
	}
}