import java.awt.event.MouseEvent;

import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class Problem43 extends GraphicsProgram {

	private GObject object = null;
	private double lastX = -1;
	private double lastY = -1;

	public void run() {
		initBall();
		addMouseListeners();
	}

	public void mouseDragged(MouseEvent e) {
		println("drag");
		if (object != null) {
			// object.setLocation(e.getX(), e.getY());
			double mouseX = e.getX();
			double mouseY = e.getY();
			if (lastX != -1 || lastY != -1) {
				object.move(mouseX - lastX, mouseY - lastY);
			}

			lastX = mouseX;
			lastY = mouseY;
		}
	}

	public void mousePressed(MouseEvent e) {
		object = getElementAt(e.getX(), e.getY());
		if (object == null) {
			println("nullia");
		} else {
			println("ar ari null");
		}
	}

	private void initBall() {
		GOval ball = new GOval(50, 50);
		ball.setFilled(true);
		add(ball);
	}
}