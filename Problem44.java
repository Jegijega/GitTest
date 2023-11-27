import java.awt.event.MouseEvent;

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Problem44 extends GraphicsProgram{
	private GOval ball = null;
	public void run(){
		ball = new GOval(50, 50);
		addMouseListeners();
		add(ball, -50, 0);
		while(true){
			ball.move(0, 5);
			pause(5);
		}
	}
	
	public void mouseClicked(MouseEvent e){
		ball.setLocation(e.getX() + 25, e.getY() + 25);
	}
}
