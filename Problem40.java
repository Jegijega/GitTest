import java.awt.Color;

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Problem40 extends GraphicsProgram{
	public void run(){
		GOval ball = new GOval(50, 50);
		add(ball, 0, getHeight() / 2 - 25);
		double xv = 10;
		double yv = 0;
		while(true){	
			while(ball.getX() + 50 <= getWidth()){
				pause(5);
				ball.move(30, 0);
			}
			ball.setLocation(getWidth() - 50, ball.getY());
			while(ball.getX() > 0){
				pause(5);
				ball.move(-xv, 0);
			}
			ball.setLocation(0, ball.getY());
		}
	}
}
