import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Problem40 extends GraphicsProgram{
	private static final int RAD = 15;
	public void run(){
		GOval ball = new GOval(2 * RAD, 2 * RAD);
		ball.setFilled(true);
		add(ball, 0, getHeight() / 2 - RAD);
		while(true){	
			while(ball.getX() < getWidth() - 3 * RAD){
				ball.move(2, 0);
				pause(5);	
			}
			//ball.setLocation(getWidth() - 2 * RAD, getHeight() / 2 - RAD);
			while(ball.getX() > 0){
				ball.move(-2, 0);
				pause(5);
			}
		}
	}
}
