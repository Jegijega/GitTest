import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class Problem41 extends GraphicsProgram{
	private boolean clicked = false;
	public void run(){
		addMouseListeners();
	}
	
	public void mouseMoved(MouseEvent e){
		if(clicked){
			GOval circle = new GOval(2, 2);
			circle.setFilled(true);
			add(circle, e.getX() - 1, e.getY() - 1);
		}
	}
	
	public void mouseClicked(MouseEvent e){
		clicked = !clicked;
	}
}
