import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Problem39 extends GraphicsProgram{
	private static final int RAD = 15;
	public void run(){
		GOval ball = new GOval(2 * RAD, 2 * RAD);
		ball.setFilled(true);
		add(ball, getWidth() / 2 - RAD, getHeight() / 2 - RAD);
		while(ball.getX()< getWidth() - 2 * RAD){
			ball.move(2, 0);
			pause(5);
		}
	}
}
