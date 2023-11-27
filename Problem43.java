import java.awt.Color;
import java.awt.event.MouseEvent;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class Problem43 extends GraphicsProgram {
	private GOval oval = null;
	public void run() {
		oval = new GOval(100, 100);
		oval.setFilled(true);
		oval.setColor(Color.GREEN);
		add (oval, getWidth() / 2, getHeight() / 2);
		addMouseListeners();
	}
	
	public void mouseDragged (MouseEvent e) {
		if (getElementAt(e.getX(), e.getY()) == oval) {
			oval.setLocation(e.getX() - 50, e.getY() - 50);
		}
	}

}
